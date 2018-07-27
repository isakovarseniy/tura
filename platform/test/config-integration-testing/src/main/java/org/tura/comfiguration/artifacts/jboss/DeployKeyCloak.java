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

import java.io.File;

import org.tura.comfiguration.artifacts.CopyArtifact;
import org.tura.comfiguration.artifacts.ExecuteArtifact;
import org.zeroturnaround.zip.ZipUtil;

public class DeployKeyCloak extends  CopyArtifact<DeployKeyCloak> {

	private static String targetPath = "${JBOSS_HOME}";
	private String jboss_home;

	public DeployKeyCloak(String jboss_home) {
		this.jboss_home = jboss_home;
		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
	}
	
	public void doDeploy() throws Exception {
		ZipUtil.unpack(new File(srcResource), new File(targetLocation));
		this
		    .setTargetLocation(this.targetLocation+"/modules")
		    .setSourceResource(this.application+ "/wildfly-10.1.0.Final/assets/layers.conf")
		    .setTargetName("layers.conf")
		    .copyFromClassPath();

		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		
		this
	    .setTargetLocation(this.targetLocation+"/bin")
	    .setSourceResource(this.application+ "/wildfly-10.1.0.Final/assets/keycloak-install.cli")
	    .setTargetName("keycloak-install.cli")
	    .copyFromClassPath();

		this.setTargetLocation(targetPath.replace("${JBOSS_HOME}", jboss_home));
		
		new ExecuteArtifact()
		     .addArguments(this.targetLocation+"/bin/jboss-cli.sh") 
		     .addArguments("--file="+this.targetLocation+"/bin/keycloak-install.cli")
		     .run();
		     
		
		
	}
	
	
}
