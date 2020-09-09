/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import sales.analyzer.api.model.impl.ETLListOfNodeInstanceLogs;
import sales.analyzer.api.model.impl.ETLNodeInstanceLog;

public class ETLNodeLogInstanceMapping extends AbstractQueryMapper<ETLNodeInstanceLog>
		implements QueryResultMapper<ETLListOfNodeInstanceLogs> {

	private static final long serialVersionUID = -2926632299572472426L;

	private static final String COLUMN_ID = "ID";
	private static final String COLUMN_LOG_DATE = "LOG_DATE";
	private static final String COLUMN_NODEINSTANCEID = "NODEINSTANCEID";
	private static final String COLUMN_NODENAME = "NODENAME";
	private static final String COLUMN_NODETYPE = "NODETYPE";
	private static final String COLUMN_PROCESSINSTANCEID = "PROCESSINSTANCEID";
	private static final String COLUMN_TYPE = "TYPE";

	@SuppressWarnings("unused")
	private Map<String, String> variablesMap = new HashMap<String, String>();

	public ETLNodeLogInstanceMapping() {
		super();
	}

	public ETLNodeLogInstanceMapping(Map<String, String> variablesMap) {
		this.variablesMap = variablesMap;
	}

	@Override
	public ETLListOfNodeInstanceLogs map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			List<ETLNodeInstanceLog> mappedResult = new ArrayList<ETLNodeInstanceLog>();

			if (dataSetResult != null) {

				for (int i = 0; i < dataSetResult.getRowCount(); i++) {
					ETLNodeInstanceLog pi = buildInstance(dataSetResult, i);
					mappedResult.add(pi);
				}
			}
			ETLListOfNodeInstanceLogs r = new ETLListOfNodeInstanceLogs();
			r.setNodes(mappedResult);
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	@Override
	protected ETLNodeInstanceLog buildInstance(DataSet dataSetResult, int index) {
		ETLNodeInstanceLog pi = new ETLNodeInstanceLog();
		pi.setId(getColumnLongValue(dataSetResult, COLUMN_ID, index));
		pi.setLogDate(getColumnDateValue(dataSetResult, COLUMN_LOG_DATE, index));
		pi.setNodeInstanceId(getColumnStringValue(dataSetResult, COLUMN_NODEINSTANCEID, index));
		pi.setNodeName(getColumnStringValue(dataSetResult, COLUMN_NODENAME, index));
		pi.setProcessInstanceId(getColumnLongValue(dataSetResult, COLUMN_PROCESSINSTANCEID, index));
		pi.setNodeType(getColumnStringValue(dataSetResult, COLUMN_NODETYPE, index));
		pi.setType(getColumnIntValue(dataSetResult, COLUMN_TYPE, index));

		return pi;
	}

	@Override
	public String getName() {
		return ETLNodeInstanceLog.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return ETLNodeInstanceLog.class;
	}

	@Override
	public QueryResultMapper<ETLListOfNodeInstanceLogs> forColumnMapping(Map<String, String> arg0) {
		return new ETLNodeLogInstanceMapping();
	}

}
