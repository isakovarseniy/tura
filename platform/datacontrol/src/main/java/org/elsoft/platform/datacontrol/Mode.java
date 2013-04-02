/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.datacontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.datacontrol.metainfo.DefaultSearchCriteria;
import org.elsoft.platform.datacontrol.metainfo.Relation;

public class Mode<T> {

	private Relation parent = null;
	private HashMap<String, Relation> children = new HashMap<String, Relation>();
	private Integer currentMode = RootModeSwitch.INSERT_MODE;
	private Integer newMode = RootModeSwitch.INSERT_MODE;
	private HashMap<Integer, DataControl<T>> modeSwitch = new HashMap<Integer, DataControl<T>>();
	private HashMap<String, Activity> transition = new HashMap<String, Activity>();
	private HashMap<String, Object> dependency = new HashMap<String, Object>();
	private RootModeSwitch root;
	private ELResolver elResolver = null;
	private StructureControl stControl = null;
	private String object;
	private List<DefaultSearchCriteria> defaultFilter;
	private List<OrderCriteria> defaultOrderby;
	private Object extender;
	private Class<?> rootClass;
	private List<DCEventListener> refreshListeners = new ArrayList<DCEventListener>();

	public Class<?> getRootClass() {
		return rootClass;
	}

	public List<DCEventListener> getRefreshListeners() {
		return refreshListeners;
	}

	public void setRootClass(Class<?> rootClass) {
		this.rootClass = rootClass;
	}

	public HashMap<String, Object> getDependency() {
		return dependency;
	}

	public void setDependency(HashMap<String, Object> dependency) {
		this.dependency = dependency;
	}

	public void addMode(Integer mode, DataControl<T> dc, boolean isDefault)
			throws Exception {
		modeSwitch.put(mode, dc);
		dc.setMode(this);
		dc.initControl();
		if (isDefault) {
			currentMode = mode;
			newMode = mode;
		}
	}

	public HashMap<Integer, DataControl<T>> getControls() {
		return modeSwitch;
	}

	public void addTransition(Integer mode1, Integer mode2, Activity activity) {
		transition.put(mode1.toString() + "-" + mode2.toString(), activity);
	}

	public void setMode(Integer newMode) {
		this.newMode = newMode;
		this.getControl();

		Collection<Relation> relCol = this.getChildrens();
		Iterator<Relation> itr = relCol.iterator();
		while (itr.hasNext()) {
			Mode<?> cm = itr.next().getChild();
			if (cm != null) // It can be null for self-relation
				cm.setMode(this.currentMode);
		}
	}

	public Integer getMode() {
		return this.currentMode;
	}

	public DataControl<T> getControl() {
		Integer toMode = this.newMode;
		if (toMode == null)
			return null;
		if (toMode.equals(currentMode)) {
			return modeSwitch.get(currentMode);
		} else {
			Activity activity = transition.get(currentMode.toString() + "-"
					+ toMode.toString());
			if (activity != null) {
				if (activity.execute(modeSwitch.get(currentMode),
						modeSwitch.get(toMode)))
					currentMode = toMode;
			} else
				currentMode = toMode;
			return modeSwitch.get(currentMode);
		}
	}

	public Relation getParent() {
		return parent;
	}

	public void setParent(Relation parent) {
		this.parent = parent;
	}

	public Relation getChildren(String relationName) {
		return children.get(relationName);
	}

	public Collection<Relation> getChildrens() {
		return children.values();
	}

	public Set<String> getRelationsName() {
		return children.keySet();
	}

	public void addChildren(String relationName, Relation relation) {
		children.put(relationName, relation);
		relation.setParent(this);
		if (relation.getChild() != null)
			relation.getChild().setParent(relation);
	}

	public RootModeSwitch getRoot() {
		return root;
	}

	public void setRoot(RootModeSwitch root) {
		this.root = root;
		root.addRootMode(this);
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public void setElResolver(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	public StructureControl getStControl() {
		return stControl;
	}

	public void setStControl(StructureControl stControl) {
		this.stControl = stControl;
	}

	public String getAnnotatedObject() {
		return object;
	}

	public void setAnnotatedObject(String object) {
		this.object = object;
	}

	public List<DefaultSearchCriteria> getDefaultFilter() {
		return defaultFilter;
	}

	public void setDefaultFilter(List<DefaultSearchCriteria> defaultFilter) {
		this.defaultFilter = defaultFilter;
	}

	public List<OrderCriteria> getDefaultOrderby() {
		return defaultOrderby;
	}

	public void setDefaultOrderby(List<OrderCriteria> defaultOrderby) {
		this.defaultOrderby = defaultOrderby;
	}

	public Object getExtender() {
		return extender;
	}

	public void setExtender(Object extender) {
		this.extender = extender;
	}

}
