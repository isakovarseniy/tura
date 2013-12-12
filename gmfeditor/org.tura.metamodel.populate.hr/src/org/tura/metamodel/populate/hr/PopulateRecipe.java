package org.tura.metamodel.populate.hr;

import java.util.HashMap;
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
		  
		domain.Ingredient ingredient = DomainFactory.eINSTANCE.createIngredient();
		ingredient.setName(Constants.HR_SERVICE_INGREDIENT);
		ingredient.setUid(UUID.randomUUID().toString());
		ingredient.setLayer(PlatformLayers.SERVICE_LAYER);
		recipe.getIngredients().add(ingredient);
		
		domain.JavaComponent component = DomainFactory.eINSTANCE.createJavaComponent();
		component.setName(Constants.HR_SERVICE);
		component.setUid(UUID.randomUUID().toString());
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
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
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
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
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
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
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
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.SERVICE_BEAN+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		query.getVariables().add(var);
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Persistence.xml");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get "+Constants.TYPE_EMPLOYEE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEE);
		query.getVariables().add(var);
		

		query = DomainFactory.eINSTANCE.createQuery();
		modelMapper.getQueries().add(query);
		query.setName("Get "+Constants.TYPE_DEPARTMENT);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.EJBSERVICE+"_"+InitDiagram.PERSISTENS_XML+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENT);
		query.getVariables().add(var);
		
		
		
		
		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("BaseType");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef().getParent().getParent());
	
		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get BaseType");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE));

	
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(InitDiagram.BASE_PACKAGE);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setQueryParamRef((QueryParameter) artifactMap.get(InitDiagram.ORMENTITY+"_"+InitDiagram.ENTITYOBJECT+"_"+InitDiagram.QUERY_TYPE+"_"+InitDiagram.VAR_TYPE_NAME));
		var.setValue("BaseType");
		query.getVariables().add(var);
	
	
	
	}

}
