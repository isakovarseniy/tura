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

package org.tura.platform.test.cdi;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.hr.objects.complex.model.InitJPARepository;
import org.tura.platform.hr.objects.serialization.ProxyRepositoryInstantiator;
import org.tura.platform.repository.cdi.ServerRegistry;
import org.tura.platform.repository.cdi.starter.CdiServerProxyRepositoryProvider;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;
import org.tura.platform.repository.jpa.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.test.UUIPrimaryKeyStrategy;



@ApplicationScoped
@ServerRegistry
public class CdiServerRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {

		try {
			
			SpaObjectRegistry spaRegistry = new SpaObjectRegistry();
			
			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
			this.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
			this.addInstantiator(new ProxyRepositoryInstantiator(new CdiServerProxyRepositoryProvider()));
			this.setTransactrionAdapter(new CdiServerTransactionAdapter(this));

			
			Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
			queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
			
			InitJPARepository init = new InitJPARepository( this, spaRegistry);
			init.initCommandProducer(new CdiEntityManagerProvider(),queryProcessorRegistry);
			init.initProvider();
			init.initRules();
			init.initClassMapping();
			init.initFeldsMapping();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
