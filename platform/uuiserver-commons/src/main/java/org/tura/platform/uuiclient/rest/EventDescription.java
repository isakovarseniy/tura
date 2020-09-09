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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class EventDescription extends UuiElement {

	private static final long serialVersionUID = 5362709905786654288L;
	private String id;
	private String executionSide;
	private String expression;
	private String event;
	private String process;
	private String update;
	private String clazz = EventDescription.class.getName();
	private List<EventParameter> parameters = new ArrayList<EventParameter>();

	public EventDescription(String id, String executionSide, String expression, String event, String process,
			String update) {
		this.executionSide = executionSide;
		this.id = id;
		this.expression = expression;
		this.event = event;
		this.process = process;
		this.update = update;
	}

	public EventDescription() {

	}

	public List<EventParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<EventParameter> parameters) {
		this.parameters = parameters;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExecutionSide() {
		return executionSide;
	}

	public void setExecutionSide(String executionSide) {
		this.executionSide = executionSide;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	@Override
	public void initContext(ELResolver elResolver, ResponseState responseState) {

	}

	@SuppressWarnings("unchecked")
	@Override
	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request,ResponseState responseState,
			List<EventDescription> eventsToFire) throws Exception {
		this.id = (String) map.get("id");
		this.executionSide = (String) map.get("executionSide");
		this.expression = (String) map.get("expression");
		this.event = (String) map.get("event");
		this.process = (String) map.get("process");
		this.update = (String) map.get("update");

		if (request.getServerActionIds().contains(this.id)) {
			eventsToFire.add(this);
		}

		List<Object> childrens = (List<Object>) map.get("parameters");
		for (Object child : childrens) {
			Map<String, Object> chMap = (Map<String, Object>) child;
			UuiElement uie = new EventParameter();
			getParameters().add((EventParameter) uie.restoreContext(chMap, request,responseState,eventsToFire));
		}

		return this;
	}

	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {

	}

	public EventDescription addParameters(String paramId, String paramName, Object value, int paramOrder) {
		EventParameter eventParameter = new EventParameter(paramId + "_param_" + paramOrder, paramName, value);
		this.getParameters().add(eventParameter);
		return this;
	}

	public EventParameter findParameter(String paramName) {
		for (EventParameter param : parameters) {
			if (param.getParameter().equals(paramName)) {
				return param;
			}
		}
		return null;
	}
}