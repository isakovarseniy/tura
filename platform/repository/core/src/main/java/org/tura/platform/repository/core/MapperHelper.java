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

package org.tura.platform.repository.core;

import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryHelper;

public class MapperHelper extends SpaRepositoryHelper{

	private static final long serialVersionUID = 1L;
	
	public PersistanceMapper findPersistenceMapperByRepoObject(Object repositoryObject)  throws RepositoryException{
		return findPersistanceMapper(getRealClass(repositoryObject));
	}
	
	public PersistanceMapper findPersistenceMapperByPersistenceObject(Object persistenceObject) throws RepositoryException{
		String repositoryClass = registry.findRepositoryClass(persistenceObject.getClass());
		return findPersistanceMapper(repositoryClass);
	}	
	
	public void setRegistry(Registry registry) {
		this.registry = registry;
		
	}
	public void setRegistryName(String registryName) {
		this.registryName = registryName;
		
	}
	public  void setSpaObjectRegistry(SpaObjectRegistry spaRegistry) {
		this.spaRegistry = spaRegistry;
	}
	
	
	
}