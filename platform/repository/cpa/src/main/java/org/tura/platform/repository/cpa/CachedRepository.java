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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchRequest;
import org.tura.platform.repository.core.SearchResult;

public class CachedRepository implements Repository{

	private static final long serialVersionUID = 1L;
	private Repository repository;
	private Map<Integer, SearchResult<?>> cache = new HashMap<>();

	
	public CachedRepository(Repository repository ) {
		this.repository  =  repository;
	}
	
	public void clearCache() {
		cache = new HashMap<>();
	}
	
	
	@Override
	public <T> T create(Class<T> objectClass) throws RepositoryException {
		return repository.create(objectClass);
	}


	@Override
	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
		repository.insert(obj, objectClass);
	}

	@Override
	public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		repository.remove(obj, objectClass);
	}

	@Override
	public List<Object> applyChanges(List<Object> changes) throws RepositoryException {
		return repository.applyChanges(changes);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {
		
		SearchRequest request = new SearchRequest();
		request.setSearch(searchCriteria);
		request.setOrder(orderCriteria);
		request.setStartIndex(startIndex);
		request.setEndIndex(endIndex);
		request.setObjectClass(objectClass.getName());

		int hashCode = request.hashCode();
		SearchResult<?> result = cache.get(hashCode);
		if (result == null) {
			result =  repository.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
			cache.put(hashCode, result);
		}		
		return (SearchResult<T>) result;
	}


	@Override
	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		return repository.find(pk, objectClass);
	}

}
