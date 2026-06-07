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

package org.tura.cli.container;

import java.util.List;
import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "generateArtifact"
         ,description="Generate artifact command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		  
)
public class GenerateArtifactCommand extends ContainerResolver implements Callable<Object>{

	@Option(names = "--property")
	private List<String> properties;

	@Option(names = "--artifactTargetLocation")
	private String artifactTargetLocation;

	@Option(names = "--artifactName")
	private String artifactName;
	
	@Option(names = "--templateLocation")
	private String templateLocation;

	@Option(names = "--container", required = true)
	private String containerId;
	
	@Option(names = "--var")
	private String var;
	

    @Override
	public Object call() throws Exception {
		try{
			getContainerCommand();
			if (containerCommand == null){
				System.out.println("No container provider found");
				return null; 
			}
			Thread.currentThread().setContextClassLoader(containerCommand.getClass().getClassLoader());
			return containerCommand.generateArtifact(properties,artifactTargetLocation, artifactName, templateLocation,containerId,var  );
		  }catch(Exception e){
			   throw new RuntimeException(e);
		  }
	   }


}