/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.datacontrol.extender;

import java.util.ArrayList;
import java.util.Iterator;


import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.ins.InsModeDataControl;

public abstract class Handler<T,G> {

	private ArrayList<SearchCriteria> searchCr = new ArrayList<SearchCriteria>();
	private ArrayList<OrderCriteria> orderCr = new ArrayList<OrderCriteria>();
	
	public abstract Mode<?> getMode();
	
	@SuppressWarnings("unchecked")
	public T search(String name, Class<?> type, Object value){
		SearchCriteria sc = new SearchCriteria();
		sc.setName(name);
		sc.setClassName(type.getName());
		sc.setComparator(ComparatorType.EQ.name());
		sc.setValue(value.toString());
		searchCr.add(sc);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T searchString(String name,  String value){
		SearchCriteria sc = new SearchCriteria();
		sc.setName(name);
		sc.setClassName(String.class.getName());
		sc.setComparator(ComparatorType.EQ.name());
		sc.setValue(value.toString());
		searchCr.add(sc);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T searchInteger(String name,  Integer value){
		SearchCriteria sc = new SearchCriteria();
		sc.setName(name);
		sc.setClassName(Integer.class.getName());
		sc.setComparator(ComparatorType.EQ.name());
		sc.setValue(value.toString());
		searchCr.add(sc);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T searchLong(String name,  Long value){
		SearchCriteria sc = new SearchCriteria();
		sc.setName(name);
		sc.setClassName(Long.class.getName());
		sc.setComparator(ComparatorType.EQ.name());
		sc.setValue(value.toString());
		searchCr.add(sc);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T seek(){
		this.getObject();
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T search(String name, Class<?> type, Object value, ComparatorType comparator){
		
		SearchCriteria sc = new SearchCriteria();
		sc.setName(name);
		sc.setClassName(type.getName());
		sc.setComparator(comparator.name());
		sc.setValue(value.toString());
		searchCr.add(sc);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T cleanSearch(){
		searchCr = new ArrayList<SearchCriteria>();
		DataControl<G> dc =  (DataControl<G>) getMode().getControl();
		dc.setFilter(searchCr);
		dc.setRefresh(true);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public T cleanOrder(){
		orderCr = new ArrayList<OrderCriteria>();
		DataControl<G> dc =  (DataControl<G>) getMode().getControl();
		dc.setOrderby(orderCr);
		dc.setRefresh(true);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T orderBy(String name, OrderType order ){
		OrderCriteria or = new OrderCriteria();
		or.setName(name);
		or.setOrder(order.name());
		orderCr.add(or);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public G getObject(){
		DataControl<G> dc =  (DataControl<G>) getMode().getControl();
		dc.setFilter(searchCr);
		dc.setOrderby(orderCr);
		dc.setRefresh(true);
		return dc.getList().iterator().next();
	}

	@SuppressWarnings("unchecked")
	public Iterator<G> getList(){
		DataControl<G> dc =   (DataControl<G>) getMode().getControl();
		dc.setFilter(searchCr);
		dc.setOrderby(orderCr);
		dc.setRefresh(true);
		return dc.getList().iterator();
	}

	@SuppressWarnings("unchecked")
	public void delete(G object) throws Exception {
		DataControl<G> dc = (DataControl<G>) getMode().getControl();

		SearchCriteria search = new SearchCriteria();
		search.setClassName(Integer.class.getName());
		search.setComparator(ComparatorType.EQ.name());
		search.setValue( Reflection.call(object, "getObjId").toString());
		search.setName("objId");

		ArrayList<SearchCriteria> ls = new ArrayList<SearchCriteria>();
		ls.add(search);
		dc.setFilter(ls);
		G d = dc.getCurrentObject();
		if (d != null)
			dc.removeObject();
	}
	
	@SuppressWarnings("rawtypes")
	public void removeAll()throws Exception{
		DataControl<?> dc = (DataControl<?>) getMode().getControl();
		((InsModeDataControl)dc).removeAll();
	}
	
	@SuppressWarnings("unchecked")
	public G getCurrentRow(){
		return (G) getMode().getControl().getCurrentObject();
	}

}
