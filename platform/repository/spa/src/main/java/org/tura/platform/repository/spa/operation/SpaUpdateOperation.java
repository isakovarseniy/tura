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

package org.tura.platform.repository.spa.operation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class SpaUpdateOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -5703569928798444741L;
	protected RepoObjectKey pk;
	protected RepoKeyPath extendedPk;
	protected String property;
	protected Object value;
	protected String objectType;
	protected String persistanceType;
	
	
	public SpaUpdateOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try{

			SearchProvider sp = this.providerHash.get(persistanceType);
			PersistanceMapper mapper = findPersistanceMapper(Class.forName(objectType));
			
			Object persistanceObject = sp.find( mapper.getPKey(pk),persistanceType);
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedPk,persistanceObject);
			
			String methodName = "set"+WordUtils.capitalize(property);
			Method m = extendedPersistanceMasterObject.getClass().getMethod(methodName, value.getClass());
			m.invoke(extendedPersistanceMasterObject, value);

			SpaControl control = new SpaControl(persistanceObject,mapper.getPKey(pk), OperationLevel.UPDATE,registryName);
			
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
		persistanceType =  registry.findPersistanceClass(objectType);
		
		this.knownObjects.add(persistanceType);
		return true;
		
	}	
}

