package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.DefaultSearchCriteria;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class DataControl<T> extends MetaInfoHolder {

	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();

	private List<SearchCriteria> filter;
	private List<OrderCriteria> orderby;

	private Pager<T> pager;
	private int currentPosition = 0;

	protected Object comandResultHolder;

	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	public abstract void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject);

	protected void notifyChageRecordAll(T newCurrentObject) {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyChageRecordLiteners(newCurrentObject);
	}

	private void notifyChageRecordLiteners(T newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}

	}

	private void notifyChildrenDataControlsChangeCurrentRecord(
			T newCurrentObject) {
		for (Relation relation : children.values()) {
			relation.setMasterCurrentObject(newCurrentObject);
			((DataControl<?>) relation.getChild())
					.handleChangeMusterCurrentRecordNotification(newCurrentObject);
		}

	}

	public List<SearchCriteria> getFilter() {
		return filter;
	}

	public void setFilter(List<SearchCriteria> filter) {
		this.filter = filter;
	}

	public List<OrderCriteria> getOrderby() {
		return orderby;
	}

	public void setOrderby(List<OrderCriteria> orderby) {
		this.orderby = orderby;
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public void initControl() throws Exception {
		this.pager = new Pager<T>(this);
	}

	public T getCurrentObject() {
		return getObject(currentPosition);
	}

	public void nextObject() {
		if (getCurrentObject() != null) {
			currentPosition++;
		}
	}

	public void prevObject() {
		if (currentPosition > 0)
			currentPosition--;
	}

	public void removeObject() throws Exception {

		Collection<String> ls = this.getMode().getRelationsName();

		if (ls != null) {
			Iterator<String> itr = ls.iterator();
			while (itr.hasNext()) {
				String relName = itr.next();
				Relation rel = this.getMode().getChildren(relName);

				if ((rel.isCascade()) && (rel.getChild() == null)) {
					Object extender = this.getMode().getExtender();
					ModeExtender mdExt = (ModeExtender) Reflection.call(
							extender, "getWrapper");
					Reflection.call(extender, mdExt.getRelationMethod(relName));
				}

				if ((rel.isCascade())
						&& (rel.getChild() != null)
						&& (rel.getChild().getControl().getCurrentObject() != null))
					rel.getChild().getControl().removeAll();
			}
		}
		this.pager.remove(currentPosition);
	}

	
	public String getObjectKey(Object object) {

		String clazz = this.getMode().getAnnotatedObject();

		StringBuffer key = new StringBuffer();
		Iterator<String> itr = this.getMode().getStControl()
				.getAnnotation(clazz, DCMetaInfoLevel.Field, DCMetaInfo.Id)
				.keySet().iterator();
		while (itr.hasNext()) {
			String method = "get" + StringUtils.capitalize(itr.next());
			key.append(Reflection.call(object, method));
			key.append(" ");
		}
		return key.toString();
	}

	public void removeAll() throws Exception {
		this.setRefresh(true);
		T obj = null;
		int i = 0;
		do {
			obj = this.getObject(i * Pager.LOADSTEP);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj = this.getObject(i * Pager.LOADSTEP);
			}
		} while (obj != null);

	}

	public List<T> getList() {
		this.currentPosition = 0;
		return new ObjectIterator<T>(this, pager);
	}

	public synchronized T getObject(int index) {

		if (mode.getParent() != null)
			checkParenObject(mode.getParent().getParent().getControl()
					.getCurrentObject());

		boolean flagUpdate = this.isUpdated();

		if (!isRefresh()) {
			if (flagUpdate) {
				this.setRefresh(true);
			}
		}

		if (isRefresh()) {
			currentPosition = 0;
			index = 0;
		}

		T obj = pager.getObject(index);
		this.currentPosition = index;
		if (isRefresh()) {
			Iterator<DCEventListener> itr = this.getMode()
					.getRefreshListeners().iterator();
			while (itr.hasNext()) {
				itr.next().execute();
			}
		}
		this.setRefresh(false);
		return obj;
	}

	public T createObject() {
		// Refresh tree
		getObject(currentPosition);

		// Create a new object
		T objWrp = pager.createObject(currentPosition);

		try {
			if (objWrp != null) {
				if (mode.getParent() != null) {
					BeanWrapper w = ((BeanWrapper) Reflection
							.call(objWrp, "getWrapper"));
					Object obj = w.getObj();

					List<SearchCriteria> ls = mode.getParent()
							.getChildSearchCriteria();
					Iterator<SearchCriteria> itr = ls.iterator();
					while (itr.hasNext()) {
						SearchCriteria sc = itr.next();

						String name = sc.getName();
						String className = sc.getClassName();
						String value = sc.getValue();
						if (value != Constants.UNDEFINED_PARAMETER) {

							String method = "set"
									+ StringUtils.capitalize(name);
							Constructor<?> cons = Class.forName(className)
									.getConstructor(String.class);

							Reflection.call(obj, method,
									cons.newInstance(value));
						}
					}
				}

			}
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			objWrp = null;
		}
		return objWrp;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

}
