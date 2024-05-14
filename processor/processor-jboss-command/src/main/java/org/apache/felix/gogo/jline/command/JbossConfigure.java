/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.nio.file.Paths;

import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class JbossConfigure extends DockerCommand {

	@Option(names = "--container", required = true)
	private String containerId;

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--cliFile", required = true)
	private String cliFile;

	
	@Override
	public Object execute() {
		try {
			
			String fileName = Paths.get(cliFile).getFileName().toString();

			new CopyFile(this.session).setTargetLocation(jboss_home + "/bin")
					.setSourceResource(cliFile)
					.setTargetName(fileName).setContainer(containerId).copyFromExternal();

			new ExecuteExternalOperation(
			           String.format("docker exec -i  %s sh -c \" %s/bin/jboss-cli.sh  --file=%s/bin/%s\" ", containerId,
					          jboss_home, jboss_home, fileName)).execute();

			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return null;
	}

	
}
