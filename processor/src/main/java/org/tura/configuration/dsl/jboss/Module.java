/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.tura.configuration.dsl.jboss;

import org.tura.configuration.dsl.commons.Artifact;

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
