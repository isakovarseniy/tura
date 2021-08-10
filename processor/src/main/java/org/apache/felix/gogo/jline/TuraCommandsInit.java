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

package org.apache.felix.gogo.jline;

import org.apache.felix.gogo.runtime.CommandProcessorImpl;

public class TuraCommandsInit {

	public static void initProcessor(CommandProcessorImpl processor) {
		processor.addCommand("tura", new InstallOperation(), "install");
		processor.addCommand("tura", new InstallOperation(), "__install_picocliCompleter");

		processor.addCommand("tura", new GenerateOperation(), "generate");
		processor.addCommand("tura", new GenerateOperation(), "__generate_picocliCompleter");

		processor.addCommand("tura", new BuildOperation(), "build");
		processor.addCommand("tura", new BuildOperation(), "__build_picocliCompleter");

		processor.addCommand("tura", new ValidateOperation(), "validate");
		processor.addCommand("tura", new ValidateOperation(), "__validate_picocliCompleter");
		
		processor.addCommand("tura", new MavenOperation(), "mvn");
		processor.addCommand("tura", new MavenOperation(), "__mvn_picocliCompleter");

		processor.addCommand("tura", new DockerOperation(), "docker");
		processor.addCommand("tura", new DockerOperation(), "__docker_picocliCompleter");

		processor.addCommand("tura", new DSLOperation(), "dsl");
		processor.addCommand("tura", new DSLOperation(), "__dsl_picocliCompleter");

		processor.addCommand("tura", new ClosureOperation(), "closure");
		processor.addCommand("tura", new ClosureOperation(), "__closure_Completer");
	
        processor.addCommand("gogo", new ClosureOperation(), "addClosure");
        processor.addCommand("gogo", new ClosureOperation(), "removeClosure");

        processor.addCommand("tura", new ExtensionInitializationOperation(), "postInit");

        processor.addCommand("tura", new SetTuraLocation(), "setTuraLocation");
        
	}

}
