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

package sales.analyzer.process.query.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfProcessInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;

public class SalesAnalyzerProcessInstanceMapper extends AbstractQueryMapper<SalesAnalyzerProcessInstance>
		implements QueryResultMapper<SalesAnalyzerListOfProcessInstances> {

	private static final long serialVersionUID = -6779386007194964489L;
	@SuppressWarnings("unused")
	private Map<String, String> variablesMap = new HashMap<String, String>();
	private static String COLUMN_CITY = "CITY";
	private static String COLUMN_STATES = "STATES";
	private static String COLUMN_PRODUCT = "PRODUCT";
	private static String COLUMN_CASE_ID = "CASE_ID";
	private static String COLUMN_ANALYSTACTOR = "ANALYSTACTOR";
	private static String COLUMN_MANAGERACTOR="MANAGERACTOR";

	public SalesAnalyzerProcessInstanceMapper() {
		super();
	}

	public SalesAnalyzerProcessInstanceMapper(Map<String, String> variablesMap) {
		this.variablesMap = variablesMap;
	}

	public static SalesAnalyzerProcessInstanceMapper get(Map<String, String> variablesMap) {
		return new SalesAnalyzerProcessInstanceMapper(variablesMap);
	}

	@Override
	public SalesAnalyzerListOfProcessInstances map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			List<SalesAnalyzerProcessInstance> mappedResult = new ArrayList<SalesAnalyzerProcessInstance>();

			Map<Long, SalesAnalyzerProcessInstance> tmp = new HashMap<Long, SalesAnalyzerProcessInstance>();

			if (dataSetResult != null) {

				for (int i = 0; i < dataSetResult.getRowCount(); i++) {
					Long processInstanceId = getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEID, i);
					SalesAnalyzerProcessInstance pi = tmp.get(processInstanceId);
					if (pi == null) {
						pi = buildInstance(dataSetResult, i);
						mappedResult.add(pi);

						tmp.put(processInstanceId, pi);
					}
					SalesAnalyzerTaskInstance ti = buildTaskInstance(dataSetResult, i);
					if (pi.getActiveUserTasks() == null) {
						pi.setActiveUserTasks(new ArrayList<>());
					}
					pi.getActiveUserTasks().add(ti);
				}
			}
			tmp = null;
			SalesAnalyzerListOfProcessInstances r = new SalesAnalyzerListOfProcessInstances();
			r.setProcesses(mappedResult);
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	@Override
	protected SalesAnalyzerProcessInstance buildInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerProcessInstance pi = new SalesAnalyzerProcessInstance();
		pi.setId(getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEID, index));
		pi.setProcessId(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSID, index));
		pi.setProcessName(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSNAME, index));
		pi.setProcessVersion(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSVERSION, index));
		pi.setState(getColumnIntValue(dataSetResult, "PROC_"+COLUMN_STATUS, index));
		pi.setProcessInstanceDescription(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEDESCRIPTION, index));
		pi.setCorrelationKey(getColumnStringValue(dataSetResult, "PROC_"+COLUMN_CORRELATIONKEY, index));
		pi.setParentId(getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PARENTPROCESSINSTANCEID, index));

		int city = getColumnIntValue(dataSetResult, COLUMN_CITY, index);
		int states = getColumnIntValue(dataSetResult, COLUMN_STATES, index);
		String product = getColumnStringValue(dataSetResult, COLUMN_PRODUCT, index);
		String case_id = getColumnStringValue(dataSetResult, COLUMN_CASE_ID, index);
		String analystActor = getColumnStringValue(dataSetResult, COLUMN_ANALYSTACTOR, index);
		String managerActor = getColumnStringValue(dataSetResult, COLUMN_MANAGERACTOR, index);
		
		
		pi.setCity(city);
		pi.setStates(states);
		pi.setProduct(product);
		pi.setCaseId(case_id);
		pi.setAnalystActor(analystActor);
		pi.setManagerActor(managerActor);


		return pi;
	}
	
	protected SalesAnalyzerTaskInstance buildTaskInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerTaskInstance ti = new SalesAnalyzerTaskInstance();
		ti.setId(getColumnLongValue(dataSetResult, "ID", index));
		ti.setProcessId(getColumnStringValue(dataSetResult, COLUMN_TASK_PROCESSID, index));
		ti.setProcessInstanceId(getColumnLongValue(dataSetResult, COLUMN_TASK_PROCESSINSTANCEID, index));
		ti.setActualOwner(getColumnStringValue(dataSetResult, COLUMN_ACTUALOWNER, index));
		ti.setCreatedBy(getColumnStringValue(dataSetResult, COLUMN_CREATEDBY, index));
		ti.setName(getColumnStringValue(dataSetResult, COLUMN_NAME, index));
		ti.setStatus(getColumnStringValue(dataSetResult, COLUMN_STATUS, index));
		ti.setActualOwner(getColumnStringValue(dataSetResult, "actualowner_id", index));

		return ti;
	}
	

	@Override
	public String getName() {
		return SalesAnalyzerProcessInstance.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return SalesAnalyzerProcessInstance.class;
	}

	@Override
	public QueryResultMapper<SalesAnalyzerListOfProcessInstances> forColumnMapping(Map<String, String> columnMapping) {
		return new SalesAnalyzerProcessInstanceMapper();
	}

}

