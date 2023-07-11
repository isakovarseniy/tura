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

package org.tura.platform.adapter.engine.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.JOSQLExpressionBuilder;

import com.octo.java.sql.query.SelectQuery;

public abstract class Cursor<T> implements ChangeCurrentRowListener {

	protected int currentPosition = 0;

	private List<ChangeCurrentRowListener> changeCurrentRowListeners = new ArrayList<>();
	
	private boolean enableToLoad =  true;

	public abstract List<T> getCursor();

	public abstract void add(T t) throws Exception;

	protected abstract Class<T> getType();
	
	protected CursorFilter<T> cursorFilter;

	
	public List<T> getFilteredResult(){
		if (cursorFilter != null) {
			return cursorFilter.filter(getCursor(), this);
		}else {
			return getCursor();
		}
	}
	
	public void notifyChangeCurrentRow() throws Exception {
		currentPosition = 0;
		sendNotificationChangeCurrentRow();
	}
	

	public CursorFilter<T> getCursorFilter() {
		return cursorFilter;
	}

	public void setCursorFilter(CursorFilter<T> cursorFilter) {
		this.cursorFilter = cursorFilter;
	}

	public void addChangeCurrentRowListener(ChangeCurrentRowListener listener) {
		changeCurrentRowListeners.add(listener);
	}

	public void sendNotificationChangeCurrentRow() throws Exception{
		for (ChangeCurrentRowListener listener : changeCurrentRowListeners) {
			listener.notifyChangeCurrentRow();
		}
	}

	public boolean hasNext() {
		if (currentPosition + 1 == getCursor().size()) {
			return false;
		}
		return true;
	}

	public T getCurrentObject() {
		return getCursor().get(currentPosition);
	}

	
	public  List<T> add( Collection<T> ls, int index, T t){
		Stack<T> stack  = new Stack<>();
		stack.addAll(ls);
		stack.add(index,t);
		return stack;
	}
	
	public boolean hasPrev() {
		if (currentPosition == 0) {
			return false;
		}
		return true;
	}

	public T next() throws Exception {
		if (hasNext()) {
			currentPosition++;
			sendNotificationChangeCurrentRow();
			return getCursor().get(currentPosition);
		}
		throw new IndexOutOfBoundsException();
	}

	public T prev() throws Exception {
		if (hasPrev()) {
			currentPosition--;
			sendNotificationChangeCurrentRow();
			return getCursor().get(currentPosition);
		}
		throw new IndexOutOfBoundsException();
	}

	public List<T> findBy(List<SearchCriteria> search) throws Exception {
		return findBy(search,getCursor(),getType());
	}

	@SuppressWarnings("unchecked")
	public List<T> findBy(List<SearchCriteria> search, List<?> table, Class<?> clazz ) throws Exception {
		SelectQuery select = DefaulQueryFactory.builder(search, new ArrayList<OrderCriteria>(), clazz);
		String strQuery = select.toSql(new JOSQLExpressionBuilder());
		Map<String, Object> p = select.getParams();
		Query query = new Query();
		query.parse(strQuery);
		for (String var : p.keySet()) {
			if ("null".equals(p.get(var))) {
				query.setVariable(var, null);
				continue;
			}
			query.setVariable(var, p.get(var));
		}
		ArrayList<Object> lst = new ArrayList<Object>();
		lst.addAll(table);
		QueryResults result = query.execute(lst);
		return result.getResults();
	}	
	
	
	public void reset() throws Exception {
		notifyChangeCurrentRow();
	}

	public boolean setPosition(T t) throws Exception {
		int i = this.getCursor().indexOf(t);
		if (i == -1) {
			return false;
		}
		this.currentPosition = i;
		sendNotificationChangeCurrentRow();
		return true;
	}

	public boolean setPosition(int i) throws Exception {
		if ( i >=0 && i < this.getCursor().size()) {
			this.currentPosition = i;
			sendNotificationChangeCurrentRow();
			return true;
		}
		return false;
	}
	
	public boolean isEnableToLoad() {
		return enableToLoad;
	}

	public void setEnableToLoad(boolean enableToLoad) {
		this.enableToLoad = enableToLoad;
	}	
	
}
