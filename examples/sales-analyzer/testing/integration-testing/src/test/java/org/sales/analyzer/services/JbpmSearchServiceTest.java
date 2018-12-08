package org.sales.analyzer.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.sales.analyzer.process.TestCommons;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

import com.octo.java.sql.query.SelectQuery.Order;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.JbpmConfiguration;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstancePK;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.service.jbpm.JbpmSearchService;
import sales.analyzer.user.UserPreferences;

@RunWith(Arquillian.class)
public class JbpmSearchServiceTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";
	
	private static UserPreferences pref ;
	
	@Test
	@RunAsClient
	public void t0000_searchCase() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);
			
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new TestCommons().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			String caseId = UUID.randomUUID().toString();
			HashMap<String, Object> params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId);
			
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			
			String caseId1 = UUID.randomUUID().toString();
			params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId1);
			Long procesInsatnceId1 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, TestCommons.JNDI_FOR_JBPM_ACCESS);
			
			SalesAnalyzerProcessInstancePK pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId);
			pk.setId(procesInsatnceId);
			JbpmSearchService service = new JbpmSearchService(client, provider);
			SalesAnalyzerProcessInstance instance =(SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());


			pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId("NA");
			pk.setId(procesInsatnceId);
			service = new JbpmSearchService(client, provider);
			instance =(SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class.getName());
			assertNull(instance);
			

			pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId1);
			pk.setId(procesInsatnceId1);
			service = new JbpmSearchService(client, provider);
			instance =(SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId1, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());
			
			pref.setSuperAdmin(false);
			service = new JbpmSearchService(client, provider);
			instance =(SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class.getName());
			assertNull(instance);

			
			pref.setSuperAdmin(true);
			
			service = new JbpmSearchService(client, provider);
			SalesAnalyzerTaskInstance taskInstance =(SalesAnalyzerTaskInstance) service.find(ti.getId(), SalesAnalyzerTaskInstance.class.getName());
			assertEquals(taskInstance.getId(), ti.getId());
			SalesAnalyzerProcessInstance pi = taskInstance.getProcess();
			assertEquals(procesInsatnceId1, pi.getId());
			
			pref.setSuperAdmin(false);
			taskInstance =(SalesAnalyzerTaskInstance) service.find(ti.getId(), SalesAnalyzerTaskInstance.class.getName());
			assertNull(taskInstance);


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}


	@Test
	@RunAsClient
	public void t0000_searchByCaseId() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);
			
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new TestCommons().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			String caseId = UUID.randomUUID().toString();
			HashMap<String, Object> params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId);
			
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, TestCommons.JNDI_FOR_JBPM_ACCESS);
			
			JbpmSearchService service = new JbpmSearchService(client, provider);
			SalesAnalyzerProcessInstancePK pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId);
			pk.setId(procesInsatnceId);
			SalesAnalyzerProcessInstance instance =(SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			assertEquals(caseId, instance.getCaseId());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	@RunAsClient
	public void t0001_searchCase() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);
			
			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
	
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new TestCommons().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			HashMap<String, Object> params = new HashMap<>();
			params.put("city", 1500);
			params.put("state", 2500);
			params.put("product", "Product03");
			@SuppressWarnings("unused")
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			
			params = new HashMap<>();
			params.put("city", 1501);
			params.put("state", 2501);
			params.put("product", "Product04");
			@SuppressWarnings("unused")
			Long procesInsatnceId1 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			
			params = new HashMap<>();
			params.put("city", 1500);
			params.put("state", 2502);
			params.put("product", "Product05");
			@SuppressWarnings("unused")
			Long procesInsatnceId2 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			params = new HashMap<>();
			params.put("city", 1501);
			params.put("state", 2502);
			params.put("product", "Product05");
			@SuppressWarnings("unused")
			Long procesInsatnceId3 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			
			JbpmConfiguration.init(client, TestCommons.JNDI_FOR_JBPM_ACCESS);
			
			
			ArrayList<SearchCriteria> searchCriteria = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_CITY);
			sc.setValue(1500);
			searchCriteria.add(sc);
			
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_STATE);
			sc.setValue(2502);
			searchCriteria.add(sc);
			
			
			ArrayList<OrderCriteria> orderCriteria = new ArrayList<>();
			OrderCriteria orc = new OrderCriteria();
			orc.setName("PROC_"+"PROCESSINSTANCEID");
			orc.setOrder(Order.DESC.name());
			
			
			JbpmSearchService service = new JbpmSearchService(client, provider);
			service.setMapper(new ProcessMapper());
			SearchResult result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerProcessInstance.class.getName());
			assertNotEquals(0, result.getSearchResult().size());
			
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerProcessInstance pi = (SalesAnalyzerProcessInstance) o;
				assertEquals(pi.getCity(), new Integer(1500));
				assertEquals(pi.getStates(), new Integer(2502));
			}


			service.setMapper(new TaskMapper());
			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
			assertNotEquals(0, result.getSearchResult().size());
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getCity(), new Integer(1500));
				assertEquals(pi.getStates(), new Integer(2502));
			}
			
			searchCriteria = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_PRODUCT);
			sc.setValue("Product05");
			searchCriteria.add(sc);

			service.setMapper(new TaskMapper());
			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
			assertNotEquals(0, result.getSearchResult().size());
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getProduct(), "Product05");
			}
			pref.setSuperAdmin(false);
			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
			assertEquals(0, result.getSearchResult().size());
			
			ArrayList<Integer> allowerStates = new ArrayList<>();
			allowerStates.add(2502);
			
			ArrayList<Integer> allowerCities = new ArrayList<>();
			allowerCities.add(1500);
			pref.setStates(allowerStates);
			pref.setCities(allowerCities);
			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
			assertEquals(0, result.getSearchResult().size());
			
			AssignInfo info = new AssignInfo();
			info.setAnalyst("sales-manager");
			processClient.signalProcessInstance(Constants.CONTAINER_ID, procesInsatnceId2, Constants.SIGNAL_ASSIGN, info);

			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
			assertNotEquals(0, result.getSearchResult().size());

			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getProduct(), "Product05");
				assertEquals(pi.getCity(), new Integer (1500));
				assertEquals(pi.getStates(), new Integer( 2502));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}


	class ProcessMapper implements Mapper{
		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((SalesAnalyzerProcessInstance )persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	class TaskMapper implements Mapper{

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((SalesAnalyzerTaskInstance )persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}
		
	}
	class UserPeferencesProviderImpl implements UserPreferencesProvider{
		
		@Override
		public UserPreferences getUserPreferences(String userName) {
			return JbpmSearchServiceTest.pref;
		}
		
	}
	
}

