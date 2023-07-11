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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import picocli.CommandLine.Option;

public class DSLCreateLink extends DSLCommand{

	@Option(names = "--targetDirectory", required = true)
	private String targetDirectory; 
	@Option(names = "--sourceDirectory", required = true)
	private String sourceDirectory;
	@Option(names = "--linkName", required = true)
	private String linkName;

	@Override
	public Object execute() throws Exception {
		
		File dir =  new File(this.sourceDirectory);
        if ( !dir.exists()) {
            dir.mkdirs();
        }

		Path link = Paths.get(this.sourceDirectory , linkName);
		
		if (!Files.exists(link)) {
			Path trg =   Paths.get(targetDirectory);
			Files.createSymbolicLink(link, trg);
		}
		return null;
	}
	
	
}
