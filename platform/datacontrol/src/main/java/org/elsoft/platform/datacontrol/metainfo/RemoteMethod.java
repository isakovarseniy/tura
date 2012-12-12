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
package org.elsoft.platform.datacontrol.metainfo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class RemoteMethod {
	private String method;
	private ArrayList<Class> paramClass = new ArrayList<Class>();
	private ArrayList<String> expressions = new ArrayList<String>();
	private ArrayList<String> values = new ArrayList<String>();
	
	private Object proxyObject;
	

	public Object getProxyObject() {
		return proxyObject;
	}

	public void setProxyObject(Object proxyObject) {
		this.proxyObject = proxyObject;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void addParamClass(Class clazz) {
		paramClass.add(clazz);
	}
	
	public List<Class> getParamsClasses() {
		return paramClass;
	}

	public void addExpression(String expression) {
		expressions.add(expression);
	}

	public List<String> getExpressions() {
		return expressions;
	}

	public void addValue(String value) {
		values.add(value);
	}

	public List<String> getValues() {
		return values;
	}

}
