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

package org.apache.felix.gogo.jline;

import org.apache.felix.gogo.jline.command.BusinessCentralCreateProject;
import org.apache.felix.gogo.jline.command.BusinessCentralCreateSpace;
import org.apache.felix.gogo.jline.command.BusinessCentralRemoveProject;
import org.apache.felix.gogo.jline.command.DockerJbpm;
import org.apache.felix.gogo.jline.command.KieServerAbortProcess;
import org.apache.felix.gogo.jline.command.KieServerCreateContainer;
import org.apache.felix.gogo.jline.command.KieServerHealthCheck;
import org.apache.felix.gogo.jline.command.KieServerRemoveContainer;
import org.apache.felix.gogo.jline.command.KieServerStartProcess;
import org.apache.felix.gogo.jline.ext.SubmenuExtension;

import picocli.CommandLine;

public class JBPMSubmenuExtension implements SubmenuExtension{

	public static String APP_CONFIG_REPOSITORY = System.getProperty("REPO_HOME");
	
	@Override
	public CommandLine getCommandLine() {
		return 
						new CommandLine(new DockerJbpm())
								.addSubcommand("healthCheckKieServer", new KieServerHealthCheck())
								.addSubcommand("createContainer", new KieServerCreateContainer())
								.addSubcommand("removeContainer", new KieServerRemoveContainer())
								.addSubcommand("startProcess", new KieServerStartProcess())
								.addSubcommand("createProject", new BusinessCentralCreateProject())
								.addSubcommand("removeProject", new BusinessCentralRemoveProject())
								.addSubcommand("createSpace", new BusinessCentralCreateSpace())
								.addSubcommand("abortProcess", new KieServerAbortProcess())

		;

	}
	

	@Override
	public String getExtensionId() {
		return "tura:docker";
	}

	@Override
	public String getSubcommandName() {
		return "jbpm";
	}
	
	

}
