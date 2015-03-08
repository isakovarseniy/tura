package org.tura.platform.datacontrol;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class TreeDataControl implements IDataControl {

	protected List<DependecyProperty> dependency = new ArrayList<DependecyProperty>();
	private Relation parent;
	private Relation treeRelation = new Relation();
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();
	private ArrayList<ChangeRecordListener> musterCurrentRecordChageLiteners = new ArrayList<>();

	private Object currentObject;
	private IDataControl currentControl;
	private Object currentPosition;

	protected boolean blocked = false;

	private DataControl<?> root;

	public DataControl<?> getRoot() {
		return root;
	}

	public void setRoot(DataControl<?> root) {
		this.root = root;
		this.currentControl = root;
		root.setParent(treeRelation);
		currentPosition = new Object[]{0};
	}

	@Override
	public void setParent(Relation parent) throws TuraException {
		this.parent = parent;
		treeRelation.setParent(this);
		treeRelation.setChild(root);
		treeRelation.getLinks().addAll(parent.getLinks());
	}

	@Override
	public Relation getChild(String relationName) {
		return children.get(relationName);
	}

	@Override
	public Collection<String> getRelationsName() {
		return children.keySet();
	}

	@Override
	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

	@Override
	public void addMusterCurrentRecordChageLiteners(
			ChangeRecordListener listener) {
		musterCurrentRecordChageLiteners.add(listener);
	}

	@Override
	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		if (newCurrentObject == null) {
			blocked = true;
			notifyChageRecordAll(null);
		}

		blocked = false;
		treeRelation.setMasterCurrentObject(newCurrentObject);
		currentObject = null;
		root.handleChangeMusterCurrentRecordNotification(newCurrentObject);

		notifyMusterCurrentRecordChageLiteners(newCurrentObject);
		notifyChageRecordAll(getCurrentObject());
	}

	private void notifyMusterCurrentRecordChageLiteners(Object newCurrentObject)
			throws TuraException {
		for (ChangeRecordListener listener : musterCurrentRecordChageLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	public IDataControl getCurrentControl() {
		return currentControl;
	}

	public void setCurrentControl(IDataControl currentControl) {
		this.currentControl = currentControl;
	}

	protected void notifyChageRecordAll(Object newCurrentObject)
			throws TuraException {
		notifyChangeRecordLiteners(newCurrentObject);
		notifyDependencyListeners(newCurrentObject);
	}

	private void notifyChangeRecordLiteners(Object newCurrentObject)
			throws TuraException {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
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
			treeRelation
					.setMasterCurrentObject(parent.getMasterCurrentObject());
			currentObject = root.getCurrentObject();
		}
		return currentObject;
	}

	@Override
	public Object createObject() throws TuraException {
		if (blocked)
			return null;

		try {
			BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
					"getWrapper"));
			DataControl<?> dc = w.getDatacontrol();
			currentObject = dc.createObject();
		} catch (Exception e) {
			throw new TuraException(e);
		}

		if (currentObject != null) {
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
		dc.removeObject();
		notifyChageRecordAll(dc.getCurrentObject());
	}

	@Override
	public void removeAll() throws Exception {
		if (blocked)
			return;

		BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
				"getWrapper"));
		DataControl<?> dc = w.getDatacontrol();
		dc.removeAll();
		notifyChangeRecordLiteners(dc.getCurrentObject());
	}

	public synchronized boolean setCurrentPosition(Object o)
			throws TuraException {
		if (blocked)
			return false;

		int[] path = (int[]) o;
		IDataControl current = root;
		Object obj = null;
		for (int i = 0; i < path.length; i++) {
			int key = path[i];
			if (!current.setCurrentPosition(key))
				return false;
			obj = current.getCurrentObject();
			if (obj != null) {
				if (i + 1 < path.length) {
					Collection<String> names = current.getRelationsName();
					if (names != null && names.size() > 0) {
						String relationName = names.iterator().next();
						Relation rel = current.getChild(relationName);
						if (rel.getChild() == null)
							current.createChild(relationName);
						current = rel.getChild();

					} else {
						BeanWrapper w;
						try {
							w = ((BeanWrapper) Reflection.call(currentObject,
									"getWrapper"));
							current = w.getDatacontrol();
						} catch (NoSuchMethodException | SecurityException
								| IllegalAccessException
								| IllegalArgumentException
								| InvocationTargetException e) {
							throw new TuraException(e);
						}
						return false;
					}
				}
			} else {
				BeanWrapper w;
				try {
					w = ((BeanWrapper) Reflection.call(currentObject,
							"getWrapper"));
					current = w.getDatacontrol();
				} catch (NoSuchMethodException | SecurityException
						| IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					throw new TuraException(e);
				}
				return false;
			}

		}
		currentObject = obj;
		currentPosition = o;
		notifyChageRecordAll(obj);
		
		return true;
	}
	
	@Override
	public Object getCurrentPosition(){
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

}
