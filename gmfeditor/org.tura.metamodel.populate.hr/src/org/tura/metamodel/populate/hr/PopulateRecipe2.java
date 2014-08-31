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

public class PopulateRecipe2 {

	public void execute(domain.Domain model, Resource resource) {

		HashMap<String, Object> artifactMap = InitDiagram
				.getArtifactElements(resource);

		DomainApplication domainApplication = model.getDomainApplications()
				.getApplications().get(0);

		domain.ApplicationRecipe applicationRecipe = DomainFactory.eINSTANCE
				.createApplicationRecipe();
		applicationRecipe.setName(Constants.HR_RECIPE+" Package processing");
		domainApplication.getApplication().getApplicationRecipes().getRecipes()
				.add(applicationRecipe);

		domain.Recipes recipes = DomainFactory.eINSTANCE.createRecipes();
		applicationRecipe.setRecipes(recipes);
		recipes.setUid(UUID.randomUUID().toString());
		resource.getContents().add(recipes);

		domain.Recipe recipe = DomainFactory.eINSTANCE.createRecipe();
		recipe.setUid(UUID.randomUUID().toString());
		recipes.setRecipe(recipe);

		domain.Infrastructure infrastructure = DomainFactory.eINSTANCE
				.createInfrastructure();
		infrastructure.setUid(UUID.randomUUID().toString());
		infrastructure.setName("Development");
		recipes.getInfrastructures().add(infrastructure);
		recipe.getInfrastructures().add(infrastructure);

		domain.Configuration conf = DomainFactory.eINSTANCE
				.createConfiguration();
		conf.setUid(UUID.randomUUID().toString());
		infrastructure.setRecipeConfig(conf);
		recipes.getConfigurations().add(conf);
		infrastructure.getRecipeConfig().setConfigExtension(conf);

		domain.Ingredient ingredient = DomainFactory.eINSTANCE
				.createIngredient();
		ingredient.setName(Constants.HR_SERVICE_INGREDIENT);
		ingredient.setUid(UUID.randomUUID().toString());
		ingredient.setLayer(PlatformLayers.SERVICE_LAYER);
		recipe.getIngredients().add(ingredient);

		domain.JavaComponent component = DomainFactory.eINSTANCE
				.createJavaComponent();
		component.setName(Constants.HR_SERVICE);
		component.setUid(UUID.randomUUID().toString());
		component.setComponentRoot("/Users/arseniy/generatedCode/serviceLayer");
		component.setArtifactId("hrservice");
		component.setGroupId("org.tura.example.service");
		component.setVersion("1.0");
		component.setBasePackage("org.tura.example.service");
		ingredient.getComponents().add(component);

		domain.ModelMapper modelMapper = DomainFactory.eINSTANCE
				.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());
		modelMapper.setName("Process all entity in the package ");
		modelMapper.setUid(UUID.randomUUID().toString());

