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

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "logWatcher"
         ,description="Log watcher command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		  
		 )

public class LogWatcherCommand extends ContainerResolver implements Runnable{
	
	@Option(names = "--name" , required = true)
	private List<String> names;


	public void run() {
		try{
			getContainerCommand();
			if (containerCommand == null){
				System.out.println("No container provider found");
			}
			Thread.currentThread().setContextClassLoader(containerCommand.getClass().getClassLoader());
			containerCommand.logWatch(names);
		  }catch(Exception e){
			   throw new RuntimeException(e);
		  }
	   }

}