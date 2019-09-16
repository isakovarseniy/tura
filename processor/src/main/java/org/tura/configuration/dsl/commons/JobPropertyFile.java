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
package org.tura.configuration.dsl.commons;

public class JobPropertyFile extends Artifact<JobPropertyFile> {

	private static String artifactPath = ConfigConstants.RESOURCE_HOME;

	private static String templatePath = "${application}/templates/Default.properties";

	public JobPropertyFile(String artifactName) {
		this.setArtifactTargerLocation(artifactPath);
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
