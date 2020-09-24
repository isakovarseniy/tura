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

package org.tura.platform.repository.spa;

import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;

public abstract class CRUDProvider  implements AdapterLoaderAware{


	public abstract void  execute(SpaControl control) throws Exception;
	
	private Map<String, Map<Object, Object>> keyMapper;
	private ProxyFactory factory;
	
	protected String registryName;
	protected SpaObjectRegistry spaRegistry;
	protected Registry registry;
	protected RepositoryHelper helper;

	
	public CRUDProvider(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		helper = new RepositoryHelper(registry);
	}
	
	public ProxyFactory getFactory() {
		return factory;
	}

	public void setFactory(ProxyFactory factory) {
		this.factory = factory;
	}

	public Map<String, Map<Object, Object>> getKeyMapper() {
		return keyMapper;
	}

	public void setKeyMapper(Map<String, Map<Object, Object>> keyMapper) {
		this.keyMapper = keyMapper;

	}
	
	public void nillPk(Object obj, String  type) throws RepositoryException {
		Class<?> repositoryClass = helper.findRepositoryClass(type);
		Mapper mapper = helper.findMapper(repositoryClass.getName());
		mapper.nillPrimaryKey(obj);
		
	}

	public Object mapPk(String type, Object obj, Object oldPk) throws RepositoryException {
		Class<?> repositoryClass = helper.findRepositoryClass(type);
		Mapper mapper = helper.findMapper(repositoryClass.getName());
		Object newPk = mapper.getPrimaryKey(obj);
		
		Map<Object, Object> hash = this.keyMapper.get(type);
		if (hash == null) {
			hash = new HashMap<Object, Object>();
			this.keyMapper.put(type, hash);
		}
		hash.put(oldPk, newPk);
		
		return newPk;
	}
	
	public Object findPK(Object oldPK, String type) {
		Map<Object, Object> hash = keyMapper.get(type);
		if (hash == null) {
			return oldPK;
		}
		Object pk = hash.get(oldPK);
		if (pk == null) {
			return oldPK;
		} else {
			return pk;
		}

	}
	
	
}
