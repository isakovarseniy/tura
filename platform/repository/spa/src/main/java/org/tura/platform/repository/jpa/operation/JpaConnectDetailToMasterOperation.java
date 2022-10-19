/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.operation;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class JpaConnectDetailToMasterOperation extends JpaConnectMasterToDetailOperation {
	
	private static final long serialVersionUID = -5867086428476253261L;

	public JpaConnectDetailToMasterOperation(Registry registry,SpaObjectRegistry spaRegistry){
		super(registry,spaRegistry);
	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		try {
			
			RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
			RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];
			String detailProperty_ = (String) parameters[3];
			
			setMasterPk(getJpaPrimaryKey(detailPk_));
			setMasterProperty(detailProperty_);
			setMasterClassName(getJpaPersistanceClassName(detailPk_));
			setRelation(getJpaRelationType(detailPk_, detailProperty_));
			setDetailPk(getJpaPrimaryKey(masterPk_));
			setDetailClassName(getJpaPersistanceClassName(masterPk_));
            setMasterRepositortClassName(getJpaRepositoryClassName(detailPk_));
            
			this.knownObjects.add(getMasterClassName());
			this.knownObjects.add(getDetailClassName());

			
			return true;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}
	}

	
}
