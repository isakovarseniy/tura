package org.tura.metamodel.commons.initdiagram;

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;

public class InitDiagram {

	public static domain.Domain initDomainDiagram(Resource resource) {

		domain.Domain model = domain.DomainFactory.eINSTANCE.createDomain();
		model.setUid(UUID.randomUUID().toString());

		domain.DomainApplications domainApplications = domain.DomainFactory.eINSTANCE
				.createDomainApplications();
		domainApplications.setName("Domain applications");
		domainApplications.setUid(UUID.randomUUID().toString());

		domain.DomainTypes domainTypes = domain.DomainFactory.eINSTANCE
				.createDomainTypes();
		domainTypes.setName("Domain types");
		domainTypes.setUid(UUID.randomUUID().toString());

		domain.DomainArtifacts domainArtifacts = domain.DomainFactory.eINSTANCE
				.createDomainArtifacts();
		domainArtifacts.setName("Domain artifacts");
		domainArtifacts.setUid(UUID.randomUUID().toString());

		domain.JPAService jpaService = domain.DomainFactory.eINSTANCE
				.createJPAService();
		jpaService.setName("JPAService");
		jpaService.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(jpaService);
		jpaService.setArtifact(initJPAServiceDiagram(resource));

		domain.EJBService ejbService = domain.DomainFactory.eINSTANCE
				.createEJBService();
		ejbService.setName("EJBService");
		ejbService.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(ejbService);
		ejbService.setArtifact(initEJBServiceDiagram(resource));

		domain.ORMEntity ormEntity = domain.DomainFactory.eINSTANCE
				.createORMEntity();
		ormEntity.setName("ORMEntity");
		ormEntity.setUid(UUID.randomUUID().toString());
		domainArtifacts.getDomainArtifact().add(ormEntity);
		ormEntity.setArtifact(initORMEntityDiagram(resource));

		model.setDomainTypes(domainTypes);
		model.setDomainApplications(domainApplications);
		model.setDomainArtifacts(domainArtifacts);

		return model;
	}

	public static domain.Application initApplicationDiagram(Resource resource) {

		domain.Application model = domain.DomainFactory.eINSTANCE
				.createApplication();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.ApplicationRecipes applicationRecipes = domain.DomainFactory.eINSTANCE
				.createApplicationRecipes();
		applicationRecipes.setName("Application recipes");
		applicationRecipes.setUid(UUID.randomUUID().toString());

		domain.ApplicationMappers applicationMappers = domain.DomainFactory.eINSTANCE
				.createApplicationMappers();
		applicationMappers.setName("Application mapper");
		applicationMappers.setUid(UUID.randomUUID().toString());

		model.setApplicationRecipes(applicationRecipes);
		model.setApplicationMappers(applicationMappers);

		domain.ApplicationMapper appmaper = InitDiagram
				.initPrimitivesMapping(resource);
		model.getApplicationMappers().getMappers().add(appmaper);

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

		model.setTypeDefinition(types);

		for (int i = 0; i < org.tura.metamodel.commons.PlatformPrimetiveTypes
				.values().length; i++) {
			domain.Primitive primitive = domain.DomainFactory.eINSTANCE
					.createPrimitive();
			primitive.setUid(UUID.randomUUID().toString());
			primitive.setName(org.tura.metamodel.commons.PlatformPrimetiveTypes
					.values()[i].name());
			types.getPrimitives().add(primitive);
		}

		domain.Package pkg = initBasePackage(resource);
		model.getTypeDefinition().getPackages().add(pkg);

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

	public static domain.Artifacts initJPAServiceDiagram(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
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

		domain.Specifier specifier = domain.DomainFactory.eINSTANCE
				.createSpecifier();
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

		domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE
				.createConfigVariable();
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

	public static domain.Artifacts initEJBServiceDiagram(Resource resource) {

		domain.Artifacts model = domain.DomainFactory.eINSTANCE
				.createArtifacts();
		model.setUid(UUID.randomUUID().toString());
		resource.getContents().add(model);

		domain.Artifact artifact = domain.DomainFactory.eINSTANCE
				.createArtifact();
		artifact.setName("Service Bean");
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("j2ee/ejb/serviceBean");
		model.getArtifacts().add(artifact);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setName("Maven pom EJB Service jar");
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setTemplate("j2ee/ejb/mavenPom_EJBService_jar");
		model.getArtifacts().add(artifact);

		artifact = domain.DomainFactory.eINSTANCE.createArtifact();
		artifact.setUid(UUID.randomUUID().toString());
		artifact.setName("persistens.xml");
		artifact.setTemplate("j2ee/ejb");
		model.getArtifacts().add(artifact);

		domain.Specifier specifier = domain.DomainFactory.eINSTANCE
				.createSpecifier();
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
		specifier.getOptions().add(option);
		option.setUid(UUID.randomUUID().toString());
		option.setValue("MySQL");

		domain.ConfigVariable confVar = domain.DomainFactory.eINSTANCE
				.createConfigVariable();
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

	public static domain.ApplicationMapper initPrimitivesMapping(
			Resource resource) {
		domain.ApplicationMapper model = domain.DomainFactory.eINSTANCE
				.createApplicationMapper();
		model.setUid(UUID.randomUUID().toString());
		model.setName("Primitives mapper");

		domain.Mappers mappers = domain.DomainFactory.eINSTANCE.createMappers();
		mappers.setUid(UUID.randomUUID().toString());
		model.setMapper(mappers);
		resource.getContents().add(mappers);

		domain.JavaMapper mapper = domain.DomainFactory.eINSTANCE
				.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("String");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("String");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Boolean");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Boolean");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Decimal");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("BigDecimal");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Float");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Float");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Double");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Double");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("DateTime");
		mapper.setMappedToPackageName("java.util");
		mapper.setMappedToClassName("Date");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Date");
		mapper.setMappedToPackageName("java.util");
		mapper.setMappedToClassName("Date");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Integer");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Integer");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("Long");
		mapper.setMappedToPackageName("java.lang");
		mapper.setMappedToClassName("Long");
		mappers.getMappers().add(mapper);

		mapper = domain.DomainFactory.eINSTANCE.createJavaMapper();
		mapper.setUid(UUID.randomUUID().toString());
		mapper.setPackageName("Primitives");
		mapper.setTypeName("HexBinary");
		mapper.setMappedToPackageName("");
		mapper.setMappedToClassName("byte[]");
		mappers.getMappers().add(mapper);

		return model;
	}

	public static domain.Package initBasePackage(Resource resource) {

		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName("Base package");
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
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("parentId");
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objType");
		attr.setPackageName("Primitives");
		attr.setTypeName("String");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objStatus");
		attr.setPackageName("Primitives");
		attr.setTypeName("String");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("createDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("updateDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("activeDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("expiredDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		return pkg;
	}

}
