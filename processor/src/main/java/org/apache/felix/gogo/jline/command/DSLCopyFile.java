package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class DSLCopyFile extends DSLCommand{

	@Option(names = "--targetLocation", required = true)
	private String targetLocation; 
	@Option(names = "--targetName", required = true)
	private String targetName;
	@Option(names = "--sourceResource", required = true)
	private String sourceResource;
	@Option(names = "--container")
	private String containerId;
	
	
	@Override
	public Object execute() throws Exception {
	
        new CopyFile()
    		.setTargetLocation("/docker-entrypoint-initdb.d/")
            .setTargetName("hrcontroller.sql")
            .setSourceResource("hr-manager/assets/hrschema.sql")
            .setContainer(containerId)
            .copyFromExternal();
		
		return null;
	}

}
