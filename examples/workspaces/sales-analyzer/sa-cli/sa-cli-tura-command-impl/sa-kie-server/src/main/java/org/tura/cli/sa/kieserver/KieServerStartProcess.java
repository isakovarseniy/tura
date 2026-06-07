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

import java.util.HashMap;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.tura.cli.dsl.Repeater;
import org.tura.cli.sa.Constants;

public class KieServerStartProcess {

	public void execute(String jbpm_host_port, String kc_host_port, String realm, String user, String password,
			String clientId, String clientSecret , String kiecontainerId, String processId, int rpt ) {

		new Repeater(3000L, "Process  starting container" ) {

			@Override
			public void action() {

				try {
		            String kie_url = String.format(Constants.KIE_SERVER_URL, jbpm_host_port);
		            
		            KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(kie_url, null,
		                    null);
		            config.setCredentialsProvider(new OAuthCredentialsProvider(CommonActions.getToken(clientId,clientSecret, user, password, kc_host_port,realm)));
		            KieServicesClient client = KieServicesFactory.newKieServicesClient(config);

		            ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
					processClient.startProcess(kiecontainerId, processId,new HashMap<String, Object>());
					
				} catch (Exception e) {
					throw new RuntimeException(e);
				}

			}

		}.repeat(rpt);

		
	}

}
