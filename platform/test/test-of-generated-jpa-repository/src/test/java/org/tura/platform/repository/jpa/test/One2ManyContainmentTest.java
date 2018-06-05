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
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.persistence.JpaRepository;
import org.tura.platform.object.persistence.JpaTransactionAdapter;
import org.tura.platform.repository.core.BasicRepository;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.One2Many2A;
import objects.test.serialazable.jpa.One2Many2B;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class One2ManyContainmentTest {

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
		
		InitJPARepository init = new InitJPARepository(new JpaRepository(em));
		init.initClassMapping();
		init.initCommandProducer();
		init.initProvider();
		
		Registry.getInstance().setTransactrionAdapter(new JpaTransactionAdapter(em));

		return  new ProxyRepository(repository,stackProvider);
		
	}


	@Test
	public void t0000_One2Many() {
		try {
			ProxyRepository repository = getRepository();

			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class.getName());
			
			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class.getName());
			o1.getOne2Many2B().add(o2);
		
			o2 = (One2Many2B) repository.create(One2Many2B.class.getName());
			o1.getOne2Many2B().add(o2);
			
			repository.insert(o1, One2Many2A.class.getName());
			repository.applyChanges(null);
			

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			
			repository.remove(o1, One2Many2A.class.getName());
			repository.applyChanges(null);
			

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2A.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2B.class.getName());
			assertEquals(0,result.getSearchResult().size());
			

			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}


	@Test
	public void t0001_One2Many() {
		try {
			ProxyRepository repository = getRepository();


			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class.getName());
			
			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class.getName());
			o1.getOne2Many2B().add(o2);
		
			o2 = (One2Many2B) repository.create(One2Many2B.class.getName());
			o1.getOne2Many2B().add(o2);
			
			repository.insert(o1, One2Many2A.class.getName());
			repository.applyChanges(null);
			

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2B.class.getName());
			assertEquals(2,result.getSearchResult().size());
			
			
			ArrayList <One2Many2B> array = new ArrayList<>();
		    array.addAll(o1.getOne2Many2B());
			for (Object o : array){
				o1.getOne2Many2B().remove(o);
			}
			repository.applyChanges(null);
			

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);
			assertEquals(0, o1.getOne2Many2B().size());
			
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2Many2B.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}



}

