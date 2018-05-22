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
package org.tura.platform.repository.test.spa;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.triggers.PostCreateTrigger;

import com.octo.java.sql.exp.Operator;

public class SPARepository implements Repository {

	public static Map<String, Object> objectBase = new HashMap<>();

	private PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws RepositoryException {
		return null;
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(objectClass);
			if (trigger != null) {
				trigger.postCreate(obj);
			}
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		try {

			SearchCriteria parentPersistenceObject = extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,
					searchCriteria);
			extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT, searchCriteria);
			SearchCriteria parentChildRelation = extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,
					searchCriteria);
			SearchCriteria parentChildRelationType = extractAndRemove(
					RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE, searchCriteria);

			if (parentPersistenceObject != null && knownClasses(parentPersistenceObject.getValue().getClass())) {
				@SuppressWarnings("unused")
				String relationType = (String) parentChildRelationType.getValue();
				@SuppressWarnings("unused")
				String property = (String) parentChildRelation.getValue();
				Object persistenceObject = parentPersistenceObject.getValue();

				Long pk = (Long) Reflection.call(persistenceObject, "getObjId");
				
				if (pk == null){
					throw new Exception("PK is null");
				}
				String queryString = "SELECT * FROM " + objectClass+ " WHERE objRef = :p1";
				Query query = new Query();
				query.parse(queryString);
				query.setVariable("p1", pk);

				QueryResults result = query.execute(objectBase.values());
				return new SearchResult(result.getResults(), result.getResults().size());
			}

			String queryString = "SELECT * FROM " + objectClass;
			Map<String, Object> params = new HashMap<>();
			boolean first = true;
			int paramId = 0;
			for (SearchCriteria sc : searchCriteria) {
				if (first) {
					queryString = queryString + " WHERE ";
				}
				if (!first) {
					queryString = queryString + " AND ";
				}
				queryString = sc.getName() + Operator.valueOf(sc.getComparator()) + ":param" + paramId;
				Class<?> clazz = Class.forName(sc.getClassName());
				Constructor<?> c = clazz.getConstructor(String.class);
				params.put("param" + paramId, c.newInstance(sc.getValue()));

				first = false;
				paramId++;
			}
			Query query = new Query();
			query.parse(queryString);
			for (String param : params.keySet()) {
				query.setVariable(param, params.get(param));
			}
			QueryResults result = query.execute(objectBase.values());

			return new SearchResult(result.getResults(), result.getResults().size());

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}


	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void applyChanges(List changes) throws RepositoryException {
		try {
			for (Object change : changes) {

				if (change instanceof AddObjectData) {
					new AddObjectOperation().execute((AddObjectData) change);
					continue;
				}

				if (change instanceof AddInternalData) {
					new AddInternalOperation().execute((AddInternalData) change);
					continue;
				}

				if (change instanceof RemoveObjectData) {
					new RemoveObjectOperation().execute((RemoveObjectData) change);
					continue;
				}

				if (change instanceof RemoveInternalData) {
					new RemoveInternalOperation().execute((RemoveInternalData) change);
					continue;
				}

				if (change instanceof ConnectData) {
					new ConnectOperation().execute((ConnectData) change);
					continue;
				}

				if (change instanceof DisconnectData) {
					new DisconnectOperation().execute((DisconnectData) change);
					continue;
				}

			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private SearchCriteria extractAndRemove(String parameter, List<SearchCriteria> search) {
		SearchCriteria result = null;
		for (SearchCriteria sc : search) {
			if (sc.getName().equals(parameter)) {
				search.remove(sc);
				result = sc;
				break;
			}
		}
		return result;
	}

	private boolean knownClasses(Class<? extends Object> class1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
