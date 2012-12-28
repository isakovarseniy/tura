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
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek()
				.getDataSourceHandler();

		createDataSource(rf,dsh,"departments");
		createDataSource(rf,dsh,"departmentsService");

		createDataSource(rf,dsh,"employees");
		createDataSource(rf,dsh,"employeesService");
	
		createDataSource(rf,dsh,"dropdowntest");
		createDataSource(rf,dsh,"dropdowntestService");

		createDataSource(rf,dsh,"hrFeatures");
		createDataSource(rf,dsh,"hrFeaturesService");

		createDataSource( rf, dsh, "domain", "Manufacturing", "Commons", "Metarepository");		
		createDataSource( rf, dsh, "domainService", "Manufacturing", "Commons", "Metarepository");		
	
		createDataSource( rf, dsh, "functionalDomain", "Manufacturing", "Commons", "Metarepository");		
		createDataSource( rf, dsh, "functionalDomainService", "Manufacturing", "Commons", "Metarepository");		

		createDataSource( rf, dsh, "application", "Manufacturing", "Commons", "Metarepository");		
		createDataSource( rf, dsh, "applicationService", "Manufacturing", "Commons", "Metarepository");		
	}

	private void createDataSource(RepositoryFactory rf,DataSourceHandler dsh,String dataSourceName) throws Exception {

		createDataSource( rf, dsh, dataSourceName, "Manufacturing", "BackOffice", "HR");
		
	}

	private void createDataSource(RepositoryFactory rf,DataSourceHandler dsh,String dataSourceName, String domain, String functionalDomain, String application) throws Exception {

		TypeDAO typedao = rf.getTypeDefinitionHandler().cleanSearch()
				.searchString("domain", domain)
				.searchString("functionalDomain", functionalDomain)
				.searchString("application", application)
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
