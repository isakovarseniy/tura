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
					Long processInstanceId = getColumnLongValue(dataSetResult, COLUMN_PROCESSINSTANCEID, i);
					SalesAnalyzerProcessInstance pi = tmp.get(processInstanceId);
					if (pi == null) {
						pi = buildInstance(dataSetResult, i);
						mappedResult.add(pi);

						tmp.put(processInstanceId, pi);
					}
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
		pi.setId(getColumnLongValue(dataSetResult, COLUMN_PROCESSINSTANCEID, index));
		pi.setProcessId(getColumnStringValue(dataSetResult, COLUMN_PROCESSID, index));
		pi.setProcessName(getColumnStringValue(dataSetResult, COLUMN_PROCESSNAME, index));
		pi.setProcessVersion(getColumnStringValue(dataSetResult, COLUMN_PROCESSVERSION, index));
		pi.setState(getColumnIntValue(dataSetResult, COLUMN_STATUS, index));
		pi.setProcessInstanceDescription(getColumnStringValue(dataSetResult, COLUMN_PROCESSINSTANCEDESCRIPTION, index));
		pi.setCorrelationKey(getColumnStringValue(dataSetResult, COLUMN_CORRELATIONKEY, index));
		pi.setParentId(getColumnLongValue(dataSetResult, COLUMN_PARENTPROCESSINSTANCEID, index));

		int city = getColumnIntValue(dataSetResult, COLUMN_CITY, index);
		int states = getColumnIntValue(dataSetResult, COLUMN_STATES, index);
		String product = getColumnStringValue(dataSetResult, COLUMN_PRODUCT, index);
		pi.setCity(city);
		pi.setStates(states);
		pi.setProduct(product);

		return pi;
	}

	@Override
	public String getName() {
		return "SalesAnalyzerProcessInstance";
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
