/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.primefaces.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery.Order;

public class LazyDataGridModel<T> extends LazyDataModel<T> {

	private static final long serialVersionUID = -3916551980941958271L;
	@SuppressWarnings("rawtypes")
	private DataControl datacontrol;
	private java.util.logging.Logger logger;

	public int getRowCount() {
		return datacontrol.getScroller().size();
	}

	@SuppressWarnings("rawtypes")
	public DataControl getDatacontrol() {
		return datacontrol;
	}

	@SuppressWarnings("rawtypes")
	public void setDatacontrol(DataControl datacontrol) {
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
		GridPreQueryTrigger trigger = new GridPreQueryTrigger(multiSortMeta, filters, datacontrol.getPreQueryTrigger());
		try {
			datacontrol.setPreQueryTrigger(trigger);
			datacontrol.getCurrentObject();
			List<?> scroler = datacontrol.getScroller();
			int j = first + pageSize;
			if ( j >= scroler.size())
				j = scroler.size();

			for (int i = first, k = 0; i < j; i++, k++) {
				if (scroler.get(i) != null) {
					//Element could be null in case random delete
					// Size of scroller will be adjusted only after 
					//scroler.get(i) operation
				    datasource.add(new Object[] { i, k, scroler.get(i) });
				}
			}

		} catch (Exception e) {
			logger.log (  Level.SEVERE,   ExceptionUtils.getFullStackTrace( e));
		}finally{
			datacontrol.setPreQueryTrigger(trigger.getTrigger());
		}
		
		return datasource;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public T getRowData(String rowKey) {
		return (T) ((Object[]) (((List)this.getWrappedData()).get(new Integer(rowKey))))[2];
	}

	public Object getRowKey(T object) {
		Object[] array = (Object[]) object;
		return array[1];

	}

	class GridPreQueryTrigger implements PreQueryTrigger {
		private List<SortMeta> multiSortMeta;
		private Map<String, Object> filters;
		private PreQueryTrigger trigger;

		public GridPreQueryTrigger(List<SortMeta> multiSortMeta,
				Map<String, Object> filters, PreQueryTrigger trigger) {
			this.filters = filters;
			this.multiSortMeta = multiSortMeta;
			this.trigger = trigger;
		}

		public PreQueryTrigger getTrigger() {
			return trigger;
		}		
		
		@Override
		public void execute(DataControl<?> datacontrol) throws TuraException {

			try {

				List<SearchCriteria> ls = datacontrol.getSearchCriteria();

				for (String key : filters.keySet()) {
					SearchCriteria criteria = new SearchCriteria();
					Object value = filters.get(key);
					criteria.setValue(value);
					criteria.setComparator(Operator.EQ.name());
					criteria.setName(key);
					ls.add(criteria);
				}

				List<OrderCriteria> ord = datacontrol.getOrderCriteria();

				for (SortMeta sortField : multiSortMeta) {
					OrderCriteria criteria = new OrderCriteria();
					criteria.setName(sortField.getSortField());
					if (sortField.getSortOrder().equals(SortOrder.ASCENDING))
						criteria.setOrder(Order.ASC.name()); 
					else
						criteria.setOrder(Order.DESC.name()); 
					
					ord.add(criteria);
				}
				
				if (trigger != null)
					trigger.execute(datacontrol);
			
				
			} catch (Exception e) {
				throw new TuraException(e);
			}

		}

	}

}
