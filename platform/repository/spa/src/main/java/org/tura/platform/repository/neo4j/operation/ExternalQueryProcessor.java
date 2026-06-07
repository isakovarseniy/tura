/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.neo4j.operation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.neo4j.ogm.cypher.ComparisonOperator;
import org.neo4j.ogm.cypher.Filter;
import org.neo4j.ogm.cypher.Filters;
import org.neo4j.ogm.cypher.query.Pagination;
import org.neo4j.ogm.cypher.query.SortOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;

import com.octo.java.sql.exp.Operator;

public abstract class ExternalQueryProcessor<T> {

	private Neo4jSearchService searchService;

	public abstract SearchResult<T> process(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws Exception;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected List<?> findObjectsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Object... args) throws Exception {

		Class<?> clazz = (Class<?>) args[0];

		Filters filters = buildFilters(searchCriteria);
		SortOrder sortOrder = buildSort(orderCriteria);
		Pagination pager = new Pagination(10, endIndex - startIndex);
		pager.setOffset(startIndex);

		Collection<?> result = searchService.getSession().loadAll(clazz, filters, sortOrder, pager);
		List list = new ArrayList<>();
		list.addAll(result);
		return list;
	}

	protected long findNumberOfRowsQuery(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Object... args) throws Exception {

		Class<?> clazz = (Class<?>) args[0];

		Filters filters = buildFilters(searchCriteria);

		return searchService.getSession().count(clazz, filters);

	}

	@SuppressWarnings("unchecked")
	public T loadRelations(  T t ) {
		long id = searchService.getSession().resolveGraphIdFor(t);
		return (T) searchService.getSession().load (t.getClass(), id, 1);
	}
	
	
	public Neo4jSearchService getSearchService() {
		return searchService;
	}

	public void setSearchService(Neo4jSearchService searchService) {
		this.searchService = searchService;
	}

	private Filters buildFilters(List<SearchCriteria> searchCriteria) {
		Filters filters = new Filters();
		for (SearchCriteria sc : searchCriteria) {

			ComparisonOperator cmp = null;

			if (sc.getValue() == null && Operator.valueOf(sc.getComparator()).equals(Operator.EQ)) {
				cmp = ComparisonOperator.IS_NULL;
			} else {
				cmp = ComparatorConversion.valueOf(sc.getComparator()).getValue();
			}

			Filter filter = new Filter(sc.getName(), cmp, sc.getValue());
			if (!filters.iterator().hasNext()) {
				filters.add(filter);
			} else {
				filters.and(filter);
			}
		}
		return filters;
	}

	private SortOrder buildSort(List<OrderCriteria> orderCriteria) {
		SortOrder order = new SortOrder();
		for (OrderCriteria or : orderCriteria) {
			order.add(SortOrder.Direction.valueOf(or.getOrder()), or.getName());
		}
		return order;
	}

	public enum ComparatorConversion {
		LIKE(ComparisonOperator.LIKE), EQ(ComparisonOperator.EQUALS), GT(ComparisonOperator.GREATER_THAN),
		GEQ(ComparisonOperator.GREATER_THAN_EQUAL), LT(ComparisonOperator.LESS_THAN),
		LEQ(ComparisonOperator.LESS_THAN_EQUAL), IN(ComparisonOperator.IN);

		private final ComparisonOperator value;

		ComparatorConversion(ComparisonOperator value) {
			this.value = value;
		}

		public ComparisonOperator getValue() {
			return value;
		}
	}

}
