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

package org.tura.platform.repository;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.CpaTransactionAdapter;
import org.tura.platform.repository.cpa.LocalCommadStackProvider;
import org.tura.platform.repository.cpa.storage.CpaServiceInstantiator;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;
import org.tura.platform.repository.jpa.operation.query.Many2ManyQueryProcessor;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.mixed.test.SPAAdapterLoader;
import org.tura.platform.repository.mixed.test.W1PreQueryTrigger;
import org.tura.platform.repository.mixed.test.W4PreQueryTrigger;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.test.NutInstantiator;
import org.tura.platform.repository.spa.test.TestServiceInstantiator;
import org.tura.platform.test.spa.CRUDService;
import org.tura.platform.test.spa.SearchService;
import org.tura.spa.test.repo.InitSPARepository;

import objects.test.serialazable.jpa.InitCPARepository;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;
import objects.test.serialazable.jpa.Q1;
import objects.test.serialazable.jpa.Q4;
import objects.test.serialazable.jpa.W1;
import objects.test.serialazable.jpa.W2;
import objects.test.serialazable.jpa.W3;
import objects.test.serialazable.jpa.W4;
import objects.test.serialazable.jpa.W5;
import objects.test.serialazable.jpa.W6;

public class RepositoryProducer {

	public EntityManager em;
	public CpaStorageProvider cpaStorageProvider;
	public Registry registry;

	private EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};

	public CpaRepository getProxyRepository(Repository transport) throws Exception {
		return getProxyRepository( transport,false);
	}	
	
	public CpaRepository getProxyRepository(Repository transport, boolean inMemory) throws Exception {
		Registry cpaRegistry = new Registry();
		SpaObjectRegistry cpaSpaRegistry = new SpaObjectRegistry();

		ProxyCommadStackProvider stackProvider = new LocalCommadStackProvider();
		cpaStorageProvider = new ProxyCpaStorageProvider(stackProvider);

		InitCPARepository init = new InitCPARepository(cpaRegistry, cpaSpaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initRules();

		cpaSpaRegistry.getRegistry(InitCPARepository.SPA_REPOSITORY_NAME).addInstantiator(new CpaServiceInstantiator(
				cpaSpaRegistry, InitCPARepository.SPA_REPOSITORY_NAME, cpaRegistry, cpaStorageProvider));

		ProxyRepository proxyRepository = new ProxyRepository();
		proxyRepository.setStackProvider(stackProvider);
		proxyRepository.setTransport(transport);
		proxyRepository.setStorageProvider(cpaStorageProvider);
		proxyRepository.setRegistry(cpaRegistry);

		cpaRegistry.setTransactrionAdapter(new CpaTransactionAdapter(cpaRegistry));
		proxyRepository.setProfile(AllowEverythingProfile.class.getName());

		return proxyRepository;

	}

	public Repository getJpaRepository() throws Exception {
		registry = new Registry();
		SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator(new LocalProxyRepositoryProvider()));

		Repository repository = new BasicRepository(registry);

		
		Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
		queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
		
		InitJPARepository init = new InitJPARepository(registry, spaRegistry);
		init.initClassMapping();
		init.initFeldsMapping();
		init.initCommandProducer(emProvider,queryProcessorRegistry);
		init.initProvider();
		init.initRules();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));

		return repository;
	}

	public Repository getSpaRepository() throws Exception {
		Registry registry = new Registry();
		SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator(new LocalProxyRepositoryProvider()));

		Repository repository = new BasicRepository(registry);

		InitSPARepository init = new InitSPARepository(registry, spaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initRules();

		registry.addInstantiator(new NutInstantiator());
		registry.addProvider("org.tura.jpa.test.DD1", "nutRepository");
		registry.addProvider("org.tura.jpa.test.C1", "nutRepository");
		registry.addClassMapping("objects.test.serialazable.jpa.DD1", "org.tura.jpa.test.DD1");
		registry.addClassMapping("objects.test.serialazable.jpa.C1", "org.tura.jpa.test.C1");

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addInstantiator(
				new TestServiceInstantiator(registry, spaRegistry, InitSPARepository.SPA_REPOSITORY_NAME));

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.A1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.A1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.F1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addInstantiator(
				new TestServiceInstantiator(registry, spaRegistry, InitSPARepository.SPA_REPOSITORY_NAME));

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.A1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.A1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.F1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.B1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.B1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.OneWay1A.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.OneWay1A.class, SearchService.class);
		
		
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.SPAObject13.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.SPAObject13.class,
				SearchService.class);
		
		
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.L3.class, CRUDService.class);
		spaRegistry.getRegistry(
				InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.L3.class,
				SearchService.class);		
		
		return repository;

	}

	public Repository getMixRepository() throws Exception {
		Registry registry = new Registry();
		SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator(new LocalProxyRepositoryProvider()));

		Repository repository = new BasicRepository(registry);

		
		Map<String, ExternalQueryProcessor<?>> queryProcessorRegistry = new HashMap<String, ExternalQueryProcessor<?>>();
		queryProcessorRegistry.put(Constants.MANY2MANY_QUERY, new Many2ManyQueryProcessor<>());
		
		InitJPARepository initJpa = new InitJPARepository(registry, spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer(emProvider,queryProcessorRegistry);
		initJpa.initProvider();
		initJpa.initRules();

		InitSPARepository initSpa = new InitSPARepository(registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();
		initSpa.initRules();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addInstantiator(
				new TestServiceInstantiator(registry, spaRegistry, InitSPARepository.SPA_REPOSITORY_NAME));

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addCRUDProvider(org.tura.jpa.test.SPAObject1.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.SPAObject1.class, SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addCRUDProvider(org.tura.jpa.test.SPAObject2.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.SPAObject2.class, SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addCRUDProvider(org.tura.jpa.test.SPAObject3.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.SPAObject3.class, SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addCRUDProvider(org.tura.jpa.test.SPAObject4.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.SPAObject4.class, SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.A1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.A1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.F1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.F1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.OneWay1A.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME)
				.addSearchProvider(org.tura.jpa.test.OneWay1A.class, SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.W1.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.W1.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.W4.class,
				CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.W4.class,
				SearchService.class);

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.L3.class, CRUDService.class);
		spaRegistry.getRegistry(
				InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.L3.class,
				SearchService.class);		
		
		
		registry.addTrigger(Q1.class.getName(), W1.class.getName(), new W1PreQueryTrigger(registry));
		registry.addTrigger(W1.class.getName(), new W1PreQueryTrigger(registry));
		registry.addTrigger(Q4.class.getName(), W4.class.getName(), new W4PreQueryTrigger(registry));

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W1.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W1.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W2.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W2.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W3.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W3.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W4.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W4.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W5.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W5.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addLoader(org.tura.jpa.test.W6.class.getName(),
				new SPAAdapterLoader());
		registry.addLoader(W6.class.getName(), new SPAAdapterLoader());

		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addCRUDProvider(org.tura.jpa.test.SPAObject13.class, CRUDService.class);
		spaRegistry.getRegistry(InitSPARepository.SPA_REPOSITORY_NAME).addSearchProvider(org.tura.jpa.test.SPAObject13.class,
				SearchService.class);
		
		
		return repository;
	}

}
