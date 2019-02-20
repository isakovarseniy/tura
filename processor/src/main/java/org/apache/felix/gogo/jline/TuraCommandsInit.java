/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

		
		
	}

}
