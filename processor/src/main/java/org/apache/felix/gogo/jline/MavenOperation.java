/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.Posix.HelpException;
import org.apache.felix.gogo.jline.command.MavenBuildProject;
import org.apache.felix.gogo.jline.command.MavenCommand;
import org.apache.felix.gogo.jline.command.MavenInstallFile;
import org.apache.felix.gogo.jline.command.MavenSetVersion;
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

        List<String> array = new ArrayList<String>();
        for ( Object arg : argv) {
        	String str = (String) arg;
        	 if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == '\n') {
        	        str = str.substring(0, str.length() - 1);
        	    }
        	 array.add(str);
        }
        String[] arguments = array.toArray(new String[array.size()]);

        List<CommandLine> commands = line.parseArgs(arguments).asCommandLineList();

        for (CommandLine cl : commands) {
			Runnable cmd = cl.getCommand();
			cmd.run();
		}

		return null;

	}

	protected CommandLine getCommandLine() {
		return new CommandLine(new MavenCommand())
				.addSubcommand("install", new MavenInstallFile())
				.addSubcommand("build", new MavenBuildProject())
				.addSubcommand("setversion", new MavenSetVersion())
				;
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
