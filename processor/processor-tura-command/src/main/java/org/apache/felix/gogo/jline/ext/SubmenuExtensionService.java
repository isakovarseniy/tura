/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.ext;

import java.util.Iterator;
import java.util.ServiceLoader;

import picocli.CommandLine;

public class SubmenuExtensionService {
	
	private ServiceLoader<SubmenuExtension> loader;
	
	public SubmenuExtensionService() {
		loader = ServiceLoader.load(SubmenuExtension.class);
	}
	
	
	public CommandLine initExtension(CommandLine cmd, String extensionId)  {

		Iterator<SubmenuExtension> iterator = loader.iterator();
		while (iterator.hasNext()) {
			SubmenuExtension ext = iterator.next();
			if (extensionId.equals(ext.getExtensionId()) ) {
				cmd.addSubcommand(ext.getSubcommandName(), ext.getCommandLine());
			}
		}
		return cmd;
	}

}
