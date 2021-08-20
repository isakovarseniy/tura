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

package org.tura.platform.repository.mixed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.jpa.test.OneWay1A;
import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.ClientObjectProcessor;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.test.AllowEverythingProfile;
import org.tura.platform.repository.jpa.test.LocalRepositoryDataProducer;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.test.CRUDService;
import org.tura.platform.repository.spa.test.SearchService;
import org.tura.platform.repository.spa.test.TestServiceInstantiator;
import org.tura.platform.test.ClientSearchProvider;
import org.tura.spa.test.repo.InitSPARepository;

import objects.test.serialazable.jpa.OneWay3A;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;

public class DiffRepositoryTest extends DiffCommonTest{

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

	private static EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider() {

		private static final long serialVersionUID = 1L;

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);

		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();

		}

	};

	private static Logger logger;
	private static Server server;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		em = emf.createEntityManager();

	}

	private ProxyRepository getRepository() throws Exception {
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator());

		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository(registry, spaRegistry, new LocalRepositoryDataProducer());
		initJpa.initClassMapping();
		initJpa.initFeldsMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(registry, spaRegistry, new LocalRepositoryDataProducer());
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry("test-spa-repository")
				.addInstantiator(new TestServiceInstantiator(registry, spaRegistry, "test-spa-repository"));

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.OneWay1A.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.OneWay1A.class,SearchService.class);


		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());

		return proxy;

	}

	@SuppressWarnings("rawtypes")
	@Test
	public void diffObjectTest1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			OneWay1A oneWay1A = initObject();

			objects.test.serialazable.jpa.OneWay1A proxyOneWay1A = getProxyObject(oneWay1A);
			
			
			searchProvider.addKnownObject((ObjectControl) proxyOneWay1A);
			repository.insert(proxyOneWay1A, objects.test.serialazable.jpa.OneWay1A .class.getName());
			List commands =  repository.applyChanges(null);
			processor.process(commands);
			
			
			assertEquals (Long.valueOf("567"), proxyOneWay1A.getObjId() ) ;
			assertEquals (  Long.valueOf("789"),  proxyOneWay1A.getOneWay2A().getObjId());
			assertEquals ( "Name2" , proxyOneWay1A.getOneWay2A().getName());
			

			boolean found = false;
			for ( OneWay3A   oneWay3A  :   proxyOneWay1A.getOneWay3A()) {
				if ( Long.valueOf("987").equals(oneWay3A.getObjId())) {
					found = true;
					assertEquals ( "newName" , oneWay3A.getName());
				}
			}
			assertTrue(found);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
