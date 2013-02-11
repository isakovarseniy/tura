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
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("DomainDAO");

	    mp = tpmh.addTypeMapping(domain, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("DomainDAO");
		
		
		
		mp = tpmh.addTypeMapping(domainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.ELsoft.BackOffice");
		mp.setArtifactName("Model-ELsoft-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		
		mp = tpmh.addTypeMapping(domainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		
		
		mp = tpmh.addTypeMapping(domainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		
		mp = tpmh.addTypeMapping(domainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		
		mp = tpmh.addTypeMapping(domainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
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
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("FunctionalDomainDAO");

		mp = tpmh.addTypeMapping(functionalDomain, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("FunctionalDomainDAO");
		
		
		mp = tpmh.addTypeMapping(functionalDomainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.ELsoft.BackOffice");
		mp.setArtifactName("Model-ELsoft-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(functionalDomainService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		
		mp = tpmh.addTypeMapping(functionalDomainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(functionalDomainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		
		mp = tpmh.addTypeMapping(functionalDomainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
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
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("ApplicationDAO");

		mp = tpmh.addTypeMapping(application, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("ApplicationDAO");

		
		mp = tpmh.addTypeMapping(applicationService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.ELsoft.BackOffice");
		mp.setArtifactName("Model-ELsoft-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(applicationService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		mp = tpmh.addTypeMapping(applicationSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(applicationOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(applicationList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
	
	}

	private void createUIContainerMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO UIContainer = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainer").getObject();

		TypeDAO UIContainerService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerService").getObject();

		TypeDAO UIContainerSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerSearchCriteria").getObject();

		TypeDAO UIContainerOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerOrderByCriteria").getObject();
		
		TypeDAO UIContainerList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerList").getObject();

		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(UIContainer, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("UiContainerDAO");

		
		mp = tpmh.addTypeMapping(UIContainerService, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.ELsoft.BackOffice");
		mp.setArtifactName("Model-ELsoft-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(UIContainerSearchCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(UIContainerOrderByCriteria, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		mp = tpmh.addTypeMapping(UIContainerList, "ELsoft",
				"Platform", "Metarepository");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

}
