package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.jboss.CopyRoles;
import org.tura.comfiguration.artifacts.jboss.CopyUsers;
import org.tura.comfiguration.artifacts.jboss.DoDeploy;
import org.tura.comfiguration.artifacts.jboss.Module;
import org.tura.comfiguration.artifacts.jboss.StendaloneFullXml;

public class SalesAnalyzerRecipe {
	

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
                  new StendaloneFullXml(jboss_home)
                          .setApplication("sales-analyzer")
                          .setServerType("wildfly-10.1.0.Final")
                          .addConfigPath("h2/file-db")
                          .addConfigPath("kie-server")
                          .run();
                  
                  
                  new Module(jboss_home)
                         .setApplication("sales-analyzer")
                         .setServerType("wildfly-10.1.0.Final")
                         .addConfigPath("talend-job-configuration")
                         .addProperties("TURA_SOURCE_LOCATION", tura_home)
                         .setRelativeLocation("config/main")
                         .run();
     
                  
                  new CopyRoles(jboss_home)
                         .setApplication("sales-analyzer")
                         .setServerType("wildfly-10.1.0.Final")
                         .copyFromClassPath();
                  
                  new CopyUsers(jboss_home)
                         .setApplication("sales-analyzer")
                         .setServerType("wildfly-10.1.0.Final")
                         .copyFromClassPath();

	
                  new DoDeploy(jboss_home,"kie-server.war")
                          .setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/kie/server/kie-server/6.5.0.Final/kie-server-6.5.0.Final-ee7.war")
                          .doDeployExploaded();
                  
	}
}
