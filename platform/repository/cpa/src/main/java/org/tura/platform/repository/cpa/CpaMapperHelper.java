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

package org.tura.platform.repository.cpa;

import org.tura.platform.repository.core.CopyFrom;
import org.tura.platform.repository.core.MapperHelper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.storage.CpaMapper;

public class CpaMapperHelper extends  MapperHelper{

	private static final long serialVersionUID = 3297267302998566392L;
	
	public CpaMapper findCpaMapperByRepoObject(Object repositoryObject)  throws RepositoryException{
		return (CpaMapper) findMapper(getRealClass(repositoryObject));
	}
	
	public CpaMapper findCpaMapperByPersistenceObject(Object persistenceObject) throws RepositoryException{
		String persistanceType = persistenceObject.getClass().getName();
		String repositoryClass = registry.findRepositoryClass(persistanceType);
		return (CpaMapper) registry.findMapper(persistanceType, repositoryClass);
	}	

	public CopyFrom findCopyFromByRepoObject(Object repositoryObject) throws RepositoryException{
		return (CopyFrom) findMapper(getRealClass(repositoryObject));
	}
	
	
}
