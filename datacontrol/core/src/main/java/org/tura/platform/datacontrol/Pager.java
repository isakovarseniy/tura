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

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.logging.Logger;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.ComparatorType;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.OrderType;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SQLSearchCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.DefaultSearchCriteria;

import com.rits.cloning.Cloner;

public class Pager<T> {

	private Method findMethod;
	private int startIndex;
	private int endIndex;
	private List<T> entities;
	private DataControl<T> datacontrol;
	private Object prevBeginElement;
	private Object postEndElement;

	private static Logger logger = Logger.getLogger(Pager.class.getName());

	public static int LOADSTEP = 40;
	public static int PRVELEMENTWINDOW = 10;

	public Pager(DataControl<T> datacontrol) throws Exception {
		this.datacontrol = datacontrol;
	}

	public Collection<OrderCriteria> getOrderCriteria() {
		if (datacontrol.getDefaultOrderby() == null) {
			return datacontrol.getOrderby();
		} else {
			if (datacontrol.getOrderby() == null) {
				return datacontrol.getDefaultOrderby();
			}
			HashMap<String, OrderCriteria> h = new HashMap<String, OrderCriteria>();

			for (OrderCriteria obj : datacontrol.getOrderby())
				h.put(obj.getName(), obj);

			for (OrderCriteria obj : datacontrol.getDefaultOrderby())
				h.put(obj.getName(), obj);

			return h.values();
		}
	}

	public Collection<SearchCriteria> getSearchCriteria() throws Exception {

		Collection<SearchCriteria> sc = null;

		if (datacontrol.getParent() != null)
			sc = datacontrol.getParent().getChildSearchCriteria();

		if (datacontrol.getFilter() != null) {
			if (sc == null)
				sc = datacontrol.getFilter();
			else {

				HashMap<SearchCriteria, SearchCriteria> h = new HashMap<>();
				for (SearchCriteria obj : datacontrol.getFilter())
					h.put(obj, obj);

				for (SearchCriteria obj : sc)
					h.put(obj, obj);

				sc = h.values();
			}
		}

		if ((datacontrol.getDefaultFilter() != null)
				&& (datacontrol.getDefaultFilter().size() != 0)) {

			HashMap<String, SearchCriteria> h = new HashMap<>();

			if (sc != null) {
				for (SearchCriteria obj : sc)
					h.put(obj.getName(), obj);
			}

			for (DefaultSearchCriteria obj : datacontrol.getDefaultFilter()) {

				SearchCriteria defcri = new SearchCriteria();
				defcri.setName(obj.getName());
				defcri.setComparator(obj.getComparator());
				defcri.setClassName(obj.getClassName());
				if (obj.getValue() != null)
					defcri.setValue(obj.getValue());
				else {
					Object expVal = datacontrol.getElResolver().getValue(
							obj.getExpression());
					if (expVal != null)
						defcri.setValue(expVal.toString());
					else
						defcri.setValue(Constants.UNDEFINED_PARAMETER);
				}
				h.put(defcri.getName(), defcri);
			}
			sc = h.values();
		}
		return sc;
	}

	public DataControl<T> getDataControl() {
		return datacontrol;
	}

	public T createObject(int index) {
		return createObject(index, true);
	}

