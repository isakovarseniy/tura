package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.docker.Docker;

import com.github.dockerjava.api.command.CreateContainerResponse;

public class HrManagerDeploymentRecipe {

	public static void main(String[] args) {
		if ( args.length == 0 ) {
			System.out.println("Number of parameters should be one");
		}
		try {
			runRecipe(args[0]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}
	
	
	public static void runRecipe(String jboss_home ) throws Exception {
		CreateContainerResponse container = 
		new Docker()
		     .setRegistry("jboss/wildfly")
		     .setVersion("10.1.0.Final")
			 .pullWildFlyImage()
			 .runContainer("0")
			 .getContainer();
	}
	
	
}
