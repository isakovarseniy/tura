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
		
		
		DataSourceDAO DSoption = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "options")
				.getObject();

		DataSourceDAO DSoptionService = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "optionsService")
				.getObject();

		
		
		
		
		
		
		
		
		RecipeHandler rh = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek()
				.getRecipeHandler();

		
		rh.addRecipe("Genarate Liferay Metamodel interface application");

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

		
		mmh.addModelMapping(DSoption.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.options");
		mmh.addModelMapping(DSoptionService.getObjId(), JPAArtifactCalculator.class.getName(),"ELsoft.Platform.Metarepository.optionsService");
		
		
		ingh = rh.getIngredientHandler();
		ingh.addIngredient("Tura Metamodel interface Liferay", MetamodelPlatformLevel.UI_CONTAINER, 1);

		pakh = ingh.getPacketHandler();

		pack = pakh.addPacket("WAR file for Metamodel interface application");
		pack.setBuildScript("GlassFishV3/j2ee/jsfV2/buildWAR.xml");
		pack.setDeploymentScript("GlassFishV3/j2ee/Portal/Liferay/deployToLiferay.xml");
		
		mmh = pakh.getModelMappingHandler();
		
		mmh.addModelMapping(null, WEBXMLArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(null, MAVENPOMXMLArtifactCalculatorJPALiferay.class.getName(), "NA");
		mmh.addModelMapping(null, HelperClassesArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(app.getObjId(), LifeRayArtifactCalculator.class.getName(), "Security_mapping");
		mmh.addModelMapping(null, ConnectionArtifactCalculator.class.getName(), "NA");

		
		pakh = pakh.getPacketHandler();
		pakh.addPacket("JSF componen for Metamodel interface aplication");
		mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(uicontainerMetarepositoryInterface.getObjId(), JSFArtifactCalculator.class.getName(), "MetarepositoryInterface");
		
		
	}

}
