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

package org.tura.platform.repository.cpa.storage;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

public class CpaSearchService extends AbstaractSearchService {

	private CpaStorage cpaStorage;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;

	public CpaSearchService(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			CpaStorage cpaStorage) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		this.cpaStorage = cpaStorage;
	}

	@Override
	protected <T> SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected <T> T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException {
		try {
			StorageControl sc =  cpaStorage.findByPrimaryKey(pk, objectClass);
			return (T) sc.getObject();
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}


	
}
