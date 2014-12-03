package org.tura.platform.primefaces.model;

import static com.octo.java.sql.query.Query.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.ConditionConverter;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

public class LazyDataGridModel<T> extends LazyDataModel<T> {

	private static final long serialVersionUID = -3916551980941958271L;
	private DataControl<?> dc;
	private java.util.logging.Logger logger;

	public List<T> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {
		ArrayList<T> ls = new ArrayList<T>();
		try {
			SelectQuery query = dc.getQuery();
			query.whereReset();
			query.orderByReset();

			String condition = "WHERE";
			for (String key : filters.keySet()) {
				Object value = filters.get(key);
				ConditionConverter.valueOf(condition).getRestriction(query,
						c(key));
				query.op(Operator.EQ, value);
				condition = "AND";
			}

			query.orderBy(sortField);

			if (sortOrder.equals(SortOrder.ASCENDING))
				query.asc();
			else
				query.desc();
			
		} catch (Exception e) {
			logger.fine(e.getMessage());
		}
		return ls;
	}

	public List<T> load(int first, int pageSize, List<SortMeta> multiSortMeta,
			Map<String, Object> filters) {
		throw new UnsupportedOperationException(
				"Lazy loading is not implemented.");
	}

	public T getRowData(String rowKey) {
		throw new UnsupportedOperationException(
				"getRowData(String rowKey) must be implemented when basic rowKey algorithm is not used.");
	}

	public Object getRowKey(T object) {
		throw new UnsupportedOperationException(
				"getRowKey(T object) must be implemented when basic rowKey algorithm is not used.");
	}
}
