/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.configuration.dsl.sa.CopyMonthlyFiles;

import picocli.CommandLine.Option;

public class DSLCopyMonthlyFile extends DSLCommand {

	@Option(names = "--relativeLocation", required = true)
	private String relativeLocation; 

	@Option(names = "--application", required = true)
	private String application;
	
	@Option(names = "--containerId")
	private String containerId;
	
	@Option(names = "--targetLocation")
	private String targetLocation;
	
	
	
	@Override
	public Object execute() throws Exception {
		
		CopyMonthlyFiles dsl = 
				new CopyMonthlyFiles(this.session)
		               .setApplication(application)
		               .setContainer(containerId);
		
		if (targetLocation != null) {
			dsl.setTargetLocation(targetLocation);
		}
		dsl.setRelativePath(relativeLocation)
		   .copyFromExternal();
		
		return null;
	}

	
}
