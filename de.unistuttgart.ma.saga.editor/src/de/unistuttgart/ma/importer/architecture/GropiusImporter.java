package de.unistuttgart.ma.importer.architecture;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import de.foo.generated.Project;
import de.foo.generated.Query;
import de.foo.generated.QueryQuery;
import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.ma.saga.SagaFactory;


/**
 * 
 * TODO : change flow to this : get projects by name -> display them, make user choose one, becaus enames are not unique and i cant not query by id... apparently? 
 * 
 * @author maumau
 *
 */
public class GropiusImporter {//implements ArchitectureImporter {

	private final GropiusApiQuerier manager;
	private final SagaFactory factory;
	private final String projectId;

	public GropiusImporter(String uri, String projectId, SagaFactory factory) {
		super();
		this.manager = new GropiusApiQuerier(uri);
		this.factory = factory;
		this.projectId = projectId;
	}
	
	public EObject parse() { 
		QueryQuery queryQuery = GropiusApiQueries.getSingleProjectQuery(projectId);
		System.out.println(queryQuery.toString());
		try {
			Query query = manager.query(queryQuery);
			return parse(query);
		} catch (IOException | InterruptedException e) {
			// TODO do better. 
			e.printStackTrace();
		}
		throw new IllegalArgumentException("could not parse project");
	}
	
	private EObject parse(Query response) {
		de.unistuttgart.ma.saga.Project root = factory.createProject();
		
		// add the projects
		for (de.foo.generated.Project gropiusProject : response.getProjects().getNodes()) {
		
			// parse all components with provided interfaces
			for (de.foo.generated.Component gropiusComponent : gropiusProject.getComponents().getNodes()) {
				//Id id = Id.of(gropiusComponent.getId().toString());
				String name = gropiusComponent.getName();
				Component component = factory.createComponentAdapter();
				//root.getComponents().add(component);
				component.setName(name);
				
				for (de.foo.generated.ComponentInterface gropiusInterface : gropiusComponent.getInterfaces().getNodes()) {
					//Id idFace = Id.of(gropiusInterface.getId().toString());
					String nameFace = gropiusInterface.getName();
					ComponentInterface face = factory.createComponentInterfaceAdapter(); 
					face.setName(nameFace);
							
					//component.getInterfaces().add(face);
				}
			}
			
			// consumed interfaces
//			for (de.foo.generated.Component gropiusComponent : gropiusProject.getComponents().getNodes()) {
//				Id id = Id.of(gropiusComponent.getId().toString());
//				Component consumer = project.getArchitecture().getComponent(id);
//				for (ComponentInterface gropiusInterface : gropiusComponent.getConsumedInterfaces().getNodes()) {
//					Id idFace = Id.of(gropiusInterface.getId().toString());
//					Interface face = project.getArchitecture().getInterface(idFace); 
//							
//					consumer.addConsumedInterface(face);
//					
//					// set next on consumer interface
//					face.addToConsumers(consumer);
//				}
//			}	
		}
		return root;
	}
}
