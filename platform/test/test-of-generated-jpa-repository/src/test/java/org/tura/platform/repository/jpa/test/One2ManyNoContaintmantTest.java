/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2ManyNoContaintmantTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry ;
	private SpaObjectRegistry spaRegistry ;

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

		private static final long serialVersionUID = 912253233235696392L;

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
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get() .set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();
		
		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator());
		
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository init = new InitJPARepository(registry,spaRegistry);
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

			One2Many1A o1 = (One2Many1A) repository.create(One2Many1A.class.getName());
			
			One2Many1B o2 = (One2Many1B) repository.create(One2Many1B.class.getName());
			repository.insert(o2, One2Many1B.class.getName());
		
			o2 = (One2Many1B) repository.create(One2Many1B.class.getName());
			repository.insert(o2, One2Many1B.class.getName());
			
			o1.getOne2Many1B().add( o2);
			repository.insert(o1, One2Many1A.class.getName());
			
			repository.applyChanges(null);
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many1A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			
			repository.remove(o1, One2Many1A.class.getName());
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1A.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			o1 = (One2Many1A) repository.create(One2Many1A.class.getName());
			repository.insert(o1, One2Many1A.class.getName());
			
			for (Object o : result.getSearchResult()){
				o1.getOne2Many1B().add((One2Many1B) o);
			}
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1B.class.getName());
			assertEquals(2,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			o1 = (One2Many1A) result.getSearchResult().get(0);
			ArrayList <One2Many1B> array = new ArrayList<>();
		    array.addAll(o1.getOne2Many1B());
			for (Object o : array){
				o1.getOne2Many1B().remove(o);
			}
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1B.class.getName());
			assertEquals(2,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many1A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			o1 = (One2Many1A) result.getSearchResult().get(0);
			
			assertEquals(o1.getOne2Many1B().size(), 0);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
}