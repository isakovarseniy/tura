package org.tura.comfiguration.recipe;

import org.tura.comfiguration.artifacts.jboss.CopyFile;
import org.tura.comfiguration.artifacts.jboss.CopyRoles;
import org.tura.comfiguration.artifacts.jboss.CopyUsers;
import org.tura.comfiguration.artifacts.jboss.DeployKeyCloak;
import org.tura.comfiguration.artifacts.jboss.DeployKeyCloakAdapter;
import org.tura.comfiguration.artifacts.jboss.DoDeploy;
import org.tura.comfiguration.artifacts.jboss.Module;
import org.tura.comfiguration.artifacts.jboss.StendaloneFullXml;
import org.tura.comfiguration.commons.CopyMonthlyFiles;
import org.tura.comfiguration.commons.CopySalesAnalyzerDB;
import org.tura.comfiguration.commons.JobPropertyFile;

public class SalesAnalyzerRecipe {
	

	public static void main(String[] args) {
		
		if ( args.length == 0 ) {
			System.out.println("Number of parameters should be one");
		}
		try {
		Boolean	withdata = false;
		if ( args.length == 3  ) {
			withdata = new Boolean (args[2]);
		}
		runRecipe(args[0],args[1], withdata );
		System.exit(0);
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}

	public static void runRecipe(String jboss_home , String tura_home, Boolean  withdata) throws Exception {
                  new StendaloneFullXml(jboss_home)
                          .setApplication("sales-analyzer")
                          .setServerType("wildfly-10.1.0.Final")
                          .addConfigPath("postgres")
                          .addConfigPath("kie-server")
                          .addConfigPath("ui-app")
                          .addProperties("TALEND_JOB_ROOT", tura_home+"/examples/sales-analyzer/talend-jobs")
                          .run();
                  
                  
                  new Module(jboss_home)
                         .setApplication("sales-analyzer")
                         .setServerType("wildfly-10.1.0.Final")
                         .addConfigPath("talend-job-configuration")
                         .addProperties("TURA_SOURCE_LOCATION", tura_home)
                         .setRelativeLocation("config/main")
                         .run();
  
                  new Module(jboss_home)
                  		.setApplication("sales-analyzer")
                  		.setServerType("wildfly-10.1.0.Final")
                  		.addConfigPath("postgres")
                  		.setRelativeLocation("org/postgresql/main")
                  		.run();
                  
                  new CopyFile()
	                  .setTargetLocation("${JBOSS_HOME}/modules/org/postgresql/main".replace("${JBOSS_HOME}", jboss_home))
	                  .setTargetName("postgresql-42.1.1.jar")
	                  .setSourceResource(System.getProperty("user.home")+"/.m2/repository/org/postgresql/postgresql/42.1.1/postgresql-42.1.1.jar")
	                  .copyFromExternal();
                  
                  
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
                  
                  new CopySalesAnalyzerDB()
                         .withData(withdata)
                         .setApplication("sales-analyzer")
                         .copyFromClassPath();
                  
                  new CopyMonthlyFiles()
                          .setApplication("sales-analyzer")
                          .copyFromClassPath();
                  
                  
                  new DeployKeyCloak(jboss_home)
		                  .setApplication("sales-analyzer")
		                  .setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/keycloak/keycloak-server-overlay/3.2.0.Final/keycloak-server-overlay-3.2.0.Final.zip")
		                  .doDeploy();
                  
                  new DeployKeyCloakAdapter(jboss_home)
		                  .setApplication("sales-analyzer")
		                  .setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/keycloak/keycloak-wildfly-adapter-dist/3.2.0.Final/keycloak-wildfly-adapter-dist-3.2.0.Final.zip")
		                  .doDeploy();

                  
                  new JobPropertyFile(tura_home,"Default.properties")
                  		  .setApplication("sales-analyzer")
                          .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Create_cases/etl/create_cases_0_1/contexts")
                          .addProperties("USER_HOME", System.getProperty("user.home")+"/")
                          .run();

                  new JobPropertyFile(tura_home,"Development.properties")
                  		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Create_cases/etl/create_cases_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();

                  new JobPropertyFile(tura_home,"Default.properties")
		          		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/History_loader/etl/monthly_file_validation_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();

                  new JobPropertyFile(tura_home,"Default.properties")
		          		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Load_Monthly_Data/etl/load_monthly_data_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();
                  
                  new JobPropertyFile(tura_home,"Default.properties")
		          		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Monthly_file_validation/etl/monthly_file_validation_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();

                  new JobPropertyFile(tura_home,"Default.properties")
		          		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Prepare_to_rules_run/etl/prepare_to_rules_run_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();

                  new JobPropertyFile(tura_home,"Default.properties")
		          		  .setApplication("sales-analyzer")
		                  .setRelativeLocation("examples/sales-analyzer/talend-jobs/monthly_file_processing/Run_rules/etl/run_rules_0_1/contexts")
		                  .addProperties("USER_HOME", System.getProperty("user.home")+"/")
		                  .run();
                  
                   new CopyFile()
                   		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/sales-analyzer/server-extension/1.0.0-SNAPSHOT/server-extension-1.0.0-SNAPSHOT.jar")
                   		.setTargetLocation(jboss_home+"/standalone/deployments/kie-server.war/WEB-INF/lib/")
                   		.setTargetName("server-extension-1.0.0-SNAPSHOT.jar")
                   		.copyFromExternal();

                   new CopyFile()
          	      		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/sales-analyzer/api-extension/1.0.0-SNAPSHOT/api-extension-1.0.0-SNAPSHOT.jar")
          	      		.setTargetLocation(jboss_home+"/standalone/deployments/kie-server.war/WEB-INF/lib/")
          	      		.setTargetName("api-extension-1.0.0-SNAPSHOT.jar")
          	      		.copyFromExternal();

                   new CopyFile()
          	      		.setSourceResource("sales-analyzer/assets/update_db.sql")
         	      		.setTargetLocation(System.getProperty("user.home"))
          	      		.setTargetName("update_db.sql")
          	      		.copyFromClassPath();


              		new DoDeploy(jboss_home,"sa-case-manager.war")
               		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/tura/sales-analyzer/sa-case-manager/1.0/sa-case-manager-1.0.war")
               		.doDeployExploaded();
                   
                   
           		new DoDeploy(jboss_home,"sa-etl-controller.war")
                   		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/tura/sales-analyzer/sa-etl-controller/1.0/sa-etl-controller-1.0.war")
                   		.doDeployExploaded();

           		new DoDeploy(jboss_home,"sa-admin.war")
           		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/org/tura/sales-analyzer/sa-admin/1.0/sa-admin-1.0.war")
           		.doDeployExploaded();
           		
           		
           		
           		new DoDeploy(jboss_home,"sa-resources.war")
		           		.setSourceResource( System.getProperty("user.home")+"/.m2/repository/sales-analyzer/sa-resources/1.0.0-SNAPSHOT/sa-resources-1.0.0-SNAPSHOT.war")
		           		.doDeployExploaded();
           		
           		
	}
}
