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


import org.elsoft.platform.metamodel.MetamodelClasterType;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.MetamodelVMZoneTypes;
import org.elsoft.platform.metamodel.suite.ServerClasterHandler;
import org.elsoft.platform.metamodel.suite.ServerGridHandler;
import org.elsoft.platform.metamodel.suite.ServerZoneHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateAppServerDefinitionDAO;
import org.elsoft.platform.metamodel.objects.command.infrastructure.CreateDatabaseDefinitionDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO;
import org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO;
import org.elsoft.platform.metamodel.processor.infrastructure.command.CreateAppServerDefinition;
import org.elsoft.platform.metamodel.processor.infrastructure.command.CreateDatabaseDefinition;

public class PopulateInfrastructure {
	public void execute(RepositoryFactory rf) throws Exception {
		ServerZoneHandler szh = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek()
				.getInfrastructureLayer();

		ServerZoneDAO zone = szh.addServerZone("Local development zone");
		zone.setZoneType(MetamodelVMZoneTypes.Development.name());

		ServerGridHandler sgh = szh.getServerGridHandler();
		ServerGridDAO serverGrid = sgh.addServerGrid("Local grid");
		serverGrid.setLocation("Toronto office");

		ServerClasterHandler sc = sgh.getServerClasterHandler();

		ServerClasterDAO cl = sc.addServerClaster("Service claster");
		cl.setClasterType(MetamodelClasterType.ActiveActive.name());
		cl.setLavel(MetamodelPlatformLevel.WEB_SERVICES.ordinal());
        
		CreateAppServerDefinitionDAO appServerDefinition = new CreateAppServerDefinitionDAO();
		appServerDefinition.setHost("localhost");
		appServerDefinition.setHttpPort("8888");
		appServerDefinition.setManagementPort("4949");
		appServerDefinition.setPropertyName(MetamodelPlatformLevel.WEB_SERVICES.name()+"_appServer");
		CreateAppServerDefinition.save(sc.getCommandHandler(), null, appServerDefinition);
		
		cl = sc.addServerClaster("UI Claster");
		cl.setClasterType(MetamodelClasterType.ActiveActive.name());
		cl.setLavel(MetamodelPlatformLevel.UI_CONTAINER.ordinal());

		appServerDefinition.setHost("localhost");
		appServerDefinition.setHttpPort("8080");
		appServerDefinition.setManagementPort("4848");
		appServerDefinition.setPropertyName(MetamodelPlatformLevel.UI_CONTAINER.name()+"_appServer");
		CreateAppServerDefinition.save(sc.getCommandHandler(), null, appServerDefinition);
		
		
		cl = sc.addServerClaster("DB Claster");
		cl.setClasterType(MetamodelClasterType.ActiveActive.name());
		cl.setLavel(MetamodelPlatformLevel.DB.ordinal());
		CreateDatabaseDefinitionDAO databaseDefinition = new CreateDatabaseDefinitionDAO();
		databaseDefinition.setHost("localhost");
		databaseDefinition.setPort("5432");
		databaseDefinition.setDatabaseType("PostgreSQL");
		databaseDefinition.setDatabaseSchema("metamodel");
		databaseDefinition.setPropertyName(MetamodelPlatformLevel.DB.name()+"_dbServer");
		
		CreateDatabaseDefinition.save(sc.getCommandHandler(), null, databaseDefinition);
	}


}
