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

package org.tura.platform.repository.mixed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectRef;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.Ref;
import org.tura.platform.repository.cpa.storage.RelationControl;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.Q1;
import objects.test.serialazable.jpa.Q1Proxy;
import objects.test.serialazable.jpa.Q2;
import objects.test.serialazable.jpa.Q2Proxy;
import objects.test.serialazable.jpa.Q3;
import objects.test.serialazable.jpa.Q3Proxy;
import objects.test.serialazable.jpa.Q4;
import objects.test.serialazable.jpa.W1;
import objects.test.serialazable.jpa.W1Proxy;
import objects.test.serialazable.jpa.W2;
import objects.test.serialazable.jpa.W2Proxy;
import objects.test.serialazable.jpa.W3;
import objects.test.serialazable.jpa.W3Proxy;
import objects.test.serialazable.jpa.W4;
import objects.test.serialazable.jpa.W5;
import objects.test.serialazable.jpa.W6;

public class AdapterTest {

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
	public void adapterObjectTest1() {
		try {
			Repository transport = repositoryProducer.getMixRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

			Q1 o1 = (Q1) repository.create(Q1.class);
			W1 w1 = (W1) repository.create(W1.class);

			repository.insert(o1, Q1.class);

			W2 w2 = (W2) repository.create(W2.class);
			W3 w3 = (W3) repository.create(W3.class);

			w1.setW2(w2);
			List<StorageControl> array = cpaStorageProvider.getStorage().findAny(W3.class, 0, Long.MAX_VALUE);
			assertEquals(1, array.size());
			
			w1.getW3().add(w3);
			
			
			array = cpaStorageProvider.getStorage().findAny(W3.class, 0, Long.MAX_VALUE);
			assertEquals(0, array.size());
			
			repository.insert(w1, W1.class);

			o1.setW1(w1);

			String cpaid = ((Q1Proxy) o1).getCpaid();
			Map<ObjectRef, Map<RelationControl, List<Ref>>> filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ObjectRef  ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			
			cpaid = ((W1Proxy) w1).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			stackProvider.get(). commit();

			System.gc();
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class);

			assertEquals(1, result.getSearchResult().size());
			
			cpaid = ((Q1Proxy) o1).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			cpaid = ((W1Proxy) w1).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			ObjectRef oref = new ObjectRef(cpaid,cpaid);
			Ref r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((Q1Proxy)o1).getCpaid(),r.getPk());
			assertEquals(((Q1Proxy)o1).getCpaid(),r.getExtPk());
			
			
			array = cpaStorageProvider.getStorage().find(Q1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			StorageControl sc = array.get(0);
			assertEquals(1, sc.getSession());
			

			o1 = (Q1) result.getSearchResult().get(0);

			w2 = o1.getW1().getW2();

			Q2 q2 = (Q2) repository.create(Q2.class);

			w2.setQ2(q2);

			w3 = o1.getW1().getW3().get(0);

			Q3 q3 = (Q3) repository.create(Q3.class);

			w3.setQ3(q3);
			
			cpaid = ((W1Proxy) w1).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(3,filtered.size());
			
			oref = new ObjectRef(cpaid,cpaid);
			assertNotNull(filtered.get(oref));
			r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((Q1Proxy)o1).getCpaid(),r.getPk());
			assertEquals(((Q1Proxy)o1).getCpaid(),r.getExtPk());
			
			
			String extCpaId = ((W3Proxy) w3).getCpaid();
			oref = new ObjectRef(cpaid,extCpaId);
			assertNotNull(filtered.get(oref));
			r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((Q3Proxy)q3).getCpaid(),r.getPk());
			assertEquals(((Q3Proxy)q3).getCpaid(),r.getExtPk());
			
			
			extCpaId = ((W2Proxy) w2).getCpaid();
			oref = new ObjectRef(cpaid,extCpaId);
			assertNotNull(filtered.get(oref));
			r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((Q2Proxy)q2).getCpaid(),r.getPk());
			assertEquals(((Q2Proxy)q2).getCpaid(),r.getExtPk());

			
			cpaid = ((Q2Proxy) q2).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			oref = new ObjectRef(cpaid,cpaid);
			r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((W1Proxy)w1).getCpaid(),r.getPk());
			assertEquals(((W2Proxy)w2).getCpaid(),r.getExtPk());
			
			
			cpaid = ((Q3Proxy) q3).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			oref = new ObjectRef(cpaid,cpaid);
			r = filtered.get(oref).values().iterator().next().get(0);
			assertEquals(((W1Proxy)w1).getCpaid(),r.getPk());
			assertEquals(((W3Proxy)w3).getCpaid(),r.getExtPk());
			
			
			array = cpaStorageProvider.getStorage().find(Q1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(W1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Q2.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(Q3.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(Q1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(W1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().findAny(W3.class, 0, Long.MAX_VALUE);
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(Q2.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(Q3.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
 
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Q1.class);
			assertEquals(1, result.getSearchResult().size());

			array = cpaStorageProvider.getStorage().find(Q1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			sc = array.get(0);
			assertEquals(2, sc.getSession());
			
			array = cpaStorageProvider.getStorage().find(W1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			sc = array.get(0);
			if ( RepositoryTestSuite.lazyObjectRepository) {
				assertEquals(0, sc.getSession());
			}else {
				assertEquals(2, sc.getSession());
			}

			array = cpaStorageProvider.getStorage().findAny(W3.class, 0, Long.MAX_VALUE);
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(Q2.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			sc = array.get(0);
			if ( RepositoryTestSuite.lazyObjectRepository) {
				assertEquals(1, sc.getSession());
			}else {
				assertEquals(2, sc.getSession());
			}

			array = cpaStorageProvider.getStorage().find(Q3.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			sc = array.get(0);
			if ( RepositoryTestSuite.lazyObjectRepository) {
				assertEquals(1, sc.getSession());
			}else {
				assertEquals(2, sc.getSession());
			}

			o1 = (Q1) result.getSearchResult().get(0);

			w2 = o1.getW1().getW2();

			q2 = w2.getQ2();
			assertNotNull(q2);

			w3 = o1.getW1().getW3().get(0);

			q3 = w3.getQ3();
			assertNotNull(q3);

			w2.setQ2(null);
			o1.getW1().getW3().remove(0);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Q1.class);

			o1 = (Q1) result.getSearchResult().get(0);
			assertNull(o1.getW1().getW2().getQ2());
			assertEquals(0, o1.getW1().getW3().size());

			o1.setW1(null);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Q1.class);

			assertEquals(1, result.getSearchResult().size());

			o1 = (Q1) result.getSearchResult().get(0);
			assertNull(o1.getW1());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Q2.class);

			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, Q3.class);

			assertEquals(0, result.getNumberOfRows());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, W1.class);

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
			Repository transport = repositoryProducer.getMixRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			Q4 o4 = (Q4) repository.create(Q4.class);
			W4 w4 = (W4) repository.create(W4.class);

			W5 w5 = (W5) repository.create(W5.class);
			W6 w6 = (W6) repository.create(W6.class);

			w4.setW5(w5);
			w4.getW6().add(w6);
			o4.setW4(w4);

			repository.insert(o4, Q4.class);

			stackProvider.get().commit();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q4.class);

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
