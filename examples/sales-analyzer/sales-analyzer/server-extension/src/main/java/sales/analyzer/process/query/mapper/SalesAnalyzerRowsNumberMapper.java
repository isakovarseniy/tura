package sales.analyzer.process.query.mapper;

import java.util.ArrayList;
import java.util.Map;

import org.dashbuilder.dataset.DataSet;
import org.jbpm.kie.services.impl.query.mapper.AbstractQueryMapper;
import org.jbpm.services.api.query.QueryResultMapper;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfRowsNumber;
import sales.analyzer.api.model.impl.SalesAnalyzerRowsNumber;

public class SalesAnalyzerRowsNumberMapper extends AbstractQueryMapper<SalesAnalyzerRowsNumber>
implements QueryResultMapper<SalesAnalyzerListOfRowsNumber> {

	private static final long serialVersionUID = 6670372908669667978L;

	@Override
	public SalesAnalyzerListOfRowsNumber map(Object result) {
		if (result instanceof DataSet) {
			DataSet dataSetResult = (DataSet) result;
			SalesAnalyzerListOfRowsNumber r = new SalesAnalyzerListOfRowsNumber();
			r.setRows(new ArrayList<>());
			SalesAnalyzerRowsNumber n = new SalesAnalyzerRowsNumber();
			n.setRowsNumber(new Long(dataSetResult.getRowCount()));
			r.getRows().add(n);
			
			return r;
		}

		throw new IllegalArgumentException("Unsupported result for mapping " + result);
	}

	@Override
	protected SalesAnalyzerRowsNumber buildInstance(DataSet dataSetResult, int index) {
		SalesAnalyzerRowsNumber n = new SalesAnalyzerRowsNumber();
		n.setRowsNumber(getColumnLongValue(dataSetResult, "A", index));
		return n;
	}

	@Override
	public String getName() {
		return SalesAnalyzerRowsNumber.class.getSimpleName();
	}

	@Override
	public Class<?> getType() {
		return SalesAnalyzerRowsNumber.class;
	}

	@Override
	public QueryResultMapper<SalesAnalyzerListOfRowsNumber> forColumnMapping(Map<String, String> columnMapping) {
		return new SalesAnalyzerRowsNumberMapper();
	}
	
	
}

