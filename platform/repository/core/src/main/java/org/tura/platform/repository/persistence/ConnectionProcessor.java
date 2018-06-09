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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Connection;
import org.tura.platform.repository.core.annotation.Link;

public class ConnectionProcessor implements RelOperation{
	private static String SRC = "src";
	public static String MASTER = "MASTER";
	public static String DETAIL = "DETAIL";
	
	private Connection connection;
	private Association association;

	public ConnectionProcessor(Connection connection, Association association){
		this.connection = connection;
		this.association = association;
	}
	
	@Override
	public void connect(Object master, Object detail, String property) throws Exception {
		throw new UnsupportedOperationException();
	}
	
	public void connect(Object obj1, Object obj2) throws Exception {
		Map<String,Object> h = sortObject(obj1, obj2);
		Object master = h.get(MASTER);
		Object detail = h.get(DETAIL);
		
		for ( Link lnk : connection.links()) {
			String srcName = "get"+WordUtils.capitalize(lnk.field1());
			Method srcM = master.getClass().getDeclaredMethod(srcName, new Class<?>[]{} );
			Object value = srcM.invoke(master);
			
			String trgName = "set"+WordUtils.capitalize(lnk.field2());
			Method trgM = detail.getClass().getDeclaredMethod(trgName, new Class<?>[]{value.getClass()});
			
			trgM.invoke(detail, value);
			
		}
		
	}
	

	public void disconnect(Object obj1, Object obj2) throws Exception {
		Map<String,Object> h = sortObject(obj1, obj2);
		Object master = h.get(MASTER);
		Object detail = h.get(DETAIL);
		
		for ( Link lnk : connection.links()) {
			String trgGetName = "get"+WordUtils.capitalize(lnk.field1());
			Method trgGetM = master.getClass().getDeclaredMethod(trgGetName, new Class<?>[]{} );
			
			String trgSetName = "set"+WordUtils.capitalize(lnk.field2());
			Method trgM = detail.getClass().getDeclaredMethod(trgSetName, new Class<?>[]{trgGetM.getReturnType()});
			trgM.invoke(detail, new Object[] {null});

			
		}
	}
	
	
	@Override
	public void disconnect(Object master, Object detail, String property) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<?> getChildren(Object object, String property) throws Exception {
		throw new UnsupportedOperationException();
	}

	private Map<String, Object> sortObject(Object obj1, Object obj2){
		Map<String,Object> h = new HashMap<>();
		if (connection.type().equals( SRC)){
			if (obj1.getClass().equals(association.mappedBy())) {
				h.put(MASTER, obj2);
				h.put(DETAIL, obj1);
				return h;
			}else{
				h.put(MASTER, obj1);
				h.put(DETAIL, obj2);
				return h;
			}
		}else{
			if (obj1.getClass().equals(association.mappedBy())) {
				h.put(MASTER, obj1);
				h.put(DETAIL, obj2);
				return h;
			}else{
				h.put(MASTER, obj2);
				h.put(DETAIL, obj1);
				return h;
			}
		}
	}
	
	public Map<String, Class<?>> sortObject(Class<?> obj1, Class<?> obj2){
		Map<String,Class<?>> h = new HashMap<>();
		if (connection.type().equals( SRC)){
			if (obj1.equals(association.mappedBy())) {
				h.put(MASTER, obj2);
				h.put(DETAIL, obj1);
				return h;
			}else{
				h.put(MASTER, obj1);
				h.put(DETAIL, obj2);
				return h;
			}
		}else{
			if (obj1.equals(association.mappedBy())) {
				h.put(MASTER, obj1);
				h.put(DETAIL, obj2);
				return h;
			}else{
				h.put(MASTER, obj2);
				h.put(DETAIL, obj1);
				return h;
			}
		}
	}

}

