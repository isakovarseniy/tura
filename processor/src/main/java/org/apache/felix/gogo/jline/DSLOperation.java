/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline;

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.Posix.HelpException;
import org.apache.felix.gogo.jline.command.DSLAddTemplateRoot;
import org.apache.felix.gogo.jline.command.DSLCommand;
import org.apache.felix.gogo.jline.command.DSLConfiguration;
import org.apache.felix.gogo.jline.command.DSLCopyDir;
import org.apache.felix.gogo.jline.command.DSLCopyFile;
import org.apache.felix.gogo.jline.command.DSLCopyMonthlyFile;
import org.apache.felix.gogo.jline.command.DSLCopyRoles;
import org.apache.felix.gogo.jline.command.DSLCopyUsers;
import org.apache.felix.gogo.jline.command.DSLCreateLink;
import org.apache.felix.gogo.jline.command.DSLDelTemplateRoot;
import org.apache.felix.gogo.jline.command.DSLDoDeploy;
import org.apache.felix.gogo.jline.command.DSLExecuteExternal;
import org.apache.felix.gogo.jline.command.DSLGenerateArtifact;
import org.apache.felix.gogo.jline.command.DSLGitAddAndCommit;
import org.apache.felix.gogo.jline.command.DSLGitArchive;
import org.apache.felix.gogo.jline.command.DSLGitClone;
import org.apache.felix.gogo.jline.command.DSLGitPush;
import org.apache.felix.gogo.jline.command.DSLJobPropertyFile;
import org.apache.felix.gogo.jline.command.DSLLicenseSet;
import org.apache.felix.gogo.jline.command.DSLLicenseShow;
import org.apache.felix.gogo.jline.command.DSLMkDir;
import org.apache.felix.gogo.jline.command.DSLModule;
import org.apache.felix.gogo.jline.command.DSLPropertiesFile;
import org.apache.felix.gogo.jline.command.DSLRemoveFile;
import org.apache.felix.gogo.jline.command.DSLStandaloneFullXml;
import org.apache.felix.gogo.jline.command.DSLWildFlyConfiguration;
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
                .addSubcommand("wfStartupConfig", new DSLWildFlyConfiguration())
                .addSubcommand("createLink", new DSLCreateLink())
                .addSubcommand("mkDir", new DSLMkDir())
                .addSubcommand("removeFile", new DSLRemoveFile())
                .addSubcommand("gitArchive", new DSLGitArchive())
                .addSubcommand("gitAddAndCommit", new DSLGitAddAndCommit())
                .addSubcommand("gitClone", new DSLGitClone())
                .addSubcommand("gitPush", new DSLGitPush())
                .addSubcommand("copyDir", new DSLCopyDir())
                .addSubcommand("licenseSet", new DSLLicenseSet())
                .addSubcommand("licenseShow", new DSLLicenseShow())
                .addSubcommand("generateArtifact", new DSLGenerateArtifact())
                .addSubcommand("config", new DSLConfiguration())
                .addSubcommand("addTmplRoot", new DSLAddTemplateRoot())
                .addSubcommand("delTmplRoot", new DSLDelTemplateRoot())
                .addSubcommand("properties", new DSLPropertiesFile())
        ;
    }

}

