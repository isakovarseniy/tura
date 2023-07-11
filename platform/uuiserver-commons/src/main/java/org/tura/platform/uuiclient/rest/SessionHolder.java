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

import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;

import org.tura.platform.uuiclient.cdi.ScopeStorage;

@SessionScoped
public class SessionHolder implements Serializable {

	private static final long serialVersionUID = 392984588561638497L;
	private String sessionId;
	private transient  ScopeStorage scopeStorage;
	
	
	
	public ScopeStorage getScopeStorage() {
		return scopeStorage;
	}

	public void setScopeStorage(ScopeStorage scopeStorage) {
		this.scopeStorage = scopeStorage;
	}


	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		if (this.sessionId != null && !this.sessionId.equals(sessionId)) {
			scopeStorage.destroyStorage(this.sessionId);
		}
		this.sessionId = sessionId;
	}


	@PreDestroy
	public void destroy() {
		scopeStorage.destroyStorage(sessionId);
	}

}
