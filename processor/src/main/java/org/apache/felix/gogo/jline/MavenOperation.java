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

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.Posix.HelpException;
import org.apache.felix.gogo.jline.command.MavenBuildProject;
import org.apache.felix.gogo.jline.command.MavenCommand;
import org.apache.felix.gogo.jline.command.MavenInstallFile;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;
import org.jline.reader.Candidate;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;

import picocli.CommandLine;
import picocli.shell.jline3.PicocliJLineCompleter;

public class MavenOperation {

	public void _main(CommandSession session, String[] argv) {
		if (argv == null || argv.length < 1) {
			throw new IllegalArgumentException();
		}
		Process process = Process.Utils.current();
		try {
			String args[] = new String[argv.length - 1];
			System.arraycopy(argv, 1, args, 0, argv.length - 1);
			run(session, process, args);
		} catch (IllegalArgumentException e) {
			process.err().println(e.getMessage());
			process.error(2);
		} catch (HelpException e) {
			process.err().println(e.getMessage());
			process.error(0);
		}catch (RuntimeException e) {
	        throw e; 
		} catch (Exception e) {
			process.err().println(argv[0] + ": " + e.toString());
			process.error(1);
		}
	}

	protected Object run(CommandSession session, Process process, Object[] argv) throws Exception {

		CommandLine line = getCommandLine();

		List<CommandLine> commands = line.parseArgs((String[]) argv).asCommandLineList();
		for (CommandLine cl : commands) {
			Runnable cmd = cl.getCommand();
			cmd.run();
		}

		return null;

	}

	protected CommandLine getCommandLine() {
		return new CommandLine(new MavenCommand()).addSubcommand("install", new MavenInstallFile())
				.addSubcommand("build", new MavenBuildProject());
	}

	public List<Candidate> __mvn_picocliCompleter(CommandSession session) {
		ParsedLine line = Shell.getParsedLine(session);
		LineReader reader = Shell.getReader(session);
		List<Candidate> candidates = new ArrayList<>();

		if (line.words().size() > 2) {
			String last = line.words().get(line.words().size() - 2);

			if ("--pom.xml".equals(last) || "--file".equals(last)) {
				return new Builtin().__files(session);
			}
		}
		CommandLine cmd = getCommandLine();
		new PicocliJLineCompleter(cmd.getCommandSpec()).complete(reader, line, candidates);
		return candidates;
	}

}
