/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.containers.docker.wildfly;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.tura.cli.containers.docker.Docker;
import org.tura.cli.containers.docker.DockerGenerateArtifact;

public class DockerWildflyRunJbossCli extends Docker{


    public Object runJbossCli(String containerId, List<String> properties,  String jboss_home, String cliFile) throws Exception {

		    String artifactName = Paths.get(cliFile).getFileName().toString();
			String artifactTargetLocation = jboss_home;

			new DockerGenerateArtifact().execute( properties,  artifactTargetLocation,  artifactName, cliFile,  containerId,null);

			String command = String.format("sh -c \" %s/bin/jboss-cli.sh  --file=%s/%s\" ", jboss_home, jboss_home, artifactName);
			 
	        List<String> lcmd = new ArrayList<>();
	        lcmd.add("sh");
	        lcmd.add("-c");
	        lcmd.add(command);
	        
	        String[] cmd = lcmd.toArray(new String[3]);
			 
			 this.cmd(containerId, cmd,System.out,false);
			 
			return null;

    }

}
