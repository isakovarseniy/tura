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
package org.tura.platform.datacontrol.metainfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;

import com.octo.java.sql.exp.Operator;

public class Relation {

	private IDataControl parent;
	private IDataControl child;
	private Object masterCurrentObject;
	private boolean cascade = true;
	private String name;

	private ArrayList<PropertyLink> links = new ArrayList<PropertyLink>();

	public IDataControl getParent() throws TuraException {
		return parent;
	}

	public void setParent(IDataControl parent) throws TuraException {
		this.parent = parent;
	}

	public IDataControl getChild() {
		return child;

	}

	public void setChild(IDataControl child) throws TuraException {
		this.child = child;
	}

	public void setLink(String parentProp, String childProp) {
		links.add(new PropertyLink(parentProp, childProp));
	}

	public List<PropertyLink> getLinks() {
		return this.links;
	}

	public boolean isCascade() {
		return cascade;
	}

	public void setCascade(boolean cascade) {
		this.cascade = cascade;
	}

	public Object getMasterCurrentObject() throws TuraException {
		// if (masterCurrentObject == null)
		// masterCurrentObject = getParent().getCurrentObject();
		return masterCurrentObject;
	}

	public void setMasterCurrentObject(Object masterCurrentObject) {
		this.masterCurrentObject = masterCurrentObject;
	}

	public void loadMasterObject() throws TuraException{
		if (masterCurrentObject == null){
			masterCurrentObject = getParent().getCurrentObject();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<SearchCriteria> getChildSearchCriteria()
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, TuraException {

		@SuppressWarnings("rawtypes")
		ArrayList scls = new ArrayList();

		Iterator<PropertyLink> itr = links.iterator();
		loadMasterObject();
		if (masterCurrentObject != null) {
			while (itr.hasNext()) {
				PropertyLink lnk = itr.next();
				String methodName = "get"
						+ StringUtils.capitalize(lnk.getParent());
				Method m = masterCurrentObject.getClass().getMethod(methodName,
						new Class[] {});
				Object value = m.invoke(masterCurrentObject, new Object[] {});
				if (value == null)
					value = Constants.UNDEFINED_PARAMETER;
				SearchCriteria sc = new SearchCriteria();
				sc.setName(lnk.getChild());

				sc.setName(lnk.getChild());
				sc.setClassName(value.getClass().getName());
				sc.setValue(value);
				sc.setComparator(Operator.EQ.name());

				scls.add(sc);
			}
		} else {
			PropertyLink lnk = itr.next();

			SearchCriteria sc = new SearchCriteria();
			sc.setName(lnk.getChild());

			Object value = Constants.UNDEFINED_PARAMETER;
			sc.setName(lnk.getChild());
			sc.setClassName(value.getClass().getName());
			sc.setValue(value.toString());

			scls.add(sc);

		}
		return scls;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
