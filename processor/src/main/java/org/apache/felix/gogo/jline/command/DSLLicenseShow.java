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
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import org.tura.configuration.dsl.commons.ConfigConstants;

public class DSLLicenseShow extends DSLCommand {

	@Override
	public Object execute() throws Exception {
		try {
			String path  = ConfigConstants.TURA_WORKING_DIRECTORY + "/licensefile";
			System.out.println(Files.readString(Paths.get((path))));
		} catch (NoSuchFileException e) {
			System.out.println("License is not installed");
		}
		return null;
	}

}
