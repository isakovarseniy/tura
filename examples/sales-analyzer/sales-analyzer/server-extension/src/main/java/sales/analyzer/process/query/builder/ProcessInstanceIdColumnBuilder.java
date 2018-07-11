package sales.analyzer.process.query.builder;

import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.services.api.query.QueryParamBuilder;

import sales.analyzer.process.commons.Constants;

public class ProcessInstanceIdColumnBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public ProcessInstanceIdColumnBuilder(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public ColumnFilter build() {
		if (built) {
			return null;
		}
		String columnName = "processInstanceId";

		ColumnFilter filter = FilterFactory.AND(
				FilterFactory.equalsTo(((Number) parameters.get(Constants.PARAMETER_PROCESSINSTANCE_ID)).longValue()));
		filter.setColumnId(columnName);

		built = true;
		return filter;

	}
}

