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

package org.tura.platform.uuiclient.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.tura.platform.repository.cpa.storage.Locker;

public class LockerSave implements Serializable {

	private static final long serialVersionUID = 1L;
	private Map<String, List<String>> sharedLockers = new HashMap<String, List<String>>();

	public void save() {
		Map<String, List<String>> sl =  Locker.sharedLockers.get().get();
		if (sl != null) {
			sharedLockers.putAll(sl);
		}
		List<String> keys = new ArrayList<String>();
		keys.addAll( Locker.getLockKeeper().keySet());
		sharedLockers.put(Locker.getSessionId(), keys);
	}

	public void restore() {
		Map<String, List<String>>  h = Locker.sharedLockers.get().get(); 
		if (h == null) {
			h = new HashMap<String, List<String>>();
			Locker.sharedLockers.get().set(new HashMap<String, List<String>>());
		}
		
		List<String> l = Locker.externalLockers.get().get();
		if (l == null) {
			l = new ArrayList<String>();
			Locker.externalLockers.get().set(l);
		}
		
		for (Entry<String, List<String>> entry : sharedLockers.entrySet()) {
			if (!entry.getKey().equals(Locker.getSessionId())) {
				Locker.sharedLockers.get().get().put(entry.getKey(), entry.getValue());
				l.addAll(entry.getValue());
			}
		}
	}

}
