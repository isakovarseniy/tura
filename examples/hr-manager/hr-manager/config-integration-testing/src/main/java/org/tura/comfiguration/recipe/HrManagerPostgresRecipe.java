package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.docker.Docker;
import org.tura.comfiguration.artifacts.jboss.CopyFile;

import com.github.dockerjava.api.command.CreateContainerResponse;

public class HrManagerPostgresRecipe {
	
	public static void main(String[] args) {
		try {
			runRecipe();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}
	
	public static void runRecipe() throws Exception {
		
		new Docker()
    		.setContainerName("hr-pg")
    		.removeContainer();
	
		new Docker()
	     	.setRegistry("tura/hr-manager/postgres")
	     	.setVersion("1.0")
     		.removeImage();
	
		
		CreateContainerResponse container = 
		new Docker()
		     .setRegistry("postgres")
		     .setVersion("9.6")
			 .pullWildFlyImage()
			 .runContainer("0")
			 .getContainer();
		
        new CopyFile()
    		.setTargetLocation("/docker-entrypoint-initdb.d/")
            .setTargetName("hrcontroller.sql")
            .setSourceResource("hr-manager/assets/hrschema.sql")
            .setContainer(container)
            .copyFromClassPath();
		
        new Docker(container)
        	.createImage("tura/hr-manager/postgres","1.0")
        	.stopContainer();
		
		
        new Docker()
	     .setRegistry("tura/hr-manager/postgres")
	     .setVersion("1.0")
         .portMapping(5432, 5432)
         .setNetwork("hr-net")
         .setNetworkAlias("db")
         .setContainerName("hr-pg")
         .runContainer()
         ;
        
        
	}
	
}
