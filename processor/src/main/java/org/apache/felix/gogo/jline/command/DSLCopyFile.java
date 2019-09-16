/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
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
	
        new CopyFile()
    		.setTargetLocation(targetLocation)
            .setTargetName(targetName)
            .setSourceResource(sourceResource)
            .setContainer(containerId)
            .copyFromExternal();
        
        
        if (unzip ) {
    		ZipUtil.unpack(new File(targetLocation+"/"+targetName ), new File(targetLocation));
        }
		
		return null;
	}

}
