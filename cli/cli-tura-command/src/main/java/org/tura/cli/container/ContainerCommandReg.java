/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.container;

import picocli.CommandLine.Command;

@Command( name = "container" 
         , description = "Container manipulation"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
         ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"

		 , subcommands = {
				 LogWatcherCommand.class,
				 CopyFileCommand.class,
				 GenerateArtifactCommand.class
})
public class ContainerCommandReg {

}
