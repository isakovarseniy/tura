/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
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

		
	}

}
