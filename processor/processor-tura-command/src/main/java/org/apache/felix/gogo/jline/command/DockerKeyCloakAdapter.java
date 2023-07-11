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

package org.apache.felix.gogo.jline.command;

import org.apache.commons.io.FilenameUtils;
import org.apache.felix.gogo.jline.command.api.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class DockerKeyCloakAdapter extends DockerCommand {

	@Option(names = "--container", required = true)
	private String containerId;

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--serverType", required = true)
	private String serverType;

	@Option(names = "--keyCloakAdapter", required = true)
	private String keyCloakAdapter;

	@Option(names = "--cliFile")
	private String cliFile;

	@Override
	public Object execute() {
		try {

			if (cliFile == null) {
				cliFile = "adapter-install-offline.cli";
			}

			new CopyFile(this.session).setTargetLocation(jboss_home).setSourceResource(keyCloakAdapter)
					.setContainer(containerId).copyFromExternal();

			String filename = FilenameUtils.getName(keyCloakAdapter);
			new ExecuteExternalOperation(String.format("docker exec -i %s sh -c \"cd %s; unzip -o  ./%s\" ",
					containerId, jboss_home, filename)).execute();

			new CopyFile(this.session).setTargetLocation(jboss_home + "/bin")
					.setSourceResource(ConfigConstants.TURA_CONFIG_REPOSITORY + "/" + this.application + "/"
							+ serverType + "/assets/" + cliFile)
					.setTargetName(cliFile).setContainer(containerId).copyFromExternal();

			new ExecuteExternalOperation(
					String.format("docker exec -i  %s sh -c \" %s/bin/jboss-cli.sh  --file=%s/bin/%s\" ", containerId,
							jboss_home, jboss_home, cliFile)).execute();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return null;
	}

}
