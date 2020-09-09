/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.rest;

import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class EventParameter extends UuiElement{

	private static final long serialVersionUID = -8700443753942387523L;
	String id;
	Object value;
	String parameter;
	String clazz=EventParameter.class.getName();
	
	
	public EventParameter(String id,  String parameter, Object value){
		this.id=id;
		this.value = value;
		this.parameter = parameter;
		
	}
	
	public EventParameter(){
		
	}
	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	
	
	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public void initContext(ELResolver elResolver, ResponseState responseState) {
		
	}

	@Override
	public UuiElement restoreContext(Map<String, Object> map,DataUpdateRequest request, ResponseState responseState, List<EventDescription> eventsToFire) throws Exception {
		this.id =(String) map.get("id");
		this.value = map.get("value");
		this.parameter =(String) map.get("parameter");
		return this;
	}

	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {
		
	}

	
	
}