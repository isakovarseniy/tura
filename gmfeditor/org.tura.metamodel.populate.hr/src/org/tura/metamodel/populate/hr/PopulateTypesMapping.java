package org.tura.metamodel.populate.hr;

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

public class PopulateTypesMapping {

	public void execute(domain.Domain model, Resource resource) {
		
		domain.DomainApplication app = domain.DomainFactory.eINSTANCE.createDomainApplication();
		app.setName("HR application");
		app.setUid(UUID.randomUUID().toString());
		
		domain.Application appl = InitDiagram.initApplicationDiagram(resource);
		app.setApplication(appl);
		
	}
}
