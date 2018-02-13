package org.sales.analyzer.process;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashMap;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jbpm.services.api.query.model.QueryDefinition.Target;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.api.model.definition.QueryDefinition;
import org.kie.server.api.model.instance.ProcessInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

import sales.analyzer.process.commons.Constants;


@RunWith(Arquillian.class)
public class CaseProcessingTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";

	
	@Before
	public void buildAndDeployArtifacts() {
		new TestCommons().buildAndDeployArtifacts();
	}

	@After
	public void dropContainer() {
		new TestCommons().dropContainer();
	}

	
	@Test
	@RunAsClient
	public void t0000_runCase() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, Constants.USERNAME,
					Constants.PASSWORD);
			
			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			
			HashMap<String, Object> params = new HashMap<>();
			params.put("city","Toronto");
			params.put("state","Ontario");
			params.put("product","Product02");
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
			
			try {
			queryClient.getQuery("getAllCaseDetailsInstances");
			queryClient.unregisterQuery("getAllCaseDetailsInstances");
			}catch(Exception e) {
				//Query not found
			}
			
			QueryDefinition query = new QueryDefinition();
			query.setName("getAllCaseDetailsInstances");
			query.setSource("java:jboss/datasources/ExampleDS");
			query.setTarget(Target.PROCESS.name());
			query.setExpression("SELECT pl.* FROM PROCESSINSTANCELOG pl \n" + 
					"INNER JOIN MAPPEDVARIABLE mv  ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" + 
					"INNER JOIN CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n"+
					"WHERE CD.CITY='Toronto' AND CD.PRODUCT='Product02' AND CD.STATE='Ontario'"
					);

			queryClient.registerQuery(query);
			
			Collection<ProcessInstance> instances = queryClient.query("getAllCaseDetailsInstances", "ProcessInstances",0,100,ProcessInstance.class );
			for (ProcessInstance p :instances) {
				if (p.getId().equals(procesInsatnceId) ) {
					return;
				}
			}
			fail();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	
	
	
}
