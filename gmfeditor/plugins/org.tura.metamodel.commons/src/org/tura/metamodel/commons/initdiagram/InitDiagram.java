package org.tura.metamodel.commons.initdiagram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class InitDiagram {

	public static String PRIVATE_PACKAGE = "Primitive package";
	public static String BASE_PACKAGE = "Base package";
	public static String PRIMITIVES_MAPPER = "Primitives mapper";
	public static String DOMAIN_APPLICATIONS = "Domain applications";
	public static String DOMAIN_TYPES = "Domain types";
	public static String DOMAIN_ARTIFACTS = "Domain artifacts";
	public static String JPASERVICE = "JPAService";
	public static String EJBSERVICE = "EJBService";
	public static String ORMENTITY = "ORMEntity";
	public static String APPLICATION_RECIPES = "Application recipes";
	public static String APPLICATION_MAPPER = "Application mapper";
	public static String ENTITYOBJECT = "entityObject";
	public static String  PACKAGEENTITYOBJECT = "Package of Entity objects";
	public static String  PACKAGE_EJB_SERVICES = "Package of EJB Service";
	public static String  PACKAGE_REMOTE_EJB_INTERFACE = "Package of Remote EJB interface";
	public static String  PACKAGE_LOCAL_EJB_INTERFACE = "Package of Local EJB interface";
	public static String SERVICE_BEAN = "Service Bean";
	public static String REMOTE_INTERFACE = "Remote Interface";
	public static String LOCAL_INTERFACE = "Local Interface";
	public static String CONFIGURATION_JPA = "Configuration JPA";
	public static String JPA_IMPLEMENTATION = "JPA implementation";
	public static String DATABASE_TYPE = "Database type";
	public static String CONNECTION_TYPE = "Connection type";
	public static String DATABASE_IP = "DataBase IP";
	public static String DATABASE_SOCKET = "DataBase socket";
	public static String DATABASE_USER = "DataBase user";
	public static String DATABASE_PASSWORD = "DataBase password";
	public static String DATABASE_SCHEMA = "DataBase schema";
	public static String JNDI_ACCESS_STRING = "jndi access string";
	public static String PERSISTENS_XML = "persistens.xml";
	public static String APPLICATION_SERVER_IP = "Application server IP";
	public static String APPLICATION_SERVER_PORT = "Application server port";

	public static String EJB_ENTITY_CRAD_SERVICE = "EJB Entity CRAD Service";
	public static String JPA_ENTITY_CRAD_SERVICE = "JPA Entity CRAD Service";

	public static String MAVEN_POM_JPA_SERVICE = "Maven pom JPA Service";
	public static String MAVEN_POM_EJB_SERVICE = "Maven pom EJB Service";
	public static String MAVEN_POM_EJB_SERVICE_PROXY_CLIENT = "Maven pom EJB Service proxy client";

	public static String QUERY_TYPE = "Query type";
	public static String QUERY_TYPE_LOCAL = "Query local interface";
	public static String QUERY_TYPE_REMOTE = "Query remote interface";
	public static String VAR_PACKAGE_NAME = "Package name";
	public static String QUERY_TYPE_GENERIC = "Query generic type";
	public static String VAR_TYPE_NAME = "Type name";
	public static String QUERY_COMPONENT = "Query component";

	public static String MAVEN_BUILDER = "Maven Builder";
	public static String GLASSFISH_DEPLOYER = "GlassFish ejb webservice deployer";
	public static String CONTINUOUS_INTEGRATION = "Continuous integration";
	public static String ARTIFACT_TYPE = "Artifact type";

	public static String GLASSFISH_HOME = "GlassFish home";
	public static String MAVEN_LOCATION = "Maven location";
	public static String GLASSFISH_ADMIN_PORT = "GlassFish admin port";
	public static String GLASSFISH_DOMAIN = "GlassFish domain";

	public static String HINTS_IMPLEMENTS = "Implements";
	public static String HINTS_EXTENDS = "Extends";
	public static String HINTS_EJBSERVICE = "EJBService";
	public static String HINTS_EJB_REMOTE_INREFACE = "EJBRemoteInterface";
	public static String HINTS_EJB_LOCAL_INREFACE = "EJBLocalInterface";
	public static String HINTS_ENTITY= "Entity";
	public static String HINTS_EJB_GENERICS = "Generics";

	
	public static String VAR_ARTIFACT_LIB = "ArtifactLib";
	public static String VAR_ARTIFACT = "Artifact";
	public static String VAR_HINT = "Hint";
	
	public static String OS = "OS";

	public static domain.Domain initDomainDiagram(Resource resource) {

		domain.Domain model = domain.DomainFactory.eINSTANCE.createDomain();
		model.setUid(UUID.randomUUID().toString());

		domain.DomainApplications domainApplications = domain.DomainFactory.eINSTANCE
				.createDomainApplications();
		domainApplications.setName(DOMAIN_APPLICATIONS);
		domainApplications.setUid(UUID.randomUUID().toString());

		domain.DomainTypes domainTypes = domain.DomainFactory.eINSTANCE
				.createDomainTypes();
		domainTypes.setName(DOMAIN_TYPES);
		domainTypes.setUid(UUID.randomUUID().toString());

		domain.DomainArtifacts domainArtifacts = domain.DomainFactory.eINSTANCE
				.createDomainArtifacts();
		domainArtifacts.setName(DOMAIN_ARTIFACTS);
		domainArtifacts.setUid(UUID.randomUUID().toString());
		domainArtifacts.setColumns(4);

		domain.JPAService jpaService = domain.DomainFactory.eINSTANCE
				.createJPAService();
		jpaService.setName(JPASERVICE);
		jpaService.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(jpaService);
		jpaService.setArtifact(initJPAServiceDiagram(resource));

		domain.EJBService ejbService = domain.DomainFactory.eINSTANCE
				.createEJBService();
		ejbService.setName(EJBSERVICE);
		ejbService.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(ejbService);
		ejbService.setArtifact(initEJBServiceDiagram(resource));

		domain.ORMEntity ormEntity = domain.DomainFactory.eINSTANCE
				.createORMEntity();
		ormEntity.setName(ORMENTITY);
		ormEntity.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(ormEntity);
		ormEntity.setArtifact(initORMEntityDiagram(resource));

		model.setDomainTypes(domainTypes);
		model.setDomainApplications(domainApplications);
		model.setDomainArtifacts(domainArtifacts);

		domain.ContinuousIintegration cnInteg = domain.DomainFactory.eINSTANCE
				.createContinuousIintegration();
		cnInteg.setName(CONTINUOUS_INTEGRATION);
		cnInteg.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(cnInteg);
		cnInteg.setArtifact(initContinuousIntegration(resource));

		initLang(resource);

		return model;
	}

	public static domain.Application initApplicationDiagram(Resource resource) {

		domain.Application model = domain.DomainFactory.eINSTANCE
				.createApplication();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.ApplicationRecipes applicationRecipes = domain.DomainFactory.eINSTANCE
				.createApplicationRecipes();
		applicationRecipes.setName(APPLICATION_RECIPES);
		applicationRecipes.setUid(UUID.randomUUID().toString());

		domain.ApplicationMappers applicationMappers = domain.DomainFactory.eINSTANCE
				.createApplicationMappers();
		applicationMappers.setName(APPLICATION_MAPPER);
		applicationMappers.setUid(UUID.randomUUID().toString());

		model.setApplicationRecipes(applicationRecipes);
		model.setApplicationMappers(applicationMappers);

		domain.ApplicationMapper appmaper = InitDiagram
				.initPrimitivesMapping(resource);
		model.getApplicationMappers().getMappers().add(appmaper);

		return model;
	}

	public static void initLang(Resource resource) {

		domain.Language lang = domain.DomainFactory.eINSTANCE.createLanguage();
		lang.setLang("English");
		lang.setUid(lang.getLang());
		lang.setCode("en");
		resource.getContents().add(lang);

		lang = domain.DomainFactory.eINSTANCE.createLanguage();
		lang.setLang("France");
		lang.setUid(lang.getLang());
		lang.setCode("fr");
		resource.getContents().add(lang);

	}

	public static domain.Form initFormDiagram(Resource resource) {
		domain.Form model = domain.DomainFactory.eINSTANCE.createForm();

		domain.FormView view = domain.DomainFactory.eINSTANCE.createFormView();
		view.setName("Views");
		model.setView(view);

		domain.FormDataControls controls = domain.DomainFactory.eINSTANCE
				.createFormDataControls();
		controls.setName("DataControls");
		model.setDatacontrols(controls);

		return model;
	}

	public static domain.TypesRepository initTypesRepositoryDiagram(
			Resource resource) {
		domain.TypesRepository model = domain.DomainFactory.eINSTANCE
				.createTypesRepository();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Types types = domain.DomainFactory.eINSTANCE.createTypes();
		types.setUid(UUID.randomUUID().toString());
		types.setColumns(2);

		model.setTypeDefinition(types);

		domain.Package pkg = initPrimitivesPackage(resource);
		types.getPackages().add(pkg);

		pkg = initBasePackage(resource);
		types.getPackages().add(pkg);

		return model;
	}

	public static domain.Artifacts initORMEntityDiagram(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(ENTITYOBJECT);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ORMMapper/mainEntity.egl");

		domain.ModelQuery query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		artifact.getModelQuery().add(query);

		domain.QueryParameter param = domain.DomainFactory.eINSTANCE
				.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		model.getArtifacts().add(artifact);

		domain.GenerationHint hint = domain.DomainFactory.eINSTANCE
				.createGenerationHint();
		hint.setName(HINTS_IMPLEMENTS);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);

		hint = domain.DomainFactory.eINSTANCE.createGenerationHint();
		hint.setName(HINTS_EXTENDS);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);

		hint = domain.DomainFactory.eINSTANCE.createGenerationHint();
		hint.setName(HINTS_ENTITY);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);

		
		artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(PACKAGEENTITYOBJECT);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ORMMapper/mainPackageEntity.egl");

		query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type ) ) )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}' and c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name = '${Artifact}' and  c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name = '${ArtifactLib}' )->collect(c|c.oclAsType(ecore::EObject).eContainer())");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT_LIB);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_HINT);
		query.getParameters().add(param);
		
		model.getArtifacts().add(artifact);
		
		
		
		
		return model;
	}

	public static domain.Artifacts initJPAServiceDiagram(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(SERVICE_BEAN);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/jpa/mainJPA.egl");
		model.getArtifacts().add(artifact);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(MAVEN_POM_JPA_SERVICE);
		artifact.setTemplate("j2ee/jpa/mavenPom_JPAService_jar");
		model.getArtifacts().add(artifact);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(CONFIGURATION_JPA);
		artifact.setTemplate("j2ee/jpa/configJPA");
		model.getArtifacts().add(artifact);

		domain.Specifier specifier = domain.DomainFactory.eINSTANCE
				.createSpecifier();
		specifier.setUid(UUID.randomUUID().toString());
		specifier.setName(JPA_IMPLEMENTATION);
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
		specifier.setName(DATABASE_TYPE);
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
		specifier.setName(CONNECTION_TYPE);
		artifact.getSpecifiers().add(specifier);

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("jdbc");

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("jndi");

		domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE
				.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_IP);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_SOCKET);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_USER);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_PASSWORD);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_SCHEMA);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(JNDI_ACCESS_STRING);
		artifact.getConfigVariables().add(confVar);

		return model;
	}

	public static domain.Artifacts initEJBServiceDiagram(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setName(SERVICE_BEAN);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainEjb.egl");

		domain.GenerationHint hint = domain.DomainFactory.eINSTANCE
				.createGenerationHint();
		hint.setName(HINTS_EJBSERVICE);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);

		hint = domain.DomainFactory.eINSTANCE.createGenerationHint();
		hint.setName(HINTS_EJB_REMOTE_INREFACE);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);

		hint = domain.DomainFactory.eINSTANCE.createGenerationHint();
		hint.setName(HINTS_EJB_LOCAL_INREFACE);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);


		hint = domain.DomainFactory.eINSTANCE.createGenerationHint();
		hint.setName(HINTS_EJB_GENERICS);
		hint.setUid(UUID.randomUUID().toString());
		artifact.getHints().add(hint);
		
		
		domain.ModelQuery query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		artifact.getModelQuery().add(query);

		domain.QueryParameter param = domain.DomainFactory.eINSTANCE
				.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

