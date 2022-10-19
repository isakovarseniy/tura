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
import org.apache.felix.gogo.jline.command.InstallChromeDriver;
import org.apache.felix.gogo.jline.command.InstallCommand;
import org.apache.felix.gogo.jline.command.InstallMaven;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;
import org.jline.reader.Candidate;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;

import picocli.CommandLine;
import picocli.shell.jline3.PicocliJLineCompleter;

public class InstallOperation {

	static final String[] functions = { "__install_picocliCompleter" };

	
    public void _main(CommandSession session, String[] argv) {
        if (argv == null || argv.length < 1) {
            throw new IllegalArgumentException();
        }
        Process process = Process.Utils.current();
        try {
        	String args[] = new String[argv.length-1];
        	System.arraycopy(argv, 1, args, 0, argv.length-1);
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
        String[] usage = {
                "install - install additional software",
                "Usage: install [maven | chromedriver]"
        };

    	
    	CommandLine line = getInstallCommandLine();
		List<CommandLine> commands =  line.parseArgs((String[]) argv).asCommandLineList();
		if ( commands.size() == 1){
            throw new HelpException(String.join("\n", usage));
		}
		
		for(CommandLine cl: commands){
			Object cmd = cl.getCommand();
			if (cmd instanceof InstallChromeDriver || cmd instanceof InstallMaven){
				Runnable runnable = (Runnable) cmd;
				runnable.run();
			}
			
		}
		
		return null;

    }


	public List<Candidate> __install_picocliCompleter(CommandSession session) {
		ParsedLine line = Shell.getParsedLine(session);
		LineReader reader = Shell.getReader(session);
		List<Candidate> candidates = new ArrayList<>();

		CommandLine cmd = getInstallCommandLine();
		new PicocliJLineCompleter(cmd.getCommandSpec()).complete(reader, line, candidates);
		return candidates;
	}

	private CommandLine getInstallCommandLine(){
		return  new CommandLine(new InstallCommand())
				.addSubcommand("chromedriver", new InstallChromeDriver())
				.addSubcommand("maven", new InstallMaven());

	}
	
	
}
