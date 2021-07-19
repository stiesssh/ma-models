package de.unistuttgart.ma.importer.architecture;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.foo.generated.Query;
import de.foo.generated.QueryQuery;
import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.ma.saga.SagaFactory;

/**
 * 
 * TODO : change flow to this : get projects by name -> display them, make user
 * choose one, becaus enames are not unique and i cant not query by id...
 * apparently?
 * 
 * @author maumau
 *
 */
public class GropiusImporter {// implements ArchitectureImporter {

	private final GropiusApiQuerier manager;
	private final String projectId;

	private final DataMapper mapper;

	public GropiusImporter(String uri, String projectId) {
		super();
		this.manager = new GropiusApiQuerier(uri);
		this.projectId = projectId;
		this.mapper = DataMapper.getMapper();
	}

	public Project parse() {
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

	private Project parse(Query response) {

		if (response.getProjects().getNodes().size() != 1) {
			throw new RuntimeException("queried for a single project but got multiple");
		}

		// add the projects
		de.foo.generated.Project gropiusProject = response.getProjects().getNodes().get(0);

		Project project = mapper.getEcoreProject(gropiusProject);

		// parse all components with provided interfaces
		for (de.foo.generated.Component gropiusComponent : gropiusProject.getComponents().getNodes()) {

			Component component = mapper.getEcoreComponent(gropiusComponent);
			project.getComponents().add(component);

			// provided
			for (de.foo.generated.ComponentInterface gropiusInterface : gropiusComponent.getInterfaces().getNodes()) {
				ComponentInterface face = mapper.getEcoreInterface(gropiusInterface);
				component.getInterfaces().add(face);
			}
			// consumed
			for (de.foo.generated.ComponentInterface gropiusInterface : gropiusComponent.getConsumedInterfaces()
					.getNodes()) {
				ComponentInterface face = mapper.getEcoreInterface(gropiusInterface);
				component.getConsumedInterfaces().add(face);
				face.getConsumedBy().add(component);

			}
		}

		return project;
	}
}
