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

package org.tura.platform.repository.spa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.spa.CRUDService;
import org.tura.platform.test.spa.ProcessCallback;
import org.tura.platform.test.spa.SearchBase;

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A3;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.A5;
import objects.test.serialazable.jpa.OneWay1A;
import objects.test.serialazable.jpa.OneWay2A;
import objects.test.serialazable.jpa.OneWay3A;

public class SpaRepositoryInternalRelationTest {

	private static Logger logger;
	private static Server server;
	private static RepositoryProducer repositoryProducer;

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
	public void t0000_saveAndRemoveObject() {
		try {
			SearchBase.base.clear();

			Repository transport = repositoryProducer.getMixRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			A1 a1 = (A1) repository.create(A1.class);
			A2 a2 = (A2) repository.create(A2.class);
			a1.setA2(a2);
			a1.setDescription("qwerty");
			repository.insert(a1, A1.class);
			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			A1 a1_ = (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());

			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertNull(a1_.getA5());

			assertEquals(0, a1_.getA2().getA3().size());
			assertEquals(0, a1_.getA2().getA4().size());

			A4 a4 = (A4) repository.create(A4.class);
			a2.getA4().add(a4);
			a4 = (A4) repository.create(A4.class);
			a2.getA4().add(a4);

			A3 a3 = (A3) repository.create(A3.class);
			a2.getA3().add(a3);
			a3 = (A3) repository.create(A3.class);
			a2.getA3().add(a3);

			A5 a5 = (A5) repository.create(A5.class);
			a1.setA5(a5);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			a1_ = (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());

			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertEquals(a1_.getA5().getObjId5(), a5.getObjId5());

			assertEquals(2, a1_.getA2().getA3().size());
			assertEquals(2, a1_.getA2().getA4().size());

			a2.getA3().remove(a3);
			a1.setA5(null);

			stackProvider.get().commit();
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			a1_ = (A1) result.getSearchResult().get(0);
			assertNull(a1_.getA5());
			assertEquals(1, a1_.getA2().getA3().size());
			assertEquals("qwerty", a1_.getDescription());
			a1_.setDescription(null);

			stackProvider.get().commit();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_saveObject2() {
		try {
			SearchBase.base.clear();
			Repository transport = repositoryProducer.getMixRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			A1 a1 = (A1) repository.create(A1.class);
			repository.insert(a1, A1.class);
			stackProvider.get().commit();

			A2 a2 = (A2) repository.create(A2.class);
			a1.setA2(a2);

			A3 a3 = (A3) repository.create(A3.class);
			a2.getA3().add(a3);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			A1 a1_ = (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			assertEquals(a1.getA2().getObjId2(), a1_.getA2().getObjId2());
			assertEquals(1, a1.getA2().getA3().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_oneWayObject() {
		try {
			SearchBase.base.clear();
			Repository transport = repositoryProducer.getMixRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CRUDService.callbacks.put(org.tura.jpa.test.OneWay1A.class.getName(), new InsertWithDiffCallback());
			
			

			OneWay1A ow1 = (OneWay1A) repository.create(OneWay1A.class);

			OneWay2A ow2 = (OneWay2A) repository.create(OneWay2A.class);
			ow1.setOneWay2A(ow2);

			OneWay3A ow3 = (OneWay3A) repository.create(OneWay3A.class);
			ow1.getOneWay3A().add(ow3);

			repository.insert(ow1, OneWay1A.class);

			stackProvider.get().commit();

			assertEquals (Long.valueOf("567"), ow1.getObjId() ) ;
			assertEquals (  Long.valueOf("789"),  ow1.getOneWay2A().getObjId());
			assertEquals ( "Name2" , ow1.getOneWay2A().getName());
			

			boolean found = false;
			for ( OneWay3A   oneWay3A  :   ow1.getOneWay3A()) {
				if ( Long.valueOf("987").equals(oneWay3A.getObjId())) {
					found = true;
					assertEquals ( "newName" , oneWay3A.getName());
				}
			}
			assertTrue(found);			
			
			List<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName("objId");
			sc.setClassName(String.class.getName());
			sc.setValue(ow1.getObjId());
			sc.setComparator(Operator.EQ.name());
			search.add(sc);
			SearchResult<?> result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, OneWay1A.class);
			assertEquals(1, result.getNumberOfRows());
			OneWay1A ow1_ = (OneWay1A) result.getSearchResult().get(0);
			assertEquals(ow1.getOneWay2A().getObjId(), ow1_.getOneWay2A().getObjId());
			assertEquals(ow1.getOneWay3A().get(0).getObjId(), ow1_.getOneWay3A().get(0).getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	public class InsertWithDiffCallback extends ProcessCallback {
		public void preInsert(Object obj) {
			if (obj instanceof org.tura.jpa.test.OneWay1A) {
				org.tura.jpa.test.OneWay1A oneWay1A = (org.tura.jpa.test.OneWay1A) obj;
				oneWay1A.setObjId(567L);
				oneWay1A.getOneWay2A().setObjId(789L);
				oneWay1A.getOneWay2A().setName("Name2");
				oneWay1A.getOneWay3A().iterator().next().setObjId(987L);
				oneWay1A.getOneWay3A().iterator().next().setName("newName");;
			}			
		}
	}	
	
}
