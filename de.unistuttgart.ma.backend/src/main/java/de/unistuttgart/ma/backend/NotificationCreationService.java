package de.unistuttgart.ma.backend;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.springframework.beans.factory.annotation.Autowired;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.ma.backend.computationUtility.QueueItem;
import de.unistuttgart.ma.backend.repository.NotificationRespository;
import de.unistuttgart.ma.backend.repository.SystemRepositoryProxy;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaStep;
import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * calculates impact after receiving and alert
 * 
 * @author maumau
 *
 */
@org.springframework.stereotype.Component
public class NotificationCreationService {
	
	private final NotificationRespository notificationRepo;
	private final SystemRepositoryProxy systemRepo;
	
	public NotificationCreationService(@Autowired NotificationRespository notificationRepo, @Autowired SystemRepositoryProxy systemRepo) {
		this.notificationRepo = notificationRepo;
		this.systemRepo = systemRepo;
	}

	
	public void calculateImpacts(Alert alert) {
		
		String architectureId = alert.getSloRule().getGropiusProject().getId();
		
		System system = systemRepo.findByArchitectureId(architectureId);
		
		
		Notification notification = ImpactFactory.eINSTANCE.createNotification();
		// set ID to database ID.... 
		notification.setAlert(alert);

		Queue<QueueItem> queue = new LinkedList<QueueItem>();
		queue.addAll(makeInitialItems(alert));
		
		Queue<QueueItem> sagaqueue = new LinkedList<QueueItem>();
		
		// go along architecture
		while (!queue.isEmpty()) {
			QueueItem currentItem = queue.remove();
			ComponentInterface current = currentItem.getLocationAsFace();
			
			// always cause new impact at current
			Impact causedImpact = ImpactFactory.eINSTANCE.createImpact();
			notification.getImpacts().add(causedImpact);
			
			causedImpact.setLocation(current);
			// TODO : with current alert, im must differentiate between alert and impact cause... 
			//causedImpact.setCause(currentItem.getCause());
			
			// TODO : Behaviour :)
			
			Set<SagaStep> nextSteps = getNextLevel(current, system);
			if (nextSteps.isEmpty()) {
				// traverse architecture
				EList<Component> consumers = current.getConsumedBy();
				for (Component component : consumers) {
					for (ComponentInterface provided : component.getInterfaces()) {
						queue.add(new QueueItem(causedImpact, provided));
					}
				}
			} else {
				// switch to saga 
				for (SagaStep step : nextSteps) {
					sagaqueue.add(new QueueItem(causedImpact, step));	
				}
			}			
		}
	
		// do saga
		while (!sagaqueue.isEmpty()) {
			QueueItem currentItem = sagaqueue.remove();
			SagaStep current = currentItem.getLocationAsStep();

			// always cause new impact at current
			Impact causedImpact = ImpactFactory.eINSTANCE.createImpact();
			notification.getImpacts().add(causedImpact);
			
			causedImpact.setLocation(current);
			causedImpact.setCause(currentItem.getCauseAsImpact());

			// TODO : Behaviour :)

			//for (Task task : current.getTask()) {
				Impact topLevelImpact = ImpactFactory.eINSTANCE.createImpact();
				
				notification.getImpacts().add(topLevelImpact);
				notification.setTopLevelImpacts(topLevelImpact);
				
				topLevelImpact.setLocation(current.getTask());
				topLevelImpact.setCause(causedImpact);

				
			//}
		}
		
		
		// do process - already done at saga  

		system.getNotifications().add(notification);
 
		
		// TODO : save the calculated impacts (as notification) to the db.
		// --> get system by gropius id. or go by gropius id only?? 
	
	
	}
	
	protected Set<SagaStep> getNextLevel(ComponentInterface face, System system) {
		Set<SagaStep> nexts = new HashSet<>();
		
		// TODO : are these really the same objects, or do the just 'look' the same??
		// TODO : maybe compare by id or override equals.
		for (Saga saga : system.getSagas()) {
			for (SagaStep sagaStep : saga.getSteps()) {
				if (sagaStep.getComponentInterface().equals(face)) {
					nexts.add(sagaStep);
				}
			}
		}
		return nexts;
	}
	
	/**
	 * 
	 * Create the initial Items for the Queue.
	 *
	 * Violations may happen at any ThingWithSlo, there fore the violation's
	 * location might be a Component as well as an Interface. However the impact
	 * computation operates on SmallerThings. As such in case of a violation at a
	 * component, the initial items are that components provided interfaces. With
	 * 'causedby' being the initial violation. In case the violation happens at an
	 * interface, the initial violations are the provided interfaces of the
	 * consuming components, or else i would 'loose' the actual violation.
	 * 
	 * (because queueItem = previous impact x (small) location, but if location is
	 * location of actual violation, then previous impact is null and everything
	 * breaks...)
	 * 
	 * TODO : what happens if violations happen even higher up, like saga or
	 * process?
	 * 
	 * @param alert
	 * @return
	 */
	private Set<QueueItem> makeInitialItems(Alert alert) {

		Set<QueueItem> initialItems = new HashSet<>();
		Set<Component> firstImpact = new HashSet<>();

		// TODO this is wrong!! 
		if (alert.getSloRule().getGropiusComponentInterface() != null) {
			// interface is violator
			firstImpact.addAll(alert.getSloRule().getGropiusComponentInterface().getConsumedBy());
			
		} else if (alert.getSloRule().getGropiusComponent() != null) {
			// get interfaces, they are all violators
			EList<ComponentInterface> faces = alert.getSloRule().getGropiusComponent().getInterfaces();
			for (ComponentInterface componentInterface : faces) {
				firstImpact.addAll(componentInterface.getConsumedBy());
			}
			
		} else {
			throw new IllegalArgumentException("TODO - no matching location for alert");
		}
		

		for (Component c : firstImpact) {
			for (ComponentInterface face : c.getInterfaces()) {
				initialItems.add(new QueueItem(alert, face));
			}
		}

		return initialItems;
	}
}

