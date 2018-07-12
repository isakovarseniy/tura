package sales.analyzer.process.query.builder;

import java.util.ArrayList;
import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.services.api.query.QueryParamBuilder;

import sales.analyzer.process.commons.Constants;

public class SearchCriteriaBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public SearchCriteriaBuilder(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public ColumnFilter build() {
		if (built) {
			return null;
		}
		ArrayList<ColumnFilter> filters = new ArrayList<>();

		if (parameters.get(Constants.PARAMETER_CITY) != null) {
			String columnName = "CITY";

			ColumnFilter filter = FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_CITY)).longValue());
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_STATE) != null) {
			String columnName = "STATES";

			ColumnFilter filter = FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_STATE)).longValue());
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_PRODUCT) != null) {
			String columnName = "PRODUCT";

			ColumnFilter filter = FilterFactory.equalsTo(((String) parameters.get(Constants.PARAMETER_PRODUCT)));
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		ColumnFilter filter = FilterFactory.AND(filters);

		built = true;
		return filter;

	}
}
