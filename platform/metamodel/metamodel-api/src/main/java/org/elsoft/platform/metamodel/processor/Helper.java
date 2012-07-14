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
package org.elsoft.platform.metamodel.processor;

import org.elsoft.platform.metamodel.general.BusinessObjectDAO;
import org.elsoft.platform.metamodel.general.TypeDAO;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class Helper {
	public static BusinessObjectDAO findBusinessObject(RepositoryFactory rf,
			String domain, String functionalDomain, String businassObjectName) {

		rf.getRoot().clean().searchString("domainName", domain).getObject();

		FunctionalDomainHandler fDomain = rf.getRoot().getFunctionalDomain();

		fDomain.clean().searchString("functionalDomainName", functionalDomain)
				.getObject();

		BusinessObjectDAO bo = (BusinessObjectDAO) fDomain
				.getBusinessObjectsHandler().clean()
				.searchString("businessObjectTypeName", businassObjectName)
				.getObject();

		return bo;
	}

	public static TypeDAO findType(RepositoryFactory rf, String domain,
			String functionalDomain, String application, String typeName) {

		return rf.getTypeDefinitionHandler().clean().searchString("domain", domain)
				.searchString("functionalDomain", functionalDomain)
				.searchString("application", application)
				.searchString("typeName", typeName).getObject();

	}

}
