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

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "kieServerRemoveContainer"
,description="Kie server remove Container"
,headerHeading = "%nUsage:"
,synopsisHeading = "%n"		 
,parameterListHeading = "%nParameters:%n"
,optionListHeading = "%nOptions:%n"
)
public class KieServerRemoveContainer extends SaCommandResolver implements Callable<Object>{

	@Option(names = "--jbpm-host-port", required = true)
	private String jbpm_host_port;

	@Option(names = "--kc-host-port", required = true)
	private String kc_host_port;

	@Option(names = "--realm", required = true)
	private String realm;
	
	@Option(names = "--user", required = true)
	private String user;

	@Option(names = "--password", required = true)
	private String password;

	@Option(names = "--clientId", required = true)
	private String clientId;
	
	@Option(names = "--clientSecret", required = true)
	private String clientSecret;
	

	@Option(names = "--kiecontainerId", required = true)
	private String kiecontainerId;

	@Option(names = "--repeats", required = true)
	private int rpt;
	
	
	@Override
	public Object call() throws Exception {
		getKieServerCommand();
		if (kieServerCommand == null){
			System.out.println("Provider not found");
			return null; 
		}
		Thread.currentThread().setContextClassLoader(kieServerCommand.getClass().getClassLoader());
		kieServerCommand.kieServerRemoveContainer(jbpm_host_port,kc_host_port,realm,user,password,clientId,clientSecret, kiecontainerId,rpt);
		return null;


	}
	
	
}
