/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class SpaRemoveInternalOperation extends SpaRepositoryCommand{

	private RepoObjectKey masterPk;
	private RepoKeyPath extendedMasterPk;
	private String masterProperty;
	private Object detailObject;
	private String detailProperty;
	private String masterType;
	private String masterPersistanceType;

	
	public SpaRemoveInternalOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {
			SearchProvider sp = this.providerHash.get(masterPersistanceType);
			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));
			
			Object persistanceMasterObject = sp.find(masterMapper.getPKey(masterPk),masterPersistanceType);
			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedMasterPk,persistanceMasterObject);

			extendedMasterPk.addRepoObjectKey(masterProperty, findRepoObjectKey(detailObject));  ;
			Object persistanceDetailObject = getExtendedObject(extendedMasterPk,persistanceMasterObject);
			
			RelOperation relation = PersistanceRelationBuilder.build(extendedPersistanceMasterObject.getClass(), masterProperty,
					persistanceDetailObject.getClass(), detailProperty);
			relation.disconnect(extendedPersistanceMasterObject, persistanceDetailObject, masterProperty);

			if (beckwardProperty(persistanceDetailObject,detailProperty) ){
				relation = PersistanceRelationBuilder.build(persistanceDetailObject.getClass(), detailProperty,
						extendedPersistanceMasterObject.getClass(), masterProperty);
				relation.disconnect(persistanceDetailObject, extendedPersistanceMasterObject,detailProperty);
			}
			
			SpaControl masterControl = new SpaControl(persistanceMasterObject,masterMapper.getPKey(masterPk), OperationLevel.UPDATE);
			
			List<SpaControl> list= new ArrayList<>();
			list.add(masterControl);
			return list;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedMasterPk = (RepoKeyPath) parameters[0];
		masterPk = extendedMasterPk.getPath().get(0);
		masterProperty = (String) parameters[1];
		detailObject = parameters[2];
		detailProperty = (String) parameters[3];

		masterType = masterPk.getType();

		masterPersistanceType =  registry.findPersistanceClass(masterType);
		
		
		this.knownObjects.add(masterPersistanceType);
		return true;
	}

}

