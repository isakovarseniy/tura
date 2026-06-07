/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TypeInheritance implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Map<Class<?>, List<Class<?>>>  hierarchy = new HashMap<>();
	
	public void addInheritance(Class<?> superClass , Class<?> clazz ) {
		List<Class<?>>  array = hierarchy.get(superClass);
		if( array == null) {
			array= new  ArrayList<>();
			hierarchy.put(superClass, array);
		}
		array.add(clazz);
	}

	public List<Class<?>> findInheritance(Class<?> superClass  ) {
		return hierarchy.get(superClass);
	}
	
	
	
}
