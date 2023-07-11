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

package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

public abstract class AbstractSearchService implements SearchProvider {

	private Map<Object, SpaControl> cache;
	private AdapterLoader loader;


	public void setCache(Map<Object, SpaControl> cache) {
		this.cache = cache;
	}

	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
	}

	private boolean isAdapterNeeded(Class<?> clazz) {
		try {
			if (Adapter.class.isAssignableFrom(clazz)) {
				return true;
			}
			return false;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T>T find(Object pk, Class<T> objectClass) throws RepositoryException {
		if (cache != null) {
			SpaControl control = cache.get(pk);
			if (control != null) {
				return (T) control.getObject();
			} else {
				boolean needAdpter = isAdapterNeeded(objectClass);
				Object obj = serviceCall(pk, objectClass);
				if (needAdpter) {
					return (T) loader.wrapObject(obj);
				}
				return (T) obj;
			}
		} else {
			boolean needAdpter = isAdapterNeeded(objectClass);
			Object obj = serviceCall(pk, objectClass);
			if (needAdpter) {
				return (T) loader.wrapObject(obj);
			}
			return (T) obj;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> objectClass) throws RepositoryException {
		boolean needAdpter = isAdapterNeeded(objectClass);

		searchCriteria = adoptSearchCriterias(searchCriteria, objectClass);
		orderCriteria = adoptOrderCriterias(orderCriteria, objectClass);

		SearchResult result = serviceCall(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		List<Object> list = new ArrayList<>();
		for (Object o : result.getSearchResult()) {
			
			Object obj = preprocessObject(o);
			

			Object pk = null;
			if (needAdpter) {
				Mapper mapper = new RepositoryHelper(getRegistry()).findMapperByPersistenceObject(loader.wrapObject(obj));
				pk = mapper.getPrimaryKey(loader.wrapObject(obj));
			} else {
				Class<?> clazz = null;
				if ( obj instanceof TypeAware ) {
					clazz = ((TypeAware)obj).getTypeClazz();
				}else {
					clazz = obj.getClass();
				}
				Mapper mapper = new RepositoryHelper(getRegistry()).findMapperByPersistanceClass(clazz);
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

	private List<SearchCriteria> adoptSearchCriterias(List<SearchCriteria> searchCriteria, Class<?> objectClass)
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

	private List<OrderCriteria> adoptOrderCriterias(List<OrderCriteria> orderCriteria, Class<?> objectClass)
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

	public Object preprocessObject(Object obj) {
		return obj;
	}
	
	protected abstract <T>SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException;

	protected abstract <T>  T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException;

	protected abstract SpaRegistry getSpaRegistry();

	protected abstract Registry getRegistry();

}
