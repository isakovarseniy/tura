/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrmanager;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.tura.example.ui.TestSuite;
import org.tura.example.ui.hrmanager.simpleform.pageobject.FatalErrorPagePageObject;
import org.tura.platform.uuiclient.rest.DataUpdateRequest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AbstractTest {
	
	static boolean debugMode = false;
	
	static private String health_test = "http://localhost:8080/hrform-react/rest/uuiserver/update";

	
	public static String getChromeDriverName() {
		if ( TestSuite.isWindows()) {
			return "chromedriver.exe";
		}else {
			return "chromedriver";
		}
		
	}
	
	public static void healthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpPost request = new HttpPost(health_test);
				DataUpdateRequest obj = new DataUpdateRequest();
				obj.setInitSession(true);
				
				ArrayList<String> topUpdateElementIds =  new ArrayList<String>();
				topUpdateElementIds.add("aa60649c-abda-4942-bb01-a9e80feb2d2f");
				obj.setTopUpdateElementIds(topUpdateElementIds);
				obj.setProcessElements(new ArrayList<Object>());
				obj.setFormSelector("hrmanager.tree2tree");
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
	
	public static String getUrl(String path){
		if ( debugMode) {
			return "http://localhost:3000"+path;
		}else {
			return "http://localhost:8080/hr-form-react-client"+path;
		}
	}
	
	public void setDebugMode(boolean mode) {
		debugMode = mode;
	}
	
	
	public void checkifFatalErrorPage(WebDriver driver ) {
		FatalErrorPagePageObject errorPage = new FatalErrorPagePageObject(driver);
		String error = null;
		try {
			 error = errorPage.getMessage().getValue();
		} catch (Throwable t) {

		}
		if (error != null) {
			fail("Fatal error");
		}
		
	}	
	

}
