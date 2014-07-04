package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.PlatformConfig;
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

	protected static Logger logger = Logger.getLogger(DataControl.class
			.getName());

	protected Object comandResultHolder;

	private CommandStack commandStack;

	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	public void forceRefresh() throws TuraException {
		pager.cleanPager();
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		pager.cleanPager();
		currentPosition = 0;
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	protected void notifyChageRecordAll(T newCurrentObject)
			throws TuraException {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyChageRecordLiteners(newCurrentObject);
	}

	private void notifyChageRecordLiteners(T newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}

	}

	public Pager<T> getPager() {
		return pager;
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

	public void initControl() throws Exception {
		this.pager = new Pager<T>(this);
	}

	public T getCurrentObject() throws TuraException {
		return getObject(currentPosition);
	}

	public void nextObject() throws TuraException {
		T newRecord = pager.getObject(currentPosition + 1);
		if (newRecord != null) {
			currentPosition++;
			notifyChageRecordAll(newRecord);
		}
	}

	public void prevObject() throws TuraException {
		T newRecord = pager.getObject(currentPosition - 1);
		if (newRecord != null) {
			currentPosition--;
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception  {

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

	public void removeAll() throws Exception  {
		T obj = null;
		int i = 0;
		do {
			obj = this.getObject(i * PlatformConfig.LOADSTEP);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj = this.getObject(i * PlatformConfig.LOADSTEP);
			}
		} while (obj != null);

	}

	public List<T> getList() {
		this.currentPosition = 0;
		return new ObjectIterator<T>(this, pager);
	}

	public synchronized T getObject(int index) throws TuraException {

		T obj = pager.getObject(index);
		this.currentPosition = index;

		return obj;
	}

	public T createObject() throws TuraException {
		// Refresh tree
		getObject(currentPosition);

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

}
