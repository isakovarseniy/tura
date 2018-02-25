package org.tura.comfiguration.artifacts.jboss;



import java.io.File;

import org.tura.comfiguration.artifacts.CopyArtifact;
import org.tura.comfiguration.artifacts.ExecuteArtifact;
import org.zeroturnaround.zip.ZipUtil;

public class DeployKeyCloakAdapter extends  CopyArtifact<DeployKeyCloakAdapter> {

	private static String targetPath = "${JBOSS_HOME}";
	private String jboss_home;

	public DeployKeyCloakAdapter(String jboss_home) {
		this.jboss_home = jboss_home;
		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
	}
	
	public void doDeploy() throws Exception {
		ZipUtil.unpack(new File(srcResource), new File(targetLocation));

		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		
		this
	    .setTargetLocation(this.targetLocation+"/bin")
	    .setSourceResource(this.application+ "/wildfly-10.1.0.Final/assets/adapter-install-offline.cli")
	    .setTargetName("adapter-install-offline.cli")
	    .copyFromClassPath();

		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		
		new ExecuteArtifact()
		     .addArguments(this.targetLocation+"/bin/jboss-cli.sh") 
		     .addArguments("--file="+this.targetLocation+"/bin/adapter-install-offline.cli")
		     .run();
		     
		
		
	}
	
	
}
