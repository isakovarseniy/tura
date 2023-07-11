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
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

import picocli.CommandLine.Option;

public class DSLMkDir extends DSLCommand{

	@Option(names = "--targetLocation", required = true)
	private String targetLocation; 
	
	
	@Override
	public Object execute() throws Exception {

		File f = Paths.get(this.targetLocation).toFile();
		FileUtils.forceMkdir(f);

		
		return null;
	}


}
