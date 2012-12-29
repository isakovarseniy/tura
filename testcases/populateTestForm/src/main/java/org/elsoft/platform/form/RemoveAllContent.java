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


import org.elsoft.platform.metamodel.JPAObjects;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.persistence.TransactionManagerImpl;

public class RemoveAllContent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			RepositoryFactory rf = new RepositoryFactory(new TransactionManagerImpl(JPAObjects.getObjects()));
			rf.getRoot();
			UiContainerHandler uiContHand = rf.getRoot().cleanSearch()
					.searchString("domainName", "Manufacturing").seek()
					.getFunctionalDomain().cleanSearch()
					.searchString("functionalDomainName", "BackOffice").seek()
					.getApplicationHandler().cleanSearch()
					.searchString("applicationName", "HR").seek().getUILayer()
					.cleanSearch().searchString("uiContainerName", "DropDownForm").seek();

			UIContainerDAO uic = uiContHand.getObject();
			if (uic == null) {
				System.out
						.println("!!!!!!!!!!!!   -> No form header -----> !!!");
			} else {
				uiContHand.getCommandHandler().removeAll();
				rf.saveModel();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
