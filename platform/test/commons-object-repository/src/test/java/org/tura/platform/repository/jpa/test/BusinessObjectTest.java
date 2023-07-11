/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.ObjectGraphProfile;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.IndepObject2;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusinessObjectTest {

	private static Logger logger;
	private static Server server;
    private  static RepositoryProducer repositoryProducer;  

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		repositoryProducer = new RepositoryProducer();
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
		repositoryProducer.em = emf.createEntityManager();

	}


	@Test
	public void t0000_loadObject() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			o1.getIndepObject2().add(o2);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@SuppressWarnings("rawtypes")
	@Test
	public void t0001_loadObject() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			
			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			stackProvider.get().commit();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(0, o1.getIndepObject2().size());

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0003_loadObject() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			o1.getIndepObject2().add(o2);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.setProfile(IndepObject2ExceptionProfile.class.getName());
			repositoryProducer.registry.addProfile(IndepObject2ExceptionProfile.class.getName(), new IndepObject2ExceptionProfile());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			if ( RepositoryTestSuite.lazyObjectRepository ) {
				   assertEquals(1, o1.getIndepObject2().size());
			}else {
				   assertEquals(0, o1.getIndepObject2().size());
			}

			SearchResult<IndepObject2>result1 = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(1, result1.getSearchResult().size());
			o2 =  result1.getSearchResult().get(0);

			o1 = o2.getIndepObject1();
			assertNotNull(o1);

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	public class IndepObject2ExceptionProfile extends ObjectGraphProfile {

		private static final long serialVersionUID = -4428248136840262044L;

		public boolean skipRelation(Object repositoryObject, Method method) {
			if (IndepObject1.class.getName().equals(repositoryObject.getClass().getName())
					&& method.getName().equals("getIndepObject2")) {
				return true;
			} else {
				return false;
			}
		}
	}

}