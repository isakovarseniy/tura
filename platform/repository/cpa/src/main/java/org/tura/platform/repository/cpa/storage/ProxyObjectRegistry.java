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

package org.tura.platform.repository.cpa.storage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.tura.platform.repository.core.ObjectControl;

public class ProxyObjectRegistry {

	private static final ThreadLocal<AtomicReference<List<ObjectControl>>> PROXY_OBJECT_REGISTRY = ThreadLocal
			.withInitial(AtomicReference::new);

	public static void addProxyObject(ObjectControl oc) {
		if (PROXY_OBJECT_REGISTRY.get().get() == null) {
			PROXY_OBJECT_REGISTRY.get().set(new ArrayList<>());
		}
		PROXY_OBJECT_REGISTRY.get().get().add(oc);
	}

	public static List<ObjectControl> getProxyRegistry() {
		return PROXY_OBJECT_REGISTRY.get().get();
	}

	public static void restoreLock() throws Exception {
		List<ObjectControl> array = getProxyRegistry();
		if (array != null) {
			for (ObjectControl oc : array) {
				Method method = oc.getClass().getDeclaredMethod("lock");
				method.setAccessible(true);
				method.invoke(oc);
			}
			PROXY_OBJECT_REGISTRY.get().set(null);
		}
	}

}
