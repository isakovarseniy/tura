package org.sales.analyzer.process;

import java.util.HashMap;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
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
	public static final String KIE_SERVER_URL = "http://localhost:8080/kie-server/services/rest/server";
	public static final String KEYCLOAK_SERVER_URL = "http://localhost:8080/auth/realms/sales-analyzer/protocol/openid-connect/token";
	public static final String KEYCLOAK_CLIENT_ID = "service-access";
	public static final String USERNAME = "sales-manager";
	public static final String PASSWORD = "sales01";

	
	public void buildAndDeployArtifacts() throws Exception {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL,
				null, null);
		config.setCredentialsProvider(new OAuthCredentialsProvider(getToken()));
		
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
				processClient.startProcess(Constants.CONTAINER_ID, TestCommons.HEALTH_CHECK_PROCESS_ID,
						new HashMap<String, Object>());
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
				}
			}
		}
	}

	public void dropContainer() throws Exception {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(TestCommons.KIE_SERVER_URL,
				null ,null);
		config.setCredentialsProvider(new OAuthCredentialsProvider(getToken()));
		
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.disposeContainer(Constants.CONTAINER_ID);
	}

	public String getToken() throws Exception{
		HttpClient client = new HttpClient();

		PostMethod postMethod = new PostMethod(KEYCLOAK_SERVER_URL);

		postMethod.addParameter("grant_type", "password");
		postMethod.addParameter("client_id", KEYCLOAK_CLIENT_ID);
		postMethod.addParameter("username", USERNAME);
		postMethod.addParameter("password", PASSWORD);

			int statusCode = client.executeMethod(postMethod);

			if (statusCode != HttpStatus.SC_OK) {
				throw new Exception("wrong response");
			} else {
				byte[] responseBody = postMethod.getResponseBody();
				String response = new String(responseBody,"UTF-8");
				
				String t = "\"access_token\": \""; 
				int i = response.indexOf(t)+t.length()+1;
				String accessToken = response.substring(i);
				i = accessToken.indexOf("\"");
				accessToken = accessToken.substring(0,i);
				return accessToken;
			}

	}

}
