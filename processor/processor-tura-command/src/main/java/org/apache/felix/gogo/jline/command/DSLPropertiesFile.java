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
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import picocli.CommandLine.Option;

public class DSLPropertiesFile extends DSLCommand{

	@Option(names = "--propertiesFileName", required = true)
	private String propertiesFileName; 
    @Option(names = "--var")
    private List<String> vars;
	

	@Override
	public Object execute() throws Exception {
		
		Properties prop = new Properties();
		for (String str : vars) {
			int index = str.indexOf("=");

			String v0 = str.substring(0,index);
			String v1 = str.substring(index+1);
			prop.put(v0, v1);
		}		
		File f  = new File(propertiesFileName);
		FileOutputStream out = new FileOutputStream(f);
		prop.store(out, null);
		return null;
	}
	
	
}
