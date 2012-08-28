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
package org.elsoft.platform;

import java.lang.reflect.Method;

public class Reflection {

	@SuppressWarnings("rawtypes")
	public static Object call(Object obj, String method, Object... args) {
		try {

			Class[] classes = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				classes[i] = args[i].getClass();
			}

			Method m = obj.getClass().getMethod(method, classes);
			return m.invoke(obj, args);

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}


	@SuppressWarnings("rawtypes")
	public static Object callTyped(Object obj, String method, Object... args) throws Exception {

			Class[] classes = new Class[args.length/2];
			for (int i = 0,j=0; i < args.length; i+=2,j++) {
				classes[j] = (Class<?>)args[i];
			}

			Method m = obj.getClass().getMethod(method, classes);

			Object[] objects = new Object[args.length/2];
			for (int i = 1,j=0; i < args.length; i+=2,j++) {
				objects[j] = args[i];
			}
			
			
			return m.invoke(obj, objects);


	}


}
