/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.spa.operation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.RepositoryCommandType;
import org.tura.platform.repository.spa.SearchProvider;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class DefaultUpdateOperation extends SpaRepositoryCommand {

	private RepoObjectKey pk;
	private RepoKeyPath extendedPk;
	private String property;
	private Object value;
	private String objectType;
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try{

			SearchProvider sp = this.providerHash.get(objectType);
			Object persistanceObject = sp.find(pk,objectType);
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedPk,persistanceObject);
			
			String methodName = "set"+WordUtils.capitalize(property);
			Method m = extendedPersistanceMasterObject.getClass().getDeclaredMethod(methodName, value.getClass());
			m.invoke(extendedPersistanceMasterObject, value);

			PersistanceMapper mapper = findPersistanceMapper(persistanceObject.getClass());
			
			SpaControl control = new SpaControl(persistanceObject,mapper.getPKey(pk), OperationLevel.UPDATE);
			
			List<SpaControl> list= new ArrayList<>();
			list.add(control);
			return list;
			
		}catch(Exception e){
			throw new RepositoryException(e);
		}
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedPk = (RepoKeyPath) parameters[0];
		pk = extendedPk.getPath().get(0);
		property = (String) parameters[1];
		value = parameters[2];

		objectType = pk.getType();
		String persistanceType =  Registry.getInstance().findPersistanceClass(objectType);
		
		this.knownObjects.add(persistanceType);
		return true;
		
	}	
}

