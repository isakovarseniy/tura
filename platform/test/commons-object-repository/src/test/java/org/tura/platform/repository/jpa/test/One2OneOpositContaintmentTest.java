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

import objects.test.serialazable.jpa.One2One2A;
import objects.test.serialazable.jpa.One2One2B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2OneOpositContaintmentTest {

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

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class);

			One2One2B o2 = (One2One2B) repository.create(One2One2B.class);

			o2.setOne2One2A(o1);
			
			repository.insert(o2, One2One2B.class);

			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			List<Object>commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class);
			assertEquals(1,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class);
			assertEquals(1,result.getSearchResult().size());
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			
			repository.remove(result.getSearchResult().get(0), One2One2A.class);
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Updated.name() }));
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class);
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class);
			assertEquals(1,result.getSearchResult().size());

			repository.remove(result.getSearchResult().get(0), One2One2B.class);
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());
			

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

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class);
			
			One2One2B o2 = (One2One2B) repository.create(One2One2B.class);
			
			o2.setOne2One2A(o1);
			
			repository.insert(o2, One2One2B.class);
			stackProvider.get().commit();
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class);
			assertEquals(1,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class);
			assertEquals(1,result.getSearchResult().size());

			repository.remove(result.getSearchResult().get(0), One2One2B.class);
			
			List<Object>commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());
			
			stackProvider.get().commit();
			
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());

			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class);
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class);
			assertEquals(0,result.getSearchResult().size());
			
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(0, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void t0002_One2One1() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class);
			
			One2One2B o2 = (One2One2B) repository.create(One2One2B.class);
			
			o2.setOne2One2A(o1);
			
			repository.insert(o2, One2One2B.class);
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			
			o2.setOne2One2A(null);
			assertNull(o2.getOne2One2A());

			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Updated.name() }));
			assertEquals(1, array.size());
			
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Loaded.name() }));
			assertEquals(1, array.size());
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class);
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class);
			assertEquals(1,result.getSearchResult().size());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	
}
