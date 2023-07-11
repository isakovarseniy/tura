/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.operation;

import static com.octo.java.sql.query.Query.c;

import java.util.List;

import javax.persistence.Query;

import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;

import com.octo.java.sql.query.SelectQuery;

public abstract class ExternalQueryProcessor<T> {
	
	private JpaSearchService searchService;
	
	public abstract SearchResult<T> process(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws Exception;	
	
	protected List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Object... args) throws Exception {

		Class<?> clazz = (Class<?>) args[0];

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, clazz);
		Query query = searchService.getEm().createQuery(dslQuery.toSql(), clazz);
		query.setFirstResult(startIndex);
		if (endIndex > 0) {
			query.setMaxResults(endIndex - startIndex);
		}
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}

		return query.getResultList();
	}	
	
	

	protected long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Object... args) throws Exception {

		Class<?> clazz = (Class<?>) args[0];

		SelectQuery dslQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, clazz);
		dslQuery.getColumns()[0] = c("count(*)");
		dslQuery.getOrderBy().clear();

		Query query = searchService.getEm().createQuery(dslQuery.toSql());
		for (String param : dslQuery.getParams().keySet()) {
			query.setParameter(param, dslQuery.getParams().get(param));
		}
		return (long) query.getSingleResult();
	}

	public JpaSearchService getSearchService() {
		return searchService;
	}

	public void setSearchService(JpaSearchService searchService) {
		this.searchService = searchService;
	}	
	
	
}
