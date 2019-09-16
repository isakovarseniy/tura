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

import org.apache.commons.io.FilenameUtils;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class DockerKeyCloakAdapter extends DockerCommand{

	
	@Option(names = "--container", required = true)
	private String containerId;

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--serverType", required = true)
	private String serverType;
	
	@Option(names = "--keyCloakAdapter", required = true)
	private String keyCloakAdapter;

	
	
    @Override
    public Object execute()  {
    	try {

            new CopyFile()
   	            .setTargetLocation(jboss_home)
   	            .setSourceResource(keyCloakAdapter)
                .setContainer(containerId)
                .copyFromExternal();
            
    		 String filename = FilenameUtils.getName(keyCloakAdapter);
             new ExecuteExternalOperation(String.format( "docker exec -i %s sh -c 'cd %s; unzip -o  ./%s' ", containerId,jboss_home,  filename) ).execute();
             
             new CopyFile()
 	        	.setTargetLocation( jboss_home+"/bin")
 	        	.setSourceResource(ConfigConstants.TURA_CONFIG_REPOSITORY+"/"+this.application +"/"+ serverType + "/assets/adapter-install-offline.cli")
 	        	.setTargetName("adapter-install-offline.cli")
 	        	.setContainer(containerId)
 	        	.copyFromExternal();
 
             new ExecuteExternalOperation(String.format( "docker exec -i  %s sh -c ' %s/bin/jboss-cli.sh  --file=%s/bin/adapter-install-offline.cli' ",containerId,jboss_home,jboss_home) ).execute();
    		
    		
    	}catch( Exception e) {
    		throw new RuntimeException(e); 
    	}
    	
        return null;
    }

}
