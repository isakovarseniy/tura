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

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.gogo.jline.Posix.HelpException;
import org.apache.felix.gogo.jline.command.DockerCommand;
import org.apache.felix.gogo.jline.command.DockerCommitContainer;
import org.apache.felix.gogo.jline.command.DockerConfig;
import org.apache.felix.gogo.jline.command.DockerCreateContainer;
import org.apache.felix.gogo.jline.command.DockerFindContainer;
import org.apache.felix.gogo.jline.command.DockerFindImage;
import org.apache.felix.gogo.jline.command.DockerKeyCloak;
import org.apache.felix.gogo.jline.command.DockerKeyCloakAdapter;
import org.apache.felix.gogo.jline.command.DockerLdap;
import org.apache.felix.gogo.jline.command.DockerLogWatcher;
import org.apache.felix.gogo.jline.command.DockerMongo;
import org.apache.felix.gogo.jline.command.DockerMySql;
import org.apache.felix.gogo.jline.command.DockerNetwork;
import org.apache.felix.gogo.jline.command.DockerPostgresSQL;
import org.apache.felix.gogo.jline.command.DockerPullImage;
import org.apache.felix.gogo.jline.command.DockerRemoveContainerCommand;
import org.apache.felix.gogo.jline.command.DockerRemoveImage;
import org.apache.felix.gogo.jline.command.DockerStartContainer;
import org.apache.felix.gogo.jline.command.DockerStopContainer;
import org.apache.felix.gogo.jline.command.LdapOnDockerHealtCheck;
import org.apache.felix.gogo.jline.command.MongoOnDockerHealthCheck;
import org.apache.felix.gogo.jline.command.MySqlDBDump;
import org.apache.felix.gogo.jline.command.MySqlOnDockerHealthCheck;
import org.apache.felix.gogo.jline.command.MySqlUploadDump;
import org.apache.felix.gogo.jline.command.Postgres96OnDockerHealthCheck;
import org.apache.felix.gogo.jline.command.PostgresDBDump;
import org.apache.felix.gogo.jline.command.PostgresUploadDump;
import org.apache.felix.service.command.CommandSession;
import org.apache.felix.service.command.Process;
import org.jline.reader.Candidate;
import org.jline.reader.LineReader;
import org.jline.reader.ParsedLine;

import picocli.CommandLine;
import picocli.shell.jline3.PicocliJLineCompleter;

public class DockerOperation  {

    public List<Candidate> __docker_picocliCompleter(CommandSession session) {
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
        return new CommandLine(new DockerCommand())
                .addSubcommand("createContainer", new DockerCreateContainer())
                .addSubcommand("commitContainer", new DockerCommitContainer())
                .addSubcommand("config", new DockerConfig())
                .addSubcommand("removeContainer", new DockerRemoveContainerCommand())
                .addSubcommand("removeImage", new DockerRemoveImage())
                .addSubcommand("startContainer", new DockerStartContainer())
                .addSubcommand("stopContainer", new DockerStopContainer())
                .addSubcommand("pullImage", new DockerPullImage())
                .addSubcommand("findContainer", new DockerFindContainer())
                .addSubcommand("findImage", new DockerFindImage())
                .addSubcommand("logWatcher", new DockerLogWatcher())
                .addSubcommand("createNetwork", new DockerNetwork())
                .addSubcommand("postgres", new CommandLine(new DockerPostgresSQL())
                		                      .addSubcommand("postgresHealthCheck", new Postgres96OnDockerHealthCheck())
                		                      .addSubcommand("postgresUploadDump", new PostgresUploadDump())
                		                      .addSubcommand("postgresDBDump", new PostgresDBDump())
                		                      )
                .addSubcommand("mysql", new CommandLine(new DockerMySql())
                        .addSubcommand("mysqlHealthCheck", new MySqlOnDockerHealthCheck())
                        .addSubcommand("mysqlUploadDump", new MySqlUploadDump())
                        .addSubcommand("mysqlDBDump", new MySqlDBDump())
                        )
                .addSubcommand("mongo", new CommandLine(new DockerMongo())
                        .addSubcommand("mongoHealthCheck", new MongoOnDockerHealthCheck())
                        )
                .addSubcommand("ldap", new CommandLine(new DockerLdap())
                        .addSubcommand("ldapHealthCheck", new LdapOnDockerHealtCheck())
                        )

                
                .addSubcommand("keycloak", new CommandLine(new DockerKeyCloak())   
	                                        .addSubcommand("doDeployAdapter", new DockerKeyCloakAdapter())
                		) ;
    }

}


