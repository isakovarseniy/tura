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

package org.tura.platform.test.spa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.JOSQLExpressionBuilder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RegistryAware;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.query.SelectQuery;
import com.rits.cloning.Cloner;

public class SearchService extends AbstractSearchService implements RegistryAware{
	
	public static String TARGET_CLASS = "TARGET_CLASS";

	private String registryName;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	

	public SearchService(SpaObjectRegistry spaRegistry,String registryName,Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	protected  <T>SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException{

		RepositoryHelper helper = new RepositoryHelper(registry);

		try {

			helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT, searchCriteria);
			SearchCriteria sc =  helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT, searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,searchCriteria);
			helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE, searchCriteria);

			PreQueryTrigger preQueryTrigger;
			if ( sc == null){
				 preQueryTrigger = helper.findPreQueryTrigger(helper.findRepositoryClass( objectClass.getName()).getName());
			}else{
				 preQueryTrigger = helper.findPreQueryTrigger(sc.getValue().getClass().getName(),  helper.findRepositoryClass( objectClass.getName()).getName());
			}
			
			Class<?> baseClass = objectClass;
			if (Adapter.class.isAssignableFrom(baseClass)) {
			 sc = helper.extractAndRemove(TARGET_CLASS,searchCriteria);
			 baseClass = Class.forName((String)sc.getValue());
			}
			
			SelectQuery select = DefaulQueryFactory.builder(searchCriteria, orderCriteria, baseClass);
			Query query = new Query();

			String strQuery = select.toSql(new JOSQLExpressionBuilder());
			if (preQueryTrigger instanceof WrapperHook) {
				((WrapperHook)preQueryTrigger).fixParameters(query);
			}
			query.parse(strQuery);

			for (String param : select.getParams().keySet()) {
				query.setVariable(param, select.getParams().get(param));
			}
			

			Map<Object, Object> h = SearchBase.base.get(objectClass.getName());
			if (h != null) {
				Collection<?> array = SearchBase.base.get(objectClass.getName()).values();

				QueryResults result = query.execute(array);

				return new SearchResult<T>(result.getResults(), result.getResults().size());
			} else {
				return new SearchResult<T>(new ArrayList<T>(), 0);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected  <T>  T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException{
		Cloner cloner = new  Cloner();
		return (T) cloner.deepClone(SearchBase.base.get(objectClass.getName()).get(pk));		
	}

	public String getRegistryName() {
		return registryName;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
	}

	
	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

	@Override
	public Registry getRegistry() {
		return registry;
	}
	
}
