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

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelEnum;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.RepositoryCommandType;
import org.tura.platform.repository.spa.SearchProvider;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class DefaultRemoveInternalOperation extends SpaRepositoryCommand{

	private RepoKeyPath masterPk;
	private String masterProperty;
	private Object detailObject;
	private String detailProperty;
	private String masterType;

	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {
			SearchProvider sp = this.providerHash.get(masterType);
			Object persistanceMasterObject = sp.find(masterPk);
			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}

			PersistanceMapper mapper = findPersistanceMapper(detailObject.getClass());
			Object persistanceDetailObject = mapper.copyFromRepository2Persistence(detailObject);

			RelEnum relation = PersistanceRelationBuilder.build(persistanceMasterObject.getClass(), masterProperty,
					persistanceDetailObject.getClass(), detailProperty);
			relation.getOperation().disconnect(persistanceMasterObject, persistanceDetailObject, masterProperty);

			if (beckwardPrperty(persistanceDetailObject,detailProperty) ){
				relation = PersistanceRelationBuilder.build(persistanceDetailObject.getClass(), detailProperty,
						persistanceMasterObject.getClass(), masterProperty);
				relation.getOperation().disconnect(persistanceDetailObject, persistanceMasterObject,detailProperty);
			}
			
			SpaControl masterControl = new SpaControl(persistanceMasterObject,mapper.getPKey(masterPk), OperationLevel.UPDATE);
			
			List<SpaControl> list= new ArrayList<>();
			list.add(masterControl);
			return list;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) {
		masterPk = (RepoKeyPath) parameters[0];
		masterProperty = (String) parameters[1];
		detailObject = parameters[2];
		detailProperty = (String) parameters[3];
		
		masterType = masterPk.getPath().get(0).getType();
		this.knownObjects.add(detailObject.getClass().getName());
		this.knownObjects.add(masterType);
		return true;
		
	}

}
