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

import java.lang.reflect.Method;
import java.util.ArrayList;

import net.sf.cglib.proxy.CallbackFilter;

public class AnnotationMethodFiltering implements CallbackFilter{
	
	private ArrayList<String> acceptedMethod = new ArrayList<String>();
	
	public AnnotationMethodFiltering(){
		acceptedMethod.add("getWrapper");
	}
	public void addMethod(String method){
		acceptedMethod.add(method);
	}

	public int accept(Method method) {
		if (acceptedMethod.contains(method.getName()))
			return 0;
		return 1;
	}

}
