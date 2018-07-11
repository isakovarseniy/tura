package sales.analyzer.process.query.builder;

import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.services.api.query.QueryParamBuilder;

import sales.analyzer.process.commons.Constants;

public class ProductColumnBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public ProductColumnBuilder(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public ColumnFilter build() {
		if (built) {
			return null;
		}
		if (parameters.get(Constants.PARAMETER_PRODUCT) == null) {
			built = true;
			return null;
		}
		
		String columnName = "CD.PRODUCT";

		ColumnFilter filter = FilterFactory.AND(
				FilterFactory.equalsTo(((Number) parameters.get(Constants.PARAMETER_PRODUCT)).longValue()))
				;
		filter.setColumnId(columnName);

		built = true;
		return filter;

	}
}

