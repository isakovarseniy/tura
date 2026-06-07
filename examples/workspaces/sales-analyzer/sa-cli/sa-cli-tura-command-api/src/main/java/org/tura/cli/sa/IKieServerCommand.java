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

package org.tura.cli.sa;


public interface IKieServerCommand {

	void kieServerHealthCheck(String jbpm_host_port, String kc_host_port, String realm, String user, String password,
			String clientId, String clientSecret ,int rpt);

	void kieServerCreateContainer(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId, String clientSecret , String kiecontainerId, String groupId, String artifactId, String version,
			int rpt);

	void kieServerStartProcess(String jbpm_host_port, String kc_host_port, String realm, String user, String password,
			String clientId, String clientSecret , String kiecontainerId, String processId, int rpt);

	void kieServerRemoveContainer(String jbpm_host_port, String kc_host_port, String realm, String user,
			String password, String clientId, String clientSecret , String kiecontainerId, int rpt);

}
