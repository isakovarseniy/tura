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
package org.tura.platform.repository.core.relatioin;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.RelationAdapter;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.Rule;
import org.tura.platform.repository.core.annotation.Association;

public class One2OneRelationAdapter extends RelationAdapter {

	private Method method;
	private Class<?> clazz;
	private Map<String, Object> context;

	public One2OneRelationAdapter(Class<?> clazz, Method method, Map<String, Object> context) {
		this.method = method;
		this.context = context;
		this.clazz = clazz;
	}

	@Override
	public void connectRepositoryObjects(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = obj1;
		Object detail = obj2;
		

		if (clazz.getName().equals(obj1.getClass().getName())) {
			masterMethod = getLocalSetMethod();
			detailMethod = getRemoteSetMethod();
		} else {
			masterMethod = getRemoteSetMethod();
			detailMethod = getLocalSetMethod();
		}
		Rule rule = new One2OneRepositoryRuleObject(master, detail, masterMethod, detailMethod);

		@SuppressWarnings("unchecked")
		List<Rule> list = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
		if (list == null){
			list = new ArrayList<>();
			context.put(RepositoryObjectLoader.RULES_LIST, list);
		}
		list.add(rule);
	}


	private Method getRemoteSetMethod() throws Exception {
		Association assosiation = method.getAnnotation(Association.class);
		Class<?> remoteClass = assosiation.mappedBy();

		String remoteSetName = "set" + WordUtils.capitalize(assosiation.property());
		return remoteClass.getMethod(remoteSetName, new Class[] { clazz });
	}

	private Method getLocalSetMethod() throws Exception {
		String  methodName = "set"+method.getName().substring(3);
		Method m = clazz.getMethod(methodName, method.getReturnType());
		return m;
	}
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception {
		List list = new ArrayList<>();
		Object obj = method.invoke(repositoryObject);
		if (obj != null){
			list.add(obj);
		}
		return list;
	}

	@Override
	public void disconnectRepositoryObject(Object obj1, Object obj2) throws Exception {
		Method masterMethod = null;
		Method detailMethod = null;
		Object master = obj1;
		Object detail = obj2;
		

		if (clazz.getName().equals(obj1.getClass().getName())) {
			masterMethod = getLocalSetMethod();
			detailMethod = getRemoteSetMethod();
		} else {
			masterMethod = getRemoteSetMethod();
			detailMethod = getLocalSetMethod();
		}
		
		masterMethod.invoke(master, new Object[] {null}  );
		detailMethod.invoke(detail, new Object[] {null});
		
	}

	@Override
	public Map<String, String> getProperty(Object obj1, Object obj2) throws Exception {
		String masterProperty = null;
		String detailProperty = null;
		
		if (obj1.getClass().equals(clazz)){
			masterProperty = WordUtils.uncapitalize( method.getName().substring(3));
			detailProperty = WordUtils.uncapitalize( getRemoteSetMethod().getName().substring(3));
		}else{
			detailProperty = WordUtils.uncapitalize( method.getName().substring(3));
			masterProperty = WordUtils.uncapitalize( getRemoteSetMethod().getName().substring(3));
		}

		Map<String,String> map = new HashMap<>();
		map.put(MASTER_PROPERTY, masterProperty);
		map.put(DETAIL_PROPERTY, detailProperty);

		return map;

	
	}

}