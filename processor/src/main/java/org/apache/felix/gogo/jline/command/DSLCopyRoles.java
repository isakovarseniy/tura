/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.jboss.CopyRoles;

import picocli.CommandLine.Option;

public class DSLCopyRoles extends DSLCommand {

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--serverType", required = true)
	private String serverType;

	@Option(names = "--container")
	private String container;

	@Override
	public Object execute() throws Exception {
		new CopyRoles(jboss_home)
		   .setApplication(application)
		   .setServerType(serverType)
		   .setContainer(container)
		   .copyFromExternal();

		return null;
	}

}
