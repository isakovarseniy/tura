package org.tura.comfiguration.artifacts.jboss;

import org.tura.comfiguration.artifacts.Artifact;

public class Module extends Artifact<Module>{
	
    private static String artifactPath = "${JBOSS_HOME}/modules";
    private static String artifactName = "module.xml";
	
    private static String templatePath="${application}/${JBOSS_VERSION}/templates/module.xml";
    
    
	public Module(String  jboss_home) {
	    this.setArtifactTargerLocation(artifactPath.replace("${JBOSS_HOME}", jboss_home));
		this.setArtifactName(artifactName);
		this.setTemplateFile(templatePath);
   }
	
	public Module setRelativeLocation(String relativeLocation) {
		this.setArtifactTargerLocation(this.artifactTargerLocation+"/"+relativeLocation);
		return this;
	}

	   @Override
		public Module setServerType(String serverType) {
			super.setServerType(serverType);
			this.setTemplateFile(this.templateFile.replace("${JBOSS_VERSION}", serverType));
			
			return this;
		}
	   
	   @Override
		public Module setApplication(String application) {
			super.setApplication(application);
			this.setTemplateFile(this.templateFile.replace("${application}", application));
			return this;
		}
	
	

}
