package sales.analyzer.process.query.builder;

import java.util.ArrayList;
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
import sales.analyzer.user.UserPreferences;

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
		@SuppressWarnings("unused")
		UserGroupCallback userGroupCallback = UserDataServiceProvider.getUserGroupCallback();
		
		ArrayList<ColumnFilter> filters = new ArrayList<>();
		String username = null;
		if (!bypassAuthUser) {
			username = identityProvider.getName();
		}

		UserPreferences preferences = (UserPreferences) parameters.get(Constants.PARAMETER_USER_PREFERENCES);
		filters.addAll(SecurityRulesHelper.securityBoundaries(preferences,username));
		
		if (  !preferences.isSuperAdmin() &&  !preferences.isAdminForCity()  && !preferences.isAdminForStates())
		/*
		  (t.taskData.actualOwner.id = :userId l) and
		 */
		 {
			 ColumnFilter f1 = FilterFactory.equalsTo(username);
			 f1.setColumnId(SecurityRulesHelper.COLUMN_ACTUALOWNER_ID);
			 filters.add(f1);
		 }
		
		/*
//    ( potentialOwners.id = :userId or potentialOwners.id in (:groupIds) ) and
//		 */
//		 {
//			 List<String> groups = userGroupCallback.getGroupsForUser(username,null,null);
//			 ColumnFilter f1 = FilterFactory.equalsTo(username);
//			 f1.setColumnId(SecurityRulesHelper.COLUMN_ORG_ID);
//			 ColumnFilter f2 = FilterFactory.in(SecurityRulesHelper.COLUMN_ORG_ID,groups);
//			 ColumnFilter filter = FilterFactory.OR(f1,f2);
//			 filters.add(filter);
//		 }
		

		if (parameters.get(Constants.PARAMETER_CITY) != null) {
			String columnName = SecurityRulesHelper.COLUMN_CITY;

			ColumnFilter filter = FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_CITY)).longValue());
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_STATE) != null) {
			String columnName = SecurityRulesHelper.COLUMN_STATE;

			ColumnFilter filter = FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_STATE)).longValue());
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_PRODUCT) != null) {
			String columnName = SecurityRulesHelper.COLUMN_PRODUCT;

			ColumnFilter filter = FilterFactory.equalsTo(((String) parameters.get(Constants.PARAMETER_PRODUCT)));
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_CASE_ID) != null) {
			String columnName = SecurityRulesHelper.COLUMN_CASE_ID;

			ColumnFilter filter = FilterFactory.equalsTo(((String) parameters.get(Constants.PARAMETER_CASE_ID)));
			filter.setColumnId(columnName);

			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_ACTUAL_OWNER) != null) {
			String columnName = SecurityRulesHelper.COLUMN_ACTUALOWNER_ID;

			ColumnFilter filter = FilterFactory.equalsTo(((String) parameters.get(Constants.PARAMETER_ACTUAL_OWNER)));
			filter.setColumnId(columnName);

			filters.add(filter);
		}
		
		
		
		ColumnFilter filter = FilterFactory.AND(filters);

		built = true;
		return filter;

	}
}

