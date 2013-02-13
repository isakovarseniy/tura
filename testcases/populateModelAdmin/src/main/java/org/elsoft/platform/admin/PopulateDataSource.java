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

import java.util.HashMap;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.datasource.DataSourceHandler;
import org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO;
import org.elsoft.platform.metamodel.objects.datasource.DataSourceDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.processor.datasource.command.CreateDataSource;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class PopulateDataSource {

	public void execute(RepositoryFactory rf) throws Exception {

		DataSourceHandler dsh = rf.getRoot().cleanSearch()
				.searchString("domainName", "ELsoft").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "Platform").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "Metarepository").seek()
				.getDataSourceHandler();

		createDataSource(rf,dsh,"domain");
		createDataSource(rf,dsh,"domainService");
	
		createDataSource(rf,dsh,"functionalDomain");
		createDataSource(rf,dsh,"functionalDomainService");
		
		createDataSource(rf,dsh,"application");
		createDataSource(rf,dsh,"applicationService");

		createDataSource(rf,dsh,"uiContainer");
		createDataSource(rf,dsh,"uiContainerService");

		createDataSource(rf,dsh,"businessObject");
		createDataSource(rf,dsh,"businessObjectService");

		createDataSource(rf,dsh,"method");
		createDataSource(rf,dsh,"methodService");

		createDataSource(rf,dsh,"methodReference");
		createDataSource(rf,dsh,"methodReferenceService");

		createDataSource(rf,dsh,"parameter");
		createDataSource(rf,dsh,"parameterService");

		createDataSource(rf,dsh,"property");
		createDataSource(rf,dsh,"propertyService");

		createDataSource(rf,dsh,"typeDefinition");
		createDataSource(rf,dsh,"typeDefinitionService");

		createDataSource(rf,dsh,"typeMapping");
		createDataSource(rf,dsh,"typeMappingService");

		createDataSource(rf,dsh,"artifactType");
		createDataSource(rf,dsh,"artifactTypeService");

		createDataSource(rf,dsh,"applicationRole");
		createDataSource(rf,dsh,"applicationRoleService");

		createDataSource(rf,dsh,"globalRole");
		createDataSource(rf,dsh,"globalRoleService");

		createDataSource(rf,dsh,"ingredient");
		createDataSource(rf,dsh,"ingredientService");

		createDataSource(rf,dsh,"modelMapping");
		createDataSource(rf,dsh,"modelMappingService");

		createDataSource(rf,dsh,"packet");
		createDataSource(rf,dsh,"packetService");

		createDataSource(rf,dsh,"recipe");
		createDataSource(rf,dsh,"recipeService");

		createDataSource(rf,dsh,"serverClaster");
		createDataSource(rf,dsh,"serverClasterService");

		createDataSource(rf,dsh,"serverGrid");
		createDataSource(rf,dsh,"serverGridService");

		createDataSource(rf,dsh,"serverZone");
		createDataSource(rf,dsh,"serverZoneService");
	
	}

	private void createDataSource(RepositoryFactory rf,DataSourceHandler dsh,String dataSourceName) throws Exception {

		TypeDAO typedao = rf.getTypeDefinitionHandler().cleanSearch()
				.searchString("domain", "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", dataSourceName).getObject();

		HashMap<String, Object> context = new HashMap<String, Object>();

		DataSourceDAO dsdao = dsh.addDataSource(dataSourceName);
		CreateDataSourceDAO dataSource = new CreateDataSourceDAO();
		dataSource.setRefType(typedao.getObjId());
		CreateDataSource.load(rf, context, dataSource);

		String key = typedao.getDomain() + "." + typedao.getFunctionalDomain()
				+ "." + typedao.getApplication() + "." + typedao.getTypeName();
		dsh.saveDataSource(dsdao, (IndependentType) context.get(key));

	}

	
}
