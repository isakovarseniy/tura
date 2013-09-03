package org.tura.metamodel.commons.initdiagram;

import java.util.UUID;

public class InitDiagram {
	
      public static domain.Domain initDomainDiagram(){

    	  domain.Domain model = domain.DomainFactory.eINSTANCE.createDomain();
    	  model.setUid(UUID.randomUUID().toString());
   	  
    	  domain.DomainApplications  domainApplications = domain.DomainFactory.eINSTANCE.createDomainApplications();
    	  domainApplications.setName("Domain applications");
    	  domainApplications.setUid(UUID.randomUUID().toString());
    	  
    	  domain.DomainTypes  domainTypes = domain.DomainFactory.eINSTANCE.createDomainTypes();
    	  domainTypes.setName("Domain types");
    	  domainTypes.setUid(UUID.randomUUID().toString());

    	  domain.DomainArtifacts  domainArtifacts = domain.DomainFactory.eINSTANCE.createDomainArtifacts();
    	  domainArtifacts.setName("Domain artifacts");
    	  domainArtifacts.setUid(UUID.randomUUID().toString());
    	  
	       domain.JPAService jpaService = domain.DomainFactory.eINSTANCE.createJPAService();
	       jpaService.setName("JPAService");
	       jpaService.setUid(UUID.randomUUID().toString());
	       domainArtifacts.getDomainArtifact().add(jpaService);
   	  
	       domain.EJBService ejbService = domain.DomainFactory.eINSTANCE.createEJBService();
	       ejbService.setName("EJBService");
	       ejbService.setUid(UUID.randomUUID().toString());
	       domainArtifacts.getDomainArtifact().add(ejbService);

	       
	       domain.ORMEntity ormEntity = domain.DomainFactory.eINSTANCE.createORMEntity();
	       ormEntity.setName("ORMEntity");
	       ormEntity.setUid(UUID.randomUUID().toString());
	       domainArtifacts.getDomainArtifact().add(ormEntity);

	       
    	  model.setDomainTypes(domainTypes);
    	  model.setDomainApplications(domainApplications);
    	  model.setDomainArtifacts(domainArtifacts);

    	  return model;
      }

      public static domain.Application initApplicationDiagram(){

    	  domain.Application model = domain.DomainFactory.eINSTANCE.createApplication();
   		  model.setUid(UUID.randomUUID().toString());

    	  domain.ApplicationRecipes  applicationRecipes = domain.DomainFactory.eINSTANCE.createApplicationRecipes();
    	  applicationRecipes.setName("Application recipes");
    	  applicationRecipes.setUid(UUID.randomUUID().toString());
    	  
    	  domain.ApplicationMappers  applicationMappers = domain.DomainFactory.eINSTANCE.createApplicationMappers();
    	  applicationMappers.setName("Application mapper");
    	  applicationMappers.setUid(UUID.randomUUID().toString());
    	  
    	  model.setApplicationRecipes(applicationRecipes);
    	  model.setApplicationMappers(applicationMappers);

    	  return model;
      }

      
      
  	public static domain.TypesRepository initTypesRepositoryDiagram(){
  		domain.TypesRepository model = domain.DomainFactory.eINSTANCE.createTypesRepository();
  		model.setUid(UUID.randomUUID().toString());

  		domain.Types types = domain.DomainFactory.eINSTANCE.createTypes();
  		types.setUid(UUID.randomUUID().toString());
 
  		model.setTypeDefinition(types);
		
		for (int i=0; i < org.tura.metamodel.commons.PlatformPrimetiveTypes.values().length;i++){
			domain.Primitive primitive =domain.DomainFactory.eINSTANCE.createPrimitive();
			primitive.setUid(UUID.randomUUID().toString());
			primitive.setName(org.tura.metamodel.commons.PlatformPrimetiveTypes.values()[i].name());
			types.getPrimitives().add(primitive);
		}
		return model;
    }

		 
  	public static domain.Artifacts initORMEntityDiagram(){
 
        domain.Artifacts model = domain.DomainFactory.eINSTANCE.createArtifacts();
 		model.setUid(UUID.randomUUID().toString());
       
        domain.Artifact artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setUid(UUID.randomUUID().toString());
        artifact.setName("entityObject");
        artifact.setTemplate("j2ee/entity/entityObject");
        model.getArtifacts().add(artifact);

        artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setUid(UUID.randomUUID().toString());
        artifact.setName("Maven pom (entity jar)");
        artifact.setTemplate("j2ee/entity/mavenPom_Entity_jar");
        model.getArtifacts().add(artifact);        
        
        return model;
    }

