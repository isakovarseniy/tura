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

package org.sales.analyzer.services;

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
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.sales.analyzer.process.PostDeployer;
import org.sales.analyzer.services.impl.AllowEverythingProfile;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;
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
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.ProductGroupHistory;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.JbpmConfiguration;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.commons.service.impl.JbpmServiceInstantiator;
import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.service.jbpm.JbpmCRUDService;
import sales.analyzer.service.jbpm.JbpmSearchService;
import sales.analyzer.user.UserPreferences;


public class JbpmServiceTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";

	
	private static Logger logger;
	private static Server server;

	private static EntityManager em;
	@SuppressWarnings("rawtypes")
	private static List commandStack;
	
	private static UserPreferences pref ;

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

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


		private static final long serialVersionUID = -3230462391379553791L;

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

		pref = new UserPreferences();
		pref.setSuperAdmin(true);
		
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
				null);
		config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
		config.addExtraClasses(ExtraClasses.list);

		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);

		JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);
		
		
		registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
		Repository repository = new BasicRepository(registry);
		commandStack = new ArrayList<>();

		InitJPARepository initJpa = new InitJPARepository( registry, spaRegistry);
		initJpa.initClassMapping();
		initJpa.initCommandProducer();
		initJpa.initProvider();
		initJpa.initEntityManagerProvider(emProvider);

		InitSPARepository initSpa = new InitSPARepository( registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();


		JbpmServiceInstantiator init = new JbpmServiceInstantiator( PostDeployer.KIE_SERVER_URL , new OAuthCredentialsProvider(new PostDeployer().getToken()),new UserPeferencesProviderImpl(),registry,spaRegistry,"spa-persistence-repository");
		
		
		registry.setTransactrionAdapter(new JpaTransactionAdapter(em, registry));
		spaRegistry.getRegistry("spa-persistence-repository").addInstantiator(init);
		
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerProcessInstance.class,JbpmCRUDService.class);
		spaRegistry.getRegistry("spa-persistence-repository").addCRUDProvider(SalesAnalyzerTaskInstance.class,JbpmCRUDService.class);
		
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerProcessInstance.class, JbpmSearchService.class);
		spaRegistry.getRegistry("spa-persistence-repository").addSearchProvider(SalesAnalyzerTaskInstance.class, JbpmSearchService.class);
		registry.addProfile(AllowEverythingProfile.class.getName(), new AllowEverythingProfile());


		ProxyRepository proxy = new ProxyRepository(repository, stackProvider);
		proxy.setProfile(AllowEverythingProfile.class.getName());
		
		return proxy;

	}
	
	
	@Test
	public void t0000_createCase() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);
			Repository repository = getRepository();
			
			CaseProcess c1 = (CaseProcess) repository.create(CaseProcess.class.getName());
			String caseId = c1.getCaseId();
			c1.setProcessId(PROCESS_ID);
			repository.insert(c1, CaseProcess.class.getName());
			

			State state = (State) repository.create(State.class.getName());
			repository.insert(state, State.class.getName());
			
			City city = (City) repository.create(City.class.getName());
			repository.insert(city, City.class.getName());
			
			
			ProductGroupHistory h1 = (ProductGroupHistory) repository.create(ProductGroupHistory.class.getName());
			repository.insert(h1, ProductGroupHistory.class.getName());
			h1.setCityId(city.getObjId());
			h1.setStateId(state.getObjId());
			h1.setProduct("Product1");
			
//			c1.getProductGroupHistory().add(h1);
			
			repository.applyChanges(null);
			
			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_CASE_ID);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(caseId);
			search.add(sc);
			SearchResult  result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100,CaseProcess.class.getName());
			assertEquals(1, result.getNumberOfRows());

			CaseProcess c1_ = (CaseProcess) result.getSearchResult().get(0);
//			assertEquals(1, c1_.getProductGroupHistory().size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	class UserPeferencesProviderImpl implements UserPreferencesProvider{
		
		@Override
		public UserPreferences getUserPreferences(String userName) {
			return JbpmServiceTest.pref;
		}
		
	}
	
	
}

