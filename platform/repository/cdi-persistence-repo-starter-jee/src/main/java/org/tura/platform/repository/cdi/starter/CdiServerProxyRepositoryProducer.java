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

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.cdi.ServerProxyRegistry;
import org.tura.platform.repository.cdi.ServerProxyRepo;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.cpa.ProxyRepositoryInterface;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

@Alternative
@Priority(0)
public class CdiServerProxyRepositoryProducer {

	@Inject
	@ServerProxyRegistry
	Registry registry;

	@Inject
	ProxyRepositoryInterface proxyRepository;
	
	
	@Produces
	@ServerProxyRepo
	public ProxyFactory getRepository(InjectionPoint injectionPoint) throws Exception {

		ProxyCommadStackProvider stackProvider = new CdiServerCommadStackProvider();
		CpaStorageProvider   cpaStorageProvider = new CdiServerCpaStorageProvider();

		proxyRepository.setStackProvider(stackProvider);
		proxyRepository.setStorageProvider(cpaStorageProvider);
		proxyRepository.setRegistry(registry);

		proxyRepository.setProfile(AllowEverythingProfile.class.getName());
		return (ProxyFactory) proxyRepository;
	}

}
