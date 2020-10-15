/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

import sales.analyzer.api.model.impl.JbpmConfiguration;
import sales.analyzer.process.commons.Constants;

public class PostDeployer {
	
	public static final String HEALTH_CHECK_PROCESS_ID = "sales.analyzer.HealthCheck";
	public static ReleaseId releaseId = new ReleaseId("sales-analyzer", "processes", PostDeployer.class.getPackage().getSpecificationVersion());
	public static final String KIE_SERVER_URL = "http://wf:8081/kie-server/services/rest/server";
	public static String KEYCLOAK_URL = "http://kc:8080/auth";
	public static final String KEYCLOAK_SERVER_URL = KEYCLOAK_URL+"/realms/sales-analyzer/protocol/openid-connect/token";
	public static final String KEYCLOAK_CLIENT_ID = "service-access";
	public static final String USERNAME = "sales-manager";
	public static final String PASSWORD = "sales01";

	public static String KEYCLOAK_ADMIN_REALM = "master";
	public static String KEYCLOAK_ADMIN_CLIENTID = "realm-management";
	public static String CLIENT_SECRET = "029b240b-b862-463f-a528-67db46dc233d";
	public static String ADMIN_USER = "admin";
	public static String ADMIN_PASSWORD = "qwerty";
	public static String KEYCLOAK_MANAGED_REALM = "sales-analyzer";	

	public static String JNDI_FOR_JBPM_ACCESS =  "java:jboss/jdbc/SalesAnalyzerDS";

	private String query1 = "create unique index on KIESERVER.MAPPEDVARIABLE (PROCESSINSTANCEID )";
	private String query2 = "create unique index on KIESERVER.MAPPEDVARIABLE (VARIABLEID )";
	private String query3 = "create unique index on KIESERVER.PROCESSINSTANCELOG (PROCESSINSTANCEID )";
	private String query4 = "create unique index on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID )";
	private String query5 = "create unique index on KIESERVER.PEOPLEASSIGNMENTS_POTOWNERS (TASK_ID )";

	private String  url = "jdbc:postgresql:postgres";
	private KieServicesClient client;
	private String token;

	public static void main(String[] args) {
		try {
		PostDeployer pd = new PostDeployer ();
		pd.postDeployPhase1();
		pd.postDeployPhase2();
		System.exit(0);
		}catch( Exception e ) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public  void postDeployPhase1() throws Exception {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL,
				null, null);

		new Repeater("Obtain token") {
			@Override
			public void action() throws Exception {
				token = getToken();
			}
		}.repeat(40);

		config.setCredentialsProvider(new OAuthCredentialsProvider(token));
		
		new Repeater("Building KieServer client") {
			@Override
			public void action() {
				client = KieServicesFactory.newKieServicesClient(config);
			}
		}.repeat(40);

		new Repeater("Create container") {
			@Override
			public void action() {
				client.createContainer(Constants.CONTAINER_ID, new KieContainerResource(releaseId));
			}
		}.repeat(40);
		
		new Repeater("Run health check") {
			@Override
			public void action() {
				ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
				processClient.startProcess(Constants.CONTAINER_ID, HEALTH_CHECK_PROCESS_ID,new HashMap<String, Object>());
			}
		}.repeat(40);
		
		JbpmConfiguration.init(client,JNDI_FOR_JBPM_ACCESS);
		
	}

	public void postDeployPhase2() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, "postgres","postgres");
			stmt = conn.createStatement();
			stmt.execute(query1);
			stmt.execute(query2);
			stmt.execute(query3);
			stmt.execute(query4);
			stmt.execute(query5);

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		
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
	
	public void dropContainer() throws Exception {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(KIE_SERVER_URL,
				null ,null);
		config.setCredentialsProvider(new OAuthCredentialsProvider(getToken()));
		
		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		client.disposeContainer(Constants.CONTAINER_ID);
	}	
	
	public abstract class Repeater {
		String message;
		
		public Repeater(String message ) {
			this.message=message;
		}
		public abstract void action() throws Exception;

		public void repeat(int times) throws Exception {
			for (int i = 0; i < times; i++) {
				try {
					System.out.println(String.format("Attempt  %s    %s  out of  %s", message,i,times));
					action();
					return;
				} catch (Exception w) {
					if (times - i == 1) {
						throw w;
					}
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
					}
				}
			}

		}

	}
	
	
	
	
}

