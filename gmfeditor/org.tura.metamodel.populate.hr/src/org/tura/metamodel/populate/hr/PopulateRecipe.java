package org.tura.metamodel.populate.hr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

import domain.Artifact;
import domain.DomainApplication;
import domain.DomainFactory;
import domain.ModelQuery;
import domain.PlatformLayers;
import domain.QueryParameter;

public class PopulateRecipe {

	public void execute(domain.Domain model, Resource resource) {

		HashMap<String, Object> artifactMap = InitDiagram.getArtifactElements(resource);
		
		DomainApplication domainApplication =   model.getDomainApplications().getApplications().get(0);
		
		domain.ApplicationRecipe applicationRecipe = DomainFactory.eINSTANCE.createApplicationRecipe();
		applicationRecipe.setName(Constants.HR_RECIPE);
		domainApplication.getApplication().getApplicationRecipes().getRecipes().add(applicationRecipe);

		
		domain.Recipes recipes = DomainFactory.eINSTANCE.createRecipes();
		applicationRecipe.setRecipes(recipes);
		recipes.setUid(UUID.randomUUID().toString());
		resource.getContents().add(recipes);
		
		domain.Recipe recipe = DomainFactory.eINSTANCE.createRecipe();
		recipe.setUid(UUID.randomUUID().toString());
		recipes.setRecipe(recipe);
		  
		domain.Infrastructure infrastructure = DomainFactory.eINSTANCE.createInfrastructure();
		infrastructure.setUid(UUID.randomUUID().toString());
		infrastructure.setName("Development");
		recipes.getInfrastructures().add(infrastructure);
		recipe.getInfrastructures().add(infrastructure);
		
		domain.Configuration conf = DomainFactory.eINSTANCE.createConfiguration();
		conf.setUid(UUID.randomUUID().toString());
		infrastructure.setRecipeConfig(conf);
		recipes.getConfigurations().add(conf);
		infrastructure.getRecipeConfig().setConfigExtension(conf);
		
		
		domain.Ingredient ingredient = DomainFactory.eINSTANCE.createIngredient();
		ingredient.setName(Constants.HR_SERVICE_INGREDIENT);
		ingredient.setUid(UUID.randomUUID().toString());
		ingredient.setLayer(PlatformLayers.SERVICE_LAYER);
		recipe.getIngredients().add(ingredient);
		
		domain.JavaComponent component = DomainFactory.eINSTANCE.createJavaComponent();
		component.setName(Constants.HR_SERVICE);
		component.setUid(UUID.randomUUID().toString());
		component.setComponentRoot("generatedCode/serviceLayer");
		component.setArtifactId("hrservice");
		component.setGroupId("org.tura.example.service");
		component.setVersion("1.0");
		component.setBasePackage("org.tura.example.service");
		ingredient.getComponents().add(component);
		
		
		domain.ModelMapper modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		modelMapper.setName(Constants.TYPE_DEPARTMENT);
		modelMapper.setUid(UUID.randomUUID().toString());
		
		domain.Query query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENT);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE));
		
		domain.QueryVariable var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENT);
		query.getVariables().add(var);
		
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_EMPLOYEE);
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		modelMapper.setUid(UUID.randomUUID().toString());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE));
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEE);
		query.getVariables().add(var);
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		modelMapper.setUid(UUID.randomUUID().toString());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		query.getVariables().add(var);
		

//------------
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);

		//------------
		
				query = DomainFactory.eINSTANCE.createQuery();
				query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
				modelMapper.getQueries().add(query);
				query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL));

				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL+"_"+InitDiagram.VAR_PACKAGE_NAME));
				var.setValue(Constants.PACKAGE_HR);
				query.getVariables().add(var);
				
				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL+"_"+InitDiagram.VAR_TYPE_NAME));
				var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
				query.getVariables().add(var);
		
				//------------
				
				query = DomainFactory.eINSTANCE.createQuery();
				query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_GENERIC_TYPE);
				modelMapper.getQueries().add(query);
				query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC));

				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC+"_"+InitDiagram.VAR_PACKAGE_NAME));
				var.setValue(Constants.PACKAGE_HR);
				query.getVariables().add(var);
				
				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC+"_"+InitDiagram.VAR_TYPE_NAME));
				var.setValue(Constants.TYPE_DEPARTMENT);
				query.getVariables().add(var);
		
		
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		query.getVariables().add(var);
		

