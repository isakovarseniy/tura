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

package org.tura.cli.metamodel;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "build"
         ,description="Recipe build command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		  
		 )
public class BuildCommand extends MetamodelResolver implements Callable<Object> {

	@Option(names = "--recipeId", description = "Recipe identificator", required = true)
	private String recipeId;

	@Option(names = "--infraId", description = "Recipe configuration", required = true)
	private String infraId;

	@Option(names = "--source", description = "Model location" , required = true)
	private String source;

    @Override
	public Object call() throws Exception {
		getMetamodelCommand();
		if (metamodelCommand == null){
			System.out.println("Provider not found");
			return null; 
		}
		Thread.currentThread().setContextClassLoader(metamodelCommand.getClass().getClassLoader());
	    metamodelCommand.build(recipeId, infraId, source);
		return null;
	}


}
