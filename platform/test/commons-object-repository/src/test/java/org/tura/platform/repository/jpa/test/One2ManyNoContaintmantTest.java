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

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2ManyNoContaintmantTest {

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
	public void t0000_One2Many() {
		try {

			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;

			One2Many1A o1 = (One2Many1A) repository.create(One2Many1A.class);

			One2Many1B o2 = (One2Many1B) repository.create(One2Many1B.class);
			repository.insert(o2, One2Many1B.class);

			o2 = (One2Many1B) repository.create(One2Many1B.class);
			repository.insert(o2, One2Many1B.class);

			repository.insert(o1, One2Many1A.class);
			o1.getOne2Many1B().add(o2);

			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					0, One2Many1A.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many1A) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1B.class);
			assertEquals(2, result.getSearchResult().size());

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			repository.remove(o1, One2Many1A.class);
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name(), ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1A.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1B.class);
			assertEquals(2, result.getSearchResult().size());

			o1 = (One2Many1A) repository.create(One2Many1A.class);
			repository.insert(o1, One2Many1A.class);

			for (Object o : result.getSearchResult()) {
				o1.getOne2Many1B().add((One2Many1B) o);
			}
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(2, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1B.class);
			assertEquals(2, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1A.class);
			assertEquals(1, result.getSearchResult().size());

			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			o1 = (One2Many1A) result.getSearchResult().get(0);
			int size = o1.getOne2Many1B().size();
			for (int  i = 0 ; i < size; i++) {
				o1.getOne2Many1B().remove(0);
			}
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1B.class);
			assertEquals(2, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many1A.class);
			assertEquals(1, result.getSearchResult().size());

			o1 = (One2Many1A) result.getSearchResult().get(0);

			assertEquals(o1.getOne2Many1B().size(), 0);

			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
}