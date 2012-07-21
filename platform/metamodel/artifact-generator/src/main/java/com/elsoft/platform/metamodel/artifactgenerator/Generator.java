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
package com.elsoft.platform.metamodel.artifactgenerator;

import java.util.HashMap;

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;

public class Generator {

	public static void main(String[] args) {
		RepositoryFactory rf;
		String domain = args[0];
		String functionalDomain = args[1];
		String application = args[2];
		String infrastructure = args[3];
		String recipe = args[4];
		String beginLevel = args[5];
		String endLevel = args[6];
		
		try {
			rf = new RepositoryFactory();

			ApplicationHandler ah = rf.getRoot().clean()
					.searchString("domainName", domain).seek()
					.getFunctionalDomain().clean()
					.searchString("functionalDomainName", functionalDomain)
					.seek().getApplicationHandler().clean()
					.searchString("applicationName", application).seek();
			
			HashMap<String, Object> infrastructureContext = ah
					.getInfrastructureLayer().clean()
					.searchString("zoneName", infrastructure).seek()
					.loadProperties(rf);

			RecipeHandler rh = ah.getRecipeHandler()
					.searchString("recipeName", recipe).seek();

			rh.buildRecipe(rf, infrastructureContext,
					MetamodelPlatformLevel.valueOf(beginLevel),
					MetamodelPlatformLevel.valueOf(endLevel), domain,
					functionalDomain, application);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
