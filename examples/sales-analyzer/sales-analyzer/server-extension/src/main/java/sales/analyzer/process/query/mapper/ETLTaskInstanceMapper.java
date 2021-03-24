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

package sales.analyzer.process.query.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.ETLListOfTaskInstances;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.ETLTaskInstance;

public class ETLTaskInstanceMapper extends AbstractQueryMapper<ETLTaskInstance>
		implements QueryResultMapper<ETLListOfTaskInstances> {

	private static final long serialVersionUID = -6779386007194964489L;
	@SuppressWarnings("unused")
	private Map<String, String> variablesMap = new HashMap<String, String>();

	public ETLTaskInstanceMapper() {
		super();
	}

	public ETLTaskInstanceMapper(Map<String, String> variablesMap) {
		this.variablesMap = variablesMap;
	}
	
	public static ETLProcessInstanceMapper get(Map<String, String> variablesMap) {
		return new ETLProcessInstanceMapper(variablesMap);
	}
	
	

	@Override
	public ETLListOfTaskInstances map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			List<ETLTaskInstance> mappedResult = new ArrayList<ETLTaskInstance>();

			Map<Long, ETLTaskInstance> tmp = new HashMap<Long, ETLTaskInstance>();
			Map<Long, ETLProcessInstance> tmp2 = new HashMap<Long, ETLProcessInstance>();

			if (dataSetResult != null) {

				for (int i = 0; i < dataSetResult.getRowCount(); i++) {
					Long taskId = getColumnLongValue(dataSetResult, "ID", i);
					ETLTaskInstance ti = tmp.get(taskId);
					if (ti == null) {
						ti = buildInstance(dataSetResult, i);
						mappedResult.add(ti);
						tmp.put(taskId, ti);
					}
					Long processInstanceId = getColumnLongValue(dataSetResult, "PROC_" + COLUMN_PROCESSINSTANCEID, i);
					ETLProcessInstance pi = tmp2.get(processInstanceId);
					if (pi == null) {
						pi = buildProcessInstance(dataSetResult, i);
						tmp2.put(processInstanceId, pi);
					}
					ti.setProcess(pi);
				}
			}
			tmp = null;
			tmp2 = null;
			ETLListOfTaskInstances r = new ETLListOfTaskInstances();
			r.setTasks(mappedResult);
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	protected ETLProcessInstance buildProcessInstance(DataSet dataSetResult, int index) {
		ETLProcessInstance pi = new ETLProcessInstance();
		pi.setId(getColumnLongValue(dataSetResult, "PROC_" + COLUMN_PROCESSINSTANCEID, index));
		pi.setProcessId(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSID, index));
		pi.setProcessName(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSNAME, index));
		pi.setProcessVersion(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSVERSION, index));
		pi.setState(getColumnIntValue(dataSetResult, "PROC_" + COLUMN_STATUS, index));
		pi.setProcessInstanceDescription(
				getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSINSTANCEDESCRIPTION, index));
		pi.setCorrelationKey(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_CORRELATIONKEY, index));
		pi.setParentId(getColumnLongValue(dataSetResult, "PROC_" + COLUMN_PARENTPROCESSINSTANCEID, index));

		return pi;
	}

	@Override
	protected ETLTaskInstance buildInstance(DataSet dataSetResult, int index) {
		ETLTaskInstance ti = new ETLTaskInstance();
		ti.setId(getColumnLongValue(dataSetResult, "ID", index));
		ti.setProcessId(getColumnStringValue(dataSetResult, COLUMN_TASK_PROCESSID, index));
		ti.setActualOwner(getColumnStringValue(dataSetResult, "actualowner_id", index));
		ti.setCreatedBy(getColumnStringValue(dataSetResult, COLUMN_CREATEDBY, index));
		ti.setName(getColumnStringValue(dataSetResult, COLUMN_NAME, index));
		ti.setStatus(getColumnStringValue(dataSetResult, COLUMN_STATUS, index));

		return ti;
	}

	@Override
	public String getName() {
		return ETLTaskInstance.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return ETLTaskInstance.class;
	}

	@Override
	public QueryResultMapper<ETLListOfTaskInstances> forColumnMapping(Map<String, String> columnMapping) {
		return new ETLTaskInstanceMapper();
	}

}
