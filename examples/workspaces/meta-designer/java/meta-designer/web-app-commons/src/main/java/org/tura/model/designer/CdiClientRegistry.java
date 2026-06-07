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

package org.tura.model.designer;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.tura.platform.repository.cdi.CdiClientCpaStorageProvider;
import org.tura.platform.repository.cdi.CdiClientRegistryProvider;
import org.tura.platform.repository.cdi.ClientRegistry;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.cpa.InitCpaRepositoryInterface;
import org.tura.platform.repository.cpa.storage.CpaServiceInstantiator;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;

@ApplicationScoped
@ClientRegistry("mmdesigner.shared")
public class CdiClientRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@Inject
	private InitCpaRepositoryInterface init;

	@PostConstruct
	public void init() {
		try {
			SpaObjectRegistry cpaSpaRegistry = new SpaObjectRegistry();
			CpaStorageProvider cpaStorageProvider = new CdiClientCpaStorageProvider("mmdesigner.shared");
			init.setRegistry(this);
			init.setSpaObjectRegistry(cpaSpaRegistry);
			init.initClassMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initRules();
			cpaSpaRegistry.getRegistry(init.getName()).addInstantiator(new CpaServiceInstantiator(cpaSpaRegistry,
					init.getName(), this, cpaStorageProvider, new CdiClientRegistryProvider("mmdesigner.shared")));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
