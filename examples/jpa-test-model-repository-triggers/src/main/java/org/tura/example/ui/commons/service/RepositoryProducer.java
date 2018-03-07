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

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.tura.platform.repository.cdi.Repo;
import org.tura.platform.repository.cdi.RepositoryExtension;
import org.tura.platform.repository.core.DataProvider;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.Triggers;

public class RepositoryProducer {

	@Inject
	private RepositoryExtension repositoryExtension;

	@Inject
	private LocalTransactionRepository repository;

	@Inject
	private BeanManager beanManager;

	@Produces
	@Repo("repository")
	public Repository getRepository(InjectionPoint injectionPoint) {

		for (DataProvider provider : getDataProviders()) {
			provider.setRepository(repository);
			provider.init();

			for (Triggers triggers : getQueryTriggers()) {
				provider.setTriggers(triggers);
			}

		}
		return repository;
	}

	private List<DataProvider> getDataProviders() {

		ArrayList<DataProvider> array = new ArrayList<>();

		for (Bean<?> bean : repositoryExtension.getDataProviderBeans()) {

			CreationalContext<?> ctx = beanManager.createCreationalContext(bean);
			DataProvider provider = (DataProvider) beanManager.getReference(bean, DataProvider.class, ctx);

			array.add(provider);
		}

		return array;
	}

	private List<Triggers> getQueryTriggers() {

		ArrayList<Triggers> array = new ArrayList<>();

		for (Bean<?> bean : repositoryExtension.getRepositoryTriggersBeans()) {

			CreationalContext<?> ctx = beanManager.createCreationalContext(bean);
			Triggers provider = (Triggers) beanManager.getReference(bean, Triggers.class, ctx);

			array.add(provider);
		}

		return array;
	}

}
