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
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;

public abstract class AbstaractSearchService implements SearchProvider {

	private Map<Object, SpaControl> cache;
	private Mapper mapper;
	private AdapterLoader loader;

	public void setCache(Map<Object, SpaControl> cache) {
		this.cache = cache;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
	}

	public Object find(Object pk, String objectClass) {
		if (cache != null) {
			SpaControl control = cache.get(pk);
			if (control != null) {
				Object obj = control.getObject();
				if (obj instanceof AdapterLoader) {
					return loader.wrapObject(obj);
				}
				return control.getObject();
			} else {
				Object obj = serviceCall(pk, objectClass);
				if (obj instanceof AdapterLoader) {
					return loader.wrapObject(obj);
				}
				return obj;
			}
		} else {
			Object obj = serviceCall(pk, objectClass);
			if (obj instanceof AdapterLoader) {
				return loader.wrapObject(obj);
			}
			return obj;
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
					Object o = control.getObject();
					if (o instanceof AdapterLoader) {
						o = loader.wrapObject(obj);
					}
					list.add(o);
				} else {
					if (obj instanceof AdapterLoader) {
						list.add(loader.wrapObject(obj));
					}
					list.add(obj);
				}
			} else {
				if (obj instanceof AdapterLoader) {
					list.add(loader.wrapObject(obj));
				}
				list.add(obj);
			}
		}
		return new SearchResult(list, result.getNumberOfRows());
	}

	protected abstract SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException;

	protected abstract Object serviceCall(Object pk, String objectClass);

}
