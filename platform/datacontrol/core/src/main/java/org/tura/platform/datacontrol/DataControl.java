/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.platform.datacontrol.commons.OrderCriteria;
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
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;

public abstract class DataControl<T> extends MetaInfoHolder<T> implements IDataControl {

	private static final long serialVersionUID = 5969220022228857404L;
	private String id = UUID.randomUUID().toString();

	private TreeDataControl treeDataControl;

	private ArrayList<EventListener> eventLiteners = new ArrayList<>();

	protected List<SearchCriteria> searchCriteria;
	protected List<OrderCriteria> orderCriteria;
	protected CpaStorageProvider cpaStorageProvider;

	private Pager<T> pager;
	private int currentPosition = 0;
	private boolean isoleted;

	protected Object commandResultHolder;

	public void addEventLiteners(EventListener listener) {
		eventLiteners.add(listener);
	}

	public void forceRefresh() throws TuraException {
		currentPosition = 0;
		pager.cleanPager();
		notifyLiteners(new ControlRefreshedEvent(this));
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	@SuppressWarnings("unchecked")
	public void handleChangeMusterCurrentRecordNotification(Object newMastertObject) throws TuraException {
		pager.cleanPager();
		currentPosition = 0;
		Object  newCurrentObject  = pager.getObject(currentPosition);
		notifyLiteners(new MasterRowChangedEvent(this, newCurrentObject));
		notifyChageRecordAll((T) newCurrentObject);
	}

	protected void notifyChageRecordAll(T newCurrentObject) throws TuraException {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyDependencyListeners(newCurrentObject);
	}

	private void notifyDependencyListeners(Object newCurrentObject) throws TuraException {
		for (DependecyProperty dep : dependency) {
			ChangeRecordListener listener = (ChangeRecordListener) getElResolver().getValue(dep.getExpression());
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	public void notifyLiteners(Event event) throws TuraException {
		for (EventListener listener : eventLiteners) {
			if (listener != null)
				listener.handleEventListener(event);
		}
	}

	private void notifyChildrenDataControlsChangeCurrentRecord(T newCurrentObject) throws TuraException {
		boolean isChildrenUpdated = false;
		for (Relation relation : children.values()) {
			boolean isNew = Helper.isNewObject(newCurrentObject, relation.getMasterCurrentObject());
			if (isNew) {
				isChildrenUpdated = true;
				relation.setMasterCurrentObject(newCurrentObject);
				if (relation.getChild() != null) {
					((IDataControl) relation.getChild()).handleChangeMusterCurrentRecordNotification(newCurrentObject);
				}
			}
		}
		if  ( !isChildrenUpdated && treeDataControl !=  null  &&  treeDataControl.getScanerSection() == 0) {
			treeDataControl.lastControlUpdate();
		}
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public T getCurrentObject() throws TuraException {
		T t = null;
		long beforeSize = pager.size();
		long afterSize = beforeSize;
		if (currentPosition < beforeSize) {
			t = pager.getObject(currentPosition);
			afterSize = pager.size();
			if ( currentPosition >= afterSize && afterSize > 0) {
				currentPosition = (int) (afterSize-1);
				t = pager.getObject(currentPosition);
			}
		}
		if (t == null && autoCreateObjectRule != null &&  currentPosition ==  0) {
			if (autoCreateObjectRule.execute(this)) {
				return createObject();
			}
		}
		if (beforeSize != afterSize) {
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(t);
		}
		return t;
	}

	public boolean hasNext() throws TuraException {
		if (currentPosition + 1 < pager.size())
			return true;
		else
			return false;

	}

	public void nextObject() throws TuraException {

		if (currentPosition + 1 < pager.size()) {
			currentPosition++;
			T newRecord = pager.getObject(currentPosition);
			notifyLiteners(new RowChangedEvent(this));
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
			T newRecord = pager.getObject(currentPosition);
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception {
		for (String relName : getRelationsName()) {
			Relation rel = this.getChild(relName);

			if ((rel.isCascade()) && (rel.getChild() == null)) {
				createChild(relName);
			}

			if ((rel.isCascade()) && (rel.getChild() != null) && (rel.getChild().getCurrentObject() != null))
				rel.getChild().removeAll();
		}
		RowRemovedEvent event = new RowRemovedEvent(this, pager.getObject(currentPosition));
		this.pager.remove(currentPosition);
		if (currentPosition == pager.size() && currentPosition != 0)
			currentPosition--;

		notifyLiteners(event);
		notifyChageRecordAll(getCurrentObject());
	}

	public void removeAll() throws Exception {
		T obj = null;
		do {
			obj = getCurrentObject();
			if (obj != null) {
				removeObject();
			}
		} while (obj != null);
	}

	public T createObject() throws TuraException {
		// Bring all new object in datacontrol
		pager.getObject(currentPosition);

		// Create a new object
		pager.createObject(currentPosition);

		// Bring created object in datacontrol
		T obj = pager.getObject(currentPosition);

		try {
			if (obj != null) {
				notifyLiteners(new RowCreatedEvent(this, getCurrentObject()));
				notifyChageRecordAll(getCurrentObject());
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
		return obj;
	}

	public Integer getCurrentPosition() {
		return currentPosition;
	}

	@Override
	public boolean setCurrentPosition(Object crtPosition) throws TuraException {
		Object obj = null;
		try {
			obj = pager.getObject((int) crtPosition);
		} catch (Exception IndexOutOfBoundsException) {
			return false;
		}

		if (obj != null) {
			this.currentPosition = (int) crtPosition;
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(getCurrentObject());
			return true;
		} else
			return false;
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

	public String getId() {
		return id;
	}

	public boolean isIsoleted() {
		return isoleted;
	}

	public void setIsoleted(boolean isoleted) {
		this.isoleted = isoleted;
	}

	public TreeDataControl getTreeContext() {
		return treeDataControl;
	}

	public void setTreeContext(TreeDataControl tdc) {
		treeDataControl = tdc;
		treeDataControl.addControl(this);
		this.addEventLiteners(treeDataControl);
	}

	public List<T> getScroller() throws TuraException {
		return pager.getScroller();
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

	public Pager<T> getPager() {
		return this.pager;
	}

	public CpaStorageProvider getCpaStorageProvider() {
		return cpaStorageProvider;
	}

	public void setCpaStorageProvider(CpaStorageProvider cpaStorageProvider) {
		this.cpaStorageProvider = cpaStorageProvider;
	}

	@Override
	public Object findObject(RepoKeyPath key) throws TuraException {
		return pager.findObject(key);
	}

}
