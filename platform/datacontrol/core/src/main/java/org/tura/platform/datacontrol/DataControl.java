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
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.shift.ShiftControl;

import com.octo.java.sql.query.SelectQuery;
import com.rits.cloning.Cloner;

public abstract class DataControl<T> extends MetaInfoHolder implements
		IDataControl {

	private static boolean SCROLL_DOWN = true;
	private static boolean SCROLL_UP = false;
	private String id = UUID.randomUUID().toString();

	protected boolean blocked = false;
	private TreeDataControl treeDataControl;

	private ArrayList<EventListener> eventLiteners = new ArrayList<>();

	private SelectQuery query;

	private Pager<T> pager;
	private int currentPosition = 0;
	
	private Scroller<T> scroller;

	protected Object comandResultHolder;

	protected CommandStack commandStack;

	@SuppressWarnings({ "unchecked" })
	public DataControl() throws Exception {
		this.pager = new Pager<T>(this);
		this.scroller = (Scroller<T>) ScrollerWrapper.newInstance(new Scroller<T>(pager));
	}

	public void addEventLiteners(EventListener listener) {
		eventLiteners.add(listener);
	}

	public void forceRefresh() throws TuraException {
		currentPosition = 0;
		pager.cleanPager();
		pager.setScrollDirection(SCROLL_DOWN);
		notifyLiteners(new ControlRefreshedEvent(this));
		notifyChageRecordAll(pager.getObject(currentPosition));
	}
	
	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		if (newCurrentObject == null) {
			blocked = true;
			pager.cleanPager();
			notifyLiteners(new MasterRowChangedEvent(this, null));
			notifyChageRecordAll(null);
			return;
		}

		blocked = false;
		pager.cleanPager();
		currentPosition = 0;
		pager.setScrollDirection(SCROLL_DOWN);
		notifyLiteners(new MasterRowChangedEvent(this, newCurrentObject));
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	protected void notifyChageRecordAll(T newCurrentObject)
			throws TuraException {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyDependencyListeners(newCurrentObject);
	}

	private void notifyDependencyListeners(Object newCurrentObject)
			throws TuraException {
		for (DependecyProperty dep : dependency) {
			ChangeRecordListener listener = (ChangeRecordListener) getElResolver()
					.getValue(dep.getExpression());
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	public void notifyLiteners(Event event) throws TuraException {
		for (EventListener listener : eventLiteners) {
			if (listener != null )
			     listener.handleEventListener(event);
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
		if (blocked)
			return null;

		pager.setScrollDirection(SCROLL_DOWN);
		return pager.getObject(currentPosition);
	}

	public boolean hasNext() throws TuraException {
		if (blocked)
			return false;

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
		if (blocked)
			return;

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
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(newRecord);
		}
	}

	public boolean hasPrev() {
		if (blocked)
			return false;

		if (currentPosition > 0)
			return true;
		else
			return false;

	}

	public void prevObject() throws TuraException {
		if (blocked)
			return;

		if (currentPosition > 0) {
			currentPosition--;
			pager.setScrollDirection(SCROLL_UP);
			T newRecord = pager.getObject(currentPosition);
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception {
		if (blocked)
			return;

		if (treeDataControl != null ){
			TreePath[] treePosition =  (TreePath[]) treeDataControl.getCurrentPosition();
			TreePath[] newTreePosition = new TreePath[treePosition.length+1];
			System.arraycopy(treePosition, 0, newTreePosition, 0, treePosition.length);
			newTreePosition[treePosition.length]= new TreePath(this.getParent().getName(), 0);
			treeDataControl.setCurrentPosition(newTreePosition);
		}
		for (String relName : getRelationsName()) {
			Relation rel = this.getChild(relName);

			if ((rel.isCascade()) && (rel.getChild() == null)) {
				createChild(relName);
			}

			if ((rel.isCascade()) && (rel.getChild() != null)
					&& (rel.getChild().getCurrentObject() != null))
				rel.getChild().removeAll();
		}
		RowRemovedEvent event =   new RowRemovedEvent(this,pager.getObject(currentPosition));
		this.pager.remove(currentPosition);
		if (currentPosition == pager.listSize())
			currentPosition--;
		
		if (treeDataControl != null ){
			TreePath[] treePosition =  (TreePath[]) treeDataControl.getCurrentPosition();
			TreePath[] newTreePosition = new TreePath[treePosition.length-1];
			System.arraycopy(treePosition, 0, newTreePosition, 0, treePosition.length-1);
			treeDataControl.setCurrentPosition(newTreePosition);
		}		
		notifyLiteners(event);
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
		if (blocked)
			return;

		T obj = null;
		pager.setScrollDirection(SCROLL_DOWN);
		do {
			obj = getCurrentObject();
			if (obj != null)
				removeObject();
		} while (obj != null);
	}

	public T createObject() throws TuraException {
		if (blocked)
			return null;

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
				notifyLiteners(new RowCreatedEvent(this,getCurrentObject()));
				notifyChageRecordAll(getCurrentObject());
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
		return objWrp;
	}

	public Integer getCurrentPosition() {
		if (blocked)
			return -1;

		return currentPosition;
	}

	@Override
	public boolean setCurrentPosition(Object crtPosition) throws TuraException {
		if (blocked)
			return false;

		if (pager.listSize() == -1)
			getCurrentObject();

		int position;
		try {
			position = (int) pager.getShifter().getObject((int) crtPosition,
					true);
		} catch (Exception e) {
			throw new TuraException(e);
		}
		if (position < pager.listSize()) {
			this.currentPosition = (int) crtPosition;
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(getCurrentObject());
			return true;
		} else
			return false;

	}

	public CommandStack getCommandStack() {
		return commandStack;
	}

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

	public void cleanShifter() throws TuraException {
		pager.cleanShifter();
	}

	public ShiftControl getShifter() throws TuraException {
		return pager.getShifter();

	}

	public String getId() {
		return id;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public TreeDataControl getTreeContext() {
		return treeDataControl;
	}

	public void setTreeContext(TreeDataControl tdc) {
		treeDataControl = tdc;
		this.addEventLiteners(treeDataControl);
	}

	public List<T> getScroller() {
		return scroller;
	}

	public void putObjectToPool(Object obj, PoolCommand c) throws TuraException{
		Object pooledObj = obj;
		try{
			BeanWrapper w =  (BeanWrapper) Reflection.call(obj, "getWrapper");
			pooledObj = w.getObj();
		}catch(Exception e){
			
		}
		Cloner cloner = new Cloner();
		Object o = cloner.deepClone(pooledObj);
		
		pager.addCommandt(  c.createdCommand(o, getObjectKey(obj), getBaseClass(), getShifter().getId()));
	}
	
}
