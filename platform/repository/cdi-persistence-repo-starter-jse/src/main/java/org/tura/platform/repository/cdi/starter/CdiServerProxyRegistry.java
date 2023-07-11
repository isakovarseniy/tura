/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.tura.platform.repository.cdi.ServerProxyRegistry;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.cpa.CpaTransactionAdapter;
import org.tura.platform.repository.cpa.InitCpaRepositoryInterface;
import org.tura.platform.repository.cpa.storage.CpaServiceInstantiator;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;


@ApplicationScoped
@ServerProxyRegistry
public class CdiServerProxyRegistry extends Registry{

	private static final long serialVersionUID = 1L;
	
	@Inject
	InitCpaRepositoryInterface init;

	@PostConstruct
	public void init() {

		try {
			SpaObjectRegistry cpaSpaRegistry = new SpaObjectRegistry();
			this.setTransactrionAdapter(new CpaTransactionAdapter(this));

			CpaStorageProvider   cpaStorageProvider = new CdiServerCpaStorageProvider();

			init.setRegistry(this);
			init.setSpaObjectRegistry(cpaSpaRegistry);
			init.initClassMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initRules();

			cpaSpaRegistry.getRegistry(init.getName()).addInstantiator(new CpaServiceInstantiator(
					cpaSpaRegistry, init.getName(), this, cpaStorageProvider));
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
}
