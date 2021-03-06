/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.persistence;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.RepositoryHelper;

public class One2One implements RelOperation {

	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		String name = "set"+WordUtils.capitalize(property);
		Class<?> type = RepositoryHelper.getObjectType(detail);
		Method m = master.getClass().getMethod(name, type);
		m.invoke(master, detail);
	}

	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		String name = "set"+WordUtils.capitalize(property);
		Class<?> type = RepositoryHelper.getObjectType(detail);
		Method m = master.getClass().getMethod(name, type);
		m.invoke(master, new Object[]{null});
	}

	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List getChildren(Object object, String property) throws Exception {
		String methodName = "get"+WordUtils.capitalize(property);
		Method method = object.getClass().getMethod(methodName, new Class[]{});
		
		Object obj = method.invoke(object, new Object[]{});
		List list = new ArrayList<>();
		if (obj != null){
			list.add(obj);
		}
		return list;
	}

	@Override
	public void connect(Object master, Object detail) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public void disconnect(Object master, Object detail) throws Exception {
		throw new UnsupportedOperationException();
	}	
	
}
