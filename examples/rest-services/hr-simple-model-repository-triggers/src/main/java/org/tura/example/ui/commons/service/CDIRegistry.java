/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.commons.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.tura.platform.hr.objects.serialization.InitJPARepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;

@ApplicationScoped
public class CDIRegistry extends Registry {

	private static final long serialVersionUID = 1L;

	@Inject
	SpaObjectRegistry spaRegistry;
	@Inject
	Registry registry;

	@PostConstruct
	public void init() {
		try {
			this.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());

			InitJPARepository init = new InitJPARepository(new SpaRepository(), this, spaRegistry);

			init.initClassMapping();
			init.initCommandProducer();
			init.initProvider();
			init.initEntityManagerProvider(new CDIEntityManagerProvider());
			this.setTransactrionAdapter(new CDITransactionAdapter(registry));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
