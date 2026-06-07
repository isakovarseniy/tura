/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.cli.sa.containers.docker;

import org.tura.cli.ConfigConstants;
import org.tura.cli.dsl.Artifact;

public class JobPropertyFile extends Artifact{

	private static String artifactPath = ConfigConstants.RESOURCE_HOME;

	private static String templatePath = "${application}/templates/Default.properties";

	public JobPropertyFile(String artifactName, Object session) {
		this.setArtifactTargerLocation(artifactPath);
		this.setArtifactName(artifactName);
		this.setTemplateFile(templatePath);
	}

	public void  setRelativeLocation(String relativeLocation) {
		this.setArtifactTargerLocation(this.artifactTargerLocation + "/" + relativeLocation);
	}

	public void  setApplication(String application) {
		this.setTemplateFile(this.templateFile.replace("${application}", application));
	}

}
