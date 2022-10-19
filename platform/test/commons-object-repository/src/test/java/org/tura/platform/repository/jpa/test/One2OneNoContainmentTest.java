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
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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

import objects.test.serialazable.jpa.One2One3A;
import objects.test.serialazable.jpa.One2One3B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2OneNoContainmentTest {

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

			One2One3A o1 = (One2One3A) repository.create(One2One3A.class);
			One2One3B o2 = (One2One3B) repository.create(One2One3B.class);
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());

			repository.insert(o2, One2One3B.class);
			repository.insert(o1, One2One3A.class);
			o1.setOne2One3B(o2);
			
			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			long o1Objid = o1.getObjId();
			long o2Objid = o2.getObjId();

			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					0, One2One3A.class);
			
			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			long o1Objid_ = o1.getObjId();
			long o2Objid_ = o2.getObjId();
			assertNotEquals( o1Objid,o1Objid_);
			assertNotEquals(o2Objid, o2Objid_);
			
			assertEquals(1, result.getSearchResult().size());
			One2One3A o1_ = (One2One3A) result.getSearchResult().get(0);
			assertNotNull(o1_.getOne2One3B());
			assertEquals(o2.getObjId(), o1_.getOne2One3B().getObjId());
			One2One3B o2_ = o1_.getOne2One3B();

			o2 = (One2One3B) repository.create(One2One3B.class);
			repository.insert(o2, One2One3B.class);
			o1.setOne2One3B(o2);
			
			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			assertEquals(repository.getStackProvider().get().getListOfCommand().size(), 3);

			stackProvider.get().commit();
			
			assertNotEquals(o2_.getObjId(), o2.getObjId() );

			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2One3B.class);
			assertEquals(2, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2One3A.class);
			assertEquals(1, result.getSearchResult().size());

			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
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

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2One3A.class);
			One2One3A o1 = (One2One3A) result.getSearchResult().get(0);
			One2One3B o2 = o1.getOne2One3B();

			repository.remove(o1, One2One3A.class);
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(1, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			try {
				o1.getObjId();
				fail();
			}catch( Exception e) {
			}
			assertNull(o2.getOne2One3A());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2One3B.class);
			assertEquals(2, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2One3A.class);
			assertEquals(0, result.getSearchResult().size());
			assertNull(o2.getOne2One3A());
			
			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
}