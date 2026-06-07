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

package org.tura.jpa;

import java.util.UUID;

import org.tura.platform.repository.cpa.storage.CpaStorage;
import org.tura.platform.repository.cpa.storage.CpaStorageEventSubscribers;
import org.tura.platform.repository.cpa.storage.CpaStorageEventSubscribersProvider;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.TypeInheritance;
import org.tura.platform.repository.cpa.storage.TypeInheritanceProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.ObjectInheritance;

public class ProxyCpaStorageProvider implements CpaStorageProvider {

	private static final long serialVersionUID = 520444826411985629L;
	private CpaStorage cpaStorage;
	private CpaStorageEventSubscribers cpaStorageEventSubscribers; 
	private ObjectInheritance inh;

	public ProxyCpaStorageProvider(ProxyCommadStackProvider stackProvider) {
		inh = new ObjectInheritance();
		inh.init();
		this.cpaStorage = new CpaStorage(UUID.randomUUID().toString(),new TypeInheritanceProvider() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public TypeInheritance get() {
				return inh;
			}
		});
		this.cpaStorage.setCommadStackProvider(stackProvider);
		this.cpaStorageEventSubscribers = new CpaStorageEventSubscribers();
		this.cpaStorage. setEventSubscriberesProvider(new CpaStorageEventSubscribersProvider() {
			private static final long serialVersionUID = 1L;

			@Override
			public CpaStorageEventSubscribers get() {
				return cpaStorageEventSubscribers;
			}
		});
	}

	@Override
	public CpaStorage get() {
		return cpaStorage;
	}

}
