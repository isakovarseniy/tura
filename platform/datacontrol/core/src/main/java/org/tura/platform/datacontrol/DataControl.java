package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.query.SelectQuery;

public abstract class DataControl<T>  extends MetaInfoHolder implements IDataControl{

	private static boolean SCROLL_DOWN = true;
	private static boolean SCROLL_UP = false;
	private static String id = UUID.randomUUID().toString();

	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();

	private SelectQuery query;

	private Pager<T> pager;
	private int currentPosition = 0;

	protected Object comandResultHolder;

	protected CommandStack commandStack;

	public DataControl() throws Exception {
		this.pager = new Pager<T>(this);
	}

	public abstract void createChild(IDataControl dc, String relName , Relation relation);

	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	public void forceRefresh() throws TuraException {
		currentPosition = 0;
		pager.cleanPager();
		pager.setScrollDirection(SCROLL_DOWN);
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		pager.cleanPager();
		currentPosition = 0;
		pager.setScrollDirection(SCROLL_DOWN);
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
			if (relation.getChild() != null)
				((IDataControl) relation.getChild())
						.handleChangeMusterCurrentRecordNotification(newCurrentObject);
		}
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public T getCurrentObject() throws TuraException {
		pager.setScrollDirection(SCROLL_DOWN);
		return pager.getObject(currentPosition);
	}

	public boolean hasNext() throws TuraException {
		if (pager.listSize() == -1)
			getCurrentObject();

		int position;
		try {
			position = (int) pager.getShifter()
					.getObject(currentPosition, true);
		} catch (Exception e) {
			throw new TuraException(e);
		}
		if (position + 1 < pager.listSize())
			return true;
		else
			return false;

	}

	public void nextObject() throws TuraException {
		if (pager.listSize() == -1)
			getCurrentObject();

		int position;
		try {
			position = (int) pager.getShifter()
					.getObject(currentPosition, true);
		} catch (Exception e) {
			throw new TuraException(e);
		}
		if (position + 1 < pager.listSize()) {
			currentPosition++;
			pager.setScrollDirection(SCROLL_DOWN);
			T newRecord = pager.getObject(currentPosition);
			notifyChageRecordAll(newRecord);
		}
	}

	public boolean hasPrev() {
		if (currentPosition > 0)
			return true;
		else
			return false;

	}

	public void prevObject() throws TuraException {
		if (currentPosition > 0) {
			currentPosition--;
			pager.setScrollDirection(SCROLL_UP);
			T newRecord = pager.getObject(currentPosition);
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception {

		for (String relName : getRelationsName()) {
			Relation rel = this.getChild(relName);

			if ((rel.isCascade()) && (rel.getChild() == null)) {
				createChild(this, relName, rel);
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
		pager.setScrollDirection(SCROLL_DOWN);
		do {
			obj = pager.getObject(i);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj = pager.getObject(i);
			}
		} while (obj != null);

	}

	public T createObject() throws TuraException {
		// Refresh tree
		pager.setScrollDirection(SCROLL_DOWN);
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
						Object value = sc.getValue();
						if (!value.equals(Constants.UNDEFINED_PARAMETER)) {

							String method = "set"
									+ StringUtils.capitalize(name);

							Reflection.callTyped(obj, method,
									Class.forName(className), value);
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

	@Override
	public boolean setCurrentPosition(Object crtPosition) throws TuraException {

		if (pager.listSize() == -1)
			getCurrentObject();
		
		int position;
		try {
			position = (int) pager.getShifter()
					.getObject((int)crtPosition, true);
		} catch (Exception e) {
			throw new TuraException(e);
		}
		if (position  < pager.listSize()){
			this.currentPosition = (int)crtPosition;
			return true;
		}
		else
			return false;
		
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

	public void setPageSize(int page) {
		pager.setLoadStep(page);
	}

	public int getStartIndex() {
		return pager.getStartIndex();
	}

	public int getEndIndex() {
		return pager.getEndIndex();
	}

	public void cleanShifter() {
		pager.cleanShifter();
	}

	public ShiftControl getShifter() throws TuraException {
		return pager.getShifter();

	}

	public String getId() {
		return id;
	}

}
