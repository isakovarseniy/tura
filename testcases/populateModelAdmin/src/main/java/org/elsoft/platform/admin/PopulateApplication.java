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

import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.JPAObjects;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.persistence.TransactionManagerImpl;

public class PopulateApplication {

	private RepositoryFactory rf;

	public void execute() {
		try {

			rf = new RepositoryFactory(new TransactionManagerImpl(JPAObjects.getObjects()));
			rf.getRoot();

			rf.createPrimitiveTypes();
			rf.populateArtifacts();
			rf.getRoot().addDomain("ELsoft");
			FunctionalDomainHandler fDomain = rf.getRoot()
					.getFunctionalDomain();
			fDomain.addFunctionalDomain("Platform");

			ApplicationHandler ah = fDomain.getApplicationHandler();
			ah.addApplication("Metarepository");

			new PopulateType().execute(rf);
			new PopulateTypeMapping().execute(rf);
			new PopulateBusinessType().execute(rf, fDomain);
			new PopulateInfrastructure().execute(rf);
			
			UiContainerHandler uch = rf.getRoot().cleanSearch()
					.searchString("domainName", "ELsoft").seek()
					.getFunctionalDomain().cleanSearch()
					.searchString("functionalDomainName", "Platform").seek()
					.getApplicationHandler().cleanSearch()
					.searchString("applicationName", "Metarepository").seek().getUILayer();

			uch.addUIContainer("MetarepositoryInterface");
			
			new PopulateDataSource().execute(rf);            
			new PopulateRecipe().execute(rf);

			rf.saveModel();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PopulateApplication().execute();
	}

}
