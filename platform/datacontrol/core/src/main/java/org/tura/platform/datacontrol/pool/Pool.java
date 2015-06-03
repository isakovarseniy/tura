package org.tura.platform.datacontrol.pool;

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
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;

public abstract class Pool {
	
	private static long id = 0;

	private static ArrayList<PoolElement> poolElement = new ArrayList<>();

	protected abstract ShiftControl getShifter() throws TuraException;

	protected abstract boolean prepareQuery() throws TuraException;

	protected abstract SelectQuery getSelectQuery();

	public void addCommandt(PoolElement element) throws TuraException {
		getShifter();
		//element cannot be yonge then shifter
		element.setCreateDate( getNextId());
		poolElement.add(element);
	}

	protected void cleanPool(String id) throws QueryParseException, TuraException,
			QueryExecutionException {

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_BY_SHIFTER_ID);
		query.setVariable("shifterId", id);
		QueryResults result = query.execute(poolElement);

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			poolElement.remove(element);
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

			List<?> objects = filterByDataControlCondition(poolObjects,
					getSelectQuery());

			Collections.reverse(objects);

			for (Object obj : objects)
				getShifter().add(index, obj);
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
		QueryResults result = query.execute(poolElement);

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		HashMap<Object, PoolElement> hash = new HashMap<>();

		for (PoolElement element : array) {
			if (PoolCommand.C.name().equals(element.getOperation()))
				hash.put(element.getKey(), element);

			if (PoolCommand.R.name().equals(element.getOperation()) )
				hash.remove(element.getKey());

			if (PoolCommand.U.name().equals(element.getOperation()))
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
		
		String strQuery = select.toSql( new JOSQLExpressionBuilder());
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
		query.setVariable("beginTimeStamp", beginTimeStamp);
		query.setVariable("endTimeStamp", endTimeStamp);

		QueryResults result = query.execute(poolElement);

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		if (array.size() == 0)
			return false;

		PoolElement lastElement = array.get(array.size()-1);

		if ("R".equals(lastElement.getOperation())) {
			getShifter().remove(index);
			isRemoved = true;
		}

		return isRemoved;
	}

	protected Object checkForUpdate(Class<?> clazz, long beginTimeStamp,
			long endTimeStamp, Object obj, Object key, int index)
			throws QueryParseException, QueryExecutionException,
			InstantiationException, IllegalAccessException, TuraException {

		Object object = obj;

		ArrayList<PoolElement> array = new ArrayList<>();

		Query query = new Query();
		query.parse(PoolConstants.SELECT_OBJECTS_SORTED_DESC_FOR_KEY);
		query.setVariable("shifterId", getShifter().getId());
		query.setVariable("key", key);
		query.setVariable("beginTimeStamp", beginTimeStamp);
		query.setVariable("endTimeStamp", endTimeStamp);

		QueryResults result = query.execute(poolElement);

		for (Object el : result.getResults()) {
			PoolElement element = (PoolElement) el;
			if (clazz.isAssignableFrom(element.getClazz()))
				array.add(element);
		}

		if (array.size() == 0)
			return object;
		
		PoolElement lastElement = array.get(array.size()-1);

		if ("U".equals(lastElement.getOperation())) {
			getShifter().update(index, lastElement.getObj());
			object = lastElement.getObj();
		}
		return object;
	}

	public static synchronized long getNextId(){
	   return ++id;	
	}
	
}
