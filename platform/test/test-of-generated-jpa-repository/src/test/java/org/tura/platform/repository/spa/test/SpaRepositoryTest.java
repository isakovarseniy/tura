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
package org.tura.platform.repository.spa.test;

import static org.junit.Assert.*;

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
import org.tura.platform.object.persistence.JPATransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.InitSPARepository;
import objects.test.serialazable.jpa.ProxyRepository;

public class SpaRepositoryTest {

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;
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
		Registry.newInstance();
		Registry.getInstance().setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository();
		commandStack = new ArrayList<>();
		
		InitSPARepository init = new InitSPARepository(new SpaRepository());
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		
		
		Repository nutRepository = new NutRepository();
        Registry.getInstance().addProvider("org.tura.jpa.test.DD1", nutRepository);
        Registry.getInstance().addClassMapping("objects.test.serialazable.jpa.DD1","org.tura.jpa.test.DD1");
		
		Registry.getInstance().setTransactrionAdapter(new JPATransactionAdapter(em));
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.A1.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.A1.class, new SearchService());

        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.F1.class, new CRUDService());
        SpaObjectRegistry.getInstance().getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.F1.class, new SearchService());
		
		return  new ProxyRepository(repository,stackProvider);
		
	}
	
	@Test
	public void t0000_saveObject() {
		try {
			ProxyRepository repository = getRepository();
			
			A1 a1 = (A1) repository.create(A1.class.getName());
			A2 a2 = (A2) repository.create(A2.class.getName());
			a1.setA2(a2);
			repository.insert(a1, A1.class.getName());
			repository.applyChanges(null);
			
			SearchResult  result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class.getName());
			assertEquals(1, result.getNumberOfRows());
			
			A1  a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(a1.getA2().getObjId(), a1_.getA2().getObjId());
			assertNull(a1_.getA5());
			
			assertEquals(0,a1_.getA2().getA3().size());
			assertEquals(0,a1_.getA2().getA4().size());

		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
}
