/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Option;

public class DSLDelTemplateRoot  extends DSLCommand{

    @Option(names = "--root" , required = true)
    private String root;

	@Override
	public Object execute() throws Exception {
		ConfigConstants.roots=null; 
		Path lnk = Paths.get(ConfigConstants.TURA_WORKING_DIRECTORY, ConfigConstants.TEMPLATES_ROOT_LINK);
		File f = lnk.toFile();
		if (f.exists()) {
			String str = FileUtils.readFileToString(f, Charset.defaultCharset());
			if (str.contains(root + ":")) {
				str = str.replace(root + ":", "");
				FileUtils.writeStringToFile(f, str, Charset.defaultCharset());
				return null;
			}
		}
		return null;
	}
}
