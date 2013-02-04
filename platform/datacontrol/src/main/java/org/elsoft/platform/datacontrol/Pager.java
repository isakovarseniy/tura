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
package org.elsoft.platform.datacontrol;

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
import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.Constants;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.OrderType;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SQLSearchCriteria;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.ins.InsModeBeanWrapper;
import org.elsoft.platform.datacontrol.ins.InsModeDataControl;
import org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria;
import org.elsoft.platform.datacontrol.metainfo.FunctionResult;
import org.elsoft.platform.datacontrol.metainfo.RemoteMethod;

import com.rits.cloning.Cloner;

public class Pager<T> {

	private Method findMethod;
	private int startIndex;
	private int endIndex;
	private List<T> entities;
	private InsModeDataControl<T> datacontrol;
	private Object prevBeginElement;
	private Object postEndElement;

	private static Logger logger = Logger.getLogger(Pager.class.getName());

	public static int LOADSTEP = 40;
	public static int PRVELEMENTWINDOW = 10;

	public Pager(InsModeDataControl<T> datacontrol) throws Exception {

		this.datacontrol = datacontrol;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getOrderCriteria() {

		if (datacontrol.getMode().getDefaultOrderby() == null) {
			return datacontrol.getOrderby();
		} else {
			if (datacontrol.getOrderby() == null) {
				return datacontrol.getMode().getDefaultOrderby();
			}
			Iterator<OrderCriteria> itr = datacontrol.getOrderby().iterator();
			HashMap<String, OrderCriteria> h = new HashMap<String, OrderCriteria>();
			while (itr.hasNext()) {
				OrderCriteria obj = itr.next();
				h.put(obj.getName(), obj);
			}
			itr = datacontrol.getMode().getDefaultOrderby().iterator();
			while (itr.hasNext()) {
				OrderCriteria obj = itr.next();
				h.put(obj.getName(), obj);
			}
			return new ArrayList(h.values());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<SearchCriteria> getSearchCriteria() throws Exception {
		List<SearchCriteria> sc = null;

		if ((datacontrol.getMode().getParent() != null)
				&& (datacontrol.getMode().getParent().getParent().getMode() == RootModeSwitch.INSERT_MODE)) {
			sc = datacontrol.getMode().getParent().getChildSearchCriteria();
		}

		if (datacontrol.getFilter() != null) {
			if (sc == null)
				sc = datacontrol.getFilter();
			else {
				Iterator<SearchCriteria> itr = datacontrol.getFilter()
						.iterator();
				HashMap<SearchCriteria, SearchCriteria> h = new HashMap();
				while (itr.hasNext()) {
					SearchCriteria obj = itr.next();
					h.put(obj, obj);
				}
				itr = sc.iterator();
				while (itr.hasNext()) {
					SearchCriteria obj = itr.next();
					h.put(obj, obj);
				}
				sc = new ArrayList(h.values());
			}
		}

		if ((datacontrol.getMode().getDefaultFilter() != null)
				&& (datacontrol.getMode().getDefaultFilter().size() != 0)) {

			HashMap<String, SearchCriteria> h = new HashMap();

			if (sc != null) {
				Iterator<SearchCriteria> itr = sc.iterator();
				while (itr.hasNext()) {
					SearchCriteria obj = itr.next();
					h.put(obj.getName(), obj);
				}
			}
			Iterator<DefaultSearchCriteria> itr = datacontrol.getMode()
					.getDefaultFilter().iterator();
			while (itr.hasNext()) {
				DefaultSearchCriteria obj = itr.next();
				SearchCriteria defcri = new SearchCriteria();
				defcri.setName(obj.getName());
				defcri.setComparator(obj.getComparator());
				defcri.setClassName(obj.getClassName());
				if (obj.getValue() != null)
					defcri.setValue(obj.getValue());
				else {
					Object expVal = datacontrol.getMode().getElResolver()
							.getValue(obj.getExpression());
					if (expVal != null)
						defcri.setValue(expVal.toString());
					else
						defcri.setValue(Constants.UNDEFINED_PARAMETER);
				}
				h.put(defcri.getName(), defcri);
			}
			sc = new ArrayList(h.values());
		}
		return sc;
	}

	public boolean isRefresh() {
		return datacontrol.isRefresh();
	}

	public InsModeDataControl<T> getDataControl() {
		return this.datacontrol;
	}

	public T createObject(int index) {
		return createObject(index, true);
	}

	@SuppressWarnings("unchecked")
	public T createObject(int index, boolean managable) {

		try {
			getDataControl().getMode().getStControl()
					.createObjectCommand(getDataControl());

			FunctionResult functionResult = (FunctionResult) getDataControl()
					.getMode()
					.getStControl()
					.getAnnotation(
							getDataControl().getMode().getAnnotatedObject(),
							DCMetaInfoLevel.Class, DCMetaInfo.FunctionResult)
					.values().iterator().next();

			Object obj = getDataControl().getMode().getElResolver()
					.getValue(functionResult.getResultExpression());
			obj = convertobject((T) obj);

			InsModeBeanWrapper w = (InsModeBeanWrapper) Reflection.call(obj,
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
				}else
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

		List<SearchCriteria> ls = getSearchCriteria();
		if (ls == null)
			ls = new ArrayList<SearchCriteria>();

		List<OrderCriteria> lsOrd = getOrderCriteria();
		if (lsOrd == null)
			lsOrd = new ArrayList<OrderCriteria>();

		datacontrol
				.getMode()
				.getStControl()
				.preQueryTrigger(datacontrol,
						new Object[] { this.getDataControl(), ls, lsOrd });

		RemoteMethod annotation = (RemoteMethod) datacontrol
				.getMode()
				.getStControl()
				.getAnnotation(datacontrol.getMode().getAnnotatedObject(),
						DCMetaInfoLevel.Class,
						datacontrol.getMode().getAnnotatedObject())
				.get(DCMetaInfo.SearchTrigger.name());

		findMethod = annotation
				.getProxyObject()
				.getClass()
				.getMethod(
						annotation.getMethod(),
						new Class[] { List.class, List.class, Integer.class,
								Integer.class, String.class });

		try {
			this.getDataControl().getMode().getStControl().getTrx().begin();

			int shift = 0;
			if (index != 0)
				shift = 1;
			entities = (List<T>) findMethod.invoke(annotation.getProxyObject(),
					new Object[] { ls, lsOrd, new Integer(startIndex - shift),
							new Integer(endIndex),
							annotation.getValues().get(4) });

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
		CollectionUtils.filter(c, new Filter(ls, getDataControl().getMode()
				.getRootClass()));
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
		CollectionUtils.filter(c, new Filter(ls, getDataControl().getMode()
				.getRootClass()));
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

	private Object sort(Object o1, Object o2, List<OrderCriteria> order) {
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

			datacontrol.getMode().getStControl()
					.postQueryTrigger(datacontrol, new Object[] { el });

			return (T) el;
		}
	}

	@SuppressWarnings("unchecked")
	private T convertobject(T obj) {

		try {
			Object wrapper = InsModeBeanWrapper.newInstance(obj.getClass(),
					this.getDataControl().getMode().getAnnotatedObject(),
					this.getDataControl());
			InsModeBeanWrapper w = (InsModeBeanWrapper) Reflection.call(
					wrapper, "getWrapper");

			w.setObj(obj);
			w.setDatacontrol(this.getDataControl());
			w.setPager(this);

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
				InsModeBeanWrapper w = (InsModeBeanWrapper) Reflection.call(
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
		private List<OrderCriteria> order;
		private Map<?, ?> base;
		private Sorter sorter;

		protected Sort(List<OrderCriteria> order, Map<?, ?> base) {
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
				List<OrderCriteria> order) {
			Iterator<OrderCriteria> itr = order.iterator();
			int result = 0;
			while (itr.hasNext()) {
				OrderCriteria crit = itr.next();
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

		private List<SearchCriteria> sc;
		private Class<?> clazz;

		protected Filter(List<SearchCriteria> sc, Class<?> clazz) {
			this.sc = sc;
			this.clazz = clazz;

		}

		@SuppressWarnings("unchecked")
		public boolean evaluate(Object obj) {
			boolean isComarable = true;

			try {

				obj.getClass().asSubclass(clazz);
				if (sc == null)
					return true;
				Iterator<SearchCriteria> itr = sc.iterator();
				while (itr.hasNext()) {
					SearchCriteria crit = itr.next();
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
