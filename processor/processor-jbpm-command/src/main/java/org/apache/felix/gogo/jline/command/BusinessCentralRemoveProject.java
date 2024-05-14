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

import javax.ws.rs.NotFoundException;

import org.apache.felix.gogo.jline.Executable;
import org.apache.felix.gogo.jline.SessionAware;
import org.apache.felix.gogo.jline.command.helper.CommonActions;
import org.apache.felix.gogo.jline.command.helper.RestWorkbenchClient;
import org.apache.felix.gogo.jline.command.helper.WorkbenchClient;
import org.apache.felix.gogo.jline.ext.Repeater;
import org.apache.felix.service.command.CommandSession;
import org.guvnor.rest.client.DeleteProjectRequest;
import org.guvnor.rest.client.JobResult;
import org.guvnor.rest.client.JobStatus;

import picocli.CommandLine.Option;

public class BusinessCentralRemoveProject implements Executable, SessionAware {

	@Option(names = "--bc-host-port", required = true)
	private String bc_host_port;

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

	@Option(names = "--space", required = true)
	private String space;

	@Option(names = "--projectName", required = true)
	private String projectName;

	@Option(names = "--repeats")
	private int rpt = 10;

	@Override
	public void setSession(CommandSession session) {

	}

	@Override
	public Object execute() throws Exception {

		String bc_url = String.format(Constants.BUSINESS_CENTRAL_URL, bc_host_port);
		String kc_url = String.format(Constants.KEYCLOAK_SERVER_URL, kc_host_port, realm);
		String token = CommonActions.getToken(clientId, user, password, kc_url);

		WorkbenchClient client = RestWorkbenchClient.createWorkbenchClient(bc_url, token);
		DeleteProjectRequest request = null;
		try {
			request = client.deleteProject(space, projectName);
		} catch (NotFoundException e) {
			System.out.println("Project not found");
			return null;
		}

		String jobId = request.getJobId();
		new Repeater(1000L, "Project removing in process ") {

			@Override
			public void action() {
				JobResult jobResult = client.getJob(jobId);
				System.out.println(jobResult.getStatus());
				if ( !jobResult.getStatus().equals(JobStatus.SUCCESS)) {
					throw new RuntimeException("Failed");
				}
				
				
			}
		}.repeat(rpt);

		return null;
	}

}
