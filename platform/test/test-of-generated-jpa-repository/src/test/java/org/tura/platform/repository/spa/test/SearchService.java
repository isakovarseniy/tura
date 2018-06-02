/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.spa.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.pool.JOSQLExpressionBuilder;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.SearchProvider;

import com.octo.java.sql.query.SelectQuery;

public class SearchService extends SearchProvider {

	public static Map<String, Map<Object, Object>> base = new HashMap<String, Map<Object, Object>>();

	@Override
	protected SearchResult serviceCall(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, String objectClass) throws RepositoryException {

		try {
			Class<?> baseClass = Class.forName(objectClass);
			SelectQuery select = DefaulQueryFactory.builder(searchCriteria, orderCriteria, baseClass);
			Query query = new Query();

			String strQuery = select.toSql(new JOSQLExpressionBuilder());
			query.parse(strQuery);

			for (String param : select.getParams().keySet()) {
				query.setVariable(param, select.getParams().get(param));
			}

			Map<Object, Object> h = base.get(objectClass);
			if (h != null) {
				Collection<?> array = base.get(objectClass).values();

				QueryResults result = query.execute(array);

				return new SearchResult(result.getResults(), result.getResults().size());
			}else{
				return new SearchResult(new ArrayList<>(), 0);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	protected Object serviceCall(Object pk, String objectClass) {
		return base.get(objectClass).get(pk);
	}

}
