package sales.analyzer.process.query.builder;

import java.util.Map;

import org.jbpm.services.api.query.QueryParamBuilder;
import org.jbpm.services.api.query.QueryParamBuilderFactory;

import sales.analyzer.process.commons.Constants;

public class ETLProcessSearchCriteriaBuilderFactory  implements QueryParamBuilderFactory{

	@Override
	public boolean accept(String identifier) {
		if ((Constants.QUERY_ETL_PROCESS_BY_SEARCH_CRITERIA+Constants.BUILDER_SUFFIX).equals(identifier) ) {
			return true;
		}
		return false;
	}

	@Override
	public QueryParamBuilder<?> newInstance(Map<String, Object> parameters) {
		return new ETLProcessSearchCriteriaBuilder(parameters);
	}

}

