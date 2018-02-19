package org.tura.comfiguration.artifacts.jboss;

import org.tura.comfiguration.artifacts.Artifact;

public class StendaloneFullXml extends Artifact<StendaloneFullXml>{

    private static String artifactPath = "${JBOSS_HOME}/standalone/configuration";
    private static String artifactName = "standalone-full.xml";
    
    private static String templatePath="${application}/${JBOSS_VERSION}/templates/standalone-full.xml";
	
	public StendaloneFullXml(String  jboss_home) {
		    this.setArtifactTargerLocation(artifactPath.replace("${JBOSS_HOME}", jboss_home));
			this.setArtifactName(artifactName);
			this.setTemplateFile(templatePath);
	}
	
   @Override
	public StendaloneFullXml setServerType(String serverType) {
		super.setServerType(serverType);
		this.setTemplateFile(this.templateFile.replace("${JBOSS_VERSION}", serverType));
		
		return this;
	}
   
   @Override
	public StendaloneFullXml setApplication(String application) {
		super.setApplication(application);
		this.setTemplateFile(this.templateFile.replace("${application}", application));
		return this;
	}

		

}
