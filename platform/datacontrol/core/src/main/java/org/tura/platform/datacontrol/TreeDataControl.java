/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class TreeDataControl implements IDataControl, EventListener {

	protected List<DependecyProperty> dependency = new ArrayList<DependecyProperty>();
	private Relation parent;
	private Relation treeRelation;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();

	private ArrayList<EventListener> eventLiteners = new ArrayList<>();
	private HashMap<String, IDataControl> treeControls = new HashMap<>();

	private Object stateObject;
	private Object currentObject;
	private TreePath[] currentPosition;

	protected boolean blocked = false;

	private DataControl<?> root;

	
	public DataControl<?> getRoot() {
		return root;
	}

	public void setRoot(DataControl<?> root) {
		this.root = root;
		currentPosition = new TreePath[] { new TreePath(null, 0) };
		root.getCommandStack().getPoolFlushAware().add(this);
	}

	@Override
	public void setParent(Relation parent) throws TuraException {
		this.parent = parent;
		treeRelation = new Relation();
		treeRelation.setParent(this);
		treeRelation.setChild(root);
		treeRelation.getLinks().addAll(parent.getLinks());
		root.setParent(treeRelation);
	}

	@Override
	public Relation getChild(String relationName) {
		return children.get(relationName);
	}

	@Override
	public Collection<String> getRelationsName() {
		return children.keySet();
	}

	public void addEventLiteners(EventListener listener) {
		eventLiteners.add(listener);
	}

	@Override
	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		if (newCurrentObject == null) {
			blocked = true;
			notifyLiteners(new ControlRefreshedEvent(this));
			notifyChageRecordAll(null);
		}

		blocked = false;
		if (treeRelation != null)
			treeRelation.setMasterCurrentObject(newCurrentObject);
		currentObject = null;
		root.handleChangeMusterCurrentRecordNotification(newCurrentObject);

		notifyLiteners(new MasterRowChangedEvent(this, newCurrentObject));
		notifyChageRecordAll(getCurrentObject());
	}

	protected void notifyChageRecordAll(Object newCurrentObject)
			throws TuraException {
		notifyDependencyListeners(newCurrentObject);
	}

	private void notifyLiteners(Event event) throws TuraException {
		for (EventListener listener : eventLiteners) {
			listener.handleEventListener(event);
		}
	}

	private void notifyDependencyListeners(Object newCurrentObject)
			throws TuraException {
		for (DependecyProperty dep : dependency) {
			ChangeRecordListener listener = (ChangeRecordListener) root
					.getElResolver().getValue(dep.getExpression());
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	@Override
	public synchronized Object getCurrentObject() throws TuraException {
		if (blocked)
			return null;
		if (currentObject == null) {
			currentObject = root.getCurrentObject();
		}
		return currentObject;
	}

	public Object createChildObject(String relationName) throws TuraException {
		if (blocked)
			return null;
		Object obj = null;
		try {
			DataControl<?> dc = getRoot();
			if (currentObject != null) {
				BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
						"getWrapper"));
				dc = w.getDatacontrol();
			}
			Relation rel = dc.getChild(relationName);
			if (rel.getChild() == null)
				dc.createChild(relationName);
			obj = rel.getChild().createObject();
		} catch (Exception e) {
			throw new TuraException(e);
		}

		if (obj != null) {
			notifyLiteners(new RowCreatedEvent(this, obj));
			return obj;
		}
		throw new TuraException(
				"Error during creation new object for tree data control");

	}

	@Override
	public Object createObject() throws TuraException {
		if (blocked)
			return null;

		try {
			DataControl<?> dc = getRoot();
			if (currentObject != null) {
				BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
						"getWrapper"));
				dc = w.getDatacontrol();
			}

			currentObject = dc.createObject();
		} catch (Exception e) {
			throw new TuraException(e);
		}

		if (currentObject != null) {
			notifyLiteners(new RowCreatedEvent(this, currentObject));
			notifyChageRecordAll(currentObject);
		} else {
			throw new TuraException(
					"Error during creation new object for tree data control");
		}
		return currentObject;
	}

	@Override
	public void removeObject() throws Exception {
		if (blocked)
			return;

		BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
				"getWrapper"));
		DataControl<?> dc = w.getDatacontrol();

		RowRemovedEvent event = new RowRemovedEvent(this, currentObject);
		dc.removeObject();
		notifyLiteners(event);
		notifyChageRecordAll(dc.getCurrentObject());
	}

	@Override
	public void removeAll() throws Exception {
		if (blocked)
			return;

		setCurrentPosition(new TreePath[] { new TreePath(null, 0) });

		BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
				"getWrapper"));
		DataControl<?> dc = w.getDatacontrol();

		dc.removeAll();

		notifyLiteners(new RowRemovedEvent(this, null));
		notifyChageRecordAll(null);
	}

	private Object[] treeScaner(TreePath[] path) throws TuraException {
		IDataControl current = root;
		Object obj = null;
		for (int i = 0; i < path.length; i++) {
			int key = path[i].getKey();
			if (!current.setCurrentPosition(key))
				return new Object []{obj,false};
			Object tmp = current.getCurrentObject();
			if (tmp != null) {
				obj = tmp;
				if (i + 1 < path.length) {
					String relationName = path[i + 1].getRelation();
					if (current.getChild(relationName) != null) {
						Relation rel = current.getChild(relationName);
						if (rel.getChild() == null)
							current.createChild(relationName);
						current = rel.getChild();

					} else {
						return new Object []{obj,false};
					}
				}
			} else {
				return new Object []{obj,false};
			}
		}
		return new Object []{obj,true};

	}

	public synchronized boolean setCurrentPosition(Object o)
			throws TuraException {
		if (blocked)
			return false;

		Object[] a = treeScaner((TreePath[]) o);
		if ( !(boolean)a[1] )
			return false;

		currentObject = a[0];
		currentPosition = (TreePath[]) o;
		notifyLiteners(new RowChangedEvent(this));
		notifyChageRecordAll(currentObject);

		return true;
	}

	@Override
	public Object getCurrentPosition() {
		return currentPosition;
	}

	@Override
	public void createChild(String relationName) throws TuraException {
		throw new TuraException(
				"Tree data contol cannot has master - detail relations");
	}

	@Override
	public List<DependecyProperty> getDependency() {
		return dependency;
	}

	@Override
	public void setDependency(List<DependecyProperty> dependency) {
		this.dependency = dependency;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public TreeDataControl getTreeContext() {
		return null;
	}

	public void setTreeContext(TreeDataControl tdc) {
	}

	@Override
	public Relation getParent() {
		return parent;
	}

	@Override
	public void handleEventListener(Event event) throws TuraException {
		notifyLiteners(event);
	}

	public void addControl(DataControl<?> dc) {
		treeControls.put(dc.getId(), dc);
	}

	public HashMap<String, IDataControl> getControls() {
		return treeControls;
	}

	public void saveState() throws TuraException {
		stateObject = currentObject;
	}

	
	public void flush() throws TuraException {
	}	
	
	public void onPoolUpdate() throws TuraException {
		root.onPoolUpdate();
		Object[] a = treeScaner(currentPosition);
		Object newObject = a[0];

		String newObjectKey = null;
		String stateObjectKey = null;
		
		if (newObject != null )
			 newObjectKey = Util.getDataControl(newObject).getObjectKey(newObject);
		if (stateObject != null )
		    stateObjectKey = Util.getDataControl(stateObject).getObjectKey(stateObject);

		if (((newObject == null) && (stateObject != null))
				|| ((newObject != null) && (stateObject == null))
				|| !(newObjectKey.equals(stateObjectKey))) {

			currentObject = a[0];
			notifyLiteners(new RowChangedEvent(this));
			notifyChageRecordAll(newObject);

		}else{
			for (DependecyProperty dep : dependency) {
				Object o = root.getElResolver().getValue(dep.getExpression());
				if ( o instanceof IDataControl)
					((IDataControl)o).onPoolUpdate();
			}
			
		}

	}

}
