/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
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