//		query = domain.DomainFactory.eINSTANCE.createModelQuery();
//		query.setUid(UUID.randomUUID().toString());
//		query.setName(QUERY_TYPE_LOCAL);
//		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
//		artifact.getModelQuery().add(query);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_TYPE_NAME);
//		query.getParameters().add(param);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_PACKAGE_NAME);
//		query.getParameters().add(param);
//
//		query = domain.DomainFactory.eINSTANCE.createModelQuery();
//		query.setUid(UUID.randomUUID().toString());
//		query.setName(QUERY_TYPE_REMOTE);
//		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
//		artifact.getModelQuery().add(query);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_TYPE_NAME);
//		query.getParameters().add(param);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_PACKAGE_NAME);
//		query.getParameters().add(param);
//
//		query = domain.DomainFactory.eINSTANCE.createModelQuery();
//		query.setUid(UUID.randomUUID().toString());
//		query.setName(QUERY_TYPE_GENERIC);
//		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
//		artifact.getModelQuery().add(query);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_TYPE_NAME);
//		query.getParameters().add(param);
//
//		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
//		param.setUid(UUID.randomUUID().toString());
//		param.setName(VAR_PACKAGE_NAME);
//		query.getParameters().add(param);

		model.getArtifacts().add(artifact);

		// ************

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName(MAVEN_POM_EJB_SERVICE_PROXY_CLIENT);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainMavenPom_EJBService_ProxyClient.egl");

		query = domain.DomainFactory.eINSTANCE.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE
				.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(APPLICATION_SERVER_IP);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(APPLICATION_SERVER_PORT);
		artifact.getConfigVariables().add(confVar);

		model.getArtifacts().add(artifact);

		// -------

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName(REMOTE_INTERFACE);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainEjbRemoteInterface.egl");

		query = domain.DomainFactory.eINSTANCE.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		model.getArtifacts().add(artifact);

		// ---------
		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName(LOCAL_INTERFACE);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainEjbLocalInterface.egl");

		query = domain.DomainFactory.eINSTANCE.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		model.getArtifacts().add(artifact);
		// -----------------

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName(MAVEN_POM_EJB_SERVICE);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainMavenPom_EJBService.egl");
		model.getArtifacts().add(artifact);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(PERSISTENS_XML);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainPersistence-xml.egl");
		model.getArtifacts().add(artifact);

		query = domain.DomainFactory.eINSTANCE.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '${Type name}')  or (r.oclIsKindOf(domain::Primitive) and  r.oclAsType(domain::Primitive).name = '${Type name}') or (r.oclIsKindOf(domain::Enumarator) and  r.oclAsType(domain::Enumarator).name = '${Type name}') )");
		query.setName(QUERY_TYPE);
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_TYPE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		domain.Specifier specifier = domain.DomainFactory.eINSTANCE
				.createSpecifier();
		specifier.setUid(UUID.randomUUID().toString());
		specifier.setName(JPA_IMPLEMENTATION);
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
		specifier.setName(DATABASE_TYPE);
		artifact.getSpecifiers().add(specifier);

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("PostgresSQL");

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("Oracle");

		option = domain.DomainFactory.eINSTANCE.createOption();
		specifier.getOptions().add(option);
		option.setUid(UUID.randomUUID().toString());
		option.setValue("MySQL");

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_IP);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_SOCKET);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_USER);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_PASSWORD);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(DATABASE_SCHEMA);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(JNDI_ACCESS_STRING);
		artifact.getConfigVariables().add(confVar);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName(GLASSFISH_DEPLOYER);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainGlassfishDeployer.egl");
		model.getArtifacts().add(artifact);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(GLASSFISH_HOME);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(GLASSFISH_ADMIN_PORT);
		artifact.getConfigVariables().add(confVar);

		confVar = domain.DomainFactory.eINSTANCE.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(GLASSFISH_DOMAIN);
		artifact.getConfigVariables().add(confVar);

		specifier = domain.DomainFactory.eINSTANCE.createSpecifier();
		specifier.setUid(UUID.randomUUID().toString());
		specifier.setName(OS);
		artifact.getSpecifiers().add(specifier);

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("Unix");

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("Window");

		
		artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(PACKAGE_EJB_SERVICES);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainPackageEJBServices.egl");

		query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type ) ) )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}' and c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name = '${Artifact}' and  c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name = '${ArtifactLib}' )->collect(c|c.oclAsType(ecore::EObject).eContainer())");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT_LIB);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_HINT);
		query.getParameters().add(param);
		
		model.getArtifacts().add(artifact);
		
		artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(PACKAGE_REMOTE_EJB_INTERFACE);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainPackageRemoteEJBInterface.egl");

		query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type ) ) )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}' and c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name = '${Artifact}' and  c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name = '${ArtifactLib}' )->collect(c|c.oclAsType(ecore::EObject).eContainer())");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT_LIB);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_HINT);
		query.getParameters().add(param);
		
		model.getArtifacts().add(artifact);
		
		artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName(PACKAGE_LOCAL_EJB_INTERFACE);
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/jee/ejb-ws/mainPackageLocalEJBInterface.egl");

		query = domain.DomainFactory.eINSTANCE
				.createModelQuery();
		query.setUid(UUID.randomUUID().toString());
		query.setName(QUERY_TYPE);
		query.setQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type ) ) )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}' and c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name = '${Artifact}' and  c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name = '${ArtifactLib}' )->collect(c|c.oclAsType(ecore::EObject).eContainer())");
		artifact.getModelQuery().add(query);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_PACKAGE_NAME);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT_LIB);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_ARTIFACT);
		query.getParameters().add(param);

		param = domain.DomainFactory.eINSTANCE.createQueryParameter();
		param.setUid(UUID.randomUUID().toString());
		param.setName(VAR_HINT);
		query.getParameters().add(param);
		
		model.getArtifacts().add(artifact);
		
		
		return model;
	}

	public static domain.Artifacts initContinuousIntegration(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setName(MAVEN_BUILDER);
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("platform:/plugin/org.tura.metamodel.wizard.generation/template/continuousIntegration/mainMavenBuilder.egl");
		model.getArtifacts().add(artifact);

		domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE
				.createConfigVariable();
		confVar.setUid(UUID.randomUUID().toString());
		confVar.setName(MAVEN_LOCATION);
		artifact.getConfigVariables().add(confVar);

		domain.Specifier specifier = domain.DomainFactory.eINSTANCE
				.createSpecifier();
		specifier.setUid(UUID.randomUUID().toString());
		specifier.setName(OS);
		artifact.getSpecifiers().add(specifier);

		domain.Option option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("Unix");

		option = domain.DomainFactory.eINSTANCE.createOption();
		option.setUid(UUID.randomUUID().toString());
		specifier.getOptions().add(option);
		option.setValue("Window");

		return model;

	}

	public static domain.ApplicationMapper initPrimitivesMapping(
			Resource resource) {

		HashMap<String, domain.TypeElement> typesHash = getTypeElements(resource);

		domain.ApplicationMapper model = domain.DomainFactory.eINSTANCE
				.createApplicationMapper();
		model.setUid(UUID.randomUUID().toString());
		model.setName(PRIMITIVES_MAPPER);

		domain.Mappers mappers = domain.DomainFactory.eINSTANCE.createMappers();
		mappers.setUid(UUID.randomUUID().toString());
		model.setMapper(mappers);
		resource.getContents().add(mappers);

		domain.JavaMapper mapper = domain.DomainFactory.eINSTANCE
				.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_String")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_String"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("String");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Boolean")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Boolean"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Boolean");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Decimal")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Decimal"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("BigDecimal");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Float")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Float"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Float");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Double")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Double"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Double");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_DateTime")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_DateTime"));
		mapper.setMappedToPackageName("java.util");
		mapper.setMappedToClassName("Date");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Date")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Date"));
		mapper.setMappedToPackageName("java.util");
		mapper.setMappedToClassName("Date");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Integer")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Integer"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Integer");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Long")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Long"));
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Long");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_HexBinary")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_HexBinary"));
		mapper.setMappedToPackageName("");
		mapper.setMappedToClassName("byte[]");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Void")
				.getParent().getParent());
		mapper.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Void"));
		mapper.setMappedToPackageName("");
		mapper.setMappedToClassName("void");
		mapper.setUiLayer(true);
		mapper.setServiceLayer(true);
		mappers.getMappers().add(mapper);

		return model;
	}

	public static domain.Package initPrimitivesPackage(Resource resource) {
		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName(PRIVATE_PACKAGE);
		pkg.setUid(UUID.randomUUID().toString());
		resource.getContents().add(pkg);

		domain.TypeDefinition td = domain.DomainFactory.eINSTANCE
				.createTypeDefinition();
		resource.getContents().add(td);
		td.setUid(UUID.randomUUID().toString());
		pkg.setTypedefinition(td);

		for (int i = 0; i < org.tura.metamodel.commons.PlatformPrimetiveTypes
				.values().length; i++) {
			domain.Primitive primitive = domain.DomainFactory.eINSTANCE
					.createPrimitive();
			primitive.setUid(UUID.randomUUID().toString());
			primitive.setName(org.tura.metamodel.commons.PlatformPrimetiveTypes
					.values()[i].name());
			pkg.getTypedefinition().getTypes().add(primitive);
		}

		return pkg;

	}

	public static domain.Package initBasePackage(Resource resource) {

		HashMap<String, domain.TypeElement> typesHash = getTypeElements(resource);

		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName(BASE_PACKAGE);
		pkg.setUid(UUID.randomUUID().toString());
		resource.getContents().add(pkg);

		domain.TypeDefinition td = domain.DomainFactory.eINSTANCE
				.createTypeDefinition();
		resource.getContents().add(td);
		td.setUid(UUID.randomUUID().toString());
		pkg.setTypedefinition(td);

		domain.Type baseType = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(baseType);
		td.getTypes().add(baseType);
		baseType.setName("BaseType");
		baseType.setUid(UUID.randomUUID().toString());

		domain.Attribute attr = domain.DomainFactory.eINSTANCE
				.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setName("objId");
		attr.setPk(true);
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Long").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("parentId");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Long").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objType");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_String")
				.getParent().getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objStatus");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_String")
				.getParent().getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("createDate");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Date").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Date"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("updateDate");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Date").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Date"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("activeDate");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Date").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Date"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("expiredDate");
		attr.setPackageRef(typesHash.get(PRIVATE_PACKAGE + "_Date").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(PRIVATE_PACKAGE + "_Date"));
		attr.setUid(UUID.randomUUID().toString());

		domain.Type ejbEntityService = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(ejbEntityService);
		td.getTypes().add(ejbEntityService);
		ejbEntityService.setName(EJB_ENTITY_CRAD_SERVICE);
		ejbEntityService.setUid(UUID.randomUUID().toString());

		domain.Type jpaEntityService = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(jpaEntityService);
		td.getTypes().add(jpaEntityService);
		jpaEntityService.setName(JPA_ENTITY_CRAD_SERVICE);
		jpaEntityService.setUid(UUID.randomUUID().toString());

		return pkg;
	}

	public static HashMap<String, domain.TypeElement> getTypeElements(
			Resource resource) {

		HashMap<String, domain.TypeElement> map = new HashMap<String, domain.TypeElement>();

		for (Iterator<EObject> itr = resource.getContents().iterator(); itr
				.hasNext();) {
			EObject obj = itr.next();
			if (obj instanceof domain.TypeDefinition) {
				for (Iterator<domain.TypeElement> typesItr = ((domain.TypeDefinition) obj)
						.getTypes().iterator(); typesItr.hasNext();) {
					domain.TypeElement typeElement = typesItr.next();
					map.put(typeElement.getParent().getParent().getName() + "_"
							+ typeElement.getName(), typeElement);
				}
			}
		}
		return map;
	}

	public static HashMap<String, Object> getArtifactElements(Resource resource) {

		HashMap<String, Object> map = new HashMap<String, Object>();

		for (Iterator<EObject> itr = resource.getContents().iterator(); itr
				.hasNext();) {
			EObject obj = itr.next();
			if (obj instanceof domain.Artifacts) {
				for (Iterator<domain.Artifact> artitr = ((domain.Artifacts) obj)
						.getArtifacts().iterator(); artitr.hasNext();) {
					domain.Artifact artifact = artitr.next();
					map.put(artifact.getParent().getParent().getName() + "_"
							+ artifact.getName(), artifact);

					for (Iterator<domain.GenerationHint> hintItr = artifact
							.getHints().iterator(); hintItr.hasNext();) {
						domain.GenerationHint h = hintItr.next();
						map.put(artifact.getParent().getParent().getName() + "_"
								+ artifact.getName()+"_"+ h.getName(), h);
					}

					for (Iterator<domain.ModelQuery> mqItr = artifact
							.getModelQuery().iterator(); mqItr.hasNext();) {
						domain.ModelQuery mq = mqItr.next();
						map.put(artifact.getParent().getParent().getName()
								+ "_" + artifact.getName() + "_" + mq.getName(),
								mq);
						for (Iterator<domain.QueryParameter> paramItr = mq
								.getParameters().iterator(); paramItr.hasNext();) {
							domain.QueryParameter param = paramItr.next();
							map.put(artifact.getParent().getParent().getName()
									+ "_" + artifact.getName() + "_"
									+ mq.getName() + "_" + param.getName(),
									param);
						}

					}
				}
			}
		}
		return map;
	}

	public static void addType(HashMap<String, domain.TypeElement> map,
			domain.TypeElement typeElement) {
		map.put(typeElement.getParent().getParent().getName() + "_"
				+ typeElement.getName(), typeElement);
	}

}