//------------
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_REMOTE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);
		
		//------------
				query = DomainFactory.eINSTANCE.createQuery();
				query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
				modelMapper.getQueries().add(query);
				query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL));

				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL+"_"+InitDiagram.VAR_PACKAGE_NAME));
				var.setValue(Constants.PACKAGE_HR);
				query.getVariables().add(var);
				
				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_LOCAL+"_"+InitDiagram.VAR_TYPE_NAME));
				var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
				query.getVariables().add(var);

				//------------
				
				query = DomainFactory.eINSTANCE.createQuery();
				query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_GENERIC_TYPE);
				modelMapper.getQueries().add(query);
				query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC));

				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC+"_"+InitDiagram.VAR_PACKAGE_NAME));
				var.setValue(Constants.PACKAGE_HR);
				query.getVariables().add(var);
				
				var = DomainFactory.eINSTANCE.createQueryVariable();
				var.setUid(UUID.randomUUID().toString());
				var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE_GENERIC+"_"+InitDiagram.VAR_TYPE_NAME));
				var.setValue(Constants.TYPE_EMPLOYEE);
				query.getVariables().add(var);
				
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Persistence.xml");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());

        for (Iterator<domain.ConfigVariable>  itr =modelMapper.getArtifactRef().getConfigVariables().iterator();itr.hasNext(); ){
        	domain.ConfigVariable confvar = itr.next();
            domain.Property prop = 	DomainFactory.eINSTANCE.createProperty();
            prop.setConfVarRef(confvar);
            prop.setUid(UUID.randomUUID().toString());
            String v=null;
            if (confvar.getName().equals(InitDiagram.DATABASE_SOCKET))
            	v="1521";
            if (confvar.getName().equals(InitDiagram.DATABASE_USER))
            	v="HR";
            if (confvar.getName().equals(InitDiagram.DATABASE_IP))
            	v="localhost";
            if (confvar.getName().equals(InitDiagram.DATABASE_PASSWORD))
            	v="HR";
            if (confvar.getName().equals(InitDiagram.DATABASE_SCHEMA))
            	v="HR";
            if (confvar.getName().equals(InitDiagram.JNDI_ACCESS_STRING))
            	v="jdbc/hrDS";
            prop.setValue(v);
            conf.getProperties().add(prop);
        }
        
        for (Iterator<domain.Specifier>  itr =modelMapper.getArtifactRef().getSpecifiers().iterator();itr.hasNext(); ){
        	domain.Specifier sp = itr.next();
            domain.MappingSpecifier ms = 	DomainFactory.eINSTANCE.createMappingSpecifier();
            ms.setSpecifierRef(sp);       
            ms.setValueRef(sp.getOptions().get(0));
        	ms.setUid(UUID.randomUUID().toString());
        	modelMapper.getSpecifiers().add(ms);
        }        
        
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEE);
		query.getVariables().add(var);
		
		query = DomainFactory.eINSTANCE.createQuery();
		modelMapper.getQueries().add(query);
		query.setName("Get "+Constants.TYPE_DEPARTMENT);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENT);
		query.getVariables().add(var);
		
		
//		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
//		component.getMappers().add(modelMapper);
//		modelMapper.setName("BaseType");
//		modelMapper.setUid(UUID.randomUUID().toString());
//		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT));
//		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
//	
//		query = DomainFactory.eINSTANCE.createQuery();
//		query.setName("Get BaseType");
//		modelMapper.getQueries().add(query);
//		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE));
//
//	
//		var = DomainFactory.eINSTANCE.createQueryVariable();
//		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
//		var.setValue(InitDiagram.BASE_PACKAGE);
//		query.getVariables().add(var);
//		
//		var = DomainFactory.eINSTANCE.createQueryVariable();
//		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
//		var.setValue("BaseType");
//		query.getVariables().add(var);
	
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);
		

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
		query.getVariables().add(var);
		

		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.REMOTE_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);
		

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.LOCAL_INTERFACE+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
		query.getVariables().add(var);
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_POM_EJB_SERVICE);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		
//-------------------- Ingredient Proxy
		
		ingredient = DomainFactory.eINSTANCE.createIngredient();
		ingredient.setName(Constants.HR_SERVICE_PROXY_CLIENT_INGREDIENT);
		ingredient.setUid(UUID.randomUUID().toString());
		ingredient.setLayer(PlatformLayers.SERVICE_LAYER);
		recipe.getIngredients().add(ingredient);
		
		component = DomainFactory.eINSTANCE.createJavaComponent();
		component.setName(Constants.HR_SERVICE_PROXY_CLIENT);
		component.setUid(UUID.randomUUID().toString());
		component.setComponentRoot("generatedCode/serviceLayer");
		component.setArtifactId("hrservice-proxy-client");
		component.setGroupId("org.tura.example.service");
		component.setVersion("1.0");
		component.setBasePackage("org.tura.example.service");
		ingredient.getComponents().add(component);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE));
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		query.getVariables().add(var);
		
		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);

		
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		query.getVariables().add(var);


		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		
		for (Iterator<domain.ConfigVariable>  itr =modelMapper.getArtifactRef().getConfigVariables().iterator();itr.hasNext(); ){
        	domain.ConfigVariable confvar = itr.next();
            domain.Property prop = 	DomainFactory.eINSTANCE.createProperty();
            prop.setConfVarRef(confvar);
            prop.setUid(UUID.randomUUID().toString());
            String v=null;
            if (confvar.getName().equals(InitDiagram.APPLICATION_SERVER_IP))
            	v="localhost";
            if (confvar.getName().equals(InitDiagram.APPLICATION_SERVER_PORT))
            	v="8080";

            prop.setValue(v);
            conf.getProperties().add(prop);
        }
        
		
	}

}
