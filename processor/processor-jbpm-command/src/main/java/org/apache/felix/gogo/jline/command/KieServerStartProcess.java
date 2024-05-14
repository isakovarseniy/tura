/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import java.util.HashMap;

import org.apache.felix.gogo.jline.Executable;
import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.gogo.jline.command.helper.CommonActions;
import org.apache.felix.gogo.jline.command.helper.OAuthCredentialsProvider;
import org.apache.felix.gogo.jline.ext.Repeater;
import org.apache.felix.service.command.CommandSession;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;

import picocli.CommandLine.Option;

public class KieServerStartProcess implements Executable, SessionAware {
	
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

	@Option(names = "--kiecontainerId", required = true)
	private String kiecontainerId;

	@Option(names = "--processId", required = true)
	private String processId;
	
	@Option(names = "--repeats", required = true)
	private int rpt;

	@Override
	public void setSession(CommandSession session) {
	}

	@Override
	public Object execute() throws Exception {
		new Repeater(3000L, "Process  starting container") {

			@Override
			public void action() {

				try {
		            String kie_url = String.format(Constants.KIE_SERVER_URL, jbpm_host_port);
		            String kc_url = String.format(Constants.KEYCLOAK_SERVER_URL, kc_host_port,realm);
		            
		            KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(kie_url, null,
		                    null);
		            config.setCredentialsProvider(new OAuthCredentialsProvider(CommonActions.getToken(clientId, user, password, kc_url)));
		            KieServicesClient client = KieServicesFactory.newKieServicesClient(config);

		            ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
					processClient.startProcess(kiecontainerId, processId,new HashMap<String, Object>());
					
				} catch (Exception e) {
					throw new RuntimeException(e);
				}

			}

		}.repeat(rpt);

		return null;
	}

}

