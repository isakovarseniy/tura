package org.sales.analyzer.process;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.jboss.arquillian.container.test.api.ContainerController;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jbpm.services.api.query.model.QueryDefinition.Target;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.api.model.definition.QueryDefinition;
import org.kie.server.api.model.instance.TaskInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

import sales.analyzer.api.model.impl.SalesAnalyzerListOfProcessInstances;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.process.commons.Constants;

@RunWith(Arquillian.class)
public class CaseProcessingTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";

	@ArquillianResource
	private ContainerController controller;

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
			HashSet<Class<?>> newList = new HashSet<Class<?>>();
			newList.add(SalesAnalyzerListOfProcessInstances.class);
			newList.add(SalesAnalyzerProcessInstance.class);
			config.addExtraClasses(newList);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			HashMap<String, Object> params = new HashMap<>();
			params.put("city", 1000);
			params.put("state", 2000);
			params.put("product", "Product02");
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);

			try {
				queryClient.getQuery("getAllCaseDetailsInstances");
				queryClient.unregisterQuery("getAllCaseDetailsInstances");
			} catch (Exception e) {
				// Query not found
			}

			try {
				queryClient.getQuery("getAllTaskiInstancesForCase");
				queryClient.unregisterQuery("getAllTaskiInstancesForCase");
			} catch (Exception e) {
				// Query not found
			}

			QueryDefinition query = new QueryDefinition();
			query.setName("getAllCaseDetailsInstances");
			query.setSource("java:jboss/datasources/ExampleDS");
			query.setTarget(Target.PROCESS.name());
			query.setExpression("SELECT pl.* ,CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES FROM KIESERVER.PROCESSINSTANCELOG pl \n"
					+ "INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n"
					+ "INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n"
					+ "WHERE CD.CITY=1000 AND CD.PRODUCT='Product02' AND CD.STATE=2000");

			queryClient.registerQuery(query);

			query = new QueryDefinition();
			query.setName("getAllTaskiInstancesForCase");
			query.setSource("java:jboss/datasources/ExampleDS");
			query.setTarget(Target.TASK.name());
			query.setExpression("SELECT TSK.* FROM KIESERVER.TASK TSK \n"
					+ "INNER JOIN KIESERVER.TASKEXTENDEDINFO INFO ON INFO.TASKID=tsk.ID\n"
					+ "WHERE INFO.CITY=1000 AND INFO.PRODUCT='Product02' AND INFO.STATE=2000");

			queryClient.registerQuery(query);

			Collection<SalesAnalyzerProcessInstance> instances = queryClient.query("getAllCaseDetailsInstances", "SalesAnalyzerProcessInstance",
					0, 100, SalesAnalyzerProcessInstance.class);
			boolean isFind = false;
			
			for (SalesAnalyzerProcessInstance p : instances) {
				if (p.getId().equals(procesInsatnceId)) {
					isFind = true;
				}
			}
			if (!isFind) {
				fail();
			}

			Collection<TaskInstance> tasks = queryClient.query("getAllTaskiInstancesForCase", "UserTasks", 0, 100,
					TaskInstance.class);
			isFind = false;
			for (TaskInstance t : tasks) {
				if (t.getProcessInstanceId().equals(procesInsatnceId)) {
					isFind = true;
				}
			}
			if (!isFind) {
				fail();
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}

