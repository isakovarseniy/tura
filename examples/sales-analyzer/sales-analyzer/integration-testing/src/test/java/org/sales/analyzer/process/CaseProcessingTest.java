package org.sales.analyzer.process;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

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

import sales.analyzer.process.CaseDetails;
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
			
			HashSet<Class<?>> set = new HashSet<>();
			set.add(CaseDetails.class);
			config.addExtraClasses(set);
			
			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			CaseDetails caseDetails =new CaseDetails();
			caseDetails.setCity("Toronto");
			caseDetails.setState("Ontario");
			caseDetails.setProduct("Product02");
			
			HashMap<String, Object> params = new HashMap<>();
			params.put("caseDetails", caseDetails);
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);
			
			
			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
			
			QueryDefinition caseQuery = queryClient.getQuery("getAllCaseDetailsInstances");
			
			if (caseQuery != null) {
				queryClient.unregisterQuery("getAllCaseDetailsInstances");
			}
			
			QueryDefinition query = new QueryDefinition();
			query.setName("getAllCaseDetailsInstances");
			query.setSource("java:jboss/datasources/ExampleDS");
			query.setTarget(Target.PROCESS.name());
			query.setExpression("SELECT pl.* FROM PROCESSINSTANCELOG pl \n" + 
					"INNER JOIN MAPPEDVARIABLE mv  ON PL.PROCESSINSTANCEID = MV.PROCESSINSTANCEID\n" + 
					"INNER JOIN CASEDETAILS CD ON MV.VARIABLEID=CD.ID\n"+
					"WHERE CD.CITY='"+ caseDetails.getCity()+"' AND CD.PRODUCT='"+ caseDetails.getProduct()+ "' AND CD.STATE='"+caseDetails.getState()+"'"
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
