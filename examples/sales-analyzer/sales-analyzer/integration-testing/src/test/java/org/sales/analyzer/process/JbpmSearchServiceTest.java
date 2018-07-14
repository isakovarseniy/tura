package org.sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

import com.octo.java.sql.query.SelectQuery.Order;

import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.JbpmConfiguration;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.jbpm.JbpmSearchService;

@RunWith(Arquillian.class)
public class JbpmSearchServiceTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";

	@Before
	public void buildAndDeployArtifacts() throws Exception {
		new TestCommons().buildAndDeployArtifacts();
	}

	@After
	public void dropContainer() throws Exception {
		new TestCommons().dropContainer();
	}
	
	@Test
	@RunAsClient
	public void t0000_runCase() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new TestCommons().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			HashMap<String, Object> params = new HashMap<>();
			params.put("city", 1000);
			params.put("state", 2000);
			params.put("product", "Product02");
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			Long procesInsatnceId1 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			
			JbpmConfiguration.init(client, "java:jboss/datasources/ExampleDS");
			
			JbpmSearchService service = new JbpmSearchService(client);
			SalesAnalyzerProcessInstance instance =(SalesAnalyzerProcessInstance) service.find(procesInsatnceId, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().get(0);
			assertNotNull(ti.getId());

			service = new JbpmSearchService(client);
			instance =(SalesAnalyzerProcessInstance) service.find(-987, SalesAnalyzerProcessInstance.class.getName());
			assertNull(instance);
			
			service = new JbpmSearchService(client);
			instance =(SalesAnalyzerProcessInstance) service.find(procesInsatnceId1, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId1, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			ti = instance.getActiveUserTasks().get(0);
			assertNotNull(ti.getId());
			
			
			service = new JbpmSearchService(client);
			SalesAnalyzerTaskInstance taskInstance =(SalesAnalyzerTaskInstance) service.find(ti.getId(), SalesAnalyzerTaskInstance.class.getName());
			assertEquals(taskInstance.getId(), ti.getId());
			SalesAnalyzerProcessInstance pi = taskInstance.getProcess();
			assertEquals(procesInsatnceId1, pi.getId());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	@RunAsClient
	public void t0001_runCase() {
		try {
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
			
			JbpmConfiguration.init(client, "java:jboss/datasources/ExampleDS");
			
			
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
			
			
			JbpmSearchService service = new JbpmSearchService(client);
			service.setMapper(new ProcessMapper());
			SearchResult result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerProcessInstance.class.getName());
			
			
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerProcessInstance pi = (SalesAnalyzerProcessInstance) o;
				assertEquals(pi.getCity(), new Integer(1500));
				assertEquals(pi.getStates(), new Integer(2502));
			}


			service.setMapper(new TaskMapper());
			result = service.find(searchCriteria, orderCriteria,0,100, SalesAnalyzerTaskInstance.class.getName());
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
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getProduct(), "Product05");
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
		
	}
	
	
}

