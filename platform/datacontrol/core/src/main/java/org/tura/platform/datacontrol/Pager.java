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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.RestrictionsConverter;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;

import com.octo.java.sql.query.QueryGrammarException;
import com.octo.java.sql.query.SelectQuery;

public class Pager<T> {

	private int startIndex;
	private int endIndex;
	private int loadStep;
	private List<T> entities = new LazyList<>();
	private DataControl<T> datacontrol;

	public Pager(DataControl<T> datacontrol)  {
		this.datacontrol = datacontrol;
		loadStep = PlatformConfig.LOADSTEP;
	}

	public void cleanPager() {
		entities = new LazyList<>();
		startIndex = 0;
	}

	public int listSize(){
		return entities.size();
	}
	private void prepareQuery() throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, QueryGrammarException {

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

		for (String key : query.getParams().keySet()) {
			Object param = query.getParams().get(key);
			if (param instanceof String) {
				String str = (String) param;
				if (((String) param).length() > 3) {
					int lastindex = str.length() - 1;
					if ("#{".equals(str.substring(0, 2))
							&& "}".equals(str.substring(lastindex - 1))) {
						Object expVal = datacontrol.getElResolver().getValue(
								str);
						query.getParams().put(key, expVal);
					}
				}
			}
		}
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
			Object obj = datacontrol.getCreateCommand().execute();
			obj = convertobject((T) obj);

			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			w.setInsertMode(true);
			entities.add(index, (T) obj);

			return (T) obj;
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) throws TuraException {

		try {
			return entities.get(index);
		} catch (IndexOutOfBoundsException e) {
			@SuppressWarnings("rawtypes")
			Stack st = new Stack();
			try {
				st.push(startIndex);
				st.push(entities);

				T obj = queryDS(index);
				if (obj == null) {
					entities = (ArrayList<T>) st.pop();
					startIndex = (Integer) st.pop();
				}
				return obj;
			} catch (Throwable ee) {
				entities = (ArrayList<T>) st.pop();
				startIndex = (Integer) st.pop();

				throw new TuraException(e);

			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	private T queryDS(int index) throws TuraException {

		if (datacontrol.getCommandStack().isEmpty())
			throw new TuraException(
					"Command stack is not empty. Commit or Rollback first ");

		startIndex = index;
		endIndex = index+getLoadStep();

		try {
			prepareQuery();

			try {
				datacontrol.getCommandStack().getTrx().begin();

				entities = (List<T>) datacontrol.getSearchCommand().execute();

			} finally {
				datacontrol.getCommandStack().getTrx().commit();
			}

			if (entities.size() != 0) {
				return getEntity(index);
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new TuraException(e);
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
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");

			datacontrol.getDeleteCommand().setObj(w.getObj());
			this.entities.remove(i);

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
}
