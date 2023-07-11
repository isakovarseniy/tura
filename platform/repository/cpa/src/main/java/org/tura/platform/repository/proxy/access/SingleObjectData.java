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
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;

public class SingleObjectData implements Serializable,  Closeable{

	private static final long serialVersionUID = 4977232158182050480L;
	
	private Object object;
	private List<SearchCriteria> searchCriteria = new ArrayList<>();
	private List<OrderCriteria> orderCriteria = new ArrayList<>();
	private long currentTimeStamp;
	
	
	public SingleObjectData() {
		
	}
	

	public SingleObjectData(SingleObjectData s) {
		this.object = s.object;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}


	public List<SearchCriteria> getSearchCriteria() {
		return searchCriteria;
	}


	public void setSearchCriteria(List<SearchCriteria> searchCriteria) {
		this.searchCriteria = searchCriteria;
	}


	public List<OrderCriteria> getOrderCriteria() {
		return orderCriteria;
	}


	public void setOrderCriteria(List<OrderCriteria> orderCriteria) {
		this.orderCriteria = orderCriteria;
	}


	public long getCurrentTimeStamp() {
		return currentTimeStamp;
	}


	public void setCurrentTimeStamp(long currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}


	@Override
	public void close() throws IOException {
		throw  new UnsupportedOperationException();
	}
	
}
