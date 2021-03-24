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

package org.sales.analyzer.ui;

import java.util.ArrayList;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.sales.analyzer.process.PostDeployer;
import org.tura.platform.uuiclient.rest.DataUpdateRequest;
import org.sales.analyzer.suites.TestSute;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AbstractTest {
	
	static boolean debugMode = false;
	
	static private String admin_health_test = "http://wf:8081/sa-admin/rest/uuiserver/update";
	static private String case_health_test = "http://wf:8081/sa-case-manager/rest/uuiserver/update";

	
	public static String getChromeDriverName() {
		if ( TestSute.isWindows()) {
			return "chromedriver.exe";
		}else {
			return "chromedriver";
		}
	}
	
	
	public static void adminHealthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				
				HttpClient client = HttpClientBuilder.create().build();
				HttpPost request = new HttpPost(admin_health_test);
				setTocken(request);
				DataUpdateRequest obj = new DataUpdateRequest();
				obj.setInitSession(true);
				
				ArrayList<String> topUpdateElementIds =  new ArrayList<String>();
				topUpdateElementIds.add("4cdbf7eb-01a5-4076-afe2-55b7aefca072");
				obj.setTopUpdateElementIds(topUpdateElementIds);
				obj.setProcessElements(new ArrayList<Object>());
				obj.setFormSelector("admin.administration");
				obj.setBrowserLanguage("en");
				
				ObjectMapper mapper = new ObjectMapper();
				StringEntity entity = new StringEntity(mapper.writeValueAsString(obj));
				request.setEntity(entity);
				request.addHeader("content-type", "application/json");				

				HttpResponse response = client.execute(request);
				if ( response.getStatusLine().getStatusCode() == 200){
					return;
				}
				System.out.println("Error ..."+i);
				
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		throw new Exception("Connection error");
	}

	public static void caseHealthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpPost request = new HttpPost(case_health_test);
				setTocken(request);
				
				DataUpdateRequest obj = new DataUpdateRequest();
				obj.setInitSession(true);

				ArrayList<String> topUpdateElementIds =  new ArrayList<String>();
				topUpdateElementIds.add("ef4d1512-69ce-48f5-a82f-029fea14a6e2");
				obj.setTopUpdateElementIds(topUpdateElementIds);
				obj.setProcessElements(new ArrayList<Object>());
				obj.setFormSelector("analysis.casemanager");
				obj.setBrowserLanguage("en");
				
				ObjectMapper mapper = new ObjectMapper();
				StringEntity entity = new StringEntity(mapper.writeValueAsString(obj));
				request.setEntity(entity);
				request.addHeader("content-type", "application/json");				

				HttpResponse response = client.execute(request);
				if ( response.getStatusLine().getStatusCode() == 200){
					return;
				}
				System.out.println("Error ..."+i);
				
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		throw new Exception("Connection error");
	}

	public static void setTocken(HttpPost request) throws Exception {
		String token = new PostDeployer().getToken();
		String authHeader =  "Bearer "+token;
		request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);				

	}

	public static String getAdminUrl(String path){
		if ( debugMode) {
			return "http://localhost:3000"+path;
		}else {
			return "http://wf:8081/sa-admin-react-client"+path;
		}
	}

	public static String getCaseMgmUrl(String path){
		if ( debugMode) {
			return "http://localhost:3000"+path;
		}else {
			return "http://wf:8081/sa-case-manager-react-client"+path;
		}
	}

	
	public void setDebugMode(boolean mode) {
		debugMode = mode;
	}
	

}
