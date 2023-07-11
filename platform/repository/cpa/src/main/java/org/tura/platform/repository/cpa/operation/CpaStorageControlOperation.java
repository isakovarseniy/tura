/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.Constants;
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

public class CpaStorageControlOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -5703569928798444741L;
	protected RepoObjectKey pk;
	protected RepoKeyPath extendedPk;
	protected String property;
	protected Object value;
	protected String objectType;
	protected String persistanceType;
	
	
	public CpaStorageControlOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try{

			SearchProvider sp = this.providerHash.get(persistanceType);
			PersistanceMapper mapper = findPersistanceMapper(Class.forName(objectType));
			Object cmdPk  = mapper.getPKey(pk);
			Object realPk = findReversePK(cmdPk, persistanceType);
			
			Object persistanceObject = sp.find( realPk ,Class.forName(persistanceType));
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}

			CpaUpdateStorageControl control = new CpaUpdateStorageControl(persistanceObject,cmdPk, OperationLevel.OPERATION,registryName);
			control.setProperty(property);
			control.setValue(value);

			List<SpaControl> list= new ArrayList<>();
			list.add(control);
			return list;
			
		}catch(Exception e){
			throw new RepositoryException(e);
		}
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		if (  !RepositoryCommandType.update.equals(cmdType) ) {
			return false;
		}
		extendedPk = (RepoKeyPath) parameters[0];
		pk = extendedPk.getPath().get(0);
		property = (String) parameters[1];
		if ( !Constants.STORAGE_CONTROL_STATUS.equals(property)) {
			return false;
		}
		value = parameters[2];
		objectType = pk.getType();
		persistanceType =  registry.findPersistanceClass(objectType);
		
		this.knownObjects.add(persistanceType);
		return true;
		
	}	
}


