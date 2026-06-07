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

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "cp"
           ,description="Copy file to container command"
	      ,headerHeading = "%nUsage:"
           ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		  
		 )
public class CopyFileCommand extends ContainerResolver implements Callable<Object>{ 

	@Option(names = "--targetLocation", required = true)
	private String targetLocation; 
	@Option(names = "--targetName")
	private String targetName;	
	@Option(names = "--sourceResource", required = true)
	private String sourceResource;
	@Option(names = "--container")
	private String containerId;
	@Option(names = "--unzip")
	private boolean unzip;
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
              return containerCommand.copyFile(targetLocation,  targetName , sourceResource, containerId, unzip,var);
         }catch(Exception e){
              throw new RuntimeException(e);
         }
      }    

}