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

      public static application.Application initApplicationDiagram(){

    	  application.Application model = application.ApplicationFactory.eINSTANCE.createApplication();
    	  
    	  application.ApplicationRecipes  applicationRecipes = application.ApplicationFactory.eINSTANCE.createApplicationRecipes();
    	  applicationRecipes.setName("Application recipes");
    	  
    	  application.ApplicationMappers  applicationMappers = application.ApplicationFactory.eINSTANCE.createApplicationMappers();
    	  applicationMappers.setName("Application mapper");
    	  
    	  model.setApplicationRecipes(applicationRecipes);
    	  model.setApplicationMappers(applicationMappers);

    	  return model;
      }

      
      
  	public static typesrepository.TypesRepository initTypesRepositoryDiagram(){
		typesrepository.TypesRepository model = typesrepository.TypesrepositoryFactory.eINSTANCE.createTypesRepository();
		typesrepository.Types types = typesrepository.TypesrepositoryFactory.eINSTANCE.createTypes();
		model.setTypeDefinition(types);
		
		for (int i=0; i < org.tura.metamodel.commons.PlatformPrimetiveTypes.values().length;i++){
			typesrepository.Primitive primitive =typesrepository.TypesrepositoryFactory.eINSTANCE.createPrimitive();
			primitive.setName(org.tura.metamodel.commons.PlatformPrimetiveTypes.values()[i].name());
			types.getPrimitives().add(primitive);
		}
		return model;
    }


}
