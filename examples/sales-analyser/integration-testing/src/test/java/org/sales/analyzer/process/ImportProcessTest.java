package org.sales.analyzer.process;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.List;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.api.model.instance.NodeInstance;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

@RunWith(Arquillian.class)
public class ImportProcessTest {

	private static int RETRY = 100;
	private static ReleaseId releaseId = new ReleaseId("sales-analyzer", "processes", "1.0.0-SNAPSHOT");
	private static final String CONTAINER_ID = "sales-analyzer-container";
	private static final String PROCESS_ID = "sales.analyzer.MonthlyFileLoad";
	private static final String KIE_SERVER_URL = "http://localhost:8080/kie-server-6.5.0.Final-ee7/services/rest/server";
	private static final String USERNAME = "kieserver";
	private static final String PASSWORD = "kieserver";
	private static final String FILE_LOAD_NODE = "File Loader";

	@Before
	public void buildAndDeployArtifacts() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME, PASSWORD);
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.createContainer(CONTAINER_ID, new KieContainerResource(releaseId));
	}

	@After
	public void dropContainer() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME, PASSWORD);
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.disposeContainer(CONTAINER_ID);
	}

	@Test
	@RunAsClient
	public void t0000_One2One1() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL, USERNAME,
					PASSWORD);
			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			Long procesInsatnceId = processClient.startProcess(CONTAINER_ID, PROCESS_ID, new HashMap<String, Object>());

			QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
			waitForNode(FILE_LOAD_NODE, procesInsatnceId, queryClient);

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
			throw new Exception ("Node has not been fired");
		}
		
	}
}
