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

import java.io.File;

import org.tura.configuration.dsl.commons.CopyFile;
import org.zeroturnaround.zip.ZipUtil;

import picocli.CommandLine.Option;

public class DSLCopyFile extends DSLCommand{

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
	
	
	
	@Override
	public Object execute() throws Exception {
	
        new CopyFile(this.session)
    		.setTargetLocation(targetLocation)
            .setTargetName(targetName)
            .setSourceResource(sourceResource)
            .setContainer(containerId)
            .copyFromExternal();
        
        
        if (unzip && containerId == null) {
    		ZipUtil.unpack(new File(targetLocation+"/"+targetName ), new File(targetLocation));
        }

        if (unzip && containerId != null) {
            new ExecuteExternalOperation(String.format( "docker exec -i %s sh -c \"cd %s; unzip -o  ./%s\" ", containerId,targetLocation,  targetName) ).execute();
        }
        
        
        
		return null;
	}

}
