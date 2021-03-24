/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

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

	private boolean isAdapterNeeded(String objectClass) {
		try {
			Class<?> clazz = Class.forName(objectClass);
			if (Adapter.class.isAssignableFrom(clazz)) {
				return true;
			}
			return false;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Object find(Object pk, String objectClass) throws RepositoryException {
		if (cache != null) {
			SpaControl control = cache.get(pk);
			if (control != null) {
				return control.getObject();
			} else {
				boolean needAdpter = isAdapterNeeded(objectClass);
				Object obj = serviceCall(pk, objectClass);
				if (needAdpter) {
					return loader.wrapObject(obj);
				}
				return obj;
			}
		} else {
			boolean needAdpter = isAdapterNeeded(objectClass);
			Object obj = serviceCall(pk, objectClass);
			if (needAdpter) {
				return loader.wrapObject(obj);
			}
			return obj;
		}
	}

	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		boolean needAdpter = isAdapterNeeded(objectClass);

		searchCriteria = adoptSearchCriterias(searchCriteria, objectClass);
		orderCriteria = adoptOrderCriterias(orderCriteria, objectClass);

		SearchResult result = serviceCall(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		List<Object> list = new ArrayList<>();
		for (Object obj : result.getSearchResult()) {
			Object pk = null;
			if (needAdpter) {
				pk = mapper.getPrimaryKey(loader.wrapObject(obj));
			} else {
				pk = mapper.getPrimaryKey(obj);
			}
			if (cache != null) {
				SpaControl control = cache.get(pk);
				if (control != null) {
					list.add(control.getObject());
					continue;
				} else {
					if (needAdpter) {
						list.add(loader.wrapObject(obj));
						continue;
					}
					list.add(obj);
					continue;
				}
			} else {
				if (needAdpter) {
					list.add(loader.wrapObject(obj));
					continue;
				}
				list.add(obj);
			}
		}
		return new SearchResult(list, result.getNumberOfRows());
	}

	private List<SearchCriteria> adoptSearchCriterias(List<SearchCriteria> searchCriteria, String objectClass)
			throws RepositoryException {
		try {
			SpaRegistry spaRegistry = this.getSpaRegistry();
			if (searchCriteria != null) {
				List<SearchCriteria> newSearchCriterias = new ArrayList<SearchCriteria>();
				for (SearchCriteria sc : searchCriteria) {
					String mappedField = spaRegistry.findFieldMapping(objectClass, sc.getName());
					if (mappedField != null) {
						SearchCriteria nsc = new SearchCriteria(mappedField, sc.getComparator(), sc.getValue(),
								sc.getClassName());
						nsc.setProperty(sc.getProperty());
						nsc.setParentClass(sc.getParentClass());

						newSearchCriterias.add(nsc);
					} else {
						newSearchCriterias.add(sc);
					}
				}
				return newSearchCriterias;
			}
			return null;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private List<OrderCriteria> adoptOrderCriterias(List<OrderCriteria> orderCriteria, String objectClass)
			throws RepositoryException {
		try {
			SpaRegistry spaRegistry = this.getSpaRegistry();
			if (orderCriteria != null) {
				List<OrderCriteria> newOrderCriterias = new ArrayList<OrderCriteria>();
				for (OrderCriteria orc : orderCriteria) {
					String mappedField = spaRegistry.findFieldMapping(objectClass, orc.getName());
					if (mappedField != null) {
						OrderCriteria norc = new OrderCriteria(mappedField, orc.getOrder());

						newOrderCriterias.add(norc);
					} else {
						newOrderCriterias.add(orc);
					}
				}
				return newOrderCriterias;
			}
			return null;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	protected abstract SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException;

	protected abstract Object serviceCall(Object pk, String objectClass) throws RepositoryException;

	protected abstract SpaRegistry getSpaRegistry();

}
