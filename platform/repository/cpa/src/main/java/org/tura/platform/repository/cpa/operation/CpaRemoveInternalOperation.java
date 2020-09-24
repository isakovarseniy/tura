/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelOperation;

public class CpaRemoveInternalOperation extends CpaRepositoryCommand {

	private static final long serialVersionUID = -8044940054565717710L;
	private RepoObjectKey masterPk;
	private RepoKeyPath extendedMasterPk;
	private String masterProperty;
	private Object detailObject;
	private String detailProperty;
	private String masterPersistanceType;
	private SearchProvider searchProvider;

	public CpaRemoveInternalOperation(SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}

	public void prepare() throws RepositoryException {
		try {

			Object persistanceMasterObject = searchProvider.find(getPrimaryKey(masterPk), masterPersistanceType);
			if (persistanceMasterObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + masterPk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedMasterPk, persistanceMasterObject);

			extendedMasterPk.addRepoObjectKey(masterProperty, findRepoObjectKey(detailObject));
			Object persistanceDetailObject = getExtendedObject(extendedMasterPk, persistanceMasterObject);

			RelOperation relation = PersistanceRelationBuilder.build(extendedPersistanceMasterObject.getClass(),
					masterProperty, persistanceDetailObject.getClass(), detailProperty);
			relation.disconnect(extendedPersistanceMasterObject, persistanceDetailObject, masterProperty);

			if (beckwardProperty(persistanceDetailObject, detailProperty)) {
				relation = PersistanceRelationBuilder.build(persistanceDetailObject.getClass(), detailProperty,
						extendedPersistanceMasterObject.getClass(), masterProperty);
				relation.disconnect(persistanceDetailObject, extendedPersistanceMasterObject, detailProperty);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		extendedMasterPk = (RepoKeyPath) parameters[0];
		masterPk = extendedMasterPk.getPath().get(0);
		masterProperty = (String) parameters[1];
		detailObject = parameters[2];
		detailProperty = (String) parameters[3];

		return true;
	}

}
