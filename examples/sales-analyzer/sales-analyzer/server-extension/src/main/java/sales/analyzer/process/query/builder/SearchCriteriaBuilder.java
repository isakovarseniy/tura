package sales.analyzer.process.query.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.runtime.manager.impl.identity.UserDataServiceProvider;
import org.jbpm.services.api.query.QueryParamBuilder;
import org.kie.api.task.UserGroupCallback;
import org.kie.internal.identity.IdentityProvider;
import org.kie.server.api.KieServerConstants;
import org.kie.server.services.api.KieServerRegistry;
import org.kie.server.services.impl.KieServerImpl;
import org.kie.server.services.impl.KieServerLocator;

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

		KieServerImpl server = KieServerLocator.getInstance();
		KieServerRegistry registry = server.getServerRegistry();
		IdentityProvider identityProvider = registry.getIdentityProvider();
		Boolean bypassAuthUser = Boolean.parseBoolean(registry.getConfig().getConfigItemValue(KieServerConstants.CFG_BYPASS_AUTH_USER, "false"));
		UserGroupCallback userGroupCallback = UserDataServiceProvider.getUserGroupCallback();
		
		
		ArrayList<ColumnFilter> filters = new ArrayList<>();
		String username = "undefined";
		if (!bypassAuthUser) {
			username = identityProvider.getName();
		}
		
		/*
		  (t.taskData.actualOwner.id = :userId or t.taskData.actualOwner is null) and
		 */
		 {
			 ColumnFilter f1 = FilterFactory.equalsTo(username);
			 f1.setColumnId("ACTUALOWNER_ID");
			 ColumnFilter f2 = FilterFactory.isNull();
			 f2.setColumnId("ACTUALOWNER_ID");
			 ColumnFilter filter = FilterFactory.OR(f1,f2);
			 filters.add(filter);
		 }
		/*
    ( potentialOwners.id = :userId or potentialOwners.id in (:groupIds) ) and
		 */
		 {
			 List<String> groups = userGroupCallback.getGroupsForUser(username,null,null);
			 ColumnFilter f1 = FilterFactory.equalsTo(username);
			 f1.setColumnId("ORG_ID");
			 ColumnFilter f2 = FilterFactory.in("ORG_ID",groups);
			 ColumnFilter filter = FilterFactory.OR(f1,f2);
			 filters.add(filter);
		 }
		

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

