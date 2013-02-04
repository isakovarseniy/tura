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
package org.elsoft.platform.datacontrol.ins;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;


import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.Constants;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.Pager;
import org.elsoft.platform.datacontrol.extender.ModeExtender;
import org.elsoft.platform.datacontrol.metainfo.Relation;

public class InsModeDataControl<T> extends DataControl<T> {

	private String uuid = UUID.randomUUID().toString();
	private int ghostCounter = 0;
	private int currentPosition = 0;
	private boolean refresh = false;
	private Object savedCarentParent = null;
	private Pager<T> pager;
	private Mode<T> mode;
	@SuppressWarnings("rawtypes")
	private List filter;
	@SuppressWarnings("rawtypes")
	private List orderby;
	private static Logger logger = Logger.getLogger(InsModeDataControl.class
			.getName());

	public void initControl() throws Exception {
		this.pager = new Pager<T>(this);
	}

	public T getCurrentObject() {
		return getObject(currentPosition);
	}

	public void nextObject() {
		if (getCurrentObject() != null) {
			currentPosition++;
		}
	}

	
	public synchronized void incGhostCounter(){
		ghostCounter++;
		this.mode.getStControl().addGhostObjectsControls(uuid, this);
	}

	public  synchronized void decGhostCounter(){
		ghostCounter--;
		if (ghostCounter == 0)
		   this.mode.getStControl().removeGhostObjectsControls(uuid);
	}
	
	public  synchronized void cleanGhost(){
		ghostCounter =0;
		this.mode.getStControl().removeGhostObjectsControls(uuid);
	}
	
	public  synchronized void cleanGhostObjects() throws Exception{
		if (ghostCounter < 0)
			throw new Exception ("ghostCounter < 0");

		ghostCounter =0;
		this.mode.getStControl().removeGhostObjectsControls(uuid);
	}

	
	
	public  synchronized void setGhostCounter(){
		ghostCounter =0;
	}
	
	public void prevObject() {
		if (currentPosition > 0)
			currentPosition--;
	}

	public void removeObject() throws Exception {

		Collection<String> ls = this.getMode().getRelationsName();

		if (ls != null) {
			Iterator<String> itr = ls.iterator();
			while (itr.hasNext()) {
				String relName = itr.next();
				Relation rel = this.getMode().getChildren(relName);

				if ((rel.isCascade()) && (rel.getChild() == null)) {
					Object extender = this.getMode().getExtender();
					ModeExtender mdExt = (ModeExtender) Reflection.call(
							extender, "getWrapper");
					Reflection.call(extender, mdExt.getRelationMethod(relName));
				}

				if ((rel.isCascade())
						&& (rel.getChild() != null)
						&& (rel.getChild().getControl().getCurrentObject() != null))
					rel.getChild().getControl().removeAll();
			}
		}
		this.pager.remove(currentPosition);
	}

	public void removeAll() throws Exception {
		this.setRefresh(true);
		T obj = null;
		int i = 0;
		do {
			obj = this.getObject(i * Pager.LOADSTEP);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj = this.getObject(i * Pager.LOADSTEP);
			}
		} while (obj != null);

	}

	public List<T> getList() {
		this.currentPosition = 0;
		return new ObjectIterator<T>(this, pager);
	}

	public boolean isRefresh() {
		return refresh;
	}

	public synchronized boolean testForRefresh() {
		boolean saveRefresh = isRefresh();
		Object saveSavedObject = this.savedCarentParent;

		if (mode.getParent() != null)
			checkParenObject(mode.getParent().getParent().getControl()
					.getCurrentObject());

		if (!isRefresh()) {
			if (this.isUpdated()) {
				this.setRefresh(true);
			}
		}

		boolean resultRefresh = isRefresh();
		this.savedCarentParent = saveSavedObject;

		setRefresh(saveRefresh);

		return resultRefresh;
	}

	public synchronized T getObject(int index) {

		if (mode.getParent() != null)
			checkParenObject(mode.getParent().getParent().getControl()
					.getCurrentObject());

		
		boolean flagUpdate = this.isUpdated(); 
		
		if (!isRefresh()) {
			if (flagUpdate) {
				this.setRefresh(true);
			}
		}

		if (isRefresh()) {
			currentPosition = 0;
			index = 0;
		}

		T obj = pager.getObject(index);
		this.currentPosition = index;
		this.setRefresh(false);
		return obj;
	}

	public T createObject() {
		// Refresh tree
		getObject(currentPosition);

		// Create a new object
		T objWrp = pager.createObject(currentPosition);

		try {
			if (objWrp != null) {
				if (mode.getParent() != null) {
					InsModeBeanWrapper w  =((InsModeBeanWrapper) Reflection.call(objWrp,
							"getWrapper"));
					Object  obj = w.getObj();
					
					List<SearchCriteria> ls = mode.getParent()
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

	public void setRefresh(boolean refresh) {
		this.refresh = refresh;
	}

	private void checkParenObject(Object obj) {
		if ((savedCarentParent == null) && (obj != null))
			this.setRefresh(true);

		if ((savedCarentParent != null) && (obj == null))
			this.setRefresh(true);
		if ((savedCarentParent != null) && (obj != null)) {
			try {
				Object obj1 = ((InsModeBeanWrapper) Reflection.call(
						savedCarentParent, "getWrapper")).getDatacontrol()
						.getObjectKey(savedCarentParent);
				Object obj2 = ((InsModeBeanWrapper) Reflection.call(obj,
						"getWrapper")).getDatacontrol().getObjectKey(obj);

				if (!obj1.equals(obj2)) {
					this.setRefresh(true);
				}
			} catch (Exception e) {
				this.setRefresh(false);
			}
		}
		savedCarentParent = obj;
	}

	private boolean isUpdated() {
		boolean isUpdated = false;

		if (mode.getElResolver() != null) {

			HashMap<String, Object> dependencyStore = getMode().getDependency();
			Set<String> en = dependencyStore.keySet();
			Iterator<String> itr = en.iterator();
			while (itr.hasNext()) {
				String resourceName = (String) itr.next();
				Object newObj = mode.getElResolver().getValue(resourceName);

				Object storeObj = dependencyStore.get(resourceName);

				if (((newObj == null) && (!storeObj.equals("")))) {
					isUpdated = true;
					dependencyStore.put(resourceName, "");
					continue;
				}
				if ((newObj != null)) {
					if (!newObj.toString().equals(storeObj.toString())) {
						isUpdated = true;
						dependencyStore.put(resourceName, newObj);
						continue;
					}
				}
			}
		}
		return isUpdated;
	}

	public void setMode(Mode<T> mode) {
		this.mode = mode;
	}

	public Mode<T> getMode() {
		return this.mode;
	}

	@SuppressWarnings("unchecked")
	public List<SearchCriteria> getFilter() {
		return filter;
	}

	public void setFilter(List<SearchCriteria> filter) {
		this.filter = filter;
	}

	@SuppressWarnings("unchecked")
	public List<OrderCriteria> getOrderby() {
		return orderby;
	}

	public void setOrderby(List<OrderCriteria> orderby) {
		this.orderby = orderby;
	}

	public Pager<T> getPager() {
		return pager;
	}

}
