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
package org.elsoft.platform.datacontrol.qry;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.datacontrol.DCMetaInfoLevel;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.Mode;
import org.elsoft.platform.datacontrol.Pager;
import org.elsoft.platform.datacontrol.metainfo.FunctionResult;

public class QryModeDataControl<T> extends DataControl<T> {

	private ArrayList<T> ls = new ArrayList<T>();
	private Object proxyObject;
	private Mode<T> mode;
	private static Logger logger = Logger.getLogger(QryModeDataControl.class
			.getName());

	public T getCurrentObject() {
		return ls.get(0);
	}

	public void nextObject() {

	}

	public void prevObject() {
	}

	public List<T> getList() {
		return ls;
	}

	public T getObject(int index) {
		if (index == 0)
			return ls.get(index);
		else
			return null;
	}

	public int getCurrentPosition() {
		return 0;
	}

	public static QryModeBeanWrapper getWrapperMethod(Object wrapper)
			throws Exception {

		Method m = wrapper.getClass().getMethod("getWrapper", new Class[] {});
		return (QryModeBeanWrapper) m.invoke(wrapper, new Object[] {});

	}

	@SuppressWarnings("unchecked")
	public T createObject() {
		try {

			getMode().getStControl().createObjectCommand(this);

			FunctionResult functionResult = (FunctionResult) getMode()
					.getStControl()
					.getAnnotation(getMode().getAnnotatedObject(),
							DCMetaInfoLevel.Class, DCMetaInfo.FunctionResult)
					.values().iterator().next();

			Object obj = getMode().getElResolver().getValue(
					functionResult.getResultExpression());

			ls = new ArrayList<T>();

			ls.add((T) QryModeBeanWrapper.newInstance(obj.getClass(), getMode()
					.getAnnotatedObject(), this));

			QryModeBeanWrapper w = getWrapperMethod(ls.get(0));
			w.setObj(obj);

			return ls.get(0);
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			return null;
		}
	}

	public void setRefresh(boolean refresh) {

	}

	public synchronized boolean testForRefresh() {
		return false;
	}

	public Object getProxyObject() {
		return this.proxyObject;
	}

	public void setMode(Mode<T> mode) {
		this.mode = mode;
	}

	public Mode<T> getMode() {
		return this.mode;
	}

	public List<SearchCriteria> getFilter() {
		return null;
	}

	public void setFilter(List<SearchCriteria> filter) {
	}

	public List<OrderCriteria> getOrderby() {
		return null;
	}

	public void setOrderby(List<OrderCriteria> orderby) {
	}

	public void removeObject() {
	}

	public void removeAll() throws Exception {
	}

	public boolean isRefresh() {
		return false;
	}

	public Pager<T> getPager() {
		return null;
	}

	public void initControl() throws Exception {
	}

	@Override
	public void cleanGhostObjects() throws Exception {
	}

}
