package sales.analyzer.process.query.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfTaskInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;

public class SalesAnalyzerTaskInstanceMapper extends AbstractQueryMapper<SalesAnalyzerTaskInstance>
		implements QueryResultMapper<SalesAnalyzerListOfTaskInstances> {

	private static final long serialVersionUID = -6779386007194964489L;
	@SuppressWarnings("unused")
	private Map<String, String> variablesMap = new HashMap<String, String>();
	private static String COLUMN_CITY = "CITY";
	private static String COLUMN_STATES = "STATES";
	private static String COLUMN_PRODUCT = "PRODUCT";
	private static String COLUMN_CASE_ID = "CASE_ID";
	private static String COLUMN_ANALYSTACTOR = "ANALYSTACTOR";
	private static String COLUMN_MANAGERACTOR="MANAGERACTOR";

	public SalesAnalyzerTaskInstanceMapper() {
		super();
	}

	public static SalesAnalyzerProcessInstanceMapper get(Map<String, String> variablesMap) {
		return new SalesAnalyzerProcessInstanceMapper(variablesMap);
	}

	@Override
	public SalesAnalyzerListOfTaskInstances map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			List<SalesAnalyzerTaskInstance> mappedResult = new ArrayList<SalesAnalyzerTaskInstance>();

			Map<Long, SalesAnalyzerTaskInstance> tmp = new HashMap<Long, SalesAnalyzerTaskInstance>();
			Map<Long, SalesAnalyzerProcessInstance> tmp2 = new HashMap<Long, SalesAnalyzerProcessInstance>();

			if (dataSetResult != null) {

				for (int i = 0; i < dataSetResult.getRowCount(); i++) {
					Long taskId = getColumnLongValue(dataSetResult, "ID" , i);
					SalesAnalyzerTaskInstance ti = tmp.get(taskId);
					if (ti == null) {
						ti = buildInstance(dataSetResult, i);
						mappedResult.add(ti);
						tmp.put(taskId, ti);
					}
					Long processInstanceId = getColumnLongValue(dataSetResult, "PROC_"+COLUMN_PROCESSINSTANCEID, i);
					SalesAnalyzerProcessInstance pi = tmp2.get(processInstanceId);
					if (pi == null) {
						pi = buildProcessInstance(dataSetResult, i);
						tmp2.put(processInstanceId, pi);
					}
					ti.setProcess(pi);
				}
			}
			tmp = null;
			tmp2 = null;
			SalesAnalyzerListOfTaskInstances r = new SalesAnalyzerListOfTaskInstances();
			r.setTasks(mappedResult);
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	protected SalesAnalyzerProcessInstance buildProcessInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerProcessInstance pi = new SalesAnalyzerProcessInstance();
		pi.setId(getColumnLongValue(dataSetResult, "PROC_" + COLUMN_PROCESSINSTANCEID, index));
		pi.setProcessId(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSID, index));
		pi.setProcessName(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSNAME, index));
		pi.setProcessVersion(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSVERSION, index));
		pi.setState(getColumnIntValue(dataSetResult, "PROC_" + COLUMN_STATUS, index));
		pi.setProcessInstanceDescription(
				getColumnStringValue(dataSetResult, "PROC_" + COLUMN_PROCESSINSTANCEDESCRIPTION, index));
		pi.setCorrelationKey(getColumnStringValue(dataSetResult, "PROC_" + COLUMN_CORRELATIONKEY, index));
		pi.setParentId(getColumnLongValue(dataSetResult, "PROC_" + COLUMN_PARENTPROCESSINSTANCEID, index));

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

	@Override
	protected SalesAnalyzerTaskInstance buildInstance (DataSet dataSetResult, int index) {
		SalesAnalyzerTaskInstance ti = new SalesAnalyzerTaskInstance();
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
		return SalesAnalyzerTaskInstance.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return SalesAnalyzerTaskInstance.class;
	}

	@Override
	public QueryResultMapper<SalesAnalyzerListOfTaskInstances> forColumnMapping(Map<String, String> columnMapping) {
		return new SalesAnalyzerTaskInstanceMapper();
	}

}