		domain.Query query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get entities");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT
						+ "_" + InitDiagram.QUERY_TYPE));

		domain.QueryVariable var = DomainFactory.eINSTANCE
				.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT));
		var.setValue(InitDiagram.ENTITYOBJECT);
		query.getVariables().add(var);


		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT_LIB));
		var.setValue(InitDiagram.ORMENTITY);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.ORMENTITY + "_" + InitDiagram.PACKAGEENTITYOBJECT
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_HINT));
		var.setValue(InitDiagram.HINTS_ENTITY);
		query.getVariables().add(var);


		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Process all services in the package");
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());
		modelMapper.setUid(UUID.randomUUID().toString());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get services");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES
						+ "_" + InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE
				.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT));
		var.setValue(InitDiagram.SERVICE_BEAN);
		query.getVariables().add(var);


		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT_LIB));
		var.setValue(InitDiagram.EJBSERVICE);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_EJB_SERVICES
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_HINT));
		var.setValue(InitDiagram.HINTS_EJBSERVICE);
		query.getVariables().add(var);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Persistence.xml");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper
				.setArtifactRef((Artifact) artifactMap
						.get(InitDiagram.EJBSERVICE + "_"
								+ InitDiagram.PERSISTENS_XML));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		for (Iterator<domain.ConfigVariable> itr = modelMapper.getArtifactRef()
				.getConfigVariables().iterator(); itr.hasNext();) {
			domain.ConfigVariable confvar = itr.next();
			domain.Property prop = DomainFactory.eINSTANCE.createProperty();
			prop.setConfVarRef(confvar);
			prop.setUid(UUID.randomUUID().toString());
			String v = null;
			if (confvar.getName().equals(InitDiagram.DATABASE_SOCKET))
				v = "5432";
			if (confvar.getName().equals(InitDiagram.DATABASE_USER))
				v = "postgres";
			if (confvar.getName().equals(InitDiagram.DATABASE_IP))
				v = "localhost";
			if (confvar.getName().equals(InitDiagram.DATABASE_PASSWORD))
				v = "postgres";
			if (confvar.getName().equals(InitDiagram.DATABASE_SCHEMA))
				v = "hr";
			if (confvar.getName().equals(InitDiagram.JNDI_ACCESS_STRING))
				v = "jdbc/hrDS";
			prop.setValue(v);
			conf.getProperties().add(prop);
		}

		for (Iterator<domain.Specifier> itr = modelMapper.getArtifactRef()
				.getSpecifiers().iterator(); itr.hasNext();) {
			domain.Specifier sp = itr.next();
			domain.MappingSpecifier ms = DomainFactory.eINSTANCE
					.createMappingSpecifier();
			ms.setSpecifierRef(sp);
			ms.setValueRef(sp.getOptions().get(0));
			ms.setUid(UUID.randomUUID().toString());
			modelMapper.getSpecifiers().add(ms);
		}

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get " + Constants.TYPE_EMPLOYEE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.PERSISTENS_XML + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PERSISTENS_XML
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PERSISTENS_XML
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEE);
		query.getVariables().add(var);

		query = DomainFactory.eINSTANCE.createQuery();
		modelMapper.getQueries().add(query);
		query.setName("Get " + Constants.TYPE_DEPARTMENT);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.PERSISTENS_XML + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PERSISTENS_XML
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PERSISTENS_XML
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENT);
		query.getVariables().add(var);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Process all remote interfacse");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get remote interfaces" );
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE + "_"
				+ InitDiagram.QUERY_TYPE));


		var = DomainFactory.eINSTANCE
				.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT));
		var.setValue(InitDiagram.SERVICE_BEAN);
		query.getVariables().add(var);


		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT_LIB));
		var.setValue(InitDiagram.EJBSERVICE);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_REMOTE_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_HINT));
		var.setValue(InitDiagram.HINTS_EJB_REMOTE_INREFACE);
		query.getVariables().add(var);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName("Process all local interfacse");
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper
				.setArtifactRef((Artifact) artifactMap
						.get(InitDiagram.EJBSERVICE + "_"
								+ InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get all local interfaces");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE
				.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT));
		var.setValue(InitDiagram.SERVICE_BEAN);
		query.getVariables().add(var);


		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_ARTIFACT_LIB));
		var.setValue(InitDiagram.EJBSERVICE);
		query.getVariables().add(var);
		
		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_" + InitDiagram.PACKAGE_LOCAL_EJB_INTERFACE
						+ "_" + InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_HINT));
		var.setValue(InitDiagram.HINTS_EJB_LOCAL_INREFACE);
		query.getVariables().add(var);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_POM_EJB_SERVICE);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_BUILDER);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.CONTINUOUS_INTEGRATION + "_"
						+ InitDiagram.MAVEN_BUILDER));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		
		for (Iterator<domain.Specifier> itr = modelMapper.getArtifactRef()
				.getSpecifiers().iterator(); itr.hasNext();) {
			domain.Specifier sp = itr.next();
			domain.MappingSpecifier ms = DomainFactory.eINSTANCE
					.createMappingSpecifier();
			ms.setSpecifierRef(sp);
			ms.setValueRef(sp.getOptions().get(0));
			ms.setUid(UUID.randomUUID().toString());
			modelMapper.getSpecifiers().add(ms);
		}

		for (Iterator<domain.ConfigVariable> itr = modelMapper.getArtifactRef()
				.getConfigVariables().iterator(); itr.hasNext();) {
			domain.ConfigVariable confvar = itr.next();
			domain.Property prop = DomainFactory.eINSTANCE.createProperty();
			prop.setConfVarRef(confvar);
			prop.setUid(UUID.randomUUID().toString());
			String v = null;
			if (confvar.getName().equals(InitDiagram.MAVEN_LOCATION))
				v = "/Users/arseniy/tools/apache-maven-3.1.1";

			prop.setValue(v);
			conf.getProperties().add(prop);
		}

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.GLASSFISH_DEPLOYER);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.GLASSFISH_DEPLOYER));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		
		for (Iterator<domain.Specifier> itr = modelMapper.getArtifactRef()
				.getSpecifiers().iterator(); itr.hasNext();) {
			domain.Specifier sp = itr.next();
			domain.MappingSpecifier ms = DomainFactory.eINSTANCE
					.createMappingSpecifier();
			ms.setSpecifierRef(sp);
			ms.setValueRef(sp.getOptions().get(0));
			ms.setUid(UUID.randomUUID().toString());
			modelMapper.getSpecifiers().add(ms);
		}

		for (Iterator<domain.ConfigVariable> itr = modelMapper.getArtifactRef()
				.getConfigVariables().iterator(); itr.hasNext();) {
			domain.ConfigVariable confvar = itr.next();
			domain.Property prop = DomainFactory.eINSTANCE.createProperty();
			prop.setConfVarRef(confvar);
			prop.setUid(UUID.randomUUID().toString());
			String v = null;
			if (confvar.getName().equals(InitDiagram.GLASSFISH_HOME))
				v = "/Users/arseniy/glassfish3";
			if (confvar.getName().equals(InitDiagram.GLASSFISH_ADMIN_PORT))
				v = "4848";
			if (confvar.getName().equals(InitDiagram.GLASSFISH_DOMAIN))
				v = "domain1";

			prop.setValue(v);
			conf.getProperties().add(prop);
		}

		// -------------------- Ingredient Proxy

		ingredient = DomainFactory.eINSTANCE.createIngredient();
		ingredient.setName(Constants.HR_SERVICE_PROXY_CLIENT_INGREDIENT);
		ingredient.setUid(UUID.randomUUID().toString());
		ingredient.setLayer(PlatformLayers.SERVICE_LAYER);
		recipe.getIngredients().add(ingredient);

		component = DomainFactory.eINSTANCE.createJavaComponent();
		component.setName(Constants.HR_SERVICE_PROXY_CLIENT);
		component.setUid(UUID.randomUUID().toString());
		component.setComponentRoot("/Users/arseniy/generatedCode/serviceLayer");
		component.setArtifactId("hrservice-proxy-client");
		component.setGroupId("org.tura.example.service");
		component.setVersion("1.0");
		component.setBasePackage("org.tura.example.service");
		ingredient.getComponents().add(component);

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get " + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		query.setGroupCode("a.remote");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);

		query = DomainFactory.eINSTANCE.createQuery();
		query.setGroupCode("a.impl");
		query.setName("Get " + Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		query.getVariables().add(var);

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get " + Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		query.setGroupCode("b.remote");
		modelMapper.getQueries().add(query);
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		query.getVariables().add(var);

		query = DomainFactory.eINSTANCE.createQuery();
		query.setName("Get " + Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		modelMapper.getQueries().add(query);
		query.setGroupCode("b.impl");
		query.setQueryRef((ModelQuery) artifactMap.get(InitDiagram.EJBSERVICE
				+ "_" + InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
				+ InitDiagram.QUERY_TYPE));

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_TYPE_NAME));
		var.setValue(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		query.getVariables().add(var);

		var = DomainFactory.eINSTANCE.createQueryVariable();
		var.setUid(UUID.randomUUID().toString());
		var.setQueryParamRef((QueryParameter) artifactMap
				.get(InitDiagram.EJBSERVICE + "_"
						+ InitDiagram.MAVEN_POM_EJB_SERVICE_PROXY_CLIENT + "_"
						+ InitDiagram.QUERY_TYPE + "_"
						+ InitDiagram.VAR_PACKAGE_NAME));
		var.setValue(Constants.PACKAGE_HR);
		query.getVariables().add(var);

		for (Iterator<domain.ConfigVariable> itr = modelMapper.getArtifactRef()
				.getConfigVariables().iterator(); itr.hasNext();) {
			domain.ConfigVariable confvar = itr.next();
			domain.Property prop = DomainFactory.eINSTANCE.createProperty();
			prop.setConfVarRef(confvar);
			prop.setUid(UUID.randomUUID().toString());
			String v = null;
			if (confvar.getName().equals(InitDiagram.APPLICATION_SERVER_IP))
				v = "localhost";
			if (confvar.getName().equals(InitDiagram.APPLICATION_SERVER_PORT))
				v = "8080";

			prop.setValue(v);
			conf.getProperties().add(prop);
		}

		modelMapper = DomainFactory.eINSTANCE.createModelMapper();
		component.getMappers().add(modelMapper);
		modelMapper.setName(InitDiagram.MAVEN_BUILDER);
		modelMapper.setUid(UUID.randomUUID().toString());
		modelMapper.setArtifactRef((Artifact) artifactMap
				.get(InitDiagram.CONTINUOUS_INTEGRATION + "_"
						+ InitDiagram.MAVEN_BUILDER));
		modelMapper.setDomainArtifactRef(modelMapper.getArtifactRef()
				.getParent().getParent());

		for (Iterator<domain.Specifier> itr = modelMapper.getArtifactRef()
				.getSpecifiers().iterator(); itr.hasNext();) {
			domain.Specifier sp = itr.next();
			domain.MappingSpecifier ms = DomainFactory.eINSTANCE
					.createMappingSpecifier();
			ms.setSpecifierRef(sp);
			ms.setValueRef(sp.getOptions().get(0));
			ms.setUid(UUID.randomUUID().toString());
			modelMapper.getSpecifiers().add(ms);
		}

	}
	
	
}
