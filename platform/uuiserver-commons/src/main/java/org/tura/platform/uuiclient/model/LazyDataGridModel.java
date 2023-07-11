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

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery.Order;

public class LazyDataGridModel<T> implements Serializable {

	private static final long serialVersionUID = -3916551980941958271L;

	@SuppressWarnings("rawtypes")
	private DataControl datacontrol;
	private transient Logger logger = Logger.getLogger(LazyDataGridModel.class.getName());
	private GridModel model;
	private Map<String, SortMeta> sortMeta = new HashMap<>();
	private long totalRows;


	public LazyDataGridModel() {
	}

	
	public LazyDataGridModel(GridModel gridSingleSelectModel) {
		this.model = gridSingleSelectModel;
	}

	public int getRowCount() {
		try {
			return datacontrol.getScroller().size();
		} catch (TuraException e) {
			throw new  RuntimeException(e);
		}
	}

	@SuppressWarnings("rawtypes")
	public DataControl getDatacontrol() {
		return datacontrol;
	}

	@SuppressWarnings("rawtypes")
	public void setDatacontrol(DataControl datacontrol) {
		this.datacontrol = datacontrol;
	}

	private boolean initSortMeta(List<SortMeta> sort) {
		if (sort.size() == sortMeta.keySet().size()) {
			if (compareMeta(sort)) {
				return false;
			} else {
				saveMeta(sort);
				return true;
			}

		} else {
			saveMeta(sort);
			return true;
		}
	}

	private void saveMeta(List<SortMeta> sort) {
		sortMeta = new HashMap<>();
		for (SortMeta meta : sort) {
			sortMeta.put(meta.getSortField(), meta);
		}
	}

	private boolean compareMeta(List<SortMeta> sort) {
		sortMeta = new HashMap<>();
		for (SortMeta meta : sort) {
			SortMeta saved = sortMeta.get(meta.getSortField());
			if (saved == null) {
				return false;
			} else {
				if (!saved.equals(meta)) {
					return false;
				}
			}
		}
		return true;
	}

	private List<SortMeta> filterSortMeta(List<SortMeta> sort) {
		List<SortMeta> filtered = new ArrayList<>();
		for (SortMeta meta : sort) {
			if (meta.getSortField() != null) {
				filtered.add(meta);
			}
		}
		return filtered;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String, Object> filters) {

		List<SortMeta> filteredMultiSortMeta = filterSortMeta(multiSortMeta);

		ArrayList datasource = new ArrayList();
		GridPreQueryTrigger trigger = new GridPreQueryTrigger(filteredMultiSortMeta, filters,
				datacontrol.getPreQueryTrigger());
		try {
			datacontrol.setPreQueryTrigger(trigger);
			if (initSortMeta(filteredMultiSortMeta)) {
				datacontrol.forceRefresh();
			}

			List<?> scroler = datacontrol.getScroller();
			int j = first + pageSize;
			int size = scroler.size();

			for (int i = first; i < j; i++) {
				try {
					if ( i <  size && scroler.get(i) != null) {
						// Element could be null in case random delete
						// Size of scroller will be adjusted only after
						// scroler.get(i) operation
						ObjectControl oc = (ObjectControl) scroler.get(i);
						oc.setViewModelId1(i);
						datasource.add(oc);
					}else {
						break;
					}
				}catch(IndexOutOfBoundsException e){
					break;
				}
			}
			
			this.totalRows = scroler.size();

			if (GridType.SingleSelect.equals(model.getGridType()) && first == 0 && model.getSelected() == null
					&& datasource.size() != 0) {
				model.setSelected(datasource.get(0));
			}
			if (GridType.MultiSelect.equals(model.getGridType()) && datasource.size() != 0) {
				GridModelTriggers callback = model.getCallback();
				if (callback != null) {
					List<Object> selected = callback.initSelected(datasource);
					model.setSelected(selected);
				}
			}

		} catch (Exception e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		} finally {
			datacontrol.setPreQueryTrigger(trigger.getTrigger());
		}

		return datasource;
	}

	public long getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}


	class GridPreQueryTrigger implements PreQueryTrigger {
		private static final long serialVersionUID = 6607030259056746718L;
		private List<SortMeta> multiSortMeta;
		private Map<String, Object> filters;
		private PreQueryTrigger trigger;

		public GridPreQueryTrigger(List<SortMeta> multiSortMeta, Map<String, Object> filters, PreQueryTrigger trigger) {
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

				if (multiSortMeta.size() != 0) {
					List<OrderCriteria> ord = datacontrol.getOrderCriteria();
					ord.clear();

					for (SortMeta sortField : multiSortMeta) {
						OrderCriteria criteria = new OrderCriteria();
						criteria.setName(sortField.getSortField());
						if (sortField.getSortOrder().equals(SortOrder.ASCENDING))
							criteria.setOrder(Order.ASC.name());
						else
							criteria.setOrder(Order.DESC.name());

						ord.add(criteria);
					}
				}

				if (trigger != null)
					trigger.execute(datacontrol);

			} catch (Exception e) {
				throw new TuraException(e);
			}

		}

	}
	
}