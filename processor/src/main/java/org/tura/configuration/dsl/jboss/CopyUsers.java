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

import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyArtifact;

public class CopyUsers extends CopyArtifact<CopyUsers>{

    private static String targetPath = "${JBOSS_HOME}/standalone/configuration";
    private static String targetName = "application-users.properties";
    private static String sourceName = ConfigConstants.TURA_CONFIG_REPOSITORY+"/${application}/${JBOSS_VERSION}/assets/application-users.properties";
    
	
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
