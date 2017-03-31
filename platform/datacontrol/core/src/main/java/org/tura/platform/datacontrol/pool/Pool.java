/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.pool;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.josql.Query;
import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.data.PoolData;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;

public abstract class Pool {

	protected abstract ShiftControl getShifter() throws TuraException;

	protected abstract boolean prepareQuery() throws TuraException;

	protected abstract PoolData getPoolData();

	protected abstract void registerForCleaning() throws TuraException;

	protected abstract SelectQuery getSelectQuery() throws TuraException;

	public void addCommand(PoolElement element) throws TuraException {
		element.setCreateDate(getPoolData().getNextId());
		getPoolData().getPoolElement().add(element);
	}

	protected void cleanPool(String id) throws QueryParseException,
			TuraException, QueryExecutionException {

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_BY_SHIFTER_ID);
		query.setVariable("shifterId", id);
		QueryResults result = query.execute(getPoolData().getPoolElement());

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			getPoolData().getPoolElement().remove(element);
		}

	}

	protected void beforeShifterGetCreatedObjects(Class<?> clazz,
			long beginTimeStamp, long endTimeStamp, int index)
			throws TuraException, InstantiationException {

		try {
			Collection<PoolElement> poolObjects = getNewObjects(clazz,
					beginTimeStamp, endTimeStamp);

			if (poolObjects.size() == 0 || !prepareQuery())
				return;

			List<?> objects = filterByDataControlCondition(poolObjects,getSelectQuery());

			Collections.reverse(objects);

			for (Object obj : objects) {
				getShifter().add(index, obj);
			}

			if (objects.size() > 0)
				this.registerForCleaning();

		} catch (Exception e) {
			throw new TuraException(e);
		}

	}

	private Collection<PoolElement> getNewObjects(Class<?> clazz,
			long beginTimeStamp, long endTimeStamp) throws QueryParseException,
			QueryExecutionException, TuraException {

		ArrayList<PoolElement> array = new ArrayList<>();

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_SORTED_DESC);
		query.setVariable("shifterId", getShifter().getId());
		query.setVariable("beginTimeStamp", beginTimeStamp);
		query.setVariable("endTimeStamp", endTimeStamp);
		QueryResults result = query.execute(getPoolData().getPoolElement());

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		HashMap<Object, PoolElement> hash = new HashMap<>();

		for (PoolElement element : array) {
			if (PoolCommand.C.name().equals(element.getOperation()))
				hash.put(element.getKey(), element);

			if (PoolCommand.R.name().equals(element.getOperation()))
				hash.remove(element.getKey());

			if (PoolCommand.U.name().equals(element.getOperation())
					&& hash.containsKey(element.getKey()))
				hash.put(element.getKey(), element);

		}
		return hash.values();

	}

	private List<?> filterByDataControlCondition(Collection<PoolElement> list,
			SelectQuery select) throws QueryException, QueryParseException,
			QueryExecutionException {

		ArrayList<Object> array = new ArrayList<>();

		for (PoolElement element : list)
			array.add(element.getObj());

		Query query = new Query();

		String strQuery = select.toSql(new JOSQLExpressionBuilder());
		query.parse(strQuery);

		for (String param : select.getParams().keySet())
			query.setVariable(param, select.getParams().get(param));

		QueryResults result = query.execute(array);

		return result.getResults();

	}

	protected boolean isRemoved(Class<?> clazz, long beginTimeStamp,
			long endTimeStamp, Object key, int index)
			throws QueryParseException, QueryExecutionException,
			InstantiationException, IllegalAccessException, TuraException {

		boolean isRemoved = false;

		ArrayList<PoolElement> array = new ArrayList<>();

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_SORTED_DESC_FOR_KEY);
		query.setVariable("key", key);
		query.setVariable("shifterId", getShifter().getId());
		query.setVariable("beginTimeStamp", 0);
		query.setVariable("endTimeStamp", endTimeStamp);

		QueryResults result = query.execute(getPoolData().getPoolElement());

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		if (array.size() == 0)
			return false;

		PoolElement lastElement = array.get(array.size() - 1);

		if ("R".equals(lastElement.getOperation())) {
			getShifter().remove(index);
			isRemoved = true;
			registerForCleaning();
		}

		return isRemoved;
	}

	protected Object checkForUpdate(Class<?> clazz, long beginTimeStamp,
			long endTimeStamp, Object obj, Object key, int index)
			throws QueryParseException, QueryExecutionException,
			InstantiationException, IllegalAccessException, TuraException,
			NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException {

		Object object = obj;

		ArrayList<PoolElement> array = new ArrayList<>();

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_SORTED_DESC_FOR_KEY);
		query.setVariable("shifterId", getShifter().getId());
		query.setVariable("key", key);
		query.setVariable("beginTimeStamp", 0);
		query.setVariable("endTimeStamp", endTimeStamp);

		QueryResults result = query.execute(getPoolData().getPoolElement());

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		if (array.size() == 0){
			return object;
		}

		PoolElement firstElement = array.get(0);

		if ("U".equals(firstElement.getOperation())) {
			Object objw = firstElement.getObj();
			getShifter().update(index, objw);
			object = objw;
			registerForCleaning();

		}
		return object;
	}

	public String getId() {
		return "SHARED_POOL_DATA";
	}

}
