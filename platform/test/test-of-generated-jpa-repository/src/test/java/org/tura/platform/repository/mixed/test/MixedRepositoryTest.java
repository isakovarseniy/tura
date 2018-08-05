/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A3;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.A5;
import objects.test.serialazable.jpa.B1;
import objects.test.serialazable.jpa.B2;
import objects.test.serialazable.jpa.C1;
import objects.test.serialazable.jpa.DD1;
import objects.test.serialazable.jpa.F1;
import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.InitSPARepository;
import objects.test.serialazable.jpa.JPAObject1;
import objects.test.serialazable.jpa.JPAObject2;
import objects.test.serialazable.jpa.JPAObject3;
import objects.test.serialazable.jpa.JPAObject4;
import objects.test.serialazable.jpa.P1;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.SPAObject1;
import objects.test.serialazable.jpa.SPAObject2;
import objects.test.serialazable.jpa.SPAObject3;
import objects.test.serialazable.jpa.SPAObject4;

public class MixedRepositoryTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

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


		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		
		InitJPARepository initJpa = new InitJPARepository(new SpaRepository(),registry,spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(new SpaRepository(),registry,spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject1.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject1.class, new SearchService(registry,spaRegistry));

        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject2.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject2.class, new SearchService(registry,spaRegistry));
        
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject3.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject3.class, new SearchService(registry,spaRegistry));
        
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject4.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject4.class, new SearchService(registry,spaRegistry));

        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.A1.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.A1.class, new SearchService(registry,spaRegistry));

        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.F1.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.F1.class, new SearchService(registry,spaRegistry));
        
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

	
	@Test
	public void mixedObjectTest5() {
		try {
			ProxyRepository repository = getRepository();

			A1 a1 = (A1) repository.create(A1.class.getName());
			A2 a2 = (A2) repository.create(A2.class.getName());
			a1.setA2(a2);
			repository.insert(a1, A1.class.getName());
			repository.applyChanges(null);

			A3 a3 = (A3) repository.create(A3.class.getName());
			a2.getA3().add(a3);
			
			C1 c1 = (C1) repository.create(C1.class.getName());
			a3.getC1().add(c1);
			
			B1 b1 = (B1) repository.create(B1.class.getName());
			a3.setB1(b1);
			
			B2 b2 = (B2) repository.create(B2.class.getName());
			b1.setB2(b2);
			
			A4 a4 = (A4) repository.create(A4.class.getName());
			a2.getA4().add(a4);
			
			
			F1 f1 = (F1) repository.create(F1.class.getName());
			a4.setF1(f1);
			f1.setComment("Comment");
			
			DD1 dd1 = (DD1) repository.create(DD1.class.getName());
			a1.setDD1(dd1);
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, DD1.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			DD1 dd1_ = (DD1) result.getSearchResult().get(0);
			assertEquals(dd1.getObjId(), dd1_.getObjId());
			
			A1 a1_ = dd1_.getA1();
			assertEquals(a1.getObjId(), a1_.getObjId());

			A2 a2_ = a1_.getA2();
			assertEquals(a2.getObjId(), a2_.getObjId());
			
			A3 a3_ = a2_.getA3().get(0);
			assertEquals(a3.getObjId(), a3_.getObjId());
			
			A4 a4_ = a2_.getA4().get(0);
			assertEquals(a4.getObjId(), a4_.getObjId());
			
			C1 c1_ = a3_.getC1().get(0);
			assertEquals(c1.getObjId(), c1_.getObjId());
			
			B1 b1_ = a3_.getB1();
			assertEquals(b1.getObjId(), b1_.getObjId());
			
			B2 b2_ = b1_.getB2();
			assertEquals(b2.getObjId(), b2_.getObjId());
			
			F1 f1_ = a4_.getF1();
			assertEquals(f1.getObjId(), f1_.getObjId());
			assertEquals(f1.getComment(), f1_.getComment());
			
			A5 a5 = (A5) repository.create(A5.class.getName());
			a1.setA5(a5);
			
			P1 p1 = (P1) repository.create(P1.class.getName());
			repository.insert(p1, P1.class.getName());
			a1.setA5(a5);
			a5.setP1(p1);
			
			repository.applyChanges(null);
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,100, DD1.class.getName());
			dd1_ = (DD1) result.getSearchResult().get(0);
			a1_ = dd1_.getA1();
			assertNotNull(a1_.getA5().getP1());
			assertEquals(p1.getObjId(), a1_.getA5().getP1().getObjId());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,100, P1.class.getName());
			assertEquals(1, result.getSearchResult().size(), 1);
			P1 p1_ = (P1) result.getSearchResult().get(0);
			assertNull( p1_.getA5() );
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	
}
