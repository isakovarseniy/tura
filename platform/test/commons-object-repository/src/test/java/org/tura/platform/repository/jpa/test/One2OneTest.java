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
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.JPAObject5;
import objects.test.serialazable.jpa.JPAObject6;
import objects.test.serialazable.jpa.One2One4A;
import objects.test.serialazable.jpa.One2One4B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2OneTest {

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
	public void t0000_One2One1() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

			One2One4A o1 = (One2One4A) repository.create(One2One4A.class);
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());
			
			One2One4B o2 = (One2One4B) repository.create(One2One4B.class);
			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());
			
			repository.insert(o2, One2One4B.class);
			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			repository.insert(o1, One2One4A.class);
			array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			o2.setOne2One4A(o1);
			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class);
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);

			array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class);
			assertEquals(1,result.getSearchResult().size());

			o2 = (One2One4B) result.getSearchResult().get(0);
			assertEquals( o1.getObjId(),  o2.getOne2One4A().getObjId());
			
			o1 = (One2One4A) repository.create(One2One4A.class);
			repository.insert(o1, One2One4A.class);
			o2.setOne2One4A(o1);
			
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class);
			assertEquals(2,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);
			array = cpaStorageProvider.getStorage().find(One2One4A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class);
			assertEquals(1,result.getSearchResult().size());

			array = cpaStorageProvider.getStorage().find(One2One4B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1,result.getSearchResult().size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	@Test
	public void t0001_One2One1() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

			JPAObject5 o1 = (JPAObject5) repository.create(JPAObject5.class);
			JPAObject6 o2 = (JPAObject6) repository.create(JPAObject6.class);
			
			o1.setUkObj5(100L);
			o1.setJPAObject6(o2);

			repository.insert(o1, JPAObject5.class);

			stackProvider.get().commit();
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, JPAObject5.class);
			assertEquals(1,result.getSearchResult().size());
			JPAObject5 o1_ = (JPAObject5) result.getSearchResult().get(0);
			JPAObject6 o2_ = o1.getJPAObject6() ;
           assertNotNull(o2_);

           assertEquals(o1.getJpaObj5(), o1_.getJpaObj5());
           assertEquals(o2.getJpaObj6(), o2_.getJpaObj6());
           
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(JPAObject5.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1,array.size());
           
			array = cpaStorageProvider.getStorage().find(JPAObject6.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1,array.size());
           
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	

	
}
