package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
class SagaImporterTest extends FooTest {

	@Test
	void parseEmptySystemTest() throws IOException {
		String xml = Files.readString(Paths.get("src/test/resources/", "empty.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		
		importService.parse(xml, filename);
		assertEquals(1, systemRepo.count());
		
		de.unistuttgart.ma.saga.System actual = systemRepoProxy.findById("60fa9cadc736ff6357a89a9b");
		
		assertNotNull(actual);
		assertNotNull(actual.getArchitecture());
		
		assertEquals(filename, actual.eResource().getURI().segment(actual.eResource().getURI().segmentCount() -1));
	}
	
	// TODO : not so empty systems :)
	
	@Test
	void parseT2BaseSystemTest() throws IOException {
		String xml = Files.readString(Paths.get("src/test/resources/", "t2_base.saga"), StandardCharsets.UTF_8);					
		String filename = "filename.saga";
		
		importService.parse(xml, filename);
		assertEquals(1, systemRepo.count());
		
		de.unistuttgart.ma.saga.System actual = systemRepoProxy.findById("60fa9cadc736ff6357a89a9b");
		
		assertNotNull(actual);
		assertNotNull(actual.getArchitecture());
		
		assertEquals(filename, actual.eResource().getURI().segment(actual.eResource().getURI().segmentCount() -1));
		// or:
		assertEquals(URI.createPlatformResourceURI(filename, false).toString(), actual.eResource().getURI().toString());
		
		// TODO : assert the system :x
	}
}
