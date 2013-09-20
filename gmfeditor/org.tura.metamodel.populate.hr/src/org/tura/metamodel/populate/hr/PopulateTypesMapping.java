package org.tura.metamodel.populate.hr;

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

public class PopulateTypesMapping {

	public void execute(domain.Domain model, Resource resource) {
		
		domain.DomainApplication app = domain.DomainFactory.eINSTANCE.createDomainApplication();
		app.setName("HR application");
		app.setUid(UUID.randomUUID().toString());
		model.getDomainApplications().getApplications().add(app);
		
		domain.Application appl = InitDiagram.initApplicationDiagram();
		app.setApplication(appl);
		resource.getContents().add(appl);
		
		domain.ApplicationMapper appmaper  = InitDiagram.initPrimitivesMapping();
		appl.getApplicationMappers().getMappers().add(appmaper);
		resource.getContents().add(appmaper.getMapper());
		
	}
}
