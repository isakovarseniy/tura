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

import org.tura.cli.sa.IKieServerCommand;

public class KieCommand implements IKieServerCommand{

	
	@Override
	public void kieServerHealthCheck(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId , String clientSecret , int rpt) {
		new KieServerHealthCheck( jbpm_host_port,  kc_host_port,  realm,  user,
				 password,  clientId ,  clientSecret ,  rpt ).execute();
	}


	@Override
	public void kieServerCreateContainer(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId, String clientSecret , String kiecontainerId, String groupId, String artifactId, String version,
			int rpt) {
		new KieServerCreateContainer().execute( jbpm_host_port,  kc_host_port,  realm,  user,
				 password,  clientId, clientSecret, kiecontainerId,  groupId,  artifactId,  version, rpt);
		
	}


	@Override
	public void kieServerStartProcess(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId, String clientSecret ,String kiecontainerId, String processId, int rpt) {
		new KieServerStartProcess().execute( jbpm_host_port,  kc_host_port,  realm,  user,
				 password,  clientId,  clientSecret ,kiecontainerId,  processId,  rpt  );
	}


	@Override
	public void kieServerRemoveContainer(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId, String clientSecret , String kiecontainerId, int rpt) {
		new KieServerRemoveContainer().execute( jbpm_host_port,  kc_host_port,  realm,  user,
				 password,  clientId,  clientSecret, kiecontainerId,  rpt);
		
	}

}
