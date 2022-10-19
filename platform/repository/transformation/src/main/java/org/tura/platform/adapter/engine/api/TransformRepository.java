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

package org.tura.platform.adapter.engine.api;

import java.util.HashMap;
import java.util.Map;

public class TransformRepository {

	private Map<String, OperationListner> listeners = new HashMap<>();
	private Map<String, Deserializer> objectConverters = new HashMap<>();

	
	public void addListener(String key , OperationListner listener) {
		listeners.put(key, listener);
	}

	public OperationListner findListener(String key ) {
		return listeners.get(key);
	}

	public void addDeserializer(Class<?> toType  ,  Deserializer converter) {
		objectConverters.put(toType.getName(), converter);
	}
	
	public Deserializer findDeserializer(Class<?> toType  ) {
		return objectConverters.get(toType.getName());
	}
	
}