  	public static domain.Artifacts initJPAServiceDiagram(){
 
        domain.Artifacts model = domain.DomainFactory.eINSTANCE.createArtifacts();
        model.setUid(UUID.randomUUID().toString());
        
        domain.Artifact artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setUid(UUID.randomUUID().toString());
        artifact.setName("serviceBean");
        artifact.setTemplate("j2ee/jpa/serviceBean");
        model.getArtifacts().add(artifact);        
        

        artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setUid(UUID.randomUUID().toString());
        artifact.setName("Maven pom JPA Service");
        artifact.setTemplate("j2ee/jpa/mavenPom_JPAService_jar");
        model.getArtifacts().add(artifact);        
        
        artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setUid(UUID.randomUUID().toString());
        artifact.setName("Configuration JPA");
        artifact.setTemplate("j2ee/jpa/configJPA");
        model.getArtifacts().add(artifact);        
        
        domain.Specifier specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
        specifier.setUid(UUID.randomUUID().toString());
        specifier.setName("JPA implementation");
        artifact.getSpecifiers().add(specifier);
        
        domain.Option option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("Hibernate");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("Toplink");
        
        specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
        specifier.setUid(UUID.randomUUID().toString());
        specifier.setName("Database type");
        artifact.getSpecifiers().add(specifier);
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("Oracle");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("PostgresSQL");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("MySQL");
        
        specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
        specifier.setUid(UUID.randomUUID().toString());
        specifier.setName("Connection type");
        artifact.getSpecifiers().add(specifier);
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("jdbc direct access");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        option.setUid(UUID.randomUUID().toString());
        specifier.getOptions().add(option);
        option.setValue("jndi");
        
         domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("DataBase IP");
         artifact.getConfigVariables().add(confVar);
        
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("DataBase socket");
         artifact.getConfigVariables().add(confVar);

         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("DataBase user");
         artifact.getConfigVariables().add(confVar);
         
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("DataBase password");
         artifact.getConfigVariables().add(confVar);

         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("DataBase schema");
         artifact.getConfigVariables().add(confVar);
        
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setUid(UUID.randomUUID().toString());
         confVar.setName("jndi access string");
         artifact.getConfigVariables().add(confVar);
         
         return model;
    }


  	public static domain.Artifacts initEJBServiceDiagram(){
  		 
        domain.Artifacts model = domain.DomainFactory.eINSTANCE.createArtifacts();
        
        domain.Artifact artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setName("Service Bean");
        artifact.setTemplate("j2ee/ejb/serviceBean");
        model.getArtifacts().add(artifact);        
        

        artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setName("Maven pom EJB Service jar");
        artifact.setTemplate("j2ee/ejb/mavenPom_EJBService_jar");
        model.getArtifacts().add(artifact);        
        
        artifact = domain.DomainFactory.eINSTANCE.createArtifact();
        artifact.setName("persistens.xml");
        artifact.setTemplate("j2ee/ejb");
        model.getArtifacts().add(artifact);        
        
        domain.Specifier specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
        specifier.setName("JPA implementation");
        artifact.getSpecifiers().add(specifier);
        
        domain.Option option = domain.DomainFactory.eINSTANCE.createOption();
        specifier.getOptions().add(option);
        option.setValue("Hibernate");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        specifier.getOptions().add(option);
        option.setValue("Toplink");
        
        specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
        specifier.setName("Database type");
        artifact.getSpecifiers().add(specifier);
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        specifier.getOptions().add(option);
        option.setValue("Oracle");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        specifier.getOptions().add(option);
        option.setValue("PostgresSQL");
        
        option = domain.DomainFactory.eINSTANCE.createOption();
        specifier.getOptions().add(option);
        option.setValue("MySQL");
        
         domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("DataBase IP");
         artifact.getConfigVariables().add(confVar);
        
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("DataBase socket");
         artifact.getConfigVariables().add(confVar);

         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("DataBase user");
         artifact.getConfigVariables().add(confVar);
         
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("DataBase password");
         artifact.getConfigVariables().add(confVar);

         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("DataBase schema");
         artifact.getConfigVariables().add(confVar);
        
         confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
         confVar.setName("jndi access string");
         artifact.getConfigVariables().add(confVar);
         
         return model;
    }



}
