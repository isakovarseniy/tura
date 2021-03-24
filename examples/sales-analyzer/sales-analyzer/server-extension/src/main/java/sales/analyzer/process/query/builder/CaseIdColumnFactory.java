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

import java.util.Map;

import org.jbpm.services.api.query.QueryParamBuilder;
import org.jbpm.services.api.query.QueryParamBuilderFactory;

import sales.analyzer.process.commons.Constants;

public class CaseIdColumnFactory implements QueryParamBuilderFactory{

	@Override
	public boolean accept(String identifier) {
		if ((Constants.QUERY_PROCESS_BY_CASE_ID+Constants.BUILDER_SUFFIX).equals(identifier) ) {
			return true;
		}
		return false;
	}

	@Override
	public QueryParamBuilder<?> newInstance(Map<String, Object> parameters) {
		return new CaseIdColumnBuilder(parameters);
	}

}
