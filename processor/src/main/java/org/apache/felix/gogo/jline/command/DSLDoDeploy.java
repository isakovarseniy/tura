package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.jboss.DoDeploy;

import picocli.CommandLine.Option;

public class DSLDoDeploy extends DSLCommand{

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;
	@Option(names = "--targetName", required = true)
	private String targetName;
	@Option(names = "--srcResource", required = true)
	private String srcResource;
	
	
	@Override
	public Object execute() throws Exception {
        new DoDeploy(jboss_home,targetName)
        .setSourceResource( srcResource)
        .doDeployExploaded();

		return null;
	}

}
