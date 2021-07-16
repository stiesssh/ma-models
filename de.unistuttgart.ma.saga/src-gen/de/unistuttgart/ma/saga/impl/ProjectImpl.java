/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.Component;

import de.unistuttgart.ma.saga.Notification;
import de.unistuttgart.ma.saga.Project;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ProjectImpl#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ProjectImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ProjectImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ProjectImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends IdentifiableElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getSagas() <em>Sagas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSagas()
	 * @generated
	 * @ordered
	 */
	protected EList<Saga> sagas;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.bpmn2.Process> processes;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Saga> getSagas() {
		if (sagas == null) {
			sagas = new EObjectContainmentEList<Saga>(Saga.class, this, SagaPackage.PROJECT__SAGAS);
		}
		return sagas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.bpmn2.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<org.eclipse.bpmn2.Process>(org.eclipse.bpmn2.Process.class, this, SagaPackage.PROJECT__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, SagaPackage.PROJECT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectContainmentEList<Notification>(Notification.class, this, SagaPackage.PROJECT__NOTIFICATIONS);
		}
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.PROJECT__SAGAS:
				return ((InternalEList<?>)getSagas()).basicRemove(otherEnd, msgs);
			case SagaPackage.PROJECT__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case SagaPackage.PROJECT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case SagaPackage.PROJECT__NOTIFICATIONS:
				return ((InternalEList<?>)getNotifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.PROJECT__SAGAS:
				return getSagas();
			case SagaPackage.PROJECT__PROCESSES:
				return getProcesses();
			case SagaPackage.PROJECT__COMPONENTS:
				return getComponents();
			case SagaPackage.PROJECT__NOTIFICATIONS:
				return getNotifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SagaPackage.PROJECT__SAGAS:
				getSagas().clear();
				getSagas().addAll((Collection<? extends Saga>)newValue);
				return;
			case SagaPackage.PROJECT__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.eclipse.bpmn2.Process>)newValue);
				return;
			case SagaPackage.PROJECT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case SagaPackage.PROJECT__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends Notification>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SagaPackage.PROJECT__SAGAS:
				getSagas().clear();
				return;
			case SagaPackage.PROJECT__PROCESSES:
				getProcesses().clear();
				return;
			case SagaPackage.PROJECT__COMPONENTS:
				getComponents().clear();
				return;
			case SagaPackage.PROJECT__NOTIFICATIONS:
				getNotifications().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SagaPackage.PROJECT__SAGAS:
				return sagas != null && !sagas.isEmpty();
			case SagaPackage.PROJECT__PROCESSES:
				return processes != null && !processes.isEmpty();
			case SagaPackage.PROJECT__COMPONENTS:
				return components != null && !components.isEmpty();
			case SagaPackage.PROJECT__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
