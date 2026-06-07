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

package org.tura.cli.setup;

import java.util.List;
import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;


@Command(name = "createPropertiesFile"
         ,description="Create properties file command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
)
public class PropertiesFile extends SetupResolver implements Callable<Object>{

	@Option(names = "--propertiesFileName", required = true)
	private String propertiesFileName; 
    @Option(names = "--var")
    private List<String> vars;
	

	@Override
	public Object call() throws Exception {
		try{
			getSetupCommand();
			if (setupCommand == null){
				System.out.println("No container provider found");
				return null; 
			}
			Thread.currentThread().setContextClassLoader(setupCommand.getClass().getClassLoader());
			return setupCommand.createPropertiesFile( propertiesFileName, vars );
	   }catch(Exception e){
			throw new RuntimeException(e);
	   }
	}
	
	
}
