package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.ConfigConstants;
import org.tura.comfiguration.artifacts.docker.Docker;
import org.tura.comfiguration.artifacts.jboss.CopyFile;
import org.tura.comfiguration.artifacts.jboss.CopyRoles;
import org.tura.comfiguration.artifacts.jboss.CopyUsers;
import org.tura.comfiguration.artifacts.jboss.Module;
import org.tura.comfiguration.artifacts.jboss.StandaloneFullXml;

import com.github.dockerjava.api.command.CreateContainerResponse;

public class HrManagerWidflyDockerRecipe {

	public static void main(String[] args) {
		if ( args.length == 0 ) {
			System.out.println("Number of parameters should be one");
		}
		try {
			runRecipe(args[0] );
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
	
	
	public static void runRecipe(String jboss_home ) throws Exception {
		
		new Docker()
        	.setContainerName("hr-wf")
        	.removeContainer();
		
		new Docker()
	     	.setRegistry("tura/hr-manager/wildfly")
	     	.setVersion("1.0")
	     	.removeImage();
		
		
		CreateContainerResponse container = 
		new Docker()
		     .setRegistry("jboss/wildfly")
		     .setVersion("10.1.0.Final")
			 .pullWildFlyImage()
			 .runContainer("0")
			 .getContainer();
		
        new StandaloneFullXml(jboss_home)
        	.setApplication("hr-manager")
        	.setServerType("wildfly-10.1.0.Final")
        	.addConfigPath("postgres/docker")
        	.setContainer(container)
        	.run();
        

        new Module(jboss_home)
        	.setApplication("hr-manager")
        	.setServerType("wildfly-10.1.0.Final")
        	.addConfigPath("postgres/docker")
        	.setRelativeLocation("org/postgresql/main")
        	.setContainer(container)
        	.run();
        

        new CopyRoles(jboss_home)
        	.setApplication("hr-manager")
        	.setServerType("wildfly-10.1.0.Final")
        	.setContainer(container)
        	.copyFromClassPath();
        
        new CopyUsers(jboss_home)
        	.setApplication("hr-manager")
        	.setServerType("wildfly-10.1.0.Final")
        	.setContainer(container)
        	.copyFromClassPath();
        
        
        
        new CopyFile()
        	.setTargetLocation("${JBOSS_HOME}/modules/org/postgresql/main".replace("${JBOSS_HOME}", jboss_home))
        	.setTargetName("postgresql-42.1.1.jar")
        	.setSourceResource(System.getProperty("user.home")+"/.m2/repository/org/postgresql/postgresql/42.1.1/postgresql-42.1.1.jar")
        	.setContainer(container)
        	.copyFromExternal();
        
        
        new Docker(container)
            .fixOwnership(jboss_home, "jboss:jboss")
            .dockerStarCommand(jboss_home+"/bin/standalone.sh", "--debug", "3333","-c","standalone-full.xml","-b", "0.0.0.0")
        	.createImage("tura/hr-manager/wildfly","1.0")
        	.stopContainer()
            .portMapping(8000,8000)
            .portMapping(8080, 8080)
            .volumesMapping(ConfigConstants.RESOURCE_HOME+"/hrmanager/standalone/deployments",jboss_home+"/standalone/deployments" )
        	;
        
        
        new Docker()
	     .setRegistry("tura/hr-manager/wildfly")
	     .setVersion("1.0")
         .portMapping(3333,3333)
         .portMapping(8080, 8080)
         .portMapping(8443, 8443)
         .setNetwork("hr-net")
         .setContainerName("hr-wf")
         .volumesMapping(ConfigConstants.RESOURCE_HOME+"/hrmanager/deployments",jboss_home+"/standalone/deployments" )
         .runContainer()
         ;
	     
        
	}

}
