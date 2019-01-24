package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.ConfigConstants;
import org.tura.comfiguration.artifacts.docker.CallBack;
import org.tura.comfiguration.artifacts.docker.Docker;
import org.tura.comfiguration.artifacts.jboss.DoDeploy;

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
		new Docker()
		.containerBuilder(new CallBack(){
			@Override
			public void build() throws Exception {
				HrManagerPostgresRecipe.runRecipe();
			}
		})
		.setContainerName("hr-pg")
		.validateContainer()
		;
		
		new Docker()
		.containerBuilder(new CallBack(){
			@Override
			public void build() throws Exception {
				HrManagerWidflyDockerRecipe.runRecipe(jboss_home);
			}
		})
		.setContainerName("hr-wf")
		.validateContainer()
		;
		
        new DoDeploy(ConfigConstants.RESOURCE_HOME+"/hrmanager/deployments","hrform-1.0.war")
        .setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/tura/example/ui/hrform/1.0/hrform-1.0.war")
        .doDeployExploaded();
		
	}
	
	
}
