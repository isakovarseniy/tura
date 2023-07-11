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

package org.tura.platform.repository.spa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
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
import org.tura.platform.test.spa.SearchBase;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.F1;
import objects.test.serialazable.jpa.F2;

public class MultipleSpaObjectsTest {

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
			
			Repository transport = repositoryProducer.getSpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			
			A1 a1 = (A1) repository.create(A1.class);
			A2 a2 = (A2) repository.create(A2.class);
			a1.setA2(a2);
			repository.insert(a1, A1.class);

			stackProvider.get().commit();
			
			A4 a4 = (A4) repository.create(A4.class);
			a2.getA4().add(a4);

			F1 f1 = (F1) repository.create(F1.class);
			a4.setF1(f1);
			f1.setComment("Comment");
			
			F2 f2 = (F2) repository.create(F2.class);
			f1.setF2(f2);
			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());
			
			A1  a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			A4 a4_ = a1_.getA2().getA4().get(0);
			assertNotNull (a4_.getF1());
			assertNotNull (a4_.getF1().getF2());
			
			a4_.getF1().setF2(null);
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());
			
			a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			a4_ = a1_.getA2().getA4().get(0);
			assertNotNull (a4_.getF1());
			assertNull (a4_.getF1().getF2());
			
			a4_.setF1(null);
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			a4_ = a1_.getA2().getA4().get(0);
			assertNull (a4_.getF1());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, F1.class);
			assertEquals(0, result.getNumberOfRows());
	
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
	
}
