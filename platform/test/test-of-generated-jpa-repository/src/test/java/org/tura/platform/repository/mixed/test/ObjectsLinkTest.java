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
import org.tura.platform.repository.jpa.test.AllowEverythingProfile;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.spa.test.CRUDService;
import org.tura.platform.repository.spa.test.SearchService;
import org.tura.platform.repository.spa.test.TestServiceInstantiator;
import org.tura.platform.test.ClientSearchProvider;
import org.tura.spa.test.repo.InitSPARepository;

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.L1;
import objects.test.serialazable.jpa.L2;
import objects.test.serialazable.jpa.L3;
import objects.test.serialazable.jpa.L4;
import objects.test.serialazable.jpa.ProxyRepository;
import objects.test.serialazable.jpa.ProxyRepositoryInstantiator;

public class ObjectsLinkTest {

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

		private static final long serialVersionUID = -920838127763266712L;

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
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get().set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());
		registry.addInstantiator(new ProxyRepositoryInstantiator());

		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository(registry, spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository(registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry("test-spa-repository")
				.addInstantiator(new TestServiceInstantiator(registry, spaRegistry, "test-spa-repository"));

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject1.class,
				CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject1.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject2.class,
				CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject2.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject3.class,
				CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject3.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.SPAObject4.class,
				CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.SPAObject4.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.A1.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.A1.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.F1.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.F1.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.F1.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.T2.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.T2.class,
				SearchService.class);

		spaRegistry.getRegistry("test-spa-repository").addCRUDProvider(org.tura.jpa.test.L3.class, CRUDService.class);
		spaRegistry.getRegistry("test-spa-repository").addSearchProvider(org.tura.jpa.test.L3.class,
				SearchService.class);

		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());

		return proxy;

	}

	@SuppressWarnings("rawtypes")
	@Test
	public void linkedObjectTest1() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);

			L1 o1 = (L1) repository.create(L1.class.getName());
			L2 o2 = (L2) repository.create(L2.class.getName());
			o2.setDesc("Desc 1");

			AddLinkOperation lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) o1);
			lo.setDetail((ObjectControl) o2);
			lo.addLink("objId", "parentId");

			((ObjectControl) o2).setLinkOperation(lo);

			repository.insert(o1, L1.class.getName());
			repository.insert(o2, L2.class.getName());

			searchProvider.addKnownObject((ObjectControl) o1);
			searchProvider.addKnownObject((ObjectControl) o2);
			List commands = repository.applyChanges(null);
			processor.process(commands);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, L1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			L1 o1_ = (L1) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					L2.class.getName());
			assertEquals(1, result.getSearchResult().size());
			L2 o2_ = (L2) result.getSearchResult().get(0);

			assertEquals(o1_.getObjId(), o2_.getParentId());

			assertEquals(o1.getObjId(), o1_.getObjId());
			assertEquals(o2_.getParentId(), o2.getParentId());
			assertEquals(o2_.getDesc(), "Desc 1");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void linkedObjectTest2() {
		try {
			ProxyRepository repository = getRepository();
			ClientSearchProvider searchProvider = new ClientSearchProvider();
			ClientObjectProcessor processor = new ClientObjectProcessor(searchProvider);

			L3 o3 = (L3) repository.create(L3.class.getName());
			L4 o4 = (L4) repository.create(L4.class.getName());
			o3.setL4(o4);

			L2 o2 = (L2) repository.create(L2.class.getName());
			o2.setDesc("Desc 2");

			AddLinkOperation lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) o3);
			lo.setDetail((ObjectControl) o2);
			lo.addLink("objId", "parentId");

			((ObjectControl) o2).setLinkOperation(lo);

			repository.insert(o3, L3.class.getName());
			repository.insert(o2, L2.class.getName());

			searchProvider.addKnownObject((ObjectControl) o3);
			searchProvider.addKnownObject((ObjectControl) o2);
			List commands = repository.applyChanges(null);
			processor.process(commands);

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, L3.class.getName());
			assertEquals(1, result.getSearchResult().size());
			L3 o3_ = (L3) result.getSearchResult().get(0);

			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(o3.getObjId());
			List<SearchCriteria> search = new ArrayList<SearchCriteria>();
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, L2.class.getName());
			assertEquals(1, result.getSearchResult().size());
			L2 o2_ = (L2) result.getSearchResult().get(0);

			assertEquals(o3.getObjId(), o2_.getParentId());
			assertEquals(o3_.getObjId(), o2_.getParentId());
			assertEquals(o2_.getDesc(), "Desc 2");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
