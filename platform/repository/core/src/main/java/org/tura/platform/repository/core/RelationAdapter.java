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

package org.tura.platform.repository.core;

import java.util.List;
import java.util.Map;

public abstract class RelationAdapter {
	
	protected static String MASTER_PROPERTY = "masterProperty";
	protected static String DETAIL_PROPERTY = "detailProperty";

	
	public abstract void connectRepositoryObjects (Object master, Object detail) throws Exception;
	
	public abstract List<Object> getListOfRepositoryObjects(Object repositoryObject) throws Exception;

	public abstract void disconnectRepositoryObject(Object repositoryObject, Object obj) throws Exception;

	public abstract Map<String,String> getProperty(Object obj1, Object obj2) throws Exception;

	
	public String getMasterProperty(Object obj1, Object obj2) throws Exception {
		return getProperty(obj1,obj2).get(MASTER_PROPERTY);
	}
	
	public String getDetailProperty(Object obj1, Object obj2) throws Exception {
		return getProperty(obj1,obj2).get(DETAIL_PROPERTY);
	}
	

	
	

}

