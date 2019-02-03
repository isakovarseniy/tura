package org.tura.example.ui.hrmanager;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;

public class AbstractTest {
	static private String health_test = "http://localhost:8080/hrform/hrmanager/tree2tree/Tree2TreeRelations.xhtml";

	public static void healthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(health_test);

				HttpResponse response = client.execute(request);
				if ( response.getStatusLine().getStatusCode() == 200){
					return;
				}
				Thread.sleep(2000);
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		throw new Exception("Connection error");
	}

}
