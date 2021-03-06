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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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
import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
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

import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;
import objects.test.serialazable.jpa.Q1;
import objects.test.serialazable.jpa.Q2;
import objects.test.serialazable.jpa.Q3;
import objects.test.serialazable.jpa.Q4;
import objects.test.serialazable.jpa.W1;
import objects.test.serialazable.jpa.W2;
import objects.test.serialazable.jpa.W3;
import objects.test.serialazable.jpa.W4;
import objects.test.serialazable.jpa.W5;
import objects.test.serialazable.jpa.W6;

public class AdapterTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry ;
	private SpaObjectRegistry spaRegistry ;

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

		
		InitJPARepository initJpa = new InitJPARepository(registry,spaRegistry, new LocalRepositoryDataProducer());
		initJpa.initClassMapping();
		initJpa.initFeldsMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(registry,spaRegistry, new LocalRepositoryDataProducer());
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
		spaRegistry.getRegistry("test-spa-repository").addInstantiator(new TestServiceInstantiator(registry, spaRegistry,"test-spa-repository"));
		
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.W1.class,  CRUDService.class);
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.W1.class,  SearchService.class);

        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.W4.class, CRUDService.class);
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.W4.class, SearchService.class);

        registry.addTrigger( Q1.class.getName() ,  W1.class.getName(),  new W1PreQueryTrigger(registry));
        registry.addTrigger( W1.class.getName(),  new W1PreQueryTrigger(registry));
        registry.addTrigger(Q4.class.getName(), W4.class.getName(),  new W4PreQueryTrigger(registry));
        
        
        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W1.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W1.class.getName(), new SPAAdapterLoader());

        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W2.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W2.class.getName(), new SPAAdapterLoader());
        
        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W3.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W3.class.getName(), new SPAAdapterLoader());

        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W4.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W4.class.getName(), new SPAAdapterLoader());

        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W5.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W5.class.getName(), new SPAAdapterLoader());

        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W6.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W6.class.getName(), new SPAAdapterLoader());
        
		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void adapterObjectTest1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			Q1 o1 = (Q1) repository.create(Q1.class.getName());
			W1 w1 = (W1) repository.create(W1.class.getName());
			
			repository.insert(o1, Q1.class.getName());
			
			W2 w2 = (W2) repository.create(W2.class.getName());
			W3 w3 = (W3) repository.create(W3.class.getName());

			w1.setW2(w2);
			w1.getW3().add(w3);

			repository.insert(w1, W1.class.getName());

			o1.setW1(w1);
			
			searchProvider.addKnownObject((ObjectControl) o1);
			searchProvider.addKnownObject((ObjectControl) w1);
			List commands =  repository.applyChanges(null);
			processor.process(commands);
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			
			o1 = (Q1) result.getSearchResult().get(0);
			
			w2 = o1.getW1().getW2();
			
			Q2 q2 = (Q2) repository.create(Q2.class.getName());
			
			w2.setQ2(q2);
			
			w3 = o1.getW1().getW3().get(0);
			
			Q3 q3 = (Q3) repository.create(Q3.class.getName());
			
			w3.setQ3(q3);
			
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class.getName());
			
			
			assertEquals(1, result.getSearchResult().size());
			
			o1 = (Q1) result.getSearchResult().get(0);
			
			w2 = o1.getW1().getW2();
			
			q2 = w2.getQ2();
			assertNotNull(q2);
			
			w3 = o1.getW1().getW3().get(0);
			
			q3 =w3.getQ3();	
			assertNotNull(q3);
			
			w2.setQ2(null);
			o1.getW1().getW3().remove(w3);
			
			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class.getName());
			
			o1 = (Q1) result.getSearchResult().get(0);
			assertNull(o1.getW1().getW2().getQ2() );
			assertEquals(0,o1.getW1().getW3().size() );
			
			
			o1.setW1(null);
			
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			
			o1 = (Q1) result.getSearchResult().get(0);
			assertNull(o1.getW1());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q2.class.getName());
			
			assertEquals(0, result.getNumberOfRows());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q3.class.getName());
			
			assertEquals(0, result.getNumberOfRows());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, W1.class.getName());
			
			assertEquals(1, result.getNumberOfRows());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void twoDifferentPersistenceProvidersObjectTest1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);
			
			Q4 o4 = (Q4) repository.create(Q4.class.getName());
			W4 w4 = (W4) repository.create(W4.class.getName());
			
			W5 w5 = (W5) repository.create(W5.class.getName());
			W6 w6 = (W6) repository.create(W6.class.getName());

			w4.setW5(w5);
			w4.getW6().add(w6);
			o4.setW4(w4);

			repository.insert(o4, Q4.class.getName());

			
			searchProvider.addKnownObject((ObjectControl) o4);
			searchProvider.addKnownObject((ObjectControl) w4);
			List commands =  repository.applyChanges(null);
			processor.process(commands);
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q4.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			o4 = (Q4) result.getSearchResult().get(0);
			w4 = o4.getW4();
			assertNotNull(w4);
			assertNotNull(w4.getW5());
			assertEquals(1, w4.getW6().size());
					
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	
}
