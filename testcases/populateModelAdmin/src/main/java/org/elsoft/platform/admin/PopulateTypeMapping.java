/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform.admin;

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.types.TypeMappingHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateTypeMapping {

	public void execute(RepositoryFactory rf) {
		createDomainMapping(rf);
		createFunctionalDomainMapping(rf);
		createApplicationMapping(rf);
		createUIContainerMapping(rf);

		createBusinessObjectMapping(rf);
		createMethodMapping(rf);
		createMethodReferenceMapping(rf);
		createParameterMapping(rf);
		createPropertyMapping(rf);
		createTypeDefinitionMapping(rf);
		createTypeMappingMapping(rf);
		createArtifactTypeMapping(rf);
		createApplicationRoleMapping(rf);
		createGlobalRoleMapping(rf);
		
		createIngredientMapping(rf);
		createModelMappingMapping(rf);
		createPacketMapping(rf);
		createRecipeMapping(rf);
		createServerClasterMapping(rf);
		createServerGridMapping(rf);
		createServerZoneMapping(rf);
		createOptionsMapping(rf);
		
		createCommandMapping(rf);
		createRoleMapingCommandMapping(rf);
		createDataSourceCommandMapping(rf);

		createDataSourceMapping(rf);
		
		createFormTriggersMapping(rf);	
	}

	
	private void createOptionsMapping(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO options = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "options").getObject();

		TypeDAO optionsService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "optionsService").getObject();

		TypeDAO optionsSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "optionsSearchCriteria").getObject();

		TypeDAO optionsOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "optionsOrderByCriteria").getObject();
		
		TypeDAO optionsList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "optionsList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(options, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects");
		mp.setResTypeName("OptionsDAO");
		mp.setGroupName("org.elsoft.platform.ELsoft.Platform");
		mp.setArtifactName("Model-ELsoft-Platform-Metarepository");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(optionsService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.options");
		mp.setResTypeName("OptionsService");
		mp.setGroupName("org.elsoft.platform.ELsoft.Platform");
		mp.setArtifactName("Model-ELsoft-Platform-Metarepository");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");
		

		mp = tpmh.addTypeMapping(options, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects");
		mp.setResTypeName("OptionsDAO");

		
		mp = tpmh.addTypeMapping(optionsService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.options");
		mp.setResTypeName("OptionsService");
	

		mp = tpmh.addTypeMapping(optionsSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.SearchCriteria>");


		mp = tpmh.addTypeMapping(optionsSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(optionsOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.OrderCriteria>");


		mp = tpmh.addTypeMapping(optionsOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(optionsList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.metamodel.objects.OptionsDAO>");

		mp = tpmh.addTypeMapping(optionsList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.metamodel.objects.OptionsDAO>");

	}
	

	private void createBusinessObjectMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO businessObject = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObject").getObject();

		TypeDAO businessObjectService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObjectService").getObject();

		TypeDAO businessObjectSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObjectSearchCriteria").getObject();

		TypeDAO businessObjectOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObjectOrderByCriteria").getObject();
		

		TypeDAO businessObjectList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObjectList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(businessObject, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("BusinessObjectDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(businessObjectService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(businessObjectSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(businessObjectOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(businessObjectList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}


	
	private void createDomainMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO domain = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domain").getObject();

		TypeDAO domainService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainService").getObject();

		TypeDAO domainSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainSearchCriteria").getObject();

		TypeDAO domainOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainOrderByCriteria").getObject();
		

		TypeDAO domainList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(domain, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("DomainDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(domainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(domainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	
	private void createFunctionalDomainMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO functionalDomain = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomain").getObject();

		TypeDAO functionalDomainService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainService").getObject();

		TypeDAO functionalDomainSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainSearchCriteria").getObject();

		TypeDAO functionalDomainOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainOrderByCriteria").getObject();
		

		TypeDAO functionalDomainList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(functionalDomain, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("FunctionalDomainDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(functionalDomainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(functionalDomainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createApplicationMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO application = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "application").getObject();

		TypeDAO applicationService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationService").getObject();

		TypeDAO applicationSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationSearchCriteria").getObject();

		TypeDAO applicationOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationOrderByCriteria").getObject();
		

		TypeDAO applicationList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(application, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("ApplicationDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(applicationService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(applicationSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createUIContainerMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO uiContainer = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainer").getObject();

		TypeDAO uiContainerService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainerService").getObject();

		TypeDAO uiContainerSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainerSearchCriteria").getObject();

		TypeDAO uiContainerOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainerOrderByCriteria").getObject();
		

		TypeDAO uiContainerList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainerList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(uiContainer, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.ui");
		mp.setResTypeName("UIContainerDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(uiContainerService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(uiContainerSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(uiContainerOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(uiContainerList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createMethodMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO method = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "method").getObject();

		TypeDAO methodService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodService").getObject();

		TypeDAO methodSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodSearchCriteria").getObject();

		TypeDAO methodOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodOrderByCriteria").getObject();
		

		TypeDAO methodList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(method, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("MethodDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(methodService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(methodSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(methodOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(methodList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createMethodReferenceMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO methodReference = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReference").getObject();

		TypeDAO methodReferenceService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReferenceService").getObject();

		TypeDAO methodReferenceSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReferenceSearchCriteria").getObject();

		TypeDAO methodReferenceOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReferenceOrderByCriteria").getObject();
		

		TypeDAO methodReferenceList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReferenceList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(methodReference, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("MethodReferenceDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(methodReferenceService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(methodReferenceSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(methodReferenceOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(methodReferenceList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	
	private void createParameterMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO parameter = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameter").getObject();

		TypeDAO parameterService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameterService").getObject();

		TypeDAO parameterSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameterSearchCriteria").getObject();

		TypeDAO parameterOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameterOrderByCriteria").getObject();
		

		TypeDAO parameterList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameterList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(parameter, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("ParameterDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(parameterService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(parameterSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(parameterOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(parameterList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createPropertyMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO property = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "property").getObject();

		TypeDAO propertyService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "propertyService").getObject();

		TypeDAO propertySearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "propertySearchCriteria").getObject();

		TypeDAO propertyOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "propertyOrderByCriteria").getObject();
		

		TypeDAO propertyList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "propertyList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(property, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("PropertyDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(propertyService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(propertySearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(propertyOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(propertyList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createDataSourceMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO dataSource = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "dataSource").getObject();

		TypeDAO dataSourceService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "dataSourceService").getObject();

		TypeDAO dataSourceSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "dataSourceSearchCriteria").getObject();

		TypeDAO dataSourceOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "dataSourceOrderByCriteria").getObject();
		

		TypeDAO dataSourceList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "dataSourceList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(dataSource, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.datasource");
		mp.setResTypeName("DataSourceDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(dataSourceService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(dataSourceSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(dataSourceOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(dataSourceList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	
	private void createTypeDefinitionMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO typeDefinition = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinition").getObject();

		TypeDAO typeDefinitionService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinitionService").getObject();

		TypeDAO typeDefinitionSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinitionSearchCriteria").getObject();

		TypeDAO typeDefinitionOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinitionOrderByCriteria").getObject();
		

		TypeDAO typeDefinitionList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinitionList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(typeDefinition, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("TypeDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(typeDefinitionService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(typeDefinitionSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(typeDefinitionOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(typeDefinitionList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createTypeMappingMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO typeMapping = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMapping").getObject();

		TypeDAO typeMappingService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMappingService").getObject();

		TypeDAO typeMappingSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMappingSearchCriteria").getObject();

		TypeDAO typeMappingOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMappingOrderByCriteria").getObject();
		

		TypeDAO typeMappingList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMappingList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(typeMapping, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.type");
		mp.setResTypeName("TypeMappingDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(typeMappingService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(typeMappingSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(typeMappingOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(typeMappingList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createArtifactTypeMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO artifactType = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactType").getObject();

		TypeDAO artifactTypeService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactTypeService").getObject();

		TypeDAO artifactTypeSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactTypeSearchCriteria").getObject();

		TypeDAO artifactTypeOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactTypeOrderByCriteria").getObject();
		

		TypeDAO artifactTypeList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactTypeList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(artifactType, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.transformation");
		mp.setResTypeName("ArtifactTypeDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(artifactTypeService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(artifactTypeSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(artifactTypeOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(artifactTypeList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createCommandMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO command = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "command").getObject();

		TypeDAO commandService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "commandService").getObject();

		TypeDAO commandSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "commandSearchCriteria").getObject();

		TypeDAO commandOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "commandOrderByCriteria").getObject();
		

		TypeDAO commandList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "commandList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(command, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.command");
		mp.setResTypeName("CommandDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(commandService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(commandSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(commandOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(commandList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createRoleMapingCommandMapping(RepositoryFactory rf){
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO command = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "RoleMappingCommand").getObject();

		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(command, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.command.security");
		mp.setResTypeName("CreateRoleMapperDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");
		
	}
	

	private void createDataSourceCommandMapping(RepositoryFactory rf){
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO command = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "DataSourceCommand").getObject();

		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(command, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.command.datasource");
		mp.setResTypeName("CreateDataSourceDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");
		
	}
	
	
	
	
	private void createApplicationRoleMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO applicationRole = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRole").getObject();

		TypeDAO applicationRoleService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRoleService").getObject();

		TypeDAO applicationRoleSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRoleSearchCriteria").getObject();

		TypeDAO applicationRoleOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRoleOrderByCriteria").getObject();
		

		TypeDAO applicationRoleList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRoleList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(applicationRole, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.security");
		mp.setResTypeName("ApplicationRoleDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(applicationRoleService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(applicationRoleSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationRoleOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationRoleList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createGlobalRoleMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO globalRole = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRole").getObject();

		TypeDAO globalRoleService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRoleService").getObject();

		TypeDAO globalRoleSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRoleSearchCriteria").getObject();

		TypeDAO globalRoleOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRoleOrderByCriteria").getObject();
		

		TypeDAO globalRoleList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRoleList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(globalRole, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.security");
		mp.setResTypeName("GlobalRoleDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(globalRoleService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(globalRoleSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(globalRoleOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(globalRoleList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createIngredientMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO ingredient = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredient").getObject();

		TypeDAO ingredientService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredientService").getObject();

		TypeDAO ingredientSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredientSearchCriteria").getObject();

		TypeDAO ingredientOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredientOrderByCriteria").getObject();
		

		TypeDAO ingredientList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredientList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(ingredient, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.recipe");
		mp.setResTypeName("IngredientDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(ingredientService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(ingredientSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(ingredientOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(ingredientList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createModelMappingMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO modelMapping = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMapping").getObject();

		TypeDAO modelMappingService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMappingService").getObject();

		TypeDAO modelMappingSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMappingSearchCriteria").getObject();

		TypeDAO modelMappingOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMappingOrderByCriteria").getObject();
		

		TypeDAO modelMappingList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMappingList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(modelMapping, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.recipe");
		mp.setResTypeName("ModelMappingDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(modelMappingService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(modelMappingSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(modelMappingOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(modelMappingList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	
	private void createPacketMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO packet = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packet").getObject();

		TypeDAO packetService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packetService").getObject();

		TypeDAO packetSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packetSearchCriteria").getObject();

		TypeDAO packetOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packetOrderByCriteria").getObject();
		

		TypeDAO packetList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packetList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(packet, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.recipe");
		mp.setResTypeName("PacketDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(packetService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(packetSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(packetOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(packetList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createRecipeMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO recipe = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipe").getObject();

		TypeDAO recipeService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipeService").getObject();

		TypeDAO recipeSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipeSearchCriteria").getObject();

		TypeDAO recipeOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipeOrderByCriteria").getObject();
		

		TypeDAO recipeList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipeList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(recipe, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.recipe");
		mp.setResTypeName("RecipeDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(recipeService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(recipeSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(recipeOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(recipeList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createServerClasterMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO serverClaster = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClaster").getObject();

		TypeDAO serverClasterService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClasterService").getObject();

		TypeDAO serverClasterSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClasterSearchCriteria").getObject();

		TypeDAO serverClasterOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClasterOrderByCriteria").getObject();
		

		TypeDAO serverClasterList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClasterList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(serverClaster, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.infrastructure");
		mp.setResTypeName("ServerClasterDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverClasterService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverClasterSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverClasterOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverClasterList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createServerGridMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO serverGrid = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGrid").getObject();

		TypeDAO serverGridService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGridService").getObject();

		TypeDAO serverGridSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGridSearchCriteria").getObject();

		TypeDAO serverGridOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGridOrderByCriteria").getObject();
		

		TypeDAO serverGridList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGridList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(serverGrid, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.infrastructure");
		mp.setResTypeName("ServerGridDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverGridService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverGridSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverGridOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverGridList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}
	
	private void createServerZoneMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO serverZone = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZone").getObject();

		TypeDAO serverZoneService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZoneService").getObject();

		TypeDAO serverZoneSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZoneSearchCriteria").getObject();

		TypeDAO serverZoneOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZoneOrderByCriteria").getObject();
		

		TypeDAO serverZoneList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZoneList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(serverZone, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.infrastructure");
		mp.setResTypeName("ServerZoneDAO");
		mp.setGroupName("org.elsoft.platform.metamodel");
		mp.setArtifactName("metamodel-datastructure");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverZoneService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.persistence");
		mp.setResTypeName("ELsoftJPAEntityService");
		mp.setGroupName("org.elsoft.platform");
		mp.setArtifactName("commons-platform-jpa");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("JPA-SERVICE");

		mp = tpmh.addTypeMapping(serverZoneSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverZoneOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(serverZoneList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createFormTriggersMapping(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO adminTriggersService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "MetamodelAdminTrigger").getObject();
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(adminTriggersService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.admin");
		mp.setResTypeName("MetamodelAdminTrigger");
		mp.setGroupName("org.elsoft.platform.admin");
		mp.setArtifactName("matamodel-admin-form-triggers");
		mp.setArtifactVersion("1.0");
	
	}
	
}
