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
package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public abstract class SearchProvider {

	private Map<Object, SpaControl> cache;
	private Mapper mapper;

	public void setCache(Map<Object, SpaControl> cache) {
		this.cache = cache;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public Object find(Object pk, String objectClass) {
		if (cache != null) {
			SpaControl control = cache.get(pk);
			if (control != null) {
				return control.getObject();
			} else {
				return serviceCall(pk, objectClass);
			}
		} else {
			return serviceCall(pk, objectClass);
		}
	}

	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		SearchResult result = serviceCall(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		List<Object> list = new ArrayList<>();
		for (Object obj : result.getSearchResult()) {
			Object pk = mapper.getPrimaryKey(obj);
			if (cache != null) {
				SpaControl control = cache.get(pk);
				if (control != null) {
					list.add(control.getObject());
				} else {
					list.add(obj);
				}
			} else {
				list.add(obj);
			}
		}
		return new SearchResult(list, result.getNumberOfRows());
	}

	protected abstract SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException;

	protected abstract Object serviceCall(Object pk, String objectClass);

}
