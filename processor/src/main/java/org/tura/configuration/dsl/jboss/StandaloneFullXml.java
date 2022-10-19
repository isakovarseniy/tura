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

public class StandaloneFullXml extends Artifact<StandaloneFullXml>{

    private static String artifactPath = "${JBOSS_HOME}/standalone/configuration";
    private static String artifactName = "standalone-full.xml";
    
    private static String templatePath="${application}/${JBOSS_VERSION}/templates/standalone-full.xml";
	
	public StandaloneFullXml(String  jboss_home, CommandSession session) {
		   super(session);
		    this.setArtifactTargerLocation(artifactPath.replace("${JBOSS_HOME}", jboss_home));
			this.setArtifactName(artifactName);
			this.setTemplateFile(templatePath);
	}
	
   @Override
	public StandaloneFullXml setServerType(String serverType) {
		super.setServerType(serverType);
		this.setTemplateFile(this.templateFile.replace("${JBOSS_VERSION}", serverType));
		
		return this;
	}
   
   @Override
	public StandaloneFullXml setApplication(String application) {
		super.setApplication(application);
		this.setTemplateFile(this.templateFile.replace("${application}", application));
		return this;
	}

		

}
