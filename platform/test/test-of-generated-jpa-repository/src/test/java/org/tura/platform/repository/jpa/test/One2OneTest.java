/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.ClientObjectProcessor;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.test.ClientSearchProvider;

import objects.test.serialazable.jpa.JPAObject5;
import objects.test.serialazable.jpa.JPAObject6;
import objects.test.serialazable.jpa.One2One4A;
import objects.test.serialazable.jpa.One2One4B;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2OneTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry ;
	private SpaObjectRegistry spaRegistry ;

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider(){

		private static final long serialVersionUID = -4017069984190473832L;

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
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();
		
		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator());

		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository init = new InitJPARepository(registry,spaRegistry, new LocalRepositoryDataProducer());
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		init.initEntityManagerProvider(emProvider);

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));

		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}



	
	@SuppressWarnings("rawtypes")
	@Test
	public void t0000_One2One1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);

			One2One4A o1 = (One2One4A) repository.create(One2One4A.class.getName());
			
			One2One4B o2 = (One2One4B) repository.create(One2One4B.class.getName());
			
			repository.insert(o2, One2One4B.class.getName());
			repository.insert(o1, One2One4A.class.getName());
			o2.setOne2One4A(o1);
			
			searchProvider.addKnownObject((ObjectControl) o2);
			searchProvider.addKnownObject((ObjectControl) o1);
			
			List commands =  repository.applyChanges(null);
			processor.process(commands);
			
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class.getName());
			assertEquals(1,result.getSearchResult().size());

			o2 = (One2One4B) result.getSearchResult().get(0);
			assertEquals( o1.getObjId(),  o2.getOne2One4A().getObjId());
			
			o1 = (One2One4A) repository.create(One2One4A.class.getName());
			repository.insert(o1, One2One4A.class.getName());
			o2.setOne2One4A(o1);
			
			repository.applyChanges(null);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4A.class.getName());
			assertEquals(2,result.getSearchResult().size());
			o1 = (One2One4A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One4B.class.getName());
			assertEquals(1,result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	@SuppressWarnings("rawtypes")
	@Test
	public void t0001_One2One1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);

			JPAObject5 o1 = (JPAObject5) repository.create(JPAObject5.class.getName());
			JPAObject6 o2 = (JPAObject6) repository.create(JPAObject6.class.getName());
			
			o1.setUkObj5(100L);
			o1.setJPAObject6(o2);

			repository.insert(o1, JPAObject5.class.getName());

			searchProvider.addKnownObject((ObjectControl) o1);
			searchProvider.addKnownObject((ObjectControl) o2);
			List commands =  repository.applyChanges(null);
			processor.process(commands);
			
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, JPAObject5.class.getName());
			assertEquals(1,result.getSearchResult().size());
			JPAObject5 o1_ = (JPAObject5) result.getSearchResult().get(0);
			JPAObject6 o2_ = o1.getJPAObject6() ;
           assertNotNull(o2_);

           assertEquals(o1.getJpaObj5(), o1_.getJpaObj5());
           assertEquals(o2.getJpaObj6(), o2_.getJpaObj6());
           
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	

	
}
