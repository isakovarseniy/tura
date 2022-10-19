/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.HashMap;

import org.tura.platform.uuiclient.rest.events.DefaultEventProcessor;
import org.tura.platform.uuiclient.rest.events.EventProcessor;

public class EventRegistry {

	private static HashMap<String ,EventProcessor> hash = new HashMap<>();
	
	static {
//		hash.put("react.onRowSelection", new OnRowSelectionProcessor());
	}
	
	public static EventProcessor findProcessor( String eventName) {
		EventProcessor processor = hash.get(eventName);
		if ( processor == null) {
			return new DefaultEventProcessor();
		}
		return hash.get(eventName);
	}
	
	
}
