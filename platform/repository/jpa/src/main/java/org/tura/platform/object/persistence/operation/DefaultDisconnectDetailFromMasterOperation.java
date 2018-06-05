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
package org.tura.platform.object.persistence.operation;

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;

public class DefaultDisconnectDetailFromMasterOperation extends DefaultDisconnectMasterFromDetailOperation{

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		try {
			
			RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
			RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];
			String detailProperty_ = (String) parameters[3];
			
			setMasterPk(getPrimaryKey(detailPk_));
			setMasterProperty(detailProperty_);
			setMasterClassName(getPersistanceClassName(detailPk_));
			setRelation(getRelationType(detailPk_, detailProperty_));
			setDetailPk(getPrimaryKey(masterPk_));
			setDetailClassName(getPersistanceClassName(masterPk_));

			return true;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	
}
