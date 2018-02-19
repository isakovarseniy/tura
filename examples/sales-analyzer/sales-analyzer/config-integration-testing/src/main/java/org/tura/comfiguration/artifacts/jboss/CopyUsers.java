package org.tura.comfiguration.artifacts.jboss;

import org.tura.comfiguration.artifacts.CopyArtifact;

public class CopyUsers extends CopyArtifact<CopyUsers>{

    private static String targetPath = "${JBOSS_HOME}/standalone/configuration";
    private static String targetName = "application-roles.properties";
    private static String sourceName = "${application}/${JBOSS_VERSION}/assets/application-users.properties";
    
	
	public CopyUsers(String  jboss_home) {
	    this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		this.setTargetName(targetName);
        this.setSourceResource(sourceName);
   }
	
	   @Override
		public CopyUsers setServerType(String serverType) {
			super.setServerType(serverType);
			this.setSourceResource( (this.srcResource.replace("${JBOSS_VERSION}", serverType)));
			return this;
		}
	   
	   @Override
		public CopyUsers setApplication(String application) {
			super.setApplication(application);
			this.setSourceResource(this.srcResource.replace("${application}", application));
			return this;
		}
  
    
}
