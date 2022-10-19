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

package sales.analyzer.service.jbpm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.AbstaractSearchService;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaObjectRegistry.SpaRegistry;

import com.octo.java.sql.query.SelectQuery.Order;

import sales.analyzer.api.model.impl.ETLListOfNodeInstanceLogs;
import sales.analyzer.api.model.impl.ETLNodeInstanceLog;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerListOfTaskInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstancePK;
import sales.analyzer.api.model.impl.SalesAnalyzerRowsNumber;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;

public class JbpmSearchService extends AbstaractSearchService {

	private QueryServicesClient queryClient;
	private UserPreferencesProvider prefRef;
	private String registryName;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;

	public JbpmSearchService(KieServicesClient client, UserPreferencesProvider prefRef, SpaObjectRegistry spaRegistry,
			String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;

		queryClient = client.getServicesClient(QueryServicesClient.class);
		this.prefRef = prefRef;

	}

	@SuppressWarnings("unchecked")
	@Override
	protected <T> T serviceCall(Object pk, Class<T> objectClass) throws RepositoryException {
		String query = null;
		String mapper = null;
		Class<?> clazz = null;
		HashMap<String, Object> parameters = new HashMap<>();
		if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass.getName())) {
			SalesAnalyzerProcessInstancePK o = (SalesAnalyzerProcessInstancePK) pk;
			query = Constants.QUERY_PROCESS_BY_CASE_ID;
			mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
			clazz = SalesAnalyzerProcessInstance.class;
			parameters.put(Constants.PARAMETER_CASE_ID, o.getCaseId());

		}
		if (ETLProcessInstance.class.getName().equals(objectClass.getName())) {
			Long o = (Long) pk;
			query = Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA;
			mapper = ETLProcessInstance.class.getSimpleName();
			clazz = ETLProcessInstance.class;
			parameters.put(Constants.PARAMETER_PROCESSINSTANCE_ID, o);

			ArrayList<String> array = new ArrayList<>();
			array.add(Constants.ETL_MONTHLY_FILE_LOAD_PROCESS_ID);
			parameters.put(Constants.PARAMETER_PROCESS_IDS, array);
		}

		if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_TASK_BY_PK;
			mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
			clazz = SalesAnalyzerListOfTaskInstances.class;
			parameters.put(Constants.PARAMETER_TASK_ID, pk);
		}

		if (ETLNodeInstanceLog.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_NODELOG_BY_PK;
			mapper = ETLNodeInstanceLog.class.getSimpleName();
			clazz = ETLListOfNodeInstanceLogs.class;
			parameters.put(Constants.PARAMETER_NODELOG_ID, pk);
		}

		if (query == null || mapper == null || clazz == null) {
			throw new RuntimeException("Unknown object" + objectClass.getName());
		}

		parameters.put(Constants.PARAMETER_USER_PREFERENCES, prefRef.getUserPreferences(null));

		Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, parameters, 0, 100,
				clazz);

		if (instances == null || instances.isEmpty()) {
			return null;
		}
		if (instances.size() > 1) {
			throw new RuntimeException("Primary key is not unique");
		}
		return (T) instances.iterator().next();

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected <T> SearchResult<T> serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {

		String query = null;
		String mapper = null;
		Class<?> clazz = null;
		RepositoryHelper helper = new RepositoryHelper(null);

		SearchCriteria parentPersistenceObject = helper
				.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT, searchCriteria);
		if (parentPersistenceObject != null && parentPersistenceObject.getValue() != null) {
			Object parentObject = parentPersistenceObject.getValue();
			if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass.getName()) && 
					SalesAnalyzerTaskInstance.class.getName().equals(parentObject.getClass().getName())	
					) {
				SalesAnalyzerTaskInstance task = (SalesAnalyzerTaskInstance) parentObject;
				SalesAnalyzerProcessInstance proc = task.getProcess();
				List<T> array = new  ArrayList<>();
				array.add((T) proc);
				return new SearchResult<T>(array, 1);
			}
			if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass.getName()) && 
					SalesAnalyzerProcessInstance.class.getName().equals(parentObject.getClass().getName())	
					) {
				SalesAnalyzerProcessInstance proc = (SalesAnalyzerProcessInstance) parentObject;
				List<T> array = new  ArrayList<>();
				array.addAll( (Collection<? extends T>) proc.getActiveUserTasks());
				return new SearchResult<T>(array, 1);
			}
			
			
		}

		HashMap<String, Object> parameters = new HashMap<>();
		SearchCriteria sc = helper.checkSearchParam(Constants.VAR_CITY, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.PARAMETER_CITY, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_STATE, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.PARAMETER_STATE, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_PRODUCT, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.PARAMETER_PRODUCT, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_CASE_ID, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.PARAMETER_CASE_ID, sc.getValue());
		}

		/* fix problem with generation of default search criteria */
		sc = helper.checkSearchParam(Constants.VAR_CASE_ID_, searchCriteria);
		if (sc != null) {
			parameters.put(Constants.PARAMETER_CASE_ID, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_ACTUAL_OWNER, searchCriteria);
		if (sc != null && SalesAnalyzerTaskInstance.class.getName().equals(objectClass.getName())) {
			parameters.put(Constants.PARAMETER_ACTUAL_OWNER, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_PROCESS_INSTANCE_ID, searchCriteria);
		if (sc != null && ETLNodeInstanceLog.class.getName().equals(objectClass.getName())) {
			parameters.put(Constants.PARAMETER_PROCESSINSTANCE_ID, sc.getValue());
		}

		sc = helper.checkSearchParam(Constants.VAR_PROCESS_ID, searchCriteria);
		if (sc != null && ETLProcessInstance.class.getName().equals(objectClass.getName())) {
			parameters.put(Constants.PARAMETER_PROCESSINSTANCE_ID, sc.getValue());
		}

		if (orderCriteria != null && orderCriteria.size() > 0) {
			parameters.put("q_order_by", orderCriteria.get(0).getName());
			parameters.put("q_ascending", orderCriteria.get(0).getOrder().equals(Order.ASC.name()));
		}

		if (SalesAnalyzerProcessInstance.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_PROCESS_BY_SEARCH_CRITERIA;
			mapper = SalesAnalyzerProcessInstance.class.getSimpleName();
			clazz = SalesAnalyzerProcessInstance.class;

		}

		if (ETLProcessInstance.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA;
			mapper = ETLProcessInstance.class.getSimpleName();
			clazz = ETLProcessInstance.class;

			ArrayList<String> array = new ArrayList<>();
			array.add(Constants.ETL_MONTHLY_FILE_LOAD_PROCESS_ID);
			parameters.put(Constants.PARAMETER_PROCESS_IDS, array);
		}

		if (SalesAnalyzerTaskInstance.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_TASK_BY_SEARCH_CRITERIA;
			mapper = SalesAnalyzerTaskInstance.class.getSimpleName();
			clazz = SalesAnalyzerTaskInstance.class;
		}

		if (ETLNodeInstanceLog.class.getName().equals(objectClass.getName())) {
			query = Constants.QUERY_NODELOG_BY_SEARCH_CRITERIA;
			mapper = ETLNodeInstanceLog.class.getSimpleName();
			clazz = ETLNodeInstanceLog.class;
		}

		if (query == null || mapper == null || clazz == null) {
			throw new RuntimeException("Unknown object" + objectClass.getName());
		}

		parameters.put(Constants.PARAMETER_USER_PREFERENCES, prefRef.getUserPreferences(null));

		Collection<SalesAnalyzerRowsNumber> rows = queryClient.query(query + Constants.NUMBER_OF_ROWS_SUFFIX,
				SalesAnalyzerRowsNumber.class.getSimpleName(), query + Constants.BUILDER_SUFFIX, parameters, 0, 10,
				SalesAnalyzerRowsNumber.class);

		if (rows == null || rows.isEmpty()) {
			return null;
		}
		if (rows.size() > 1) {
			throw new RuntimeException("Wrong value for rows numbers");
		}

		int pagesize = endIndex - startIndex;
		int page = startIndex / pagesize;

		Collection<?> instances = queryClient.query(query, mapper, query + Constants.BUILDER_SUFFIX, parameters, page,
				pagesize, clazz);

		if (instances == null) {
			return new SearchResult(new ArrayList<>(), 0);
		}
		ArrayList<Object> result = new ArrayList<>();
		result.addAll(instances);

		return new SearchResult(result, rows.iterator().next().getRowsNumber());
	}

	@Override
	protected SpaRegistry getSpaRegistry() {
		return spaRegistry.getRegistry(registryName);
	}

}
