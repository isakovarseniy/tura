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
package org.elsoft.platform.form;

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO;
import org.elsoft.platform.metamodel.objects.recipe.PacketDAO;
//import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.metamodel.processor.artifactcalculator.HelperClassesArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.JSFArtifactCalculator;
//import org.elsoft.platform.metamodel.processor.artifactcalculator.LifeRayArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.MAVENPOMXMLArtifactCalculator;
//import org.elsoft.platform.metamodel.processor.artifactcalculator.MAVENPOMXMLArtifactCalculatorLiferay;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WEBXMLArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBClientArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBMavenArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBMavenProxyArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBPersistentArtifactCalculator;
import org.elsoft.platform.metamodel.suite.IngredientHandler;
import org.elsoft.platform.metamodel.suite.ModelMappingHandler;
import org.elsoft.platform.metamodel.suite.PacketHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateRecipe {

	public void execute(RepositoryFactory rf) {
		
/*		ApplicationDAO app =  rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").getObject();
*/	
		UIContainerDAO uicontainerMany2Many = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "Many2ManyForm")
				.getObject();

		
		UIContainerDAO uicontainerOne2Many = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "One2ManyForm")
				.getObject();
		
		UIContainerDAO uicontainerMany2One = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "Many2OneForm")
				.getObject();
		

		UIContainerDAO uicontainerDropDown = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "DropDownForm")
				.getObject();
		
		UIContainerDAO uicontainerLov = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "LovForm")
				.getObject();

		UIContainerDAO uicontainerDrugDrop = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer()
				.cleanSearch().searchString("uiContainerName", "DrugDropForm")
				.getObject();
		
		
		DataSourceDAO DSdepartment = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "departments")
				.getObject();
		
		DataSourceDAO DSdepartmentsService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "departmentsService")
				.getObject();

		
		DataSourceDAO DSemployees = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "employees")
				.getObject();
		
		DataSourceDAO DSemployeesService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "employeesService")
				.getObject();
		

		DataSourceDAO DSdropdowntest = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "dropdowntest")
				.getObject();
		
		DataSourceDAO DSdropdowntestService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "dropdowntestService")
				.getObject();

		
		DataSourceDAO DShrHeatures = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "hrFeatures")
				.getObject();
		
		DataSourceDAO DShrFeaturesService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "hrFeaturesService")
				.getObject();
		

		DataSourceDAO DSdomainService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "domainService")
				.getObject();
		
		DataSourceDAO DSfunctionalDomainService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "functionalDomainService")
				.getObject();

		DataSourceDAO DSapplicationService = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getDataSourceHandler()
				.cleanSearch().searchString("dataSourceName", "applicationService")
				.getObject();
		
		
		
		
		RecipeHandler rh = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek()
				.getRecipeHandler();

		rh.addRecipe("Genarate HR application");

		IngredientHandler ingh = rh.getIngredientHandler();
		ingh.addIngredient("HR Services", MetamodelPlatformLevel.WEB_SERVICES, 0);
		
		PacketHandler pakh = ingh.getPacketHandler();
		PacketDAO pack = pakh.addPacket("Services  for HR application");
		pack.setBuildScript("GlassFishV3/j2ee/ejb_ws/buildEAR.xml");
		pack.setDeploymentScript("GlassFishV3/j2ee/ejb_ws/deployToGlassfishv3.xml");
		
		PacketHandler secondLevel =   pakh.getPacketHandler();
		
		secondLevel.addPacket("EJB-POM");
 		ModelMappingHandler mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(null, WSEJBMavenArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(null, WSEJBPersistentArtifactCalculator.class.getName(), "NA");

		
		secondLevel.addPacket("Services  sources");
		mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(DSdepartment.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.departments");
		mmh.addModelMapping(DSdepartmentsService.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.departmentsService");

		mmh.addModelMapping(DSemployees.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.employees");
		mmh.addModelMapping(DSemployeesService.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.employeesService");
	
		mmh.addModelMapping(DSdropdowntest.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.dropdowntest");
		mmh.addModelMapping(DSdropdowntestService.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.dropdowntestService");
		
		mmh.addModelMapping(DShrHeatures.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.hrFeatures");
		mmh.addModelMapping(DShrFeaturesService.getObjId(), WSEJBArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.hrFeaturesService");

		
		ingh = rh.getIngredientHandler();
		ingh.addIngredient("HR Services clients", MetamodelPlatformLevel.WEB_SERVICES, 1);
		
		pakh = ingh.getPacketHandler();
		pack = pakh.addPacket("Clients proxy  for HR application");
		pack.setBuildScript("GlassFishV3/j2ee/ejb_ws/buildClientProxy.xml");
		
 		mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(null, WSEJBMavenProxyArtifactCalculator.class.getName(), "NA");

		secondLevel =   pakh.getPacketHandler();
		
		secondLevel.addPacket("Services  sources");
		mmh = secondLevel.getModelMappingHandler();
		mmh.addModelMapping(DSdepartmentsService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.departmentsService");
		mmh.addModelMapping(DSemployeesService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.employeesService");
		mmh.addModelMapping(DSdropdowntestService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.dropdowntestService");
		mmh.addModelMapping(DShrFeaturesService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.BackOffice.HR.hrFeaturesService");
		mmh.addModelMapping(DSdomainService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.Commons.Metarepository.domainService");
		mmh.addModelMapping(DSfunctionalDomainService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.Commons.Metarepository.functionalDomainService");
		mmh.addModelMapping(DSapplicationService.getObjId(), WSEJBClientArtifactCalculator.class.getName(), "Manufacturing.Commons.Metarepository.applicationService");
		
		
		
		
		ingh = rh.getIngredientHandler();
		ingh.addIngredient("HR Forms", MetamodelPlatformLevel.UI_CONTAINER, 1);

		pakh = ingh.getPacketHandler();

		pack = pakh.addPacket("WAR file for HR application");
		pack.setBuildScript("GlassFishV3/j2ee/jsfV2/buildWAR.xml");
		pack.setDeploymentScript("GlassFishV3/j2ee/jsfV2/deployToGlassfishv3.xml");
		
		mmh = pakh.getModelMappingHandler();
		
		mmh.addModelMapping(null, WEBXMLArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(null, MAVENPOMXMLArtifactCalculator.class.getName(), "NA");
		mmh.addModelMapping(null, HelperClassesArtifactCalculator.class.getName(), "NA");

		
		pakh = pakh.getPacketHandler();
		pakh.addPacket("JSF componen for HR aplication");
		mmh = pakh.getModelMappingHandler();
		mmh.addModelMapping(uicontainerMany2Many.getObjId(), JSFArtifactCalculator.class.getName(), "Many2ManyForm");
		mmh.addModelMapping(uicontainerOne2Many.getObjId(), JSFArtifactCalculator.class.getName(), "One2ManyForm");
		mmh.addModelMapping(uicontainerMany2One.getObjId(), JSFArtifactCalculator.class.getName(), "Many2OneForm");
		mmh.addModelMapping(uicontainerDropDown.getObjId(), JSFArtifactCalculator.class.getName(), "DropDownForm");
		mmh.addModelMapping(uicontainerLov.getObjId(), JSFArtifactCalculator.class.getName(), "LovForm");
		mmh.addModelMapping(uicontainerDrugDrop.getObjId(), JSFArtifactCalculator.class.getName(), "DrugDropForm");

	
	}

}
