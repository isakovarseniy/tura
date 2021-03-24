/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.cpa.operation;

import java.lang.reflect.Method;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;

public class CpaUpdateOperation extends CpaRepositoryCommand {

	private static final long serialVersionUID = -5703569928798444741L;
	private RepoObjectKey pk;
	private RepoKeyPath extendedPk;
	private String property;
	private Object value;
	private String persistanceType;
	private SearchProvider searchProvider;
	
	
	public CpaUpdateOperation(SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}
	
	public void prepare() throws RepositoryException {
		try{

			Object persistanceObject = searchProvider.find( getPrimaryKey(pk),persistanceType);
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedPk,persistanceObject);
			
			String methodName = "set"+WordUtils.capitalize(property);
			Method m = extendedPersistanceMasterObject.getClass().getMethod(methodName, value.getClass());
			m.invoke(extendedPersistanceMasterObject, value);

		}catch(Exception e){
			throw new RepositoryException(e);
		}
	}


	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedPk = (RepoKeyPath) parameters[0];
		pk = extendedPk.getPath().get(0);
		property = (String) parameters[1];
		value = parameters[2];
		return true;
		
	}	
}

