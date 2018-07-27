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
package org.tura.comfiguration.commons;

import org.tura.comfiguration.artifacts.Artifact;

public class JobPropertyFile extends Artifact<JobPropertyFile> {

	private static String artifactPath = "${TURA_HOME}";

	private static String templatePath = "${application}/templates/Default.properties";

	public JobPropertyFile(String tura_home, String artifactName) {
		this.setArtifactTargerLocation(artifactPath.replace("${TURA_HOME}", tura_home));
		this.setArtifactName(artifactName);
		this.setTemplateFile(templatePath);
	}

	public JobPropertyFile setRelativeLocation(String relativeLocation) {
		this.setArtifactTargerLocation(this.artifactTargerLocation + "/" + relativeLocation);
		return this;
	}

	@Override
	public JobPropertyFile setApplication(String application) {
		super.setApplication(application);
		this.setTemplateFile(this.templateFile.replace("${application}", application));
		return this;
	}

}