	@SuppressWarnings("unchecked")
	public T createObject(int index, boolean managable) {

		try {

			datacontrol.createCommand.execute();
			Object obj = datacontrol.comandResultHolder;
			obj = convertobject((T) obj);

			BeanWrapper w = (BeanWrapper) Reflection.call(obj,
					"getWrapper");
			w.setInsertMode(true);
			if (entities == null)
				entities = new ArrayList<T>();
			if (managable)
				entities.add(index - startIndex, (T) obj);
			return (T) obj;
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public T getObject(int index) {

		@SuppressWarnings("rawtypes")
		Stack st = new Stack();

		try {
			st.push(startIndex);
			st.push(endIndex);
			st.push(entities);

			if ((entities == null) || (isRefresh())) {
				datacontrol.cleanGhost();
				return queryDS(index, null);
			}

			if ((startIndex <= index) && (index < entities.size() + startIndex)
					&& (entities.size() != 0)) {

				return getEntity(index);

			} else {
				Object prev = null;
				if (entities.size() != 0)
					prev = entities.get(entities.size() - 1);
				T obj = queryDS(index, prev);
				if (obj == null) {
					entities = (ArrayList<T>) st.pop();
					endIndex = (Integer) st.pop();
					startIndex = (Integer) st.pop();
				} else
					datacontrol.cleanGhost();

				return obj;

			}
		} catch (Throwable e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);

			entities = (ArrayList<T>) st.pop();
			endIndex = (Integer) st.pop();
			startIndex = (Integer) st.pop();

			throw new RuntimeException(e.getMessage());

		}
	}

	public int size() {
		return 0;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private T queryDS(int index, Object prevObject) throws Exception {

		startIndex = index;
		endIndex = startIndex + LOADSTEP + 1;

		Collection<SearchCriteria> ls = getSearchCriteria();
		if (ls == null)
			ls = new ArrayList<SearchCriteria>();

		Collection<OrderCriteria> lsOrd = getOrderCriteria();
		if (lsOrd == null)
			lsOrd = new ArrayList<OrderCriteria>();

		if (datacontrol.postQueryCommand != null)
			datacontrol.postQueryCommand.execute();

		try {
			this.getDataControl().getMode().getStControl().getTrx().begin();

			int shift = 0;
			if (index != 0)
				shift = 1;

			datacontrol.searchCommand.execute();
			entities = (List<T>) datacontrol.comandResultHolder;

			prevBeginElement = null;
			if ((entities != null) && (entities.size() != 0) && (index != 0))
				prevBeginElement = entities.get(0);

			if ((entities.size() == 0) && (index != 0)) {

				int i = Math.max(startIndex - PRVELEMENTWINDOW, 0);
				int j = Math.max(startIndex - 1, 0);

				List<T> check = (List<T>) findMethod.invoke(
						annotation.getProxyObject(), new Object[] { ls, lsOrd,
								new Integer(i), new Integer(j),
								annotation.getValues().get(4) });
				if (check.size() == 0)
					return null;
				prevBeginElement = check.get(check.size() - 1);
			}

			if ((prevBeginElement != null) && (prevObject != null)) {
				prevBeginElement = sort(prevBeginElement, prevObject, lsOrd);
			}

			postEndElement = null;
			if ((entities != null) && (entities.size() == LOADSTEP + 1 + shift))
				postEndElement = entities.get(LOADSTEP + shift);

		} finally {
			this.getDataControl().getMode().getStControl().getTrx().commit();
		}

		Map allObjects = new HashMap();

		Collection<?> c = (new Cloner()).deepClone(getDataControl().getMode()
				.getStControl().getCreatedObjects().values());
		CollectionUtils.filter(c, new Filter(ls, datacontrol.rootClass));
		Iterator<?> itr = c.iterator();
		while (itr.hasNext()) {
			Object t = itr.next();
			allObjects.put(this.getObjectKey(t), t);
		}

		if (entities != null) {
			Iterator<T> itrT = entities.iterator();
			while (itrT.hasNext()) {
				T t = itrT.next();
				if (!getDataControl().getMode().getStControl()
						.getRemovedObjects().containsKey(getObjectKey(t))) {
					allObjects.put(getObjectKey(t), t);
				}
			}
		}

		c = getDataControl().getMode().getStControl().getUpdatedObjects()
				.values();

		Iterator itr1 = c.iterator();
		while (itr1.hasNext()) {
			Object t = itr1.next();
			Object key = getObjectKey(t);
			allObjects.put(key, t);
		}

		c = (new Cloner()).deepClone(allObjects.values());
		CollectionUtils.filter(c, new Filter(ls, datacontrol.rootClass));
		allObjects = new HashMap();
		itr1 = c.iterator();
		while (itr1.hasNext()) {
			Object t = itr1.next();
			Object key = getObjectKey(t);
			allObjects.put(key, t);
		}

		Map treemap = null;
		if ((lsOrd != null) && (lsOrd.size() != 0)) {
			treemap = new TreeMap(new Sort(lsOrd, allObjects));
		} else {
			treemap = new TreeMap();
		}
		treemap.putAll(allObjects);

		List keyList = new ArrayList(treemap.keySet());
		List valueList = new ArrayList(treemap.values());

		int top = 0;
		int bottom = keyList.size();

		if (prevBeginElement != null) {
			top = keyList.indexOf(getObjectKey(prevBeginElement)) + 1;
		}

		if (postEndElement != null) {
			bottom = keyList.indexOf(getObjectKey(postEndElement));
		}

		if (top == bottom)
			entities = new ArrayList<T>();
		else {
			entities = new ArrayList<T>(
					(Collection<? extends T>) valueList.subList(top, bottom));
		}
		if (entities.size() != 0) {
			return getEntity(index);
		} else {
			return null;
		}
	}

	private Object sort(Object o1, Object o2, Collection<OrderCriteria> order) {
		int i = new Sorter().objectSorter(o1, o2, order);
		if (i == 1)
			return o1;
		else
			return o2;
	}

	public String getObjectKey(Object object) {
		return this.getDataControl().getObjectKey(object);
	}

	@SuppressWarnings("unchecked")
	private T getEntity(int index) throws Exception {
		T t = entities.get(index - startIndex);
		try {
			t.getClass().getMethod("getWrapper", new Class[] {});
			return (T) t;

		} catch (Exception e) {
			Object el = convertobject(t);
			entities.set((index - startIndex), (T) el);

			if (datacontrol.postQueryCommand != null)
				datacontrol.postQueryCommand.execute();

			return (T) el;
		}
	}

	@SuppressWarnings("unchecked")
	private T convertobject(T obj) {

		try {
			Object wrapper = BeanWrapper.newInstance(obj.getClass(),
					this.getDataControl().getMode().getAnnotatedObject(),
					this.getDataControl());
			BeanWrapper w = (BeanWrapper) Reflection.call(
					wrapper, "getWrapper");

			w.setObj(obj);
			w.setDatacontrol(datacontrol);

			return (T) wrapper;

		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public T remove(int i) {
		try {
			if ((startIndex > i) || (startIndex + LOADSTEP <= i))
				this.getObject(i);

			T obj = this.entities.get(i - startIndex);
			if (obj != null) {
				BeanWrapper w = (BeanWrapper) Reflection.call(
						obj, "getWrapper");
				if (w.isInsertMode()) {
					getDataControl().getMode().getStControl()
							.getCreatedObjects()
							.remove(this.getObjectKey(w.getObj()));
				} else {
					
					getDataControl().getMode().getStControl()
							.getUpdatedObjects()
							.remove(this.getObjectKey(w.getObj()));
					
					this.getDataControl()
							.getMode()
							.getStControl()
							.removeObjectCommand(w.getObj(),
									this.getDataControl());
				}
				obj = this.entities.remove(i - startIndex);
				getDataControl().getMode().getStControl()
						.addRemovedObjects((T) w.getObj(), getDataControl());
				return obj;
			} else
				return null;
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			return null;
		}
	}

	class Sort implements Comparator<Object> {
		private Collection<OrderCriteria> order;
		private Map<?, ?> base;
		private Sorter sorter;

		protected Sort(Collection<OrderCriteria> order, Map<?, ?> base) {
			this.order = order;
			this.base = base;
			this.sorter = new Sorter();
		}

		public int compare(Object k1, Object k2) {

			Object o1 = base.get(k1);
			Object o2 = base.get(k2);
			return sorter.objectSorter(o1, o2, order);
		}
	}

	@SuppressWarnings("unchecked")
	class Sorter {
		protected int objectSorter(Object o1, Object o2,
				Collection<OrderCriteria> order) {
			int result = 0;
			for (OrderCriteria crit : order) {
				String method = "get" + StringUtils.capitalize(crit.getName());

				@SuppressWarnings("rawtypes")
				Comparable v1 = (Comparable) Reflection.call(o1, method);
				@SuppressWarnings("rawtypes")
				Comparable v2 = (Comparable) Reflection.call(o2, method);

				result = v1.compareTo(v2);
				if (result != 0) {
					if (crit.getOrder().equals(OrderType.DESC.name()))
						result = result * (-1);
					break;
				}
			}
			return result;
		}
	}

	class Filter implements Predicate {

		private Collection<SearchCriteria> sc;
		private Class<?> clazz;

		protected Filter(Collection<SearchCriteria> ls, Class<?> clazz) {
			this.sc = ls;
			this.clazz = clazz;

		}

		@SuppressWarnings("unchecked")
		public boolean evaluate(Object obj) {
			boolean isComarable = true;

			try {

				obj.getClass().asSubclass(clazz);
				if (sc == null)
					return true;
				for (SearchCriteria crit : sc) {
					if (crit instanceof SQLSearchCriteria)
						continue;
					String method = "get"
							+ StringUtils.capitalize(crit.getName());
					Constructor<?> c = Class.forName(crit.getClassName())
							.getConstructor(String.class);
					Object value = c.newInstance(crit.getValue());

					ComparatorType cmp = ComparatorType.valueOf(crit
							.getComparator());
					@SuppressWarnings("rawtypes")
					Comparable v = (Comparable) Reflection.call(obj, method);

					if (cmp.equals(ComparatorType.LIKE)) {
						String expr = (String) value;
						expr = expr.toLowerCase(); // ignoring locale for now
						expr = expr.replace(".", "\\."); // "\\" is escaped to
															// "\" (thanks, Alan
															// M)
						// ... escape any other potentially problematic
						// characters here
						expr = expr.replace("?", ".");
						expr = expr.replace("%", ".*");
						String str = (String) v;
						str = str.toLowerCase();
						int i = 0;
						if (!str.matches(expr))
							i = -1;
						if (!cmp.compare(i)) {
							isComarable = false;
							break;
						}
					} else {

						if (!cmp.compare(v.compareTo(value))) {
							isComarable = false;
							break;
						}
					}

				}
			} catch (Exception e) {
				return false;
			}

			return isComarable;
		}
	}
}
