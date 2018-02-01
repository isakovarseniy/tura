package org.sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.api.model.instance.NodeInstance;
import org.kie.server.api.model.instance.TaskSummary;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.kie.server.client.UserTaskServicesClient;

import sales.analyzer.process.commons.Constants;


@RunWith(Arquillian.class)
public class ImportProcessTest {

	private static int RETRY = 100;
	private static ReleaseId releaseId = new ReleaseId("sales-analyzer", "processes", "1.0.0-SNAPSHOT");
	private static final String PROCESS_ID = "sales.analyzer.MonthlyFileLoad";
	private static final String KIE_SERVER_URL = "http://localhost:8080/kie-server-6.5.0.Final-ee7/services/rest/server";
	private static final String USERNAME = "kieserver";
	private static final String PASSWORD = "kieserver";
	private static final String FILE_LOAD_NODE = "File Loader";
	private static final String REVIEW_ERROR = "Review error";
//	private static final String PREPARE_DATA_FOR_RULES = "Prepare data for rule processing";
	private static final String RUN_BUSINESS_RULES = "Run business rules";
	

	@Before
	public void buildAndDeployArtifacts() {
		for (int i = 0; i < 10; i++) {
			try {
				KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME,
						PASSWORD);
				KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
				client.createContainer(Constants.CONTAINER_ID, new KieContainerResource(releaseId));
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
			}
		}
	}

	@After
	public void dropContainer() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME, PASSWORD);
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.disposeContainer(Constants.CONTAINER_ID);
	}

	@Test
	@RunAsClient
	public void t0000_MonthlyDataLoader_HappyPath() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME,
					PASSWORD);
			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, new HashMap<String, Object>());

			UserTaskServicesClient userTaskServicesClient = client.getServicesClient(UserTaskServicesClient.class);

			List<TaskSummary> tasks = userTaskServicesClient.findTasksAssignedAsPotentialOwner(null, 0, 40);
			assertEquals(1, tasks.size());

			userTaskServicesClient.claimTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			userTaskServicesClient.startTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

			Map<String, Object> params = new HashMap<>();
			params.put("dateOfFile", formatter.parse("01-10-2017"));
			userTaskServicesClient.completeTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null, params);

			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
			waitForNode(FILE_LOAD_NODE, procesInsatnceId, queryClient);
			
			tasks = userTaskServicesClient.findTasksAssignedAsPotentialOwner(null, 0, 40);
			assertEquals(1, tasks.size());
			assertEquals(REVIEW_ERROR,tasks.get(0).getName()); 

			userTaskServicesClient.claimTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			userTaskServicesClient.startTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			
			Map<String,Object> map = userTaskServicesClient.getTaskInputContentByTaskId(Constants.CONTAINER_ID, tasks.get(0).getId());
			Boolean asyncResult = (Boolean) map.get("executionError");
			
			if (asyncResult == true ) {
				fail();
			}

			params.put("direction", 0);
			userTaskServicesClient.completeTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null, params);
			
			waitForNode(RUN_BUSINESS_RULES, procesInsatnceId, queryClient);
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void waitForNode(String nodeName, Long procesInsatnceId, QueryServicesClient queryClient) throws Exception {
		boolean found = false;
		for (int i = 0; i < RETRY; i++) {
			List<NodeInstance> completedNodes = queryClient.findCompletedNodeInstances(procesInsatnceId, 0, 100);
			if (completedNodes.size() > 0 && completedNodes.get(completedNodes.size() - 1).getName().equals(nodeName)) {
				found = true;
				break;
			}
			Thread.sleep(1000);
		}
		if (!found) {
			throw new Exception("Node has not been fired");
		}

	}
}