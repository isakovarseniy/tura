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
import org.apache.felix.gogo.jline.command.DSLCommand;
import org.apache.felix.gogo.jline.command.DSLCopyFile;
import org.apache.felix.gogo.jline.command.DSLCopyMonthlyFile;
import org.apache.felix.gogo.jline.command.DSLCopyRoles;
import org.apache.felix.gogo.jline.command.DSLCopyUsers;
import org.apache.felix.gogo.jline.command.DSLDoDeploy;
import org.apache.felix.gogo.jline.command.DSLExecuteExternal;
import org.apache.felix.gogo.jline.command.DSLJobPropertyFile;
import org.apache.felix.gogo.jline.command.DSLModule;
import org.apache.felix.gogo.jline.command.DSLStandaloneFullXml;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;
import org.jline.reader.Candidate;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;

import picocli.CommandLine;
import picocli.shell.jline3.PicocliJLineCompleter;

public class DSLOperation  {

    public List<Candidate> __dsl_picocliCompleter(CommandSession session) {
        ParsedLine line = Shell.getParsedLine(session);
        LineReader reader = Shell.getReader(session);
        List<Candidate> candidates = new ArrayList<>();

        CommandLine cmd = getCommandLine();
        new PicocliJLineCompleter(cmd.getCommandSpec()).complete(reader, line, candidates);
        return candidates;
    }

    public Object _main(CommandSession session, String[] argv) {
        if (argv == null || argv.length < 1) {
            throw new IllegalArgumentException();
        }
        Process process = Process.Utils.current();
        try {
            String args[] = new String[argv.length - 1];
            System.arraycopy(argv, 1, args, 0, argv.length - 1);
            return run(session, process, args);
        } catch (IllegalArgumentException e) {
            process.err().println(e.getMessage());
            process.error(2);
        } catch (HelpException e) {
            process.err().println(e.getMessage());
            process.error(0);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
        	e.printStackTrace();
            process.err().println(argv[0] + ": " + e.toString());
            process.error(1);
        }
        return null;
    }

    protected Object run(CommandSession session, Process process, Object[] argv) throws Exception {

        CommandLine line = getCommandLine();
        Object result=null;

        List<CommandLine> commands = line.parseArgs((String[]) argv).asCommandLineList();
        for (CommandLine command : commands) {
            Executable cmd = command.getCommand();
            if (cmd instanceof SessionAware) {
                ((SessionAware) cmd).setSession(session);
            }
            result = cmd.execute();
        }

        return result;

    }

    protected CommandLine getCommandLine() {
        return new CommandLine(new DSLCommand())
        		.addSubcommand("copyFile", new DSLCopyFile())
                .addSubcommand("copyRoles", new DSLCopyRoles())
                .addSubcommand("copyUsers", new DSLCopyUsers())
                .addSubcommand("jbossModule", new DSLModule())
                .addSubcommand("jbossStandaloneFullXml", new DSLStandaloneFullXml())
                .addSubcommand("jbossDoDeploy", new DSLDoDeploy())
                .addSubcommand("jobPropertyFile", new DSLJobPropertyFile())
                .addSubcommand("exec", new DSLExecuteExternal())
                .addSubcommand("copyMonthlyFiles", new DSLCopyMonthlyFile())
                
        ;
    }

}

