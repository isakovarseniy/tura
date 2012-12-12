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
package org.elsoft.platform.datacontrol.metainfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.Constants;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.Mode;

public class Relation {

	private Mode<?> parent;
	private Mode<?> child;
	private boolean cascade = true;

	private ArrayList<PropertyLink> links = new ArrayList<PropertyLink>();

	public Mode<?> getParent() {
		return parent;
	}

	public void setParent(Mode<?> parent) {
		this.parent = parent;
	}

	public Mode<?> getChild() {
		return child;
	}

	public void setChild(Mode<?> child) {
		this.child = child;
	}

	public void setLink(String parentProp, String childProp) {
		links.add(new PropertyLink(parentProp, childProp));
	}

	public List<PropertyLink> getLinks() {
		return this.links;
	}

	@SuppressWarnings("unchecked")
	public List<SearchCriteria> getChildSearchCriteria() throws Exception {

		@SuppressWarnings("rawtypes")
		ArrayList scls = new ArrayList();

		Iterator<PropertyLink> itr = links.iterator();
		Object obj = parent.getControl().getCurrentObject();
		if (obj != null) {
			while (itr.hasNext()) {
				PropertyLink lnk = itr.next();
				String methodName = "get"
						+ StringUtils.capitalize(lnk.getParent());
				Method m = obj.getClass().getMethod(methodName, new Class[] {});
				Object value = m.invoke(obj, new Object[] {});
/*				if (value == null)
					throw new Exception(
							"Nullable value Cannot build search criteria");
*/
                if (value == null)
                	value = Constants.UNDEFINED_PARAMETER;
				SearchCriteria sc = new SearchCriteria();
				sc.setName(lnk.getChild());

				sc.setName(lnk.getChild());
				sc.setClassName(value.getClass().getName());
				sc.setValue(value.toString());
				sc.setComparator(ComparatorType.EQ.name());

				scls.add(sc);
			}
		}
		return scls;
	}

	public boolean isCascade() {
		return cascade;
	}

	public void setCascade(boolean cascade) {
		this.cascade = cascade;
	}

}
