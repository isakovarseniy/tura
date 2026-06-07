/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.cli.sa.kieserver;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.tura.cli.dsl.HealthCheck;
import org.tura.cli.sa.Constants;

public class KieServerHealthCheck  extends HealthCheck{

	String jbpm_host_port;
	String kc_host_port;
	String realm;
	String user;
	String password;
	String clientId;
	String clientSecret;
	
	 	
	
	
	public KieServerHealthCheck(String jbpm_host_port, String kc_host_port, String realm, String user, String password, String clientId , String clientSecret , int rpt) {
		super(rpt);
		 this.jbpm_host_port = jbpm_host_port;
		 this.kc_host_port = kc_host_port;
		 this.realm = realm;
		 this.user = user;
		 this.password = password;
		 this.clientId = clientId;
		 this.clientSecret = clientSecret;
	}

	
	
	
	@Override
	public int call() throws Exception {
		
		try {
            String kie_url = String.format(Constants.KIE_SERVER_URL, jbpm_host_port);
            
            KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(kie_url, null,
                    null);
            config.setCredentialsProvider(new OAuthCredentialsProvider(CommonActions.getToken(clientId,clientSecret, user, password, kc_host_port,realm)));
            KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
            client.listContainers();

    		return 0;
            
		} catch (Throwable e) {
			return -1;
		}
		
	}

}
