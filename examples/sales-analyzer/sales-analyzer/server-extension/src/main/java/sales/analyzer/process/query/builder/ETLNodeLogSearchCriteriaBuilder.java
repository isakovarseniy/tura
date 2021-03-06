/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import sales.analyzer.process.commons.Constants;

public class ETLNodeLogSearchCriteriaBuilder implements QueryParamBuilder<ColumnFilter> {
	private Map<String, Object> parameters;
	private boolean built = false;

	public ETLNodeLogSearchCriteriaBuilder(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public ColumnFilter build() {
		if (built) {
			return null;
		}
		ArrayList<ColumnFilter> filters = new ArrayList<>();

		if (parameters.get(Constants.PARAMETER_PROCESSINSTANCE_ID) != null) {
			String columnName = "PROCESSINSTANCEID";

			ColumnFilter filter = FilterFactory.AND(FilterFactory
					.equalsTo(((Number) parameters.get(Constants.PARAMETER_PROCESSINSTANCE_ID)).longValue()));
			filter.setColumnId(columnName);
			filters.add(filter);
		}

		if (parameters.get(Constants.PARAMETER_NODELOG_ID) != null) {
			String columnName = "ID";

			ColumnFilter filter = FilterFactory
					.AND(FilterFactory.equalsTo(((Number) parameters.get(Constants.PARAMETER_NODELOG_ID)).longValue()));
			filter.setColumnId(columnName);
			filters.add(filter);
		}

		ColumnFilter filter = FilterFactory.AND(filters);
		built = true;
		return filter;

	}

}
