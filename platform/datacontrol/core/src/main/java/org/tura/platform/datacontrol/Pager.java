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
package org.tura.platform.datacontrol;

import static com.octo.java.sql.query.Query.c;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;

import org.tura.platform.datacontrol.commons.ConditionConverter;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;
import com.rits.cloning.Cloner;

public class Pager<T> {

	private int startIndex;
	private int endIndex;
	private int loadStep;
	private LazyList<T> entities = new LazyList<>();
	private DataControl<T> datacontrol;
	private boolean direction;
	private HashMap<String, ShiftControl> shifterHash = new HashMap<>();
	private ShiftControl shifter;

	public Pager(DataControl<T> datacontrol) {
		this.datacontrol = datacontrol;
		loadStep = PlatformConfig.LOADSTEP;
	}

	public void cleanShifter() {
		shifterHash = new HashMap<>();
		shifter = null;
	}

	public void cleanPager() throws TuraException {
		entities = new LazyList<>();
		startIndex = 0;
		createShifter();
	}

	public int listSize() {
		return entities.size();
	}

	public long actualListSize() {
		return shifter.getActualRowNumber();
	}

	private boolean prepareQuery() throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, QueryException, TuraException {

		Cloner cloner = new Cloner();
		datacontrol.setQuery(cloner.deepClone(datacontrol.getDefaultQuery()));

		Collection<SearchCriteria> sc = null;

		SelectQuery query = datacontrol.getQuery();
		if (datacontrol.getParent() != null) {
			sc = datacontrol.getParent().getChildSearchCriteria();
			String condition = "AND";
			if (!sc.isEmpty() && query.getWhereClause() == null)
				condition = "WHERE";

			for (SearchCriteria criteria : sc) {

				if (!criteria.getValue().equals(Constants.UNDEFINED_PARAMETER)) {
					ConditionConverter.valueOf(condition).getRestriction(query,
							c(criteria.getName()));
					query.op(Operator.valueOf(criteria.getComparator()),
							criteria.getValue());

				} else {
					return false;
				}
				condition = "AND";
			}

		}
		query.toSql(new ExpressionResolver(datacontrol.getElResolver()));
		// restore dafaut querybuilder
		query.toSql(query.getQueryBuilder());

		return true;
	}

	public DataControl<T> getDataControl() {
		return datacontrol;
	}

	public T createObject(int index) throws TuraException {
		return createObject(index, true);
	}

	@SuppressWarnings("unchecked")
	public T createObject(int index, boolean managable) throws TuraException {

		try {
			datacontrol.getCommandStack().beginTransaction();

			Object obj = datacontrol.getCreateCommand().execute();

			return (T) obj;

		} catch (Exception e) {
			throw new TuraException(e);
		} finally {
			datacontrol.getCommandStack().commitTransaction();
		}
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) throws TuraException {

		try {
			Object obj = null;
			try {
				obj = getShifter().getObject(index);
			} catch (Exception e) {
				throw new TuraException(e);
			}

			if (obj == int.class)
				index = (int) obj;
			if (obj instanceof Integer)
				index = (int) obj;

			if (obj == int.class || obj instanceof Integer) {
				try {
					return getEntity(index);
				} catch (NoSuchMethodException e) {
					throw new TuraException(e);
				} catch (SecurityException e) {
					throw new TuraException(e);
				} catch (InstantiationException e) {
					throw new TuraException(e);
				} catch (IllegalAccessException e) {
					throw new TuraException(e);
				} catch (IllegalArgumentException e) {
					throw new TuraException(e);
				} catch (InvocationTargetException e) {
					throw new TuraException(e);
				}
			}

			return (T) obj;

		} catch (IndexOutOfBoundsException e) {
			@SuppressWarnings("rawtypes")
			Stack st = new Stack();
			try {
				st.push(startIndex);
				st.push(entities);

				T obj = queryDS(entities.getStartIndex(), index);
				if (obj == null) {
					entities = (LazyList<T>) st.pop();
					startIndex = (Integer) st.pop();
				}
				return obj;
			} catch (Throwable ee) {
				entities = (LazyList<T>) st.pop();
				startIndex = (Integer) st.pop();

				throw new TuraException(ee);

			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	private T queryDS(int sindex, int index) throws TuraException {

		if (!isFrameShiftPossible(sindex, entities.getActualRowNumber()))
			return null;
		calculateShift(sindex);

		try {

			if (!prepareQuery())
				return null;

			try {
				datacontrol.getCommandStack().beginTransaction();

				entities = (LazyList<T>) datacontrol.getSearchCommand()
						.execute();
				shifter.setActualRowNumber(entities.getActualRowNumber());

			} finally {
				datacontrol.getCommandStack().commitTransaction();
			}

			if (entities.getFragmentSize() != 0 && index < entities.getActualRowNumber() ) {
				return getEntity(index);
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	private boolean isFrameShiftPossible(int sindex, long maxrow) {
		if (maxrow == -1)
			return true;

		if (direction && sindex + getLoadStep() < maxrow)
			return true;

		if (!direction && sindex - getLoadStep() >= 0)
			return true;

		return false;
	}

	private void calculateShift(int sindex) {
		if (entities.size() == -1) {
			startIndex = 0;
			endIndex = startIndex + getLoadStep();
			return;
		}

		if (direction) {
			startIndex = sindex + getLoadStep();
			endIndex = startIndex + getLoadStep();
		} else {
			endIndex = startIndex;
			startIndex = sindex - getLoadStep();
		}

	}

	public String getObjectKey(Object object) throws TuraException {
		return this.getDataControl().getObjectKey(object);
	}

	@SuppressWarnings("unchecked")
	private T getEntity(int index) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, TuraException {
		T t = entities.get(index);
		try {
			t.getClass().getMethod("getWrapper", new Class[] {});
			return (T) t;

		} catch (Exception e) {
			Object el =  Util.convertobject(t,this.datacontrol);
			entities.set((index), (T) el);

			if (datacontrol.getPostQueryTrigger() != null)
				datacontrol.getPostQueryTrigger().execute(datacontrol, el);

			return (T) el;
		}
	}

	public T remove(int i) throws TuraException {
		try {
			T obj = getEntity(i);

			datacontrol.getDeleteCommand().setObj(obj);

			if (datacontrol.getPreDeleteTrigger() != null)
				datacontrol.getPreDeleteTrigger().execute(
						datacontrol.getDeleteCommand());

			datacontrol.getDeleteCommand().execute();

			return obj;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	public int getLoadStep() {
		return loadStep;
	}

	public void setLoadStep(int loadStep) {
		this.loadStep = loadStep;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setScrollDirection(boolean direction) {
		this.direction = direction;
	}

	public ShiftControl getShifter() throws TuraException {
		if (shifter == null) {
			createShifter();
		}
		return shifter;
	}

	private void createShifter() throws TuraException {
		try {
			String key = "default";
			if (datacontrol.getParent() != null) {
				Object obj = datacontrol.getParent().getMasterCurrentObject();
				if (obj != null) {
					BeanWrapper w = (BeanWrapper) Reflection.call(obj,
							"getWrapper");
					key = w.getDatacontrol().getObjectKey(obj);
				}
			}
			shifter = shifterHash.get(key);
			if (shifter == null) {
				shifter = new ShiftControl(shifterHash, key);
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
