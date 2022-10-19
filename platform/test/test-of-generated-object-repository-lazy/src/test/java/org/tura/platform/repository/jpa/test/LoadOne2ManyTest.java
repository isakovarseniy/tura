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

package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
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

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoadOne2ManyTest {

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

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();

		repositoryProducer.em.getTransaction().begin();
		initDb();
		repositoryProducer.em.getTransaction().commit();

	}	
	
	private static void initDb() {
		
		org.tura.jpa.test.One2Many1A a1 = new org.tura.jpa.test.One2Many1A();
		a1.setOne2Many1B(new ArrayList<>());
		
		org.tura.jpa.test.One2Many1B b1 = new org.tura.jpa.test.One2Many1B();
		a1.getOne2Many1B().add(b1);
		b1.setOne2Many1A(a1);
		
		repositoryProducer.em.persist(b1);
		repositoryProducer.em.persist(a1);
		
		b1 = new org.tura.jpa.test.One2Many1B();
		a1.getOne2Many1B().add(b1);
		b1.setOne2Many1A(a1);
		
		repositoryProducer.em.persist(b1);
		repositoryProducer.em.persist(a1);
		
		repositoryProducer.em.flush();
		
	}
	
	
	@Test
	public void t0000_loadOne2Many() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;
			
			SearchResult<One2Many1A> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1A.class);
			assertEquals(1,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			One2Many1A o1 =  result.getSearchResult().get(0);
			One2Many1B o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			StorageControl sc = array.get(0);
			assertEquals(2, sc.getSession());

			//Second attempt to access object;
			o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, sc.getSession());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t0001_loadOne2Many() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;
			
			SearchResult<One2Many1B> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1B.class);
			assertEquals(2,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			One2Many1B o2 = result.getSearchResult().get(0);
			One2Many1A o1 = o2.getOne2Many1A();
			assertNotNull(o1);
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			String cpaid = ((One2Many1A) o1).getCpaid();
			Map<ObjectRef, Map<RelationControl, List<Ref>>> filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ObjectRef  ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			Map<RelationControl, List<Ref>> mp = filtered.get(ref);
			assertEquals(1, mp.values().size());
			 List<Ref> lst = mp.values().iterator().next();
		     assertEquals(2, lst.size());
			
			cpaid = ((One2Many1B) o2).getCpaid();
			filtered = cpaStorageProvider.getStorage().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	
}
