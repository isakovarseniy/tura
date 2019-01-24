package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.ConfigConstants;
import org.tura.comfiguration.artifacts.jboss.CopyFile;
import org.tura.comfiguration.artifacts.jboss.CopyRoles;
import org.tura.comfiguration.artifacts.jboss.CopyUsers;
import org.tura.comfiguration.artifacts.jboss.DoDeploy;
import org.tura.comfiguration.artifacts.jboss.Module;
import org.tura.comfiguration.artifacts.jboss.StandaloneFullXml;
import org.tura.comfiguration.commons.DownloadChromeSeleniumWebDriver;

public class HrManagerRecipe {
	

	public static void main(String[] args) {
		
		if ( args.length == 0 ) {
			System.out.println("Number of parameters should be one");
		}
		try {
		runRecipe(args[0],args[1]);
		System.exit(0);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}


	
	public static void runRecipe(String jboss_home , String tura_home) throws Exception {
                  new StandaloneFullXml(jboss_home)
                          .setApplication("hr-manager")
                          .setServerType("wildfly-10.1.0.Final")
                          .addConfigPath("postgres")
                          .run();
                  
                  new Module(jboss_home)
		                  .setApplication("hr-manager")
		                  .setServerType("wildfly-10.1.0.Final")
		                  .addConfigPath("postgres")
		                 .setRelativeLocation("org/postgresql/main")
		                 .run();
                  
                  new CopyRoles(jboss_home)
                         .setApplication("hr-manager")
                         .setServerType("wildfly-10.1.0.Final")
                         .copyFromClassPath();
                  
                  new CopyUsers(jboss_home)
                         .setApplication("hr-manager")
                         .setServerType("wildfly-10.1.0.Final")
                         .copyFromClassPath();

                  new DoDeploy(jboss_home,"hrform-1.0.war")
                          .setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/tura/example/ui/hrform/1.0/hrform-1.0.war")
                          .doDeployExploaded();

                  new CopyFile()
                          .setTargetLocation(ConfigConstants.RESOURCE_HOME)
                          .setTargetName("hrcontroller.sql")
                          .setSourceResource("hr-manager/assets/hrcontroller.sql")
		                  .copyFromClassPath();
                  
                  new CopyFile()
	                  .setTargetLocation(ConfigConstants.RESOURCE_HOME)
	                  .setTargetName("hrschema.sql")
	                  .setSourceResource("hr-manager/assets/hrschema.sql")
	                  .copyFromClassPath();
 
                  
                  new CopyFile()
		                  .setTargetLocation("${JBOSS_HOME}/modules/org/postgresql/main".replace("${JBOSS_HOME}", jboss_home))
		                  .setTargetName("postgresql-42.1.1.jar")
		                  .setSourceResource(System.getProperty("user.home")+"/.m2/repository/org/postgresql/postgresql/42.1.1/postgresql-42.1.1.jar")
		                  .copyFromExternal();
                  
          		new DownloadChromeSeleniumWebDriver()
          				.setDriverVersion("2.40")
          				.download();
                  
	}
}
