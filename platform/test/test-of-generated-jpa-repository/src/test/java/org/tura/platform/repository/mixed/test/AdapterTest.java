/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.repository.mixed.test;

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
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.spa.test.CRUDService;
import org.tura.platform.repository.spa.test.SearchService;

import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.InitSPARepository;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.Q1;
import objects.test.serialazable.jpa.W1;
import objects.test.serialazable.jpa.W2;
import objects.test.serialazable.jpa.W3;

public class AdapterTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;

	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

	private static EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};

	private ProxyCommadStackProvider stackProvider = new ProxyCommadStackProvider() {

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
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		
		InitJPARepository initJpa = new InitJPARepository(new SpaRepository(),registry,spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(new SpaRepository(),registry,spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em,registry));
        spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.W1.class, new CRUDService());
        spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.W1.class, new SearchService(registry,spaRegistry));

        spaRegistry.getRegistry("test-spa-repository").addTrigger(org.tura.jpa.test.W1.class,  new W1PreQueryTrigger(registry));
        
        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W1.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W1.class.getName(), new SPAAdapterLoader());

        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W2.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W2.class.getName(), new SPAAdapterLoader());
        
        spaRegistry.getRegistry("test-spa-repository").addLoader(org.tura.jpa.test.W3.class.getName(), new SPAAdapterLoader());
        registry.addLoader(W3.class.getName(), new SPAAdapterLoader());

        
        return new ProxyRepository(repository, stackProvider);

	}
	
	@Test
	public void adapterObjectTest1() {
		try {
			ProxyRepository repository = getRepository();
			
			Q1 o1 = (Q1) repository.create(Q1.class.getName());
			W1 w1 = (W1) repository.create(W1.class.getName());
			
			repository.insert(o1, Q1.class.getName());
			repository.applyChanges(null);
			
			W2 w2 = (W2) repository.create(W2.class.getName());
			W3 w3 = (W3) repository.create(W3.class.getName());

			w1.setW2(w2);
			w1.getW3().add(w3);

			repository.insert(w1, W1.class.getName());

			o1.setW1(w1);
			
			repository.applyChanges(null);
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, Q1.class.getName());
			
			assertEquals(1, result.getSearchResult().size());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
}
