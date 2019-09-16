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

import java.util.List;

import org.apache.felix.gogo.jline.command.BuildCommand;
import org.apache.felix.service.command.CommandSession;
import org.jline.reader.Candidate;

import picocli.CommandLine;

public class BuildOperation extends RecipeProcessor{

	@Override
	protected CommandLine getCommandLine() {
		return  new CommandLine(new BuildCommand());
	}
	

	public List<Candidate> __build_picocliCompleter(CommandSession session) {
		return __generate_picocliCompleter(session);
	}
	
}
