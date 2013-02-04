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

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SearchCriteria;



public abstract class DataControl<T> {

//	public Object getProxyObject();


	public abstract boolean testForRefresh();
	
	public abstract T getCurrentObject();

	public abstract void nextObject();

	public abstract void prevObject();
	
	public abstract void removeObject() throws Exception;

	public abstract void removeAll() throws Exception;
	
	public abstract List<T> getList();

	public abstract boolean isRefresh();

	public abstract  T getObject(int index);

	public abstract T createObject();

	public abstract int getCurrentPosition();

	public abstract void setRefresh(boolean refresh);

	public abstract void setMode(Mode<T> mode);

	public abstract Mode<T> getMode();

	public abstract List<SearchCriteria> getFilter();

	public abstract void setFilter(List<SearchCriteria> filter);

	public abstract List<OrderCriteria> getOrderby();

	public abstract void setOrderby(List<OrderCriteria> orderby);
	
	public abstract Pager<T> getPager();
	
	public abstract void initControl() throws Exception;
	
	public abstract void cleanGhostObjects() throws Exception; 
	
	public String getObjectKey(Object object) {

		String clazz = this.getMode().getAnnotatedObject();

		StringBuffer key = new StringBuffer();
		Iterator<String> itr = this.getMode()
				.getStControl()
				.getAnnotation(clazz, DCMetaInfoLevel.Field, DCMetaInfo.Id)
				.keySet().iterator();
		while (itr.hasNext()) {
			String method = "get" + StringUtils.capitalize(itr.next());
			key.append(Reflection.call(object, method));
			key.append(" ");
		}
		return key.toString();
	}
	
	
	
}
