package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.jboss.CopyUsers;

import picocli.CommandLine.Option;

public class DSLCopyUsers  extends DSLCommand {

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
		new CopyUsers(jboss_home)
		   .setApplication(application)
		   .setServerType(serverType)
		   .setContainer(container)
		   .copyFromExternal();

		return null;
	}

}
