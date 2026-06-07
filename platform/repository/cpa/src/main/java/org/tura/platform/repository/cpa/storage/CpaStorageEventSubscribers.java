/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.proxy.CpaStorageEventListener;

public class CpaStorageEventSubscribers implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private Map<String, CpaStorageEventListener> listeners = new HashMap<>();

	public void addCpaStorageEventListener(String id, CpaStorageEventListener listener) {
		if (!listeners.containsKey(id)) {
			listeners.put(id, listener);
		}
	}

	public void CpaStorageEventListener(String id) {
		listeners.remove(id);
	}

	public void notifyCreatedEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectCreated(type, dcSource);
		}
	}

	public void notifyInsertEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectInserted(type, dcSource);
		}
	}

	public void notifyDeleteEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectDelited(type, dcSource);
		}
	}

}
