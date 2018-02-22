package org.tura.comfiguration.artifacts.jboss;

import org.tura.comfiguration.artifacts.CopyArtifact;

public class CopyH2Jar extends CopyArtifact<CopyH2Jar>{

    private static String targetPath = "${JBOSS_HOME}/modules/system/layers/base/com/h2database/h2/main";
    private static String targetName = "h2-1.3.175.jar";
    private static String sourceName = System.getProperty("user.home")+"/.m2/repository/com/h2database/h2/1.3.175/h2-1.3.175.jar";

	
	public CopyH2Jar(String  jboss_home) {
	    this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		this.setTargetName(targetName);
        this.setSourceResource(sourceName);
   }
	
	   @Override
		public CopyH2Jar setServerType(String serverType) {
			super.setServerType(serverType);
			this.setSourceResource( (this.srcResource.replace("${JBOSS_VERSION}", serverType)));
			return this;
		}
	   
	   @Override
		public CopyH2Jar setApplication(String application) {
			super.setApplication(application);
			this.setSourceResource(this.srcResource.replace("${application}", application));
			return this;
		}
	
	
}
