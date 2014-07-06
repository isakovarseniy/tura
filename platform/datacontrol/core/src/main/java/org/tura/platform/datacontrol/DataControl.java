package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;

import com.octo.java.sql.query.SelectQuery;

public abstract class DataControl<T> extends MetaInfoHolder {

	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();

	private SelectQuery query;

	private Pager<T> pager;
	private int currentPosition = 0;

	protected Object comandResultHolder;

	private CommandStack commandStack;


	public DataControl() throws Exception {
		this.pager = new Pager<T>(this);
	}
	
	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	public void forceRefresh() throws TuraException {
		pager.cleanPager();
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	protected void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		pager.cleanPager();
		currentPosition = 0;
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	protected void notifyChageRecordAll(T newCurrentObject)
			throws TuraException {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyChangeRecordLiteners(newCurrentObject);
	}

	private void notifyChangeRecordLiteners(T newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	private void notifyChildrenDataControlsChangeCurrentRecord(
			T newCurrentObject) throws TuraException {
		for (Relation relation : children.values()) {
			relation.setMasterCurrentObject(newCurrentObject);
			((DataControl<?>) relation.getChild())
					.handleChangeMusterCurrentRecordNotification(newCurrentObject);
		}
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public T getCurrentObject() throws TuraException {
		return  pager.getObject(currentPosition);
	}

	public void nextObject() throws TuraException {
		if (currentPosition <  pager.listSize()) {
			currentPosition++;
			T newRecord = pager.getObject(currentPosition);
			notifyChageRecordAll(newRecord);
		}
	}

	public void prevObject() throws TuraException {
		if (currentPosition >  0) {
			currentPosition--;
			T newRecord = pager.getObject(currentPosition );
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception {

		for (String relName : getRelationsName()) {
			Relation rel = this.getChild(relName);

			if ((rel.isCascade()) && (rel.getChild() == null)) {
				Factory.createDataControl(this, rel);
			}

			if ((rel.isCascade()) && (rel.getChild() != null)
					&& (rel.getChild().getCurrentObject() != null))
				rel.getChild().removeAll();
		}
		this.pager.remove(currentPosition);
		if (currentPosition == pager.listSize())
			currentPosition--;
		notifyChageRecordAll(getCurrentObject());
	}

	public String getObjectKey(Object object) throws TuraException {
		try {
			StringBuffer key = new StringBuffer();
			Iterator<String> itr = this.getKeys().iterator();
			while (itr.hasNext()) {
				String method = "get" + StringUtils.capitalize(itr.next());
				key.append(Reflection.call(object, method));
				key.append(" ");
			}
			return key.toString();
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	public void removeAll() throws Exception {
		T obj = null;
		int i = 0;
		do {
			obj = pager.getObject(i);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj =  pager.getObject(i);
			}
		} while (obj != null);

	}

	public T createObject() throws TuraException {
		// Refresh tree
		pager.getObject(currentPosition);

		// Create a new object
		T objWrp = pager.createObject(currentPosition);

		try {
			if (objWrp != null) {
				if (getParent() != null) {
					BeanWrapper w = ((BeanWrapper) Reflection.call(objWrp,
							"getWrapper"));
					Object obj = w.getObj();

					List<SearchCriteria> ls = getParent()
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
				notifyChageRecordAll(getCurrentObject());
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
		return objWrp;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * @return the commandStack
	 */
	public CommandStack getCommandStack() {
		return commandStack;
	}

	/**
	 * @param commandStack
	 *            the commandStack to set
	 */
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

	public SelectQuery getQuery() {
		return query;
	}

	public void setQuery(SelectQuery query) {
		this.query = query;
	}

	public Pager<T> getPager() {
		return pager;
	}

}
