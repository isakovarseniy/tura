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

public class ETLProcessSearchCriteriaBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public ETLProcessSearchCriteriaBuilder(Map<String, Object> parameters) {
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
		Boolean bypassAuthUser = Boolean.parseBoolean(
				registry.getConfig().getConfigItemValue(KieServerConstants.CFG_BYPASS_AUTH_USER, "false"));
		UserGroupCallback userGroupCallback = UserDataServiceProvider.getUserGroupCallback();

		ArrayList<ColumnFilter> filters = new ArrayList<>();
		String username = null;
		if (!bypassAuthUser) {
			username = identityProvider.getName();
		}

		/*
		 * ( t.taskData.actualOwner.id = :userId or potentialOwners.id in (:groupIds) )
		 * and
		 */
		{
			ColumnFilter f1 = FilterFactory.equalsTo(username);
			f1.setColumnId(SecurityRulesHelper.COLUMN_ACTUALOWNER_ID);

			List<String> groups = userGroupCallback.getGroupsForUser(username, null, null);
			ColumnFilter f2 = FilterFactory.in(SecurityRulesHelper.COLUMN_ORG_ID, groups);
			ColumnFilter filter = FilterFactory.OR(f1, f2);
			filters.add(filter);
		}

		@SuppressWarnings("unchecked")
		List<String> processIds = (List<String>) parameters.get(Constants.PARAMETER_PROCESS_IDS);
		{
			ColumnFilter filter = FilterFactory.in("PROCESSID", processIds);
			filters.add(filter);
		}

		String columnName = "PROC_ID";
		if (parameters.get(Constants.PARAMETER_PROCESSINSTANCE_ID) != null) {
			ColumnFilter filter = FilterFactory.AND(FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_PROCESSINSTANCE_ID)).longValue()));
			filter.setColumnId(columnName);
			filters.add(filter);
		}

		ColumnFilter filter = FilterFactory.AND(filters);

		built = true;
		return filter;

	}
}
