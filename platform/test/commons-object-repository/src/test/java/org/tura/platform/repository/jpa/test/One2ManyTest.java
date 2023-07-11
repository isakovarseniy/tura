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

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.One2Many3A;
import objects.test.serialazable.jpa.One2Many3B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2ManyTest {

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

			One2Many3A o1 = (One2Many3A) repository.create(One2Many3A.class);

			repository.insert(o1, One2Many3A.class);
			
			One2Many3B o2 = (One2Many3B) repository.create(One2Many3B.class);
			repository.insert(o2, One2Many3B.class);
			o2.setOne2Many3A(o1);
		
			o2 = (One2Many3B) repository.create(One2Many3B.class);
			repository.insert(o2, One2Many3B.class);
			o2.setOne2Many3A(o1);
			
			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			
			array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class);
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class);
			assertEquals(2,result.getSearchResult().size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			for (Object o : result.getSearchResult()){
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getOne2Many3A().getObjId());
			}
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class);
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria();
			search.add(sc);
			sc.setClassName(Long.class.getName());
			sc.setName("ref");
			sc.setValue(o1.getObjId());
			sc.setComparator(Operator.EQ.name());
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class);
			assertEquals(2,result.getSearchResult().size());
			
			for (Object o : result.getSearchResult()){
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getOne2Many3A().getObjId());
			}
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			for (Object o : result.getSearchResult()){
				repository.remove(o, One2Many3B.class);
			}
			
			array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(2, array.size());

			stackProvider.get().commit();
			
			
			array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class);
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class);
			assertEquals(0,result.getSearchResult().size());
			
			o2 = (One2Many3B) repository.create(One2Many3B.class);
			repository.insert(o2, One2Many3B.class);
			o2.setOne2Many3A(o1);
		
			o2 = (One2Many3B) repository.create(One2Many3B.class);
			repository.insert(o2, One2Many3B.class);
			o2.setOne2Many3A(o1);
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(One2Many3A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many3B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}



}

