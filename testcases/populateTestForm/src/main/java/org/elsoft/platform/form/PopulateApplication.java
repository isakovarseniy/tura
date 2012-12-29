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

			rf.getRoot().addDomain("Manufacturing");
			FunctionalDomainHandler fDomain = rf.getRoot()
					.getFunctionalDomain();
			fDomain.addFunctionalDomain("BackOffice");

			ApplicationHandler ah = fDomain.getApplicationHandler();
			ah.addApplication("HR");

			new PopulateType().execute(rf);
			new PopulateTypeMapping().execute(rf);
			new PopulateBusinessType().executeHR(rf, fDomain);
            new PopulateInfrastructure().execute(rf); 
            new PopulateArtifactType().execute(rf);
            new PopulateGlobalRoles().execute(rf);

			fDomain.addFunctionalDomain("Commons");
			new PopulateBusinessType().executeCommons(rf, fDomain);
			
			HashMap<String, Object> context = new HashMap<String, Object>();
			new LoadDrugDropForm().execute(rf, context);
 
			context = new HashMap<String, Object>();
	        new LoadMany2ManyForm().execute(rf, context);		
			

	        context = new HashMap<String, Object>();
			new LoadOne2ManyForm().execute(rf, context);
			
			context = new HashMap<String, Object>();
			new LoadMany2OneForm().execute(rf, context);

			context = new HashMap<String, Object>();
			new LoadDropDownForm().execute(rf, context);

			context = new HashMap<String, Object>();
			new LoadLovForm().execute(rf, context);
			
			context = new HashMap<String, Object>();
			new LoadTreeForm().execute(rf, context);


			
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
