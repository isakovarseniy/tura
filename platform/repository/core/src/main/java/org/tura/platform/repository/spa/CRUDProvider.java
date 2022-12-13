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

package org.tura.platform.repository.spa;

import java.util.Map;

import org.apache.commons.collections.BidiMap;
import org.tura.platform.repository.core.AdapterLoaderAware;
import org.tura.platform.repository.core.KeyMapperHelper;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;

public abstract class CRUDProvider  implements AdapterLoaderAware{


	public abstract void  execute(SpaControl control) throws Exception;
	
	private Map<String, BidiMap> keyMapper;
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

	public Map<String, BidiMap> getKeyMapper() {
		return keyMapper;
	}

	public void setKeyMapper(Map<String, BidiMap> keyMapper) {
		this.keyMapper = keyMapper;

	}
	
	public void nillPk(Object obj, String  type) throws RepositoryException {
		Class<?> repositoryClass = helper.findRepositoryClass(type);
		Mapper mapper = helper.findMapper(repositoryClass.getName());
		mapper.nillPrimaryKey(obj);
		
	}

	public Object mapPk(String type, Object obj, Object oldPk) throws RepositoryException {
		return new KeyMapperHelper(helper, keyMapper).mapPk(type, obj, oldPk);
	}
	
	public Object findPK(Object oldPK, String type) {
		return new KeyMapperHelper(helper, keyMapper).findPK(oldPK, type);
	}
	
}