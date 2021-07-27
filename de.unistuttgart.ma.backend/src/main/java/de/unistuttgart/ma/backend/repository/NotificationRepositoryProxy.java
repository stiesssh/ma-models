package de.unistuttgart.ma.backend.repository;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * Save IMPACTS!!! 
 * @author maumau
 *
 */
@Component
public class NotificationRepositoryProxy {
	
	private final NotificationRepository repository;
	private final ResourceSet set; 
	
	public NotificationRepositoryProxy(@Autowired NotificationRepository repository, @Autowired ResourceSet set) {
		this.repository = repository;
		this.set = set;
		
		this.loadedImpacts = new HashMap<>();
		this.systemId2ImpactIds = new HashMap<>();
		// systemid2impactid= // read repository;
	}
	
	Map<String, Impact> loadedImpacts;
	
	// TODO : 1 : n mapping
	Map<String, Set<String>> systemId2ImpactIds;
	
	/**
	 * save *new* impact to the database.
	 * 
	 * @param impact
	 * @param system
	 * @throws IOException 
	 */
	public void save(Impact impact, String systemId) {
		// serialize impact with any(?) ressource.
		// save xml to repository.
	
		try {
			String xml = serializeImpact(impact);
			
			NotificationItem item = new NotificationItem();
			item.content = xml;
			item.systemId = systemId;
			
			String impactId = repository.save(item).id;

			
			// updated system -> impact mapping
			Set<String> impactIds;
			if (systemId2ImpactIds.containsKey(systemId)) {
				impactIds = systemId2ImpactIds.get(systemId);
			} else {
				impactIds = new HashSet<String>();
			}
			impactIds.add(impactId);
			systemId2ImpactIds.put(systemId, impactIds);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Serialise impact to ecore xml. 
	 * 
	 * @param impact 
	 * @return ecore xml representation of impact.
	 * @throws IOException
	 */
	protected String serializeImpact(Impact impact) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("impact", new EcoreResourceFactoryImpl());

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		URI uri = URI.createPlatformResourceURI("foo.impact", false); // unmapped,  
																	
		Resource res = set.createResource(uri);
		res.getContents().add(impact);
		res.save(outputStream, null);
		
		return outputStream.toString(StandardCharsets.UTF_8);
	}
	
	
	/**
	 * Deserialise impact from ecore xml. 
	 * 
	 * @param impact 
	 * @return ecore xml representation of impact.
	 * @throws IOException
	 */
	protected Impact deserializeImpact(String xml) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("impact", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("saga", new EcoreResourceFactoryImpl());
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
				
		Resource resource = set.createResource(URI.createPlatformResourceURI("foo.impact", false));
		resource.load(targetStream, null);
		
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Impact) {
				return (Impact) eObject;
			}
		}

		throw new IOException("Could not deserialize " + xml);
	}
	
	/**
	 * 
	 * @param SystemId
	 * @return
	 */
	public Set<Impact> findBySystemId(String SystemId) {
		Set<String> noteIds = systemId2ImpactIds.get(SystemId);
		
		Set<Impact> impacts = new HashSet<Impact>();
		
		for (String noteId : noteIds) {
			impacts.add(findById(noteId));
		}
		
		return impacts;	
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Impact findById(String id) {
		if (loadedImpacts.containsKey(id)) {
			return loadedImpacts.get(id);
		}
		if (repository.existsById(id)) {
			NotificationItem item = repository.findById(id).get();
			
			try {
				Impact impact = deserializeImpact(item.content);
				loadedImpacts.put(item.systemId, impact);
				return impact;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new NoSuchElementException(String.format("Missing Impact for id %s", id));	
	}
	

}
