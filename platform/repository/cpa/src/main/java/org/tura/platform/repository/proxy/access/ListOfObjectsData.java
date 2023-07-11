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

package org.tura.platform.repository.proxy.access;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.proxy.shift.ShiftControl;

public class ListOfObjectsData implements Serializable , Closeable{

	private static final long serialVersionUID = -4827513184380128058L;
	private ShiftControl shifter;
	private List<SearchCriteria> searchCriteria = new ArrayList<>();
	private List<OrderCriteria> orderCriteria = new ArrayList<>();;
	private Map<Integer, Object> loaded;
	private int loadStep = PlatformConfig.LOADSTEP;
	private Integer startIndex = 0;
	private Integer endIndex = -1;
	private long currentTimeStamp;
	

	public ListOfObjectsData() {

	}

	public ListOfObjectsData(ListOfObjectsData p) {
		this.shifter = p.shifter;
		this.loadStep = p.loadStep;
		this.startIndex = p.startIndex;
		this.endIndex = p.endIndex;
		this.currentTimeStamp = p.currentTimeStamp;
		this.orderCriteria = cloneOrderByCriteria(p.orderCriteria);
		this.searchCriteria = cloneSearchCriteria(p.searchCriteria);
		if (p.loaded != null) {
			this.loaded = new HashMap<>();
			this.loaded.putAll(p.loaded);
		}
	}

	public Map<Integer, Object> getLoaded() {
		return loaded;
	}

	public void setLoaded(Map<Integer, Object> loaded) {
		this.loaded = loaded;
	}

	public List<SearchCriteria> getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(List<SearchCriteria> searchCriteria) {
		if ( searchCriteria == null) {
			searchCriteria  = new ArrayList<>();
			return;
		}
		this.searchCriteria = searchCriteria;
	}

	public List<OrderCriteria> getOrderCriteria() {
		return orderCriteria;
	}

	public void setOrderCriteria(List<OrderCriteria> orderCriteria) {
		if ( orderCriteria == null) {
			orderCriteria =  new ArrayList<>();
			return;
		}
		this.orderCriteria = orderCriteria;
	}

	public static Object factory(Object obj) {
		if (obj == null)
			return new ListOfObjectsData();
		if (obj instanceof ListOfObjectsData)
			return new ListOfObjectsData((ListOfObjectsData) obj);
		return null;
	}

	private List<SearchCriteria> cloneSearchCriteria(List<SearchCriteria> searchCriteria) {
		List<SearchCriteria> newSearchList = new ArrayList<>();
		if (searchCriteria != null) {
			for (SearchCriteria search : searchCriteria) {
				SearchCriteria nSearch = new SearchCriteria();
				nSearch.setClassName(search.getClassName());
				nSearch.setComparator(search.getComparator());
				nSearch.setName(search.getName());
				nSearch.setParentClass(search.getParentClass());
				nSearch.setProperty(search.getProperty());
				nSearch.setValue(search.getValue());
				newSearchList.add(nSearch);
			}
		}
		return newSearchList;
	}

	private List<OrderCriteria> cloneOrderByCriteria(List<OrderCriteria> orderCriteria) {
		List<OrderCriteria> newOrderList = new ArrayList<>();
		if (searchCriteria != null) {
			for (OrderCriteria order : orderCriteria) {
				OrderCriteria nOrder = new OrderCriteria();
				nOrder.setName(order.getName());
				nOrder.setOrder(order.getOrder());
				nOrder.setParentClass(order.getParentClass());
				newOrderList.add(nOrder);
			}
		}
		return newOrderList;
	}

	public ShiftControl getShifter() {
		return shifter;
	}

	public void setShifter(ShiftControl shifter) {
		this.shifter = shifter;
	}

	public int getLoadStep() {
		return loadStep;
	}

	public void setLoadStep(int loadStep) {
		this.loadStep = loadStep;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	public long getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	public void setCurrentTimeStamp(long currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}

	@Override
	public void close() throws IOException {
	}
}