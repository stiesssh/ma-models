package de.unistuttgart.ma.importer.architecture;

import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.ID;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusFactory;
import de.unistuttgart.ma.saga.SagaFactory;

public class DataMapper {
	
	private Map<ID, Component> componentMap;
	private Map<ID, ComponentInterface> interfaceMap;

	//SagaFactory factory = SagaFactory.eINSTANCE;
	GropiusFactory factory = GropiusFactory.eINSTANCE; 
	
	public DataMapper() {
		componentMap = new HashMap<>();
		interfaceMap = new HashMap<>();
	}
	
	/**
	 * component with name set but interfaces not set
	 * @param component
	 * @return
	 */
	public Component getEcoreComponent(de.foo.generated.Component component) {
		ID id = component.getId();
		if(componentMap.containsKey(id)) {
			return componentMap.get(id);
		} 
		
		Component result = factory.createComponent();
		result.setName(component.getName());
		result.setId(component.getId().toString());
		result.setDescription(component.getDescription());
		componentMap.put(id, result);
		return result;
	}
	
	/**
	 * interface with name & provider set
	 * @param compInterface
	 * @return
	 */
	public ComponentInterface getEcoreInterface(de.foo.generated.ComponentInterface compInterface) {
		ID id = compInterface.getId();
		if(interfaceMap.containsKey(id)) {
			return interfaceMap.get(id);
		}
		
		ComponentInterface result = factory.createComponentInterface();
		result.setName(compInterface.getName());
		result.setId(compInterface.getId().toString());
		result.setDescription(compInterface.getDescription());
		result.setComponent(getEcoreComponent(compInterface.getComponent()));
		interfaceMap.put(id, result);
		return result;
	}
}