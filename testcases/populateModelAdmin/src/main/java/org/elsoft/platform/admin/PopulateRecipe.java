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
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO;
import org.elsoft.platform.metamodel.objects.recipe.PacketDAO;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.metamodel.processor.artifactcalculator.ConnectionArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.HelperClassesArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.JPAArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.JPAMavenArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.JSFArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.LifeRayArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.MAVENPOMXMLArtifactCalculatorJPALiferay;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WEBXMLArtifactCalculator;
import org.elsoft.platform.metamodel.suite.IngredientHandler;
import org.elsoft.platform.metamodel.suite.ModelMappingHandler;
import org.elsoft.platform.metamodel.suite.PacketHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;

public class PopulateRecipe {
	
	public void execute(RepositoryFactory rf){

		ApplicationDAO app =  rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").getObject();
		
		UIContainerDAO uicontainerMetarepositoryInterface = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "MetarepositoryInterface")
				.getObject();
		
		
		DataSourceDAO DSdomain = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "domain")
				.getObject();

		DataSourceDAO DSdomainService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "domainService")
				.getObject();

		

		DataSourceDAO DSfunctionalDomain = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "functionalDomain")
				.getObject();

		DataSourceDAO DSfunctionalDomainService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "functionalDomainService")
				.getObject();
		
		
		DataSourceDAO DSapplication = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "application")
				.getObject();

		DataSourceDAO DSapplicationService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "applicationService")
				.getObject();

		DataSourceDAO DSuiContainer = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "uiContainer")
				.getObject();

		DataSourceDAO DSuiContainerService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "uiContainerService")
				.getObject();
		
		
		DataSourceDAO DSmethod = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "method")
				.getObject();

		DataSourceDAO DSmethodService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "methodService")
				.getObject();

		
		DataSourceDAO DSmethodReference = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "methodReference")
				.getObject();

		DataSourceDAO DSmethodReferenceService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "methodReferenceService")
				.getObject();

		
		DataSourceDAO DSparameter = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "parameter")
				.getObject();

		DataSourceDAO DSparameterService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "parameterService")
				.getObject();

		
		DataSourceDAO DSproperty = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "property")
				.getObject();

		DataSourceDAO DSpropertyService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "propertyService")
				.getObject();
		

		DataSourceDAO DStypeDefinition = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "typeDefinition")
				.getObject();

		DataSourceDAO DStypeDefinitionService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "typeDefinitionService")
				.getObject();


		DataSourceDAO DStypeMapping = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "typeMapping")
				.getObject();

		DataSourceDAO DStypeMappingService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "typeMappingService")
				.getObject();
		

		DataSourceDAO DSartifactType = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "artifactType")
				.getObject();

		DataSourceDAO DSartifactTypeService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "artifactTypeService")
				.getObject();
		
				
		DataSourceDAO DSapplicationRole = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "applicationRole")
				.getObject();

		DataSourceDAO DSapplicationRoleService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "applicationRoleService")
				.getObject();


		DataSourceDAO DSglobalRole = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "globalRole")
				.getObject();

		DataSourceDAO DSglobalRoleService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "globalRoleService")
				.getObject();
		
		
		DataSourceDAO DSingredient = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "ingredient")
				.getObject();

		DataSourceDAO DSingredientService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "ingredientService")
				.getObject();
		
		
		DataSourceDAO DSmodelMapping = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "modelMapping")
				.getObject();

		DataSourceDAO DSmodelMappingService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "modelMappingService")
				.getObject();


		DataSourceDAO DSpacket = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "packet")
				.getObject();

		DataSourceDAO DSpacketService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "packetService")
				.getObject();
		

		DataSourceDAO DSrecipe = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "recipe")
				.getObject();

		DataSourceDAO DSrecipeService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "recipeService")
				.getObject();
		
		DataSourceDAO DSserverClaster = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverClaster")
				.getObject();

		DataSourceDAO DSserverClasterService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverClasterService")
				.getObject();
				

		
		DataSourceDAO DSserverGrid = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverGrid")
				.getObject();

		DataSourceDAO DSserverGridService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverGridService")
				.getObject();
		
		DataSourceDAO DSserverZone = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverZone")
				.getObject();

		DataSourceDAO DSserverZoneService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "serverZoneService")
				.getObject();
		
		
		DataSourceDAO DSbusinessObject = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "businessObject")
				.getObject();

		DataSourceDAO DSbusinessObjectService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "businessObjectService")
				.getObject();
		
		
		RecipeHandler rh = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek()
				.getRecipeHandler();

		
		rh.addRecipe("Genarate Liferay Jibestream application");

		IngredientHandler ingh = rh.getIngredientHandler();
		ingh.addIngredient("Jibestream Services", MetamodelPlatformLevel.WEB_SERVICES, 0);
		
		PacketHandler pakh = ingh.getPacketHandler();
		PacketDAO pack = pakh.addPacket("Services  for Jibestream application");
		pack.setBuildScript("GlassFishV3/j2ee/ejb_ws/buildEAR.xml");
		
 		ModelMappingHandler mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(null, JPAMavenArtifactCalculator.class.getName(), "NA");

		
		PacketHandler secondLevel =   pakh.getPacketHandler();
		secondLevel.addPacket("Services  sources");
		mmh = secondLevel.getModelMappingHandler();

		
		mmh.addModelMapping(DSdomain.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.domain");
		mmh.addModelMapping(DSdomainService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.domainService");
	
		mmh.addModelMapping(DSfunctionalDomain.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.functionalDomain");
		mmh.addModelMapping(DSfunctionalDomainService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.functionalDomainService");
		
		mmh.addModelMapping(DSapplication.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.application");
		mmh.addModelMapping(DSapplicationService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.applicationService");

		mmh.addModelMapping(DSuiContainer.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.uiContainer");
		mmh.addModelMapping(DSuiContainerService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.uiContainerService");

		mmh.addModelMapping(DSbusinessObject.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.businessObject");
		mmh.addModelMapping(DSbusinessObjectService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.businessObjectService");

		mmh.addModelMapping(DSmethod.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.method");
		mmh.addModelMapping(DSmethodService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.methodService");

		mmh.addModelMapping(DSmethodReference.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.methodReference");
		mmh.addModelMapping(DSmethodReferenceService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.methodReferenceService");

		mmh.addModelMapping(DSparameter.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.parameter");
		mmh.addModelMapping(DSparameterService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.parameterService");

		mmh.addModelMapping(DSproperty.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.property");
		mmh.addModelMapping(DSpropertyService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.propertyService");

		mmh.addModelMapping(DStypeDefinition.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.typeDefinition");
		mmh.addModelMapping(DStypeDefinitionService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.typeDefinitionService");

		mmh.addModelMapping(DStypeMapping.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.typeMapping");
		mmh.addModelMapping(DStypeMappingService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.typeMappingService");

		mmh.addModelMapping(DSartifactType.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.artifactType");
		mmh.addModelMapping(DSartifactTypeService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.artifactTypeService");

		mmh.addModelMapping(DSapplicationRole.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.applicationRole");
		mmh.addModelMapping(DSapplicationRoleService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.applicationRoleService");

		mmh.addModelMapping(DSglobalRole.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.globalRole");
		mmh.addModelMapping(DSglobalRoleService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.globalRoleService");

		mmh.addModelMapping(DSingredient.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.ingredient");
		mmh.addModelMapping(DSingredientService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.ingredientService");

		mmh.addModelMapping(DSmodelMapping.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.modelMapping");
		mmh.addModelMapping(DSmodelMappingService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.modelMappingService");

		mmh.addModelMapping(DSpacket.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.packet");
		mmh.addModelMapping(DSpacketService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.packetService");

		mmh.addModelMapping(DSrecipe.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.recipe");
		mmh.addModelMapping(DSrecipeService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.recipeService");

		mmh.addModelMapping(DSserverClaster.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverClaster");
		mmh.addModelMapping(DSserverClasterService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverClasterService");

		mmh.addModelMapping(DSserverGrid.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverGrid");
		mmh.addModelMapping(DSserverGridService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverGridService");

		mmh.addModelMapping(DSserverZone.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverZone");
		mmh.addModelMapping(DSserverZoneService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.serverZoneService");
		
		
		
		ingh = rh.getIngredientHandler();
		ingh.addIngredient("Jibestream Forms Liferay", MetamodelPlatformLevel.UI_CONTAINER, 1);

		pakh = ingh.getPacketHandler();

		pack = pakh.addPacket("WAR file for JIbestream application");
		pack.setBuildScript("GlassFishV3/j2ee/jsfV2/buildWAR.xml");
		pack.setDeploymentScript("GlassFishV3/j2ee/Portal/Liferay/deployToLiferay.xml");
		
		mmh = pakh.getModelMappingHandler();
		
		mmh.addModelMapping(null, WEBXMLArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(null, MAVENPOMXMLArtifactCalculatorJPALiferay.class.getName(), "NA");
		mmh.addModelMapping(null, HelperClassesArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(app.getObjId(), LifeRayArtifactCalculator.class.getName(), "Security_mapping");
		mmh.addModelMapping(null, ConnectionArtifactCalculator.class.getName(), "NA");

		
		pakh = pakh.getPacketHandler();
		pakh.addPacket("JSF componen for Jibestream aplication");
		mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(uicontainerMetarepositoryInterface.getObjId(), JSFArtifactCalculator.class.getName(), "MetarepositoryInterface");
		
		
	}

}
