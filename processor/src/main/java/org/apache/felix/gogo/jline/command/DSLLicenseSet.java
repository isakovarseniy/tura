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

import java.nio.file.Files;
import java.nio.file.Paths;

import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Option;

public class DSLLicenseSet extends DSLCommand {

	@Option(names = "--key", required = true)
	private String key;

	@Override
	public Object execute() throws Exception {

		String path  = ConfigConstants.TURA_WORKING_DIRECTORY + "/licensefile";
		Files.writeString(Paths.get((path)), key);
		return null;
	}

}
