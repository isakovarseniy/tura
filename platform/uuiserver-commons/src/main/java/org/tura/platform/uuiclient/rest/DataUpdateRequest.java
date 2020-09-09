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

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DataUpdateRequest")
public class DataUpdateRequest {
	
	private boolean initSession;
	
	private List<String >topUpdateElementIds ; 
	
	private  List<Object > processElements;
	
	private List<String> serverActionIds;
	
	private Map<String,String> parameters;

	private String browserLanguage;
	
	private String formSelector;
	
	private String sessionId;
	
	private byte[] sessionState;
	

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public byte[] getSessionState() {
		return sessionState;
	}

	public void setSessionState(byte[] sessionState) {
		this.sessionState = sessionState;
	}

	public boolean isInitSession() {
		return initSession;
	}

	public void setInitSession(boolean initSession) {
		this.initSession = initSession;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	
	public String getFormSelector() {
		return formSelector;
	}

	public void setFormSelector(String formSelector) {
		this.formSelector = formSelector;
	}

	public String getBrowserLanguage() {
		return browserLanguage;
	}

	public void setBrowserLanguage(String browserLanguage) {
		this.browserLanguage = browserLanguage;
	}

	public List<String> getServerActionIds() {
		return serverActionIds;
	}

	public void setServerActionIds(List<String> serverActionIds) {
		this.serverActionIds = serverActionIds;
	}

	public List<String> getTopUpdateElementIds() {
		return topUpdateElementIds;
	}

	public void setTopUpdateElementIds(List<String> topUpdateElementIds) {
		this.topUpdateElementIds = topUpdateElementIds;
	}

	public List<Object> getProcessElements() {
		return processElements;
	}

	public void setProcessElements(List<Object> processElements) {
		this.processElements = processElements;
	}
	
}