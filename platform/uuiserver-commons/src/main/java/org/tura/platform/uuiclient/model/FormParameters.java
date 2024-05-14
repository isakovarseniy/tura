/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.uuiclient.rest.DataUpdateRequest;

public class FormParameters implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HashMap<String,String> params = new HashMap<String, String>();
	private DataUpdateRequest request;
	
	public DataUpdateRequest getRequest() {
		return request;
	}

	public void setRequest(DataUpdateRequest request) {
		this.request = request;
	}

	public void put( String key, String value) {
		params.put(key,value);
	}
   
	public String get( String key) {
		return params.get(key);
	}	
	
	public void putAll( Map<String,String> hash) {
		params.putAll(hash);
	}
	
	
	
}
