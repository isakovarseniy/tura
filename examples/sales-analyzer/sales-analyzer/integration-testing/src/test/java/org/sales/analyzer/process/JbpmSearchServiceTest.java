package org.sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

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

import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.SalesAnalyzerConfiguration;
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
			
			SalesAnalyzerConfiguration.init(client, "java:jboss/datasources/ExampleDS");
			
			JbpmSearchService service = new JbpmSearchService(client);
			SalesAnalyzerProcessInstance instance =(SalesAnalyzerProcessInstance) service.find(procesInsatnceId, SalesAnalyzerProcessInstance.class.getName());
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().get(0);
			assertNotNull(ti.getId());

			
			service = new JbpmSearchService(client);
			instance =(SalesAnalyzerProcessInstance) service.find(-987, SalesAnalyzerProcessInstance.class.getName());
			assertNull(instance);
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	

}

