/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.configuration.dsl.jboss;

import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyArtifact;

public class CopyRoles extends CopyArtifact<CopyRoles>{

    private static String targetPath = "${JBOSS_HOME}/standalone/configuration";
    private static String targetName = "application-roles.properties";
    private static String sourceName = ConfigConstants.TURA_CONFIG_REPOSITORY+ "/${application}/${JBOSS_VERSION}/assets/application-roles.properties";
    
	
	public CopyRoles(String  jboss_home) {
	    this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		this.setTargetName(targetName);
        this.setSourceResource(sourceName);
   }
	
	   @Override
		public CopyRoles setServerType(String serverType) {
			super.setServerType(serverType);
			this.setSourceResource( (this.srcResource.replace("${JBOSS_VERSION}", serverType)));
			return this;
		}
	   
	   @Override
		public CopyRoles setApplication(String application) {
			super.setApplication(application);
			this.setSourceResource(this.srcResource.replace("${application}", application));
			return this;
		}
  
    
}
