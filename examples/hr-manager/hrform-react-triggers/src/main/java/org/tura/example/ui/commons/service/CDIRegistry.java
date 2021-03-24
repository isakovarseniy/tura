/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.commons.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.elsoft.platform.hr.objects.simple.model.InitJPARepository;
import org.tura.platform.hr.objects.serialization.ProxyRepositoryInstantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

@ApplicationScoped
public class CDIRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@Inject
	SpaObjectRegistry spaRegistry;

	@PostConstruct
	public void init() {
		try {
			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());

			InitJPARepository init = new InitJPARepository( this, spaRegistry, new CDIRepositoryDataProducer());

			init.initClassMapping();
			init.initFeldsMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initEntityManagerProvider(new CDIEntityManagerProvider());
			this.setTransactrionAdapter(new CDITransactionAdapter(this));
			this.addInstantiator(new ProxyRepositoryInstantiator());

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
