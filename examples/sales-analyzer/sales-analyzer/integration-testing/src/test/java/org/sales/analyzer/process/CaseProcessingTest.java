/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashMap;

import org.jbpm.services.api.query.model.QueryDefinition.Target;
import org.junit.Test;
import org.kie.server.api.model.definition.QueryDefinition;
import org.kie.server.api.model.instance.TaskInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;

import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.process.commons.Constants;

public class CaseProcessingTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";


	@Test
	public void t0000_runCase() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

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
			query.setSource(PostDeployer.JNDI_FOR_JBPM_ACCESS);
			query.setTarget(Target.PROCESS.name());
			query.setExpression("SELECT "
		      +"pl.ID PROC_ID,pl.CORRELATIONKEY PROC_CORRELATIONKEY,pl.DURATION PROC_DURATION ,pl.END_DATE PROC_END_DATE ,pl.EXTERNALID PROC_EXTERNALID,pl.USER_IDENTITY PROC_USER_IDENTITY,pl.OUTCOME PROC_OUTCOME,pl.PARENTPROCESSINSTANCEID PROC_PARENTPROCESSINSTANCEID,pl.PROCESSID PROC_PROCESSID,pl.PROCESSINSTANCEDESCRIPTION PROC_PROCESSINSTANCEDESCRIPTION,pl.PROCESSINSTANCEID PROC_PROCESSINSTANCEID,pl.PROCESSNAME PROC_PROCESSNAME,pl.PROCESSVERSION PROC_PROCESSVERSION,pl.START_DATE PROC_START_DATE,pl.STATUS PROC_STATUS,\n" 	
					+ "CD.CITY AS CITY, CD.PRODUCT AS PRODUCT, CD.STATE AS STATES FROM KIESERVER.PROCESSINSTANCELOG pl \n"
					+ "INNER JOIN KIESERVER.MAPPEDVARIABLE mv ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n"
					+ "INNER JOIN KIESERVER.CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n"
					+ "WHERE CD.CITY=1000 AND CD.PRODUCT='Product02' AND CD.STATE=2000");

			queryClient.registerQuery(query);

			query = new QueryDefinition();
			query.setName("getAllTaskiInstancesForCase");
			query.setSource(PostDeployer.JNDI_FOR_JBPM_ACCESS);
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

