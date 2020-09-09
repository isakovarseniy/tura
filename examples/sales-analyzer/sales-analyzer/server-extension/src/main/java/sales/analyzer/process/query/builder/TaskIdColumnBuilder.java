/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.process.query.builder;

import java.util.ArrayList;
import java.util.Map;

import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.FilterFactory;
import org.jbpm.services.api.query.QueryParamBuilder;
import org.kie.internal.identity.IdentityProvider;
import org.kie.server.api.KieServerConstants;
import org.kie.server.services.api.KieServerRegistry;
import org.kie.server.services.impl.KieServerImpl;
import org.kie.server.services.impl.KieServerLocator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.user.UserPreferences;

public class TaskIdColumnBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public TaskIdColumnBuilder(Map<String, Object> parameters) {
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
		
		String username =null;
		if (!bypassAuthUser) {
			username = identityProvider.getName();
		}
		ArrayList<ColumnFilter> filters = new ArrayList<>();
		UserPreferences preferences = (UserPreferences) parameters.get(Constants.PARAMETER_USER_PREFERENCES);
		filters.addAll(SecurityRulesHelper.securityBoundaries(preferences,username));
		
		String columnName = "id";

		ColumnFilter filter = FilterFactory.AND(
				FilterFactory.equalsTo(((Number) parameters.get(Constants.PARAMETER_TASK_ID)).longValue()));
		filter.setColumnId(columnName);
		filters.add(filter);


		built = true;
		return FilterFactory.AND(filters);

	}
}

