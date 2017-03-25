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
package org.tura.platform.datacontrol;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

public class Util {
	
	public static Object unwrapObject(Object wrappedObject) throws Exception{
		BeanWrapper w = (BeanWrapper) Reflection.call(wrappedObject, "getWrapper");
		return w.getObj();
		
	}

	

	@SuppressWarnings({ "rawtypes" })
	public static Object convertobject(Object obj, DataControl datacontrol)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		return convertobject(obj,datacontrol,false);

	}

	
	@SuppressWarnings({ "rawtypes" })
	public static Object convertobject(Object obj, DataControl datacontrol, boolean isCreated)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Object wrapper = BeanWrapper.newInstance(obj.getClass(), datacontrol);
		BeanWrapper w = (BeanWrapper) Reflection.call(wrapper, "getWrapper");

		w.setObj(obj);
		w.setDatacontrol(datacontrol);
		w.setInsertMode(isCreated);

		return wrapper;

	}	
	
	public static DataControl<?> getDataControl(Object obj) throws  TuraException{
		try {
			BeanWrapper w = ((BeanWrapper) Reflection.call(obj, "getWrapper"));
			return w.getDatacontrol();
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException
				| IllegalArgumentException
				| InvocationTargetException e) {
			throw new TuraException(e);
		}
	}

	public static  String makeSetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "set"+StringUtils.capitalize(property);

	}
	
	public static String makeGetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "get"+StringUtils.capitalize(property);

	}
	
	
}
