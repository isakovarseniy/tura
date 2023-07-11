/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.sales.analyzer.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.kie.server.api.model.instance.NodeInstance;
import org.kie.server.api.model.instance.TaskSummary;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.kie.server.client.UserTaskServicesClient;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;

import sales.analyzer.process.commons.Constants;


public class ImportProcessTest {

	private static int RETRY = 300;
	private static final String PROCESS_ID = "sales.analyzer.MonthlyFileLoad";
	private static final String FILE_LOAD_NODE = "File Loader";
	private static final String REVIEW_ERROR = "Review error";
	@SuppressWarnings("unused")
	private static final String PREPARE_DATA_FOR_RULES = "Prepare data for rule processing";
	@SuppressWarnings("unused")
	private static final String RUN_BUSINESS_RULES = "Run business rules";
	private static final String REVIEW_BUSSINESS_RULES_RESULT = "Review bussiness rules result";
	@SuppressWarnings("unused")
	private static final String RUN_CASE_GENERATION = "Run case generation";
	private static final String REVIEW_CEASE_GENERATION="Review cease generation";
	

	@Test
	public void t0000_MonthlyDataLoader_HappyPath() {
		try {
			
			
			
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			
			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, new HashMap<String, Object>());

			UserTaskServicesClient userTaskServicesClient = client.getServicesClient(UserTaskServicesClient.class);
			List<String> status = Arrays.asList(new String[] {"Ready"});

			
			List<TaskSummary> tasks = userTaskServicesClient.findTasksByStatusByProcessInstanceId(procesInsatnceId, status, 0, 40);
			assertEquals(1, tasks.size());

			userTaskServicesClient.claimTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			userTaskServicesClient.startTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

			Map<String, Object> params = new HashMap<>();
			params.put("dateOfFile", formatter.parse("01-11-2017"));
			userTaskServicesClient.completeTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null, params);

			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
			waitForNodeCompleated(FILE_LOAD_NODE, procesInsatnceId, queryClient);
			
			 tasks = userTaskServicesClient.findTasksByStatusByProcessInstanceId(procesInsatnceId, status, 0, 40);
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
			
			waitForNodeStarted(new String[] {REVIEW_BUSSINESS_RULES_RESULT}, procesInsatnceId, queryClient);
			
			tasks = userTaskServicesClient.findTasksByStatusByProcessInstanceId(procesInsatnceId, status, 0, 40);
			assertEquals(1, tasks.size());
			assertEquals(REVIEW_BUSSINESS_RULES_RESULT,tasks.get(0).getName()); 

			userTaskServicesClient.claimTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			userTaskServicesClient.startTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			
			map = userTaskServicesClient.getTaskInputContentByTaskId(Constants.CONTAINER_ID, tasks.get(0).getId());
			asyncResult = (Boolean) map.get("executionError");
			
			if (asyncResult == true ) {
				fail();
			}

			params.put("direction", 0);
			userTaskServicesClient.completeTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null, params);
			
			
			waitForNodeStarted( new String[] {REVIEW_CEASE_GENERATION}, procesInsatnceId, queryClient);
			
			tasks = userTaskServicesClient.findTasksByStatusByProcessInstanceId(procesInsatnceId, status, 0, 40);
			assertEquals(1, tasks.size());
			assertEquals(REVIEW_CEASE_GENERATION,tasks.get(0).getName()); 

			userTaskServicesClient.claimTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			userTaskServicesClient.startTask(Constants.CONTAINER_ID, tasks.get(0).getId(), null);
			
			map = userTaskServicesClient.getTaskInputContentByTaskId(Constants.CONTAINER_ID, tasks.get(0).getId());
			asyncResult = (Boolean) map.get("executionError");
			
			if (asyncResult == true ) {
				fail();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	public void waitForNodeCompleated(String[] nodeNames, Long procesInsatnceId, QueryServicesClient queryClient) throws Exception {
		 List<String>  listOfNodes =  Arrays.asList(nodeNames);
			boolean found = false;
			for (int i = 0; i < RETRY; i++) {
				List<NodeInstance> completedNodes = queryClient.findCompletedNodeInstances(procesInsatnceId, 0, 100);
				if (completedNodes.size() > 0 && listOfNodes.contains( completedNodes.get(completedNodes.size() - 1).getName())) {
					found = true;
					break;
				}
				Thread.sleep(1000);
			}
			if (!found) {
				throw new Exception("Node has not been fired");
			}
	}

	
	public void waitForNodeCompleated(String nodeName, Long procesInsatnceId, QueryServicesClient queryClient) throws Exception {
		waitForNodeCompleated( new String[] {nodeName} ,procesInsatnceId,queryClient);
	}
	
	public void waitForNodeStarted(String[] nodeNames, Long procesInsatnceId, QueryServicesClient queryClient) throws Exception {
		 List<String>  listOfNodes =  Arrays.asList(nodeNames);
			boolean found = false;
			for (int i = 0; i < RETRY; i++) {
				List<NodeInstance> completedNodes = queryClient.findActiveNodeInstances(procesInsatnceId, 0, 100);
				if (completedNodes.size() > 0 && listOfNodes.contains( completedNodes.get(completedNodes.size() - 1).getName())) {
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
