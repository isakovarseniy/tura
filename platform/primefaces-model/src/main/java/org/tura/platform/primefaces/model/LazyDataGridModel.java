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
	private DataControl<?> datacontrol;
	private java.util.logging.Logger logger;
	@SuppressWarnings("rawtypes")
	private List datasource;

	
	public int getRowCount() {
		return datacontrol.getScroller().size();
	}
	
	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}

	public void setDatacontrol(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}
	
	public java.util.logging.Logger getLogger() {
		return logger;
	}

	public void setLogger(java.util.logging.Logger logger) {
		this.logger = logger;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {

		SortMeta sortMeta = new SortMeta();
		sortMeta.setSortField(sortField);
		sortMeta.setSortOrder(sortOrder);
		ArrayList<SortMeta> multiSortMeta = new ArrayList<>();

		return load(first, pageSize, multiSortMeta, filters);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List load(int first, int pageSize, List<SortMeta> multiSortMeta,
			Map<String, Object> filters) {
		ArrayList datasource = new ArrayList();
		try {
			SelectQuery query = datacontrol.getQuery();
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

			for (SortMeta sortField : multiSortMeta) {
				query.orderBy(sortField.getSortField());

				if (sortField.getSortOrder().equals(SortOrder.ASCENDING))
					query.asc();
				else
					query.desc();
			}
			List<?> scroler = datacontrol.getScroller();
			int j = first + pageSize;

			for (int i = first, k = 0; i < j; i++, k++)
				datasource.add( new Object[]{i,k,scroler.get(i)});

		} catch (Exception e) {
			logger.fine(e.getMessage());
		}
		return datasource;
	}

	@SuppressWarnings("unchecked")
	public T getRowData(String rowKey) {
		return (T) ((Object[])(datasource.get(new Integer(rowKey))))[2];
	}

	public Object getRowKey(T object) {
		Object[] array = (Object[]) object;
		return array[1];
		
	}
}
