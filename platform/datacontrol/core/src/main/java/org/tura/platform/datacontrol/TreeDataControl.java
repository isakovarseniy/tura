package org.tura.platform.datacontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.metainfo.Relation;

public class TreeDataControl implements IDataControl {

	protected HashMap<String, Object> dependency = new HashMap<String, Object>();
	@SuppressWarnings("unused")
	private Relation parent;
	protected HashMap<String, Relation> children = new HashMap<String, Relation>();
	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();
	private Object currentObject;

	private DataControl<?> root;

	public DataControl<?> getRoot() {
		return root;
	}

	public void setRoot(DataControl<?> root) {
		this.root = root;
	}

	@Override
	public void setParent(Relation parent) {
		this.parent = parent;
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
	public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) throws TuraException {
		root.handleChangeMusterCurrentRecordNotification(newCurrentObject);
	}

	private void notifyChangeRecordLiteners(Object newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}
	}

	@Override
	public Object getCurrentObject() throws TuraException {
		if (currentObject == null) {
			currentObject = root.getCurrentObject();
		}
		return currentObject;
	}

	@Override
	public Object createObject() throws TuraException {
		try {
			BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
					"getWrapper"));
			DataControl<?> dc = w.getDatacontrol();
			currentObject = dc.createObject();
		} catch (Exception e) {
			throw new TuraException(e);
		}

		if (currentObject != null) {
			notifyChangeRecordLiteners(currentObject);
		} else {
			throw new TuraException(
					"Error during creation new object for tree data control");
		}
		return currentObject;
	}

	@Override
	public void removeObject() throws Exception {
		BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
				"getWrapper"));
		DataControl<?> dc = w.getDatacontrol();
		dc.removeObject();
		notifyChangeRecordLiteners(dc.getCurrentObject());
	}

	@Override
	public void removeAll() throws Exception {
		BeanWrapper w = ((BeanWrapper) Reflection.call(currentObject,
				"getWrapper"));
		DataControl<?> dc = w.getDatacontrol();
		dc.removeAll();
		notifyChangeRecordLiteners(dc.getCurrentObject());
	}

	public void setCurrentPosition(Object o) throws TuraException {
		int[] path = (int[]) o;
		IDataControl current = root;
		Object obj = null;
		for (int i = 0; i < path.length; i++) {
			int key = path[i];
			current.setCurrentPosition(key);
			obj = current.getCurrentObject();
			if (obj != null) {
				if (i + 1 < path.length) {
					Collection<String> names = current.getRelationsName();
					if (names != null && names.size() > 0) {
						String relationName = names.iterator().next();
						Relation rel = current.getChild(relationName);
						if (rel.getChild() == null)
							current.createChild(current, relationName, rel);
						current = rel.getChild();

					} else {
						throw new TuraException(
								"Cannot set path for tree data control");
					}
				}
			} else {
				throw new TuraException("Cannot set path for tree data control");
			}

		}
		currentObject = obj;
		notifyChangeRecordLiteners(obj);
	}

	@Override
	public final void createChild(IDataControl dc, String relationName,
			Relation relation) throws TuraException {
		throw new TuraException(
				"Tree data contol cannot has master - detail relations");
	}

}
