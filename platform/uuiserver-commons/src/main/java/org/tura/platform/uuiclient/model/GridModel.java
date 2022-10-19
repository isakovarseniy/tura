/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GridModel implements AbstractGridModel, Serializable {
	private static final long serialVersionUID = -1772274126836681014L;

	private LazyDataGridModel<?> lazyModel;
	@SuppressWarnings("rawtypes")
	private DataControl dc;
	private Object selected;
	private GridModelTriggers callback;

	private int first;
	private int pageSize;
	private List<SortMeta> multiSortMeta = new ArrayList<SortMeta>();
	private Map<String, Object> filters = new HashMap<String, Object>();
	private GridType gridType = null;
	private String modelId;

	private transient Logger logger = Logger.getLogger(GridModel.class.getName());

	public GridModel() {

	}

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl dc, Object callback, GridType gridType, String modelId) {
		this.setModelId(modelId);
		this.dc = dc;
		this.callback = (GridModelTriggers) callback;
		this.gridType = gridType;

		lazyModel = new LazyDataGridModel(this);
		lazyModel.setDatacontrol(dc);

		if (gridType.equals(GridType.SingleSelect)) {
			dc.addEventLiteners(new RecordListener());
		}
		if (gridType.equals(GridType.MultiSelect)) {
			dc.addEventLiteners(new MultiRecordListener());
		}
	}

	public GridType getGridType() {
		return gridType;
	}

	public GridModelTriggers getCallback() {
		return callback;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<SortMeta> getMultiSortMeta() {
		return multiSortMeta;
	}

	public void setMultiSortMeta(List<SortMeta> multiSortMeta) {
		this.multiSortMeta = multiSortMeta;
	}

	public Map<String, Object> getFilters() {
		return filters;
	}

	public void setFilters(Map<String, Object> filters) {
		this.filters = filters;
	}

	public Long getTotalRows() {
		return this.lazyModel.getTotalRows();
	}

	public Object getSelected() {
		return selected;
	}

	public void setSelected(Object selected) {
		this.selected = selected;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void decodeAndSetSelected(Object obj) {
		if (obj == null) {
			setSelected(null);
			return;
		}
		if (gridType.equals(GridType.SingleSelect)) {
			setSelected(decodeSingleSelection((Map) obj));
		}
		if (gridType.equals(GridType.MultiSelect)) {
			setSelected(decodeMultiSelection((List) obj));
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void onRowSelectionChange(EventDescription event) {
		EventParameter param = event.findParameter("selected");
		Object obj = param.getValue();
		ObjectControl oc = null;
		if (gridType.equals(GridType.SingleSelect)) {

			try {
				setSelected(decodeSingleSelection((Map) obj));
				if (getSelected() == null) {
					return;
				}
				oc = (ObjectControl) getSelected();
				if (!dc.getCurrentPosition().equals(oc.getViewModelId1())) {
					dc.setCurrentPosition(oc.getViewModelId1());
				}
				if (callback != null) {
					callback.onSelect(oc);
				}

			} catch (TuraException e) {
				logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
			}
		}
		if (gridType.equals(GridType.MultiSelect)) {
			setSelected(decodeMultiSelection((List) obj));
			if (callback != null) {
				callback.onSelect(this.getSelected());
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ajaxSelected(EventDescription event) {
		EventParameter param = event.findParameter("selected");
		Object obj = param.getValue();
		setSelected(decodeSingleSelection((Map) obj));
		if (this.getSelected() == null) {
			return;
		}
		ObjectControl oc = (ObjectControl) getSelected();
		if (callback != null) {
			callback.onSelect(oc);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void ajaxUnSelected(EventDescription event) {
		EventParameter param = event.findParameter("selected");
		Object obj = param.getValue();
		setSelected(decodeSingleSelection((Map) obj));
		if (getSelected() == null) {
			return;
		}
		ObjectControl oc = (ObjectControl) getSelected();
		if (callback != null) {
			callback.onUnselect(oc);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void ajaxToggleSelect(EventDescription event) {
		EventParameter param = event.findParameter("selected");
		Object obj = param.getValue();
		setSelected(decodeMultiSelection((List) obj));

		param = event.findParameter("toggeled");
		obj = param.getValue();

		boolean toggeled = (boolean) obj;
		if (callback != null) {
			callback.toggleSelect(toggeled);
		}
	}

	public void ajaxOnEditAccept(EventDescription event) {
	}

	public void onPage(EventDescription event) {
		this.setFirst((int) event.findParameter("startIndex").getValue());
		this.setPageSize((int) event.findParameter("pageSize").getValue());

	}

	@SuppressWarnings("unchecked")
	public void onSort(EventDescription event) {
		Map<String, Object> map = (Map<String, Object>) event.findParameter("sortMeta").getValue();
		SortMeta sortMeta = new SortMeta();
		sortMeta.setSortField((String) map.get("sortField"));

		if ((int) map.get("sortOrder") == 1) {
			sortMeta.setSortOrder(SortOrder.DESCENDING);
		} else {
			sortMeta.setSortOrder(SortOrder.ASCENDING);
		}
		ArrayList<SortMeta> order = new ArrayList<SortMeta>();
		order.add(sortMeta);
		this.multiSortMeta = order;
		this.first = 0;
		this.load();

	}

	@SuppressWarnings("unchecked")
	public List<Object> load() {
		while (true) {
			List<Object> list = this.lazyModel.load(first, pageSize, multiSortMeta, filters);
			if (list.size() == 0 && this.first != 0) {
				this.first = this.first - pageSize;
				if (this.first < 0) {
					this.first = 0;
				}
			} else {
				return list;
			}

		}
	}

	public RepoKeyPath findPath(Map<String, Object> map) throws Exception{
		ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
		String json = (String) map.get("path");
		return mapper.readValue(json, new TypeReference<RepoKeyPath>() {});
	}

	public Object decodeSingleSelection(Map<String, Object> obj) {
		if (obj == null) {
			return null;
		}
		try {
			RepoKeyPath key = findPath(obj);
			Integer index = (Integer) obj.get("index");

			ObjectControl oc = (ObjectControl) dc.findObject(key);
			if (oc != null) {
				oc.setViewModelId1(index);
			}
			return oc;

		} catch (Exception e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
			return null;
		}
	}

	private List<Object> decodeMultiSelection(List<Map<String, Object>> array) {
		List<Object> result = new ArrayList<Object>();
		if (array == null) {
			return null;
		}
		for (Map<String, Object> hash : array) {
			result.add(decodeSingleSelection(hash));
		}
		return result;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	class RecordListener implements EventListener, Serializable {

		private static final long serialVersionUID = 4571934197826209703L;

		@SuppressWarnings("rawtypes")
		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof ControlRallbackEvent || event instanceof ControlRefreshedEvent) {

				DataControl dc = (DataControl) event.getSource();
				ObjectControl obj = (ObjectControl) getSelected();
				int index = 0;
				if (obj != null && obj.getViewModelId1() != null) {
					index = (int) obj.getViewModelId1();
					int max = ((DataControl) event.getSource()).getScroller().size();
					if (index == max) {
						index = max - 1;
					}
				}
				if (((DataControl) event.getSource()).getScroller().size() != 0) {
					dc.setCurrentPosition(index);
					setSelected(event.getSource().getCurrentObject());
					if (getSelected() != null) {
						obj = (ObjectControl) getSelected();
						obj.setViewModelId1(index);
					}
				}else {
					setSelected(null);
				}
			}

			if (event instanceof MasterRowChangedEvent) {
				ObjectControl obj = (ObjectControl) event.getSource().getCurrentObject();
				if (obj != null) {
					int index = (int) event.getSource().getCurrentPosition();
					obj.setViewModelId1(index);
				}
				setSelected(obj);
			}
			if (event instanceof RowChangedEvent) {
				ObjectControl obj = (ObjectControl) event.getSource().getCurrentObject();
				if (obj != null) {
					int index = (int) event.getSource().getCurrentPosition();
					obj.setViewModelId1(index);
				}
				setSelected(obj);
			}
			
			if (event instanceof RowCreatedEvent) {
				ObjectControl obj = (ObjectControl) event.getSource().getCurrentObject();
				if (obj != null) {
					int index = (int) event.getSource().getCurrentPosition();
					obj.setViewModelId1(index);
				}
				setSelected(obj);
			}
			if (event instanceof RowRemovedEvent) {
				ObjectControl obj = (ObjectControl) event.getSource().getCurrentObject();
				if (obj != null) {
					int index = (int) event.getSource().getCurrentPosition();
					obj.setViewModelId1(index);
				}
				setSelected(obj);
			}
		}
	}

	class MultiRecordListener implements EventListener, Serializable {

		private static final long serialVersionUID = 4571934197826209703L;

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof ControlRallbackEvent || event instanceof ControlRefreshedEvent) {
			}
			if (event instanceof MasterRowChangedEvent) {
			}
			if (event instanceof RowCreatedEvent) {
			}
			if (event instanceof RowRemovedEvent) {
			}
		}
	}

}