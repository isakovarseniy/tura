/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.repository.persistence;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.WordUtils;

public class Many2Many implements RelOperation{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		String name = "get"+WordUtils.capitalize(property);
		Method m = master.getClass().getMethod(name, new Class<?>[]{} );
		List list = (List) m.invoke(master, new Object[]{});
		if (list == null){
			list = new ArrayList<>();
			name = "set"+WordUtils.capitalize(property);
			m = master.getClass().getMethod(name, Collection.class );
			m.invoke(master, list);
		}
		
		list.add(detail);
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		String name = "get"+WordUtils.capitalize(property);
		Method m = master.getClass().getMethod(name, new Class<?>[]{} );
		List list = (List) m.invoke(master, new Object[]{});
		list.remove(detail);
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List getChildren(Object object, String property) throws Exception {
		String methodName = "get"+WordUtils.capitalize(property);
		Method method = object.getClass().getMethod(methodName, new Class[]{});
		
		List list = (List) method.invoke(object);
		if (list == null){
			return new ArrayList<>();
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
