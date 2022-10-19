/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.configuration.dsl.jboss;

import org.apache.felix.service.command.CommandSession;
import org.tura.configuration.dsl.commons.Artifact;

public class Module extends Artifact<Module>{
	
    private static String artifactPath = "${JBOSS_HOME}/modules";
    private static String artifactName = "module.xml";
	
    private static String templatePath="${application}/${JBOSS_VERSION}/templates/module.xml";
    
    
	public Module(String  jboss_home, CommandSession session) {
		super(session);
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
