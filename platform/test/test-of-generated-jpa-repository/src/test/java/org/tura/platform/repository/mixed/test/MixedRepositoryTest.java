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
package org.tura.platform.repository.mixed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.spa.test.CRUDService;
import org.tura.platform.repository.spa.test.SearchService;

import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.InitSPARepository;
import objects.test.serialazable.jpa.JPAObject1;
import objects.test.serialazable.jpa.JPAObject2;
import objects.test.serialazable.jpa.JPAObject3;
import objects.test.serialazable.jpa.JPAObject4;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.SPAObject1;
import objects.test.serialazable.jpa.SPAObject2;
import objects.test.serialazable.jpa.SPAObject3;
import objects.test.serialazable.jpa.SPAObject4;

public class MixedRepositoryTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

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
		Registry.newInstance();
		Registry.getInstance().setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository();
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository(new SpaRepository());
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(new SpaRepository());
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		Registry.getInstance().setTransactrionAdapter(new JpaTransactionAdapter(em));
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject1.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject1.class, new SearchService());

        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject2.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject2.class, new SearchService());
        
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject3.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject3.class, new SearchService());
        
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject4.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject4.class, new SearchService());

        
        return new ProxyRepository(repository, stackProvider);

	}

	@Test
	public void mixedObjectTest1() {
		try {
			ProxyRepository repository = getRepository();

			JPAObject1 o1 = (JPAObject1) repository.create(JPAObject1.class.getName());
			SPAObject1 o2 = (SPAObject1) repository.create(SPAObject1.class.getName());
			o1.setSPAObject1(o2);
			repository.insert(o1, JPAObject1.class.getName());
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject1.class.getName());

			assertEquals(1, result.getSearchResult().size());
			o1 = (JPAObject1) result.getSearchResult().get(0);
			assertNotNull( o1.getSPAObject1());

			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject1.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			o2 = (SPAObject1) result.getSearchResult().get(0);
			assertNotNull( o2.getJPAObject1());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject1.class.getName());
			o1 = (JPAObject1) result.getSearchResult().get(0);
			o1.setSPAObject1(null);
			
			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject1.class.getName());
			o1 = (JPAObject1) result.getSearchResult().get(0);
			assertNull( o1.getSPAObject1());

			assertTrue( SearchService.base.get("org.tura.jpa.test.SPAObject1").isEmpty());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public void mixedObjectTest2() {
		try {
			ProxyRepository repository = getRepository();

			JPAObject2 o1 = (JPAObject2) repository.create(JPAObject2.class.getName());
			SPAObject2 o2 = (SPAObject2) repository.create(SPAObject2.class.getName());
			o1.getSPAObject2().add(o2);
			repository.insert(o1, JPAObject2.class.getName());
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject2.class.getName());

			assertEquals(1, result.getSearchResult().size());
			o1 = (JPAObject2) result.getSearchResult().get(0);
			assertNotNull( o1.getSPAObject2());

			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject2.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			o2 = (SPAObject2) result.getSearchResult().get(0);
			assertNotNull( o2.getJPAObject2());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject2.class.getName());
			o1 = (JPAObject2) result.getSearchResult().get(0);
			o1.getSPAObject2().remove(o2);
			
			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject2.class.getName());
			o1 = (JPAObject2) result.getSearchResult().get(0);
			assertEquals( 0, o1.getSPAObject2().size());

			assertTrue( SearchService.base.get("org.tura.jpa.test.SPAObject2").isEmpty());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	
	@Test
	public void mixedObjectTest3() {
		try {
			ProxyRepository repository = getRepository();

			JPAObject3 o2 = (JPAObject3) repository.create(JPAObject3.class.getName());
			SPAObject3 o1 = (SPAObject3) repository.create(SPAObject3.class.getName());
			o1.setJPAObject3(o2);
			repository.insert(o1, SPAObject3.class.getName());
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject3.class.getName());

			assertEquals(1, result.getSearchResult().size());
			o1 = (SPAObject3) result.getSearchResult().get(0);
			assertNotNull( o1.getJPAObject3());

			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject3.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			o2 = (JPAObject3) result.getSearchResult().get(0);
			assertNotNull( o2.getSPAObject3());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject3.class.getName());
			o1 = (SPAObject3) result.getSearchResult().get(0);
			o1.setJPAObject3(null);
			
			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject3.class.getName());
			o1 = (SPAObject3) result.getSearchResult().get(0);
			assertNull( o1.getJPAObject3());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void mixedObjectTest4() {
		try {
			ProxyRepository repository = getRepository();

			JPAObject4 o2 = (JPAObject4) repository.create(JPAObject4.class.getName());
			SPAObject4 o1 = (SPAObject4) repository.create(SPAObject4.class.getName());
			o1.getJPAObject4().add(o2);
			repository.insert(o1, SPAObject4.class.getName());
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject4.class.getName());

			assertEquals(1, result.getSearchResult().size());
			o1 = (SPAObject4) result.getSearchResult().get(0);
			assertNotNull( o1.getJPAObject4());

			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, JPAObject4.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			o2 = (JPAObject4) result.getSearchResult().get(0);
			assertNotNull( o2.getSPAObject4());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject4.class.getName());
			o1 = (SPAObject4) result.getSearchResult().get(0);
			o1.getJPAObject4().remove(o2);
			
			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, SPAObject4.class.getName());
			o1 = (SPAObject4) result.getSearchResult().get(0);
			assertEquals(0, o1.getJPAObject4().size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	
	
}
