package org.tura.metamodel.commons.initdiagram;

public class InitDiagram {
	
      public static domain.Domain initDomainDiagram(){

    	  domain.Domain model = domain.DomainFactory.eINSTANCE.createDomain();
    	  domain.DomainApplications  domainApplications = domain.DomainFactory.eINSTANCE.createDomainApplications();
    	  domainApplications.setName("Domain applications");
    	  domain.DomainTypes  domainTypes = domain.DomainFactory.eINSTANCE.createDomainTypes();
    	  domainTypes.setName("Domain types");
    	  domain.DomainArtifacts  domainArtifacts = domain.DomainFactory.eINSTANCE.createDomainArtifacts();
    	  domainArtifacts.setName("Domain artifacts");
    	  
    	  model.setDomainTypes(domainTypes);
    	  model.setDomainApplications(domainApplications);
    	  model.setDomainArtifacts(domainArtifacts);

    	  return model;
      }

      public static domain.Application initApplicationDiagram(){

    	  domain.Application model = domain.DomainFactory.eINSTANCE.createApplication();
    	  
    	  domain.ApplicationRecipes  applicationRecipes = domain.DomainFactory.eINSTANCE.createApplicationRecipes();
    	  applicationRecipes.setName("Application recipes");
    	  
    	  domain.ApplicationMappers  applicationMappers = domain.DomainFactory.eINSTANCE.createApplicationMappers();
    	  applicationMappers.setName("Application mapper");
    	  
    	  model.setApplicationRecipes(applicationRecipes);
    	  model.setApplicationMappers(applicationMappers);

    	  return model;
      }

      
      
  	public static domain.TypesRepository initTypesRepositoryDiagram(){
  		domain.TypesRepository model = domain.DomainFactory.eINSTANCE.createTypesRepository();
  		domain.Types types = domain.DomainFactory.eINSTANCE.createTypes();
		model.setTypeDefinition(types);
		
		for (int i=0; i < org.tura.metamodel.commons.PlatformPrimetiveTypes.values().length;i++){
			domain.Primitive primitive =domain.DomainFactory.eINSTANCE.createPrimitive();
			primitive.setName(org.tura.metamodel.commons.PlatformPrimetiveTypes.values()[i].name());
			types.getPrimitives().add(primitive);
		}
		return model;
    }


}
