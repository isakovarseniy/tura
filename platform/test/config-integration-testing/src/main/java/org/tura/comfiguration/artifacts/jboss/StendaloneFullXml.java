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
