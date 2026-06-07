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

package org.tura.platform.repository.cdi.starter;

import java.lang.annotation.Annotation;

import org.omnifaces.util.Beans;
import org.tura.platform.repository.cdi.ServerCpaStorage;
import org.tura.platform.repository.cdi.ServerProxyCpaStorageEventSubscribers;
import org.tura.platform.repository.cpa.storage.CpaStorageEventSubscribers;
import org.tura.platform.repository.cpa.storage.CpaStorageEventSubscribersProvider;

public class CdiServerProxyCpaStorageEventSubscribersProvider  implements CpaStorageEventSubscribersProvider {

	private static final long serialVersionUID = 1L;

	@Override
	public CpaStorageEventSubscribers get() {
		ServerCpaStorage qualifier  = new  ServerCpaStorage() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return ServerProxyCpaStorageEventSubscribers.class;
			}
		};
		return Beans.getReference(CpaStorageEventSubscribers.class,qualifier);
	}	
	
}
