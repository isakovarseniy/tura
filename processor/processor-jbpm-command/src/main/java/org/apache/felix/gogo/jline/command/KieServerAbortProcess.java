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

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.Executable;
import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.gogo.jline.command.helper.CommonActions;
import org.apache.felix.gogo.jline.command.helper.OAuthCredentialsProvider;
import org.apache.felix.service.command.CommandSession;
import org.kie.server.api.model.definition.QueryFilterSpec;
import org.kie.server.api.model.instance.TaskInstance;
import org.kie.server.api.util.QueryFilterSpecBuilder;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

import picocli.CommandLine.Option;

public class KieServerAbortProcess implements Executable, SessionAware {

	@Option(names = "--jbpm-host-port", required = true)
	private String jbpm_host_port;

	@Option(names = "--kc-host-port", required = true)
	private String kc_host_port;

	@Option(names = "--realm", required = true)
	private String realm;

	@Option(names = "--adminuser", required = true)
	private String adminuser;

	@Option(names = "--password", required = true)
	private String password;

	@Option(names = "--clientId", required = true)
	private String clientId;

	@Option(names = "--kiecontainerId", required = true)
	private String kiecontainerId;

	@Option(names = "--processId", required = true)
	private String processId;
	
	@Option(names = "--user", required = true)
	private String user;
	
	
	@Override
	public void setSession(CommandSession session) {
	}

	@Override
	public Object execute() throws Exception {
		try {
            String kie_url = String.format(Constants.KIE_SERVER_URL, jbpm_host_port);
            String kc_url = String.format(Constants.KEYCLOAK_SERVER_URL, kc_host_port,realm);
            
            KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(kie_url, null,
                    null);
            config.setCredentialsProvider(new OAuthCredentialsProvider(CommonActions.getToken(clientId, adminuser, password, kc_url)));
            KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
            
            ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
            
    		QueryFilterSpecBuilder builder = new QueryFilterSpecBuilder().equalsTo("actualowner_id", user);
    		builder.equalsTo("processid", processId);

    		QueryServicesClient queryClient = client.getServicesClient(QueryServicesClient.class);
    		QueryFilterSpec spec = builder.get();
    		List<TaskInstance> list = queryClient.query("jbpmQueryTask", "UserTasks", spec, 0,
    				100, TaskInstance.class);
            
    		List<Long> array = new ArrayList<Long>();
    		
    		for (TaskInstance task : list) {
    			if ( !array.contains(task.getProcessInstanceId())) {
    				array.add(task.getProcessInstanceId());
    				processClient.abortProcessInstance(kiecontainerId, task.getProcessInstanceId());
    			}
    		}
    		
    		
    		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}

		return null;
		
		
	}
	
	
	
}
