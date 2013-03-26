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

import org.elsoft.platform.metamodel.JPAObjects;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.pattern.transtormer.uploader.PatternUploaderFileSystem;
import org.elsoft.platform.persistence.TransactionManagerImpl;

public class GenerateApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RepositoryFactory rf,rf1;
		try {

			PatternUploaderFileSystem pu = new PatternUploaderFileSystem();
			pu.uploader(
					     "/home/platform/GITRepo/tura/platform/implementation/primefaces-ws/transformator/src/main/resources/pattern.xml"
					   , "/home/platform/implPattern/ImplementationPetternRoot/"
					   );
			TransactionManagerImpl trMgr = new TransactionManagerImpl(JPAObjects.getObjects());

			rf = new RepositoryFactory(trMgr);

			rf1 = new RepositoryFactory(trMgr);

			ApplicationHandler ah = rf.getRoot().cleanSearch()
					.searchString("domainName", "ELsoft").seek()
					.getFunctionalDomain().cleanSearch()
					.searchString("functionalDomainName", "Platform").seek()
					.getApplicationHandler().cleanSearch()
					.searchString("applicationName", "Metarepository").seek();

			HashMap<String,Object> infrastructureContext= ah.getInfrastructureLayer().cleanSearch()
					.searchString("zoneName", "Local development zone").seek()
					.loadProperties(rf);

			RecipeHandler rh = ah.getRecipeHandler()
					.searchString("recipeName", "Genarate Liferay Metamodel interface application")
					.seek();

			rh.buildRecipe(rf1, infrastructureContext,
					MetamodelPlatformLevel.UI_CONTAINER,
					MetamodelPlatformLevel.UI_CONTAINER, "ELsoft",
					"Platform", "Metarepository");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}