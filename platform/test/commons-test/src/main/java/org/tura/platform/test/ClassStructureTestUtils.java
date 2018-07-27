/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassStructureTestUtils {
	
	public static boolean findMethod(Class<?> clazz, String method,Class<?>... parameters){
		Method  m=null;
		try{
		    m = clazz.getDeclaredMethod(method, parameters);
		}catch(Exception e){
			return false;
		}
		if (m != null)
		   return true;
		else 
			return false;
	}
	
	public static Method getMethod(Class<?> clazz, String method,Class<?>... parameters){
		Method  m=null;
		try{
		    m = clazz.getDeclaredMethod(method, parameters);
		    return m;
		}catch(Exception e){
			return null;
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Annotation findFieldAnnotation(Class<?> clazz, Class  annotation ,String method,Class<?>... parameters){
		Method  m=null;
		try{
		    m = clazz.getDeclaredMethod(method, parameters);
		    return m.getAnnotation(annotation);
		}catch(Exception e){
			return null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Annotation findFieldAnnotation(Class<?> clazz, Class  annotation ,String property){
		Field  f=null;
		try{
		    f = clazz.getDeclaredField(property);
		    return f.getAnnotation(annotation);
		}catch(Exception e){
			return null;
		}
	}	

}
