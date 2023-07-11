/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.configuration.dsl.commons;

import org.apache.felix.gogo.jline.command.api.ConfigConstants;
import org.apache.felix.service.command.CommandSession;

public class JobPropertyFile extends Artifact<JobPropertyFile> {

	private static String artifactPath = ConfigConstants.RESOURCE_HOME;

	private static String templatePath = "${application}/templates/Default.properties";

	public JobPropertyFile(String artifactName, CommandSession session) {
		super(session);
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
