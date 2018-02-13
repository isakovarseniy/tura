package org.sales.analyzer.process;

import java.util.HashMap;

import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;

import sales.analyzer.process.commons.Constants;

public class TestCommons {

	public static final String HEALTH_CHECK_PROCESS_ID = "sales.analyzer.HealthCheck";
	public static ReleaseId releaseId = new ReleaseId("sales-analyzer", "processes", "1.0.0-SNAPSHOT");
	public static final String KIE_SERVER_URL = "http://localhost:8080/kie-server-6.5.0.Final-ee7/services/rest/server";

	
	public void buildAndDeployArtifacts() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, Constants.USERNAME,
				Constants.PASSWORD);
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		for (int i = 0; i < 10; i++) {
			try {
				client.createContainer(Constants.CONTAINER_ID, new KieContainerResource(TestCommons.releaseId));
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			try {
				ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
				processClient.startProcess(Constants.CONTAINER_ID, TestCommons.HEALTH_CHECK_PROCESS_ID, new HashMap<String, Object>());
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
			}
		}
	}

	
	public void dropContainer() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL, Constants.USERNAME, Constants.PASSWORD);
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.disposeContainer(Constants.CONTAINER_ID);
	}

	
	
}
