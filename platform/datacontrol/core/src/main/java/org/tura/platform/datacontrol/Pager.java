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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Stack;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.RestrictionsConverter;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;

public class Pager<T> {

	private int startIndex;
	private int endIndex;
	private int loadStep;
	private LazyList<T> entities = new LazyList<>();
	private DataControl<T> datacontrol;
	private boolean direction;
	private ShiftControl shifter = new ShiftControl();

	public Pager(DataControl<T> datacontrol) {
		this.datacontrol = datacontrol;
		loadStep = PlatformConfig.LOADSTEP;
	}

	public void cleanPager() {
		entities = new LazyList<>();
		startIndex = 0;
	}

	public int listSize() {
		return entities.size();
	}

	private void prepareQuery() throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, QueryException {

		datacontrol.setQuery(datacontrol.getDefaultQuery());

		Collection<SearchCriteria> sc = null;

		SelectQuery query = datacontrol.getQuery();
		if (datacontrol.getParent() != null) {
			sc = datacontrol.getParent().getChildSearchCriteria();
			for (SearchCriteria criteria : sc) {

				if (!criteria.getValue().equals(Constants.UNDEFINED_PARAMETER)) {
					Constructor<?> cons = Class
							.forName(criteria.getClassName()).getConstructor(
									String.class);

					Object obj = cons.newInstance(criteria.getValue());
					query = query.and(c(criteria.getName()));
					RestrictionsConverter.valueOf(criteria.getComparator())
							.getRestriction(query, obj);
				} else
					query.and(c("1")).eq("-1");
			}

		}
		query.toSql(new ExpressionResolver(datacontrol.getElResolver()));
		// restore dafaut querybuilder
		query.toSql(query.getQueryBuilder());

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
			obj = convertobject((T) obj);

			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			w.setInsertMode(true);

			return (T) obj;

		} catch (Exception e) {
			throw new TuraException(e);
		} finally {
			datacontrol.getCommandStack().commitTransaction();
		}

		// try {
		//
		//
		// Object obj = datacontrol.getCreateCommand().execute();
		// obj = convertobject((T) obj);
		//
		// BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
		// w.setInsertMode(true);
		//
		// return (T) obj;
		// } catch (Exception e) {
		// throw new TuraException(e);
		// }
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) throws TuraException {

		try {
			Object obj = null;
			try {
				obj = shifter.getObject(index);
			} catch (Exception e) {
				throw new TuraException(e);
			}

			if (obj == int.class)
				index = (int) obj;
			if (obj instanceof Integer)
				index = (int) obj;

			if (obj == int.class || obj instanceof Integer)
				return entities.get(index);

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
			prepareQuery();

			try {
				datacontrol.getCommandStack().beginTransaction();

				entities = (LazyList<T>) datacontrol.getSearchCommand()
						.execute();

			} finally {
				datacontrol.getCommandStack().commitTransaction();
			}

			if (entities.getFragmentSize() != 0) {
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
			IllegalArgumentException, InvocationTargetException {
		T t = entities.get(index);
		try {
			t.getClass().getMethod("getWrapper", new Class[] {});
			return (T) t;

		} catch (Exception e) {
			Object el = convertobject(t);
			entities.set((index), (T) el);

			if (datacontrol.getPostQueryTrigger() != null)
				datacontrol.getPostQueryTrigger().execute(datacontrol, el);

			return (T) el;
		}
	}

	@SuppressWarnings("unchecked")
	private T convertobject(T obj) throws NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Object wrapper = BeanWrapper.newInstance(obj.getClass(),
				this.getDataControl());
		BeanWrapper w = (BeanWrapper) Reflection.call(wrapper, "getWrapper");

		w.setObj(obj);
		w.setDatacontrol(datacontrol);

		return (T) wrapper;

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

	public ShiftControl getShifter() {
		return shifter;
	}

}
