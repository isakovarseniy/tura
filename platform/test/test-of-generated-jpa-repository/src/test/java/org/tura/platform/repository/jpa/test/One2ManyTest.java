/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.jpa.test.repo.InitJPARepository;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.One2Many3A;
import objects.test.serialazable.jpa.One2Many3B;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2ManyTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

		@SuppressWarnings("unchecked")
		@Override
		public void addCommand(Object cmd) throws Exception {
			commandStack.add(cmd);
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Object> getListOfCommand() throws Exception {
			return commandStack;
		}

		@Override
		public void clear() throws Exception {
			commandStack.clear();
			
		}
		
	};	
	
	private static EntityManagerProvider emProvider = new EntityManagerProvider(){

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {
			
		}
	};

	private static Logger logger;
	private static Server server;

	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	@BeforeClass
	public static void beforeClass() throws Exception {
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
		em = emf.createEntityManager();

	}

	private ProxyRepository getRepository() throws Exception {
		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository init = new InitJPARepository(new SpaRepository(),registry,spaRegistry);
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initEntityManagerProvider(emProvider);

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));

		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}



	@Test
	public void t0000_One2Many() {
		try {
			ProxyRepository repository = getRepository();

			One2Many3A o1 = (One2Many3A) repository.create(One2Many3A.class.getName());

			repository.insert(o1, One2Many3A.class.getName());
			
			One2Many3B o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			repository.insert(o2, One2Many3B.class.getName());
			o2.setOne2Many3A(o1);
		
			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			repository.insert(o2, One2Many3B.class.getName());
			o2.setOne2Many3A(o1);
			
			
			repository.applyChanges(null);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			for (Object o : result.getSearchResult()){
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getOne2Many3A().getObjId());
			}
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria();
			search.add(sc);
			sc.setClassName(Long.class.getName());
			sc.setName("ref");
			sc.setValue(o1.getObjId());
			sc.setComparator(Operator.EQ.name());
			
			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			for (Object o : result.getSearchResult()){
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getOne2Many3A().getObjId());
			}
			
			for (Object o : result.getSearchResult()){
				repository.remove(o, One2Many3B.class.getName());
			}

			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			repository.insert(o2, One2Many3B.class.getName());
			o2.setOne2Many3A(o1);
		
			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			repository.insert(o2, One2Many3B.class.getName());
			o2.setOne2Many3A(o1);
			
			repository.applyChanges(null);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}



}

