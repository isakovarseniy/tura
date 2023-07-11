/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public abstract class UuiElement implements Serializable{
	
	private static final long serialVersionUID = 7091153312533375836L;
	private List<EventDescription> events = new ArrayList<EventDescription>();
	private List<EventParameter> parameters = new ArrayList<EventParameter>();
	private List<UuiElement> childrens = new ArrayList<UuiElement>();
	
    public abstract void initContext(ELResolver elResolver, ResponseState responseState) throws Exception ;
    public abstract UuiElement restoreContext( java.util.Map<String, Object> map, DataUpdateRequest request,ResponseState responseState, List<EventDescription> eventsToFire) throws Exception ;
    public abstract void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception ;

    
    public List<EventDescription> getEvents() {
		return events;
	}
	public void setEvents(List<EventDescription> events) {
		this.events = events;
	}
	public List<EventParameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<EventParameter> parameters) {
		this.parameters = parameters;
	}
	public List<UuiElement> getChildrens() {
		return childrens;
	}
	public void setChildrens(List<UuiElement> childrens) {
		this.childrens = childrens;
	}
    
}