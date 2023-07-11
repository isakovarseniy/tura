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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.platform.uuiclient.rest.client.commands.ClientCommand;

public class DataUpdateResponse {
	
	private List<String> topUpdateElementIds = new ArrayList<>();
	private List<UuiElement>updateElements = new ArrayList<>(); 
	private List<ClientCommand> executeClientActions = new ArrayList<ClientCommand>();
	private List<ClientCommand> fatalClientErrors = new ArrayList<ClientCommand>();
	private byte[] sessionState;

	private String uuid = UUID.randomUUID().toString();
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public byte[] getSessionState() {
		return sessionState;
	}

	public void setSessionState(byte[] sessionState) {
		this.sessionState = sessionState;
	}

	public List<String> getTopUpdateElementIds() {
		return topUpdateElementIds;
	}

	public void setTopUpdateElementIds(List<String> topUpdateElementIds) {
		this.topUpdateElementIds = topUpdateElementIds;
	}


	public List< UuiElement> getUpdateElements() {
		return updateElements;
	}

	public void setUpdateElements(List< UuiElement> updateElements) {
		this.updateElements = updateElements;
	}

	public List<ClientCommand> getExecuteClientActions() {
		return executeClientActions;
	}

	public void setExecuteClientActions(List<ClientCommand> executeClientActions) {
		this.executeClientActions = executeClientActions;
	}


	public List<ClientCommand> getFatalClientErrors() {
		return fatalClientErrors;
	}

	public void setFatalClientErrors(List<ClientCommand> fatalClientErrors) {
		this.fatalClientErrors = fatalClientErrors;
	}
	
	
	
}

