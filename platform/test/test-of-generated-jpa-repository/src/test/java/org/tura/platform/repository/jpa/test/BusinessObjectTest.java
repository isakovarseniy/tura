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
package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.ObjectGraphProfile;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.IndepObject2;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusinessObjectTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;
	
	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();
	
	
	private static EntityManagerProvider emProvider = new EntityManagerProvider(){

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
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
        registry.addProfile(IndepObject2ExceptionProfile.class.getName(), new IndepObject2ExceptionProfile());
		
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository init = new InitJPARepository(new SpaRepository(),registry,spaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initEntityManagerProvider(emProvider);

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
		

		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}

	@Test
	public void t0000_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());

			o1.getIndepObject2().add(o2);

			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.remove(o1, IndepObject1.class.getName());
			repository.remove(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class.getName());
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class.getName());
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(0, o1.getIndepObject2().size());

			repository.remove(o1, IndepObject1.class.getName());
			repository.remove(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class.getName());
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class.getName());
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0003_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());

			o1.getIndepObject2().add(o2);

			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.setProfile(IndepObject2ExceptionProfile.class.getName());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(0, o1.getIndepObject2().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o2 = (IndepObject2) result.getSearchResult().get(0);

			o1 = o2.getIndepObject1();
			assertNotNull(o1);

			repository.remove(o1, IndepObject1.class.getName());
			repository.remove(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class.getName());
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class.getName());
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	public class IndepObject2ExceptionProfile extends ObjectGraphProfile{
	
		public boolean skipRelation(Object repositoryObject, Method method) {
			if ( 
					IndepObject1.class.getName().equals( repositoryObject.getClass().getName())
				&&	method.getName().equals("getIndepObject2")
					){
			return true;
			}else{
				return false;
			}
		}
	}

}