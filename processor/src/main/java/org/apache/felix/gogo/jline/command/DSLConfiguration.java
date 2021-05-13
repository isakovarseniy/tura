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

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.metamodel.commons.Util;

import picocli.CommandLine.Option;

public class DSLConfiguration  extends DSLCommand {

    @Option(names = "--mavenRepositoryLocation")
    private boolean mavenRepositoryLocation;

	
	public String getLocalRepositoryLocation() {
		Path  lnk  = Paths.get(ConfigConstants.TURA_WORKING_DIRECTORY, ConfigConstants.MAVEN_REPO_LINK);
		
		String repoLocation= System.getProperty("user.home")+"/.m2/repository";
		try {
			repoLocation = FileUtils.readFileToString(  lnk.toFile(),  Charset.defaultCharset());
			repoLocation = repoLocation.replaceAll("\\n", "");
			repoLocation = repoLocation.replaceAll("\\r", "");
		} catch (IOException e) {
		}
		
		return Util.pathConverter(repoLocation);
	}


	@Override
	public Object execute() throws Exception {
		if (mavenRepositoryLocation) {
			return getLocalRepositoryLocation();
		}
		return null;
	}


}
