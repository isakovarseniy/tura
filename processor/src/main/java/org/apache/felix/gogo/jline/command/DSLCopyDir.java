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

import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class DSLCopyDir extends DSLCommand{

	@Option(names = "--targetLocation", required = true)
	private String targetLocation; 
	@Option(names = "--sourceResource", required = true)
	private String sourceResource;
	@Option(names = "--container")
	private String containerId;
	
	
	
	@Override
	public Object execute() throws Exception {
	
        new CopyFile(this.session)
    		.setTargetLocation(targetLocation)
            .setSourceResource(sourceResource)
            .setContainer(containerId)
            .copyDirectoryExternal();
        
		return null;
	}

}
