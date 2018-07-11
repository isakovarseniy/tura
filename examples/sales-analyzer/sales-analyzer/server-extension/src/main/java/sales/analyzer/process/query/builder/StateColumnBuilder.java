package sales.analyzer.process.query.builder;

import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.services.api.query.QueryParamBuilder;

import sales.analyzer.process.commons.Constants;

public class StateColumnBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public StateColumnBuilder(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public ColumnFilter build() {
		if (built) {
			return null;
		}
		if (parameters.get(Constants.PARAMETER_STATE) == null) {
			built = true;
			return null;
		}
		
		String columnName = "CD.STATE";

		ColumnFilter filter = FilterFactory.AND(
				FilterFactory.equalsTo(((Number) parameters.get(Constants.PARAMETER_STATE)).longValue()))
				;
		filter.setColumnId(columnName);

		built = true;
		return filter;

	}
}

