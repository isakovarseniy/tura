package sales.analyzer.process;

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
		pi.setCity(city);
		pi.setStates(states);
		pi.setProduct(product);

		return pi;
	}
	
	protected SalesAnalyzerTaskInstance buildTaskInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerTaskInstance ti = new SalesAnalyzerTaskInstance();
		ti.setId(getColumnLongValue(dataSetResult, "ID", index));
		ti.setProcessId(getColumnStringValue(dataSetResult, COLUMN_TASK_PROCESSID, index));
		ti.setActualOwner(getColumnStringValue(dataSetResult, COLUMN_ACTUALOWNER, index));
		ti.setCreatedBy(getColumnStringValue(dataSetResult, COLUMN_CREATEDBY, index));
		ti.setName(getColumnStringValue(dataSetResult, COLUMN_NAME, index));
		ti.setStatus(getColumnStringValue(dataSetResult, COLUMN_STATUS, index));

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

