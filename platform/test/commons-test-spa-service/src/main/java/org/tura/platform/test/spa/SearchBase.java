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

package org.tura.platform.test.spa;

import java.util.HashMap;
import java.util.Map;

import com.rits.cloning.Cloner;

public class SearchBase {

	public static Map<String, Map<Object, Object>> base = new HashMap<String, Map<Object, Object>>();

	public static void put(Object key, Object object, String type) throws Exception {
		Map<Object, Object> h = SearchBase.base.get(type);
		if (h == null) {
			h = new HashMap<>();
			SearchBase.base.put(type, h);
		}
		Object obj = h.get(key);
		if (obj != null) {
			throw new Exception("Object already exists");
		}
		h.put(key, object);
	}

	public static void update(Object key, Object object, String type) throws Exception {
		Map<Object, Object> h = SearchBase.base.get(type);
		if (h == null) {
			throw new Exception("Could not find an object");
		}
		get(key, type);
		h.put(key, object);
	}

	public static Object get(Object key, String type) throws Exception {
		Map<Object, Object> h = SearchBase.base.get(type);
		if (h == null) {
			throw new Exception("Could not find an object");
		}
		Object obj = h.get(key);
		if (obj == null) {
			throw new Exception("Could not find an object");
		}
		Cloner  cloner = new Cloner();
		return cloner.deepClone(obj);
	}

	public static void remove(Object key, String type) throws Exception {
		Map<Object, Object> h = SearchBase.base.get(type);
		if (h == null) {
			throw new Exception("Could not find an object");
		}
		get(key, type);
		h.remove(key);
	}

	public static void clear() {
		base = new HashMap<String, Map<Object, Object>>();
	}
}