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
		
		domain.Application appl = InitDiagram.initApplicationDiagram(resource);
		app.setApplication(appl);

		domain.ApplicationMapper mapping = domain.DomainFactory.eINSTANCE
				.createApplicationMapper();
		mapping.setUid(UUID.randomUUID().toString());
		mapping.setName("HR types mapper");
		resource.getContents().add(mapping);
		
		appl.getApplicationMappers().getMappers().add(populateDepartmentsTypeMapping(mapping,resource));
		appl.getApplicationMappers().getMappers().add(populateEmployeesTypeMapping(mapping,resource));
		
	}
	
	private domain.ApplicationMapper populateDepartmentsTypeMapping(domain.ApplicationMapper mapping,Resource resource){

		domain.Mappers mps =  domain.DomainFactory.eINSTANCE.createMappers();
		mps.setUid(UUID.randomUUID().toString());
		mapping.setMapper(mps);
        resource.getContents().add(mps); 
		
		domain.JavaMapper jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Department Type");
        jm.setMappedToPackageName("org.elsoft.platform.hr.departments");
        jm.setMappedToClassName("DepartmentsDAO");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Department Type");
        jm.setMappedToPackageName("org.elsoft.platform.hr.objects");
        jm.setMappedToClassName("DepartmentsDAO");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Departments query service");
        jm.setMappedToPackageName("org.elsoft.platform.hr.departments.impl");
        jm.setMappedToClassName("DepartmentsService");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Departments query service");
        jm.setMappedToPackageName("org.elsoft.platform.hr.departments");
        jm.setMappedToClassName("DepartmentsService");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("List of Departments");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.hr.objects.DepartmentsDAO>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Search criterias for Departments");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.SearchCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("OrderBy criterias for Departments");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.OrderCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

        return mapping;
	}
	
	private domain.ApplicationMapper populateEmployeesTypeMapping(domain.ApplicationMapper mapping,Resource resource){

		domain.Mappers mps =  domain.DomainFactory.eINSTANCE.createMappers();
		mps.setUid(UUID.randomUUID().toString());
		mapping.setMapper(mps);
        resource.getContents().add(mps); 
		
		
		domain.JavaMapper jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Employee Type");
        jm.setMappedToPackageName("org.elsoft.platform.hr.employees");
        jm.setMappedToClassName("EmployeesDAO");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("Base package");
        jm.setTypeName("BaseType");
        jm.setMappedToPackageName("org.elsoft.platform.metamodel.objects");
        jm.setMappedToClassName("ELsoftObject");
        jm.setGroupId("org.elsoft.platform");
        jm.setArtifactId("commons-platform-datastructure");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);       
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Employee Type");
        jm.setMappedToPackageName("org.elsoft.platform.hr.objects");
        jm.setMappedToClassName("EmployeesDAO");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Employees query service");
        jm.setMappedToPackageName("org.elsoft.platform.hr.employees.impl");
        jm.setMappedToClassName("EmployeesService");
        jm.setGroupId("org.elsoft.platform.Manufacturing.BackOffice");
        jm.setArtifactId("Model-Manufacturing-BackOffice-HR-client");
        jm.setVersion("1.0");
        jm.setUiLayer(true);
        jm.setServiceLayer(false);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Employees query service");
        jm.setMappedToPackageName("org.elsoft.platform.hr.employees");
        jm.setMappedToClassName("EmployeesService");
        jm.setUiLayer(false);
        jm.setServiceLayer(true);

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("List of Employees");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.hr.objects.EmployeesDAO>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("Search criterias for Employees");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.SearchCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        
		jm =  domain.DomainFactory.eINSTANCE.createJavaMapper();
		mps.getMappers().add(jm);
        jm.setPackageName("HR package");
        jm.setTypeName("OrderBy criterias for Employees");
        jm.setMappedToPackageName("java.util");
        jm.setMappedToClassName("List<org.elsoft.platform.OrderCriteria>");
        jm.setUiLayer(true);
        jm.setServiceLayer(true);
        

        return mapping;
	}
	
}
