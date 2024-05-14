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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.proxy.ProxyCommandStackEventListener;

public class CommandStackEventSubscribers implements Serializable{

	private static final long serialVersionUID = 1L;
	private Map<String, ProxyCommandStackEventListener> listeners = new HashMap<>();

	public void addProxyCommandStackEventListener(String id, ProxyCommandStackEventListener listener) {
		if (!listeners.containsKey(id)) {
			listeners.put(id, listener);
		}
	}

	public void removeProxyCommandStackEventListener(String id) {
		listeners.remove(id);
	}

	public void beforeRollback() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeRollback();
		}
	}

	public void afterRollback() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterRollback();
		}
	}

	public void beforeRollbackSavePoint() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeRollbackSavePoint();
		}
	}

	public void afterRollbackSavePoint() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterRollbackSavePoint();
		}
	}

	public void beforeCommit() throws Exception {

		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.beforeCommit();
		}
	}

	public void afterCommit() throws Exception {
		for (ProxyCommandStackEventListener listner : listeners.values()) {
			listner.afterCommit();
		}
	}

}
