/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
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
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.repository.core.ObjectControl;


public abstract class DataControl<T> extends MetaInfoHolder implements IDataControl {

	private static boolean SCROLL_DOWN = true;
	private static boolean SCROLL_UP = false;
	private String id = UUID.randomUUID().toString();
	private Object stateObject;

	protected boolean blocked = false;
	private TreeDataControl treeDataControl;

	private ArrayList<EventListener> eventLiteners = new ArrayList<>();

	protected List<SearchCriteria> searchCriteria;
	protected List<OrderCriteria> orderCriteria;

	private Pager<T> pager;
	private int currentPosition = 0;

	private Scroller<T> scroller;

	protected Object comandResultHolder;

	protected CommandStack commandStack;


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
			if (listener != null)
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
		T t =  pager.getObject(currentPosition);
		if ( t == null && autoCreateObjectRule != null) {
			if (autoCreateObjectRule.execute(this)) {
				return createObject();
			}
		}
		return t;
	}

	public boolean hasNext() throws TuraException {
		if (blocked)
			return false;

		if (pager.listSize() == -1)
			pager.queryDS(0, pager.getLoadStep());

		if (currentPosition + 1 < pager.actualListSize())
			return true;
		else
			return false;

	}

	public void nextObject() throws TuraException {
		if (blocked)
			return;

		if (pager.listSize() == -1)
			pager.queryDS(0, pager.getLoadStep());

		if (currentPosition + 1 < pager.actualListSize()) {
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

		for (String relName : getRelationsName()) {
			Relation rel = this.getChild(relName);

			if ((rel.isCascade()) && (rel.getChild() == null)) {
				createChild(relName);
			}

			if ((rel.isCascade()) && (rel.getChild() != null)
					&& (rel.getChild().getCurrentObject() != null))
				rel.getChild().removeAll();
		}
		RowRemovedEvent event = new RowRemovedEvent(this,
				pager.getObject(currentPosition));
		this.pager.remove(currentPosition);
		if (currentPosition == pager.actualListSize())
			currentPosition--;

		notifyLiteners(event);
		notifyChageRecordAll(getCurrentObject());
	}

//	public String getObjectKey(Object object) throws TuraException {
//		ObjectControl obj = (ObjectControl) object;
//		return obj.getKey();
//	}

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
		T obj = pager.createObject(currentPosition);

		try {
			if (obj != null ) {
				if (getParent() != null){
				
					List<SearchCriteria> ls = getParent().getChildSearchCriteria();
					ObjectControl cnt = (ObjectControl) obj;
					Object wobj = cnt.getWrappedObject();

					for (SearchCriteria sc : ls ) {

						String name = sc.getName();
						String className = sc.getClassName();
						Object value = sc.getValue();
						if (!value.equals(Constants.UNDEFINED_PARAMETER)) {

							String method = "set"
									+ StringUtils.capitalize(name);

							Reflection.callTyped(wobj, method,
									Class.forName(className), value);
						}
					}
				}	
				notifyLiteners(new RowCreatedEvent(this, getCurrentObject()));
				notifyChageRecordAll(getCurrentObject());
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
		return obj;
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
			pager.queryDS(0, pager.getLoadStep());

		Object obj = pager.getObject((int) crtPosition);
		if (obj != null) {
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
		treeDataControl.addControl(this);
		this.addEventLiteners(treeDataControl);
	}

	public List<T> getScroller() {
		if (scroller == null){
			scroller = new Scroller<T>(pager);
		}
		return scroller;
	}

	
	public void islolate( ){
		pager.isolate();
	}
	
	public boolean isIsolated(){
		return pager.isIsolateed();
	}	
	
	public void flush() throws TuraException {

		for (IDataControl dc : commandStack.getPoolFlushAware()) {
			  dc.saveState();
		}

		pager.flush();

		for (IDataControl dc : commandStack.getPoolFlushAware()) {
			if (dc.getParent() == null && !(dc instanceof ChangeRecordListener) && dc.getTreeContext() == null)
				dc.onPoolUpdate();
		}
	}

	public void saveState()  throws TuraException {
		stateObject = getCurrentObject();
	}

	
	public void onPoolUpdate() throws TuraException {
		T newObject = getCurrentObject();
		String newObjectKey = null;
		String stateObjectKey = null;
		
		if (newObject != null )
		   newObjectKey = ((ObjectControl) newObject).getKey();
		if (stateObject != null )
		   stateObjectKey = ((ObjectControl) stateObject).getKey();

		if (((newObject == null) && (stateObject != null))
				|| ((newObject != null) && (stateObject == null))
				|| ( (newObjectKey != null) && (stateObjectKey != null) &&  !(newObjectKey.equals(stateObjectKey)))  ) {

			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(newObject);

		} else {
			for (Relation relation : children.values()) {
				if (relation.getChild() != null)
					((IDataControl) relation.getChild()).onPoolUpdate();
			}

			for (DependecyProperty dep : dependency) {
				Object o = getElResolver().getValue(dep.getExpression());
				if ( o instanceof IDataControl)
					((IDataControl)o).onPoolUpdate();
			}

		}

	}

	public List<SearchCriteria> getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(List<SearchCriteria> searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public List<OrderCriteria> getOrderCriteria() {
		return orderCriteria;
	}

	public void setOrderCriteria(List<OrderCriteria> orderCriteria) {
		this.orderCriteria = orderCriteria;
	}

	public void setPager(Pager<T> pager) {
		this.pager = pager;
	}

}
