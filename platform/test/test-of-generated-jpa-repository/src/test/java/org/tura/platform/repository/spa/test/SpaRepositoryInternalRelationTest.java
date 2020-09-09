/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa.test;

import static org.junit.Assert.assertEquals;
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
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.test.AllowEverythingProfile;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.spa.test.repo.InitSPARepository;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A3;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.A5;
import objects.test.serialazable.jpa.ProxyRepository;

public class SpaRepositoryInternalRelationTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;
	private Registry registry ;
	private SpaObjectRegistry spaRegistry ;

	
	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

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
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get() .set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();
		
		InitSPARepository init = new InitSPARepository(registry,spaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		
		
		registry.addInstantiator(new NutInstantiator());
        registry.addProvider("org.tura.jpa.test.DD1", "nutRepository");
        registry.addProvider("org.tura.jpa.test.C1", "nutRepository");
        registry.addProvider("org.tura.jpa.test.B1", "nutRepository");
        registry.addProvider("org.tura.jpa.test.P1", "nutRepository");
        registry.addClassMapping("objects.test.serialazable.jpa.DD1","org.tura.jpa.test.DD1");
        registry.addClassMapping("objects.test.serialazable.jpa.C1","org.tura.jpa.test.C1");
        registry.addClassMapping("objects.test.serialazable.jpa.B1","org.tura.jpa.test.B1");
        registry.addClassMapping("objects.test.serialazable.jpa.P1","org.tura.jpa.test.P1");

        
		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
		spaRegistry.getRegistry("test-spa-repository").addInstantiator(new TestServiceInstantiator(registry, spaRegistry,"test-spa-repository"));
		
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.A1.class, CRUDService.class);
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.A1.class, SearchService.class);

        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.F1.class, CRUDService.class);
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.F1.class, SearchService.class);
		
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.B1.class,  CRUDService.class);
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.B1.class, SearchService.class);
        
		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;
		
	}
	
	@Test
	public void t0000_saveAndRemoveObject() {
		try {
			SearchBase.base.clear();
			
			ProxyRepository repository = getRepository();
			
			A1 a1 = (A1) repository.create(A1.class.getName());
			A2 a2 = (A2) repository.create(A2.class.getName());
			a1.setA2(a2);
			repository.insert(a1, A1.class.getName());
			repository.applyChanges(null);
			
			SearchResult  result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			A1  a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertNull(a1_.getA5());
			
			assertEquals(0,a1_.getA2().getA3().size());
			assertEquals(0,a1_.getA2().getA4().size());

			A4 a4 = (A4) repository.create(A4.class.getName());
			a2.getA4().add(a4);
			a4 = (A4) repository.create(A4.class.getName());
			a2.getA4().add(a4);
			
			A3 a3 = (A3) repository.create(A3.class.getName());
			a2.getA3().add(a3);
			a3 = (A3) repository.create(A3.class.getName());
			a2.getA3().add(a3);
			
			A5 a5 = (A5) repository.create(A5.class.getName());
			a1.setA5(a5);

			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class.getName());
			assertEquals(1, result.getNumberOfRows());

			a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertEquals(a1_.getA5().getObjId5(), a5.getObjId5() );
			
			assertEquals(2,a1_.getA2().getA3().size());
			assertEquals(2,a1_.getA2().getA4().size());
			
			a2.getA3().remove(a3);
			a1.setA5(null);
			
			repository.applyChanges(null);
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class.getName());
			assertEquals(1, result.getNumberOfRows());

			a1_= (A1) result.getSearchResult().get(0);
			assertNull(a1_.getA5());
			assertEquals(1, a1_.getA2().getA3().size());
			
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	@Test
	public void t0000_saveObject2() {
		try {
			SearchBase.base.clear();
			ProxyRepository repository = getRepository();
			A1 a1 = (A1) repository.create(A1.class.getName());
			repository.insert(a1, A1.class.getName());
			repository.applyChanges(null);
			
			A2 a2 = (A2) repository.create(A2.class.getName());
			a1.setA2(a2);
			
			A3 a3 = (A3) repository.create(A3.class.getName());
			a2.getA3().add(a3);
			repository.applyChanges(null);

			SearchResult  result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			A1  a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertEquals(1,a1.getA2().getA3().size());

			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}

	
}
