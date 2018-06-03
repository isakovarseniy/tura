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

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelEnum;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.RepositoryCommandType;
import org.tura.platform.repository.spa.SearchProvider;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class DefaultDisconnectDetailFromMasterOperation extends SpaRepositoryCommand {

	private RepoObjectKey masterPk;
	private RepoKeyPath extendedMasterPk;
	private String masterProperty;
	private RepoObjectKey detailPk;
	private RepoKeyPath extendedDetailPk;
	private String detailProperty;
	private String masterType;
	private String masterPersistanceType;
	private String detailType;
	private String detailPersistanceType;

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {
			
			SearchProvider spDetail = this.providerHash.get(detailPersistanceType);
			PersistanceMapper detailMapper = findPersistanceMapper(Class.forName(detailType));

			Object persistanceDetailObject = spDetail.find(detailMapper.getPKey(detailPk),detailPersistanceType);
			if (persistanceDetailObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + detailPk.toString());
			}
			Object extendedPersistanceDetailObject = getExtendedObject(extendedDetailPk,persistanceDetailObject);
			
			if (!beckwardProperty(extendedPersistanceDetailObject,detailProperty)){
				return new ArrayList<>();
			}

			SearchProvider spMaster = this.providerHash.get(masterPersistanceType);
			PersistanceMapper masterMapper = findPersistanceMapper(Class.forName(masterType));
			Object persistanceMasterObject = spMaster.find(masterMapper.getPKey(masterPk),masterPersistanceType);

			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedMasterPk,persistanceMasterObject);

			
			RelEnum relation = PersistanceRelationBuilder.build(extendedPersistanceDetailObject.getClass(), detailProperty,
					extendedPersistanceMasterObject.getClass(), masterProperty);
			relation.getOperation().disconnect(extendedPersistanceDetailObject, extendedPersistanceMasterObject, detailProperty);

			SpaControl detailControl = new SpaControl(persistanceDetailObject,detailMapper.getPKey(detailPk), OperationLevel.UPDATE);
			
			List<SpaControl> list= new ArrayList<>();
			list.add(detailControl);
			return list;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedMasterPk = (RepoKeyPath) parameters[0];
		masterPk = extendedMasterPk.getPath().get(0);
		masterProperty = (String) parameters[1];
		extendedDetailPk = (RepoKeyPath) parameters[2];
		detailPk = extendedDetailPk.getPath().get(0);
		detailProperty = (String) parameters[3];

		masterType = masterPk.getType();
		detailType = detailPk.getType();
		
		detailPersistanceType =  Registry.getInstance().findPersistanceClass(detailType);
		masterPersistanceType =  Registry.getInstance().findPersistanceClass(masterType);
		
		this.knownObjects.add(detailPersistanceType);
		this.knownObjects.add(masterPersistanceType);
		return true;
	}

}

