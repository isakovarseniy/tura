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
package org.apache.felix.gogo.jline.command;

import picocli.CommandLine.Option;

public class MySqlDBDump extends DockerCommand{

    @Option(names = "--dump")
    private String dump;

    @Option(names = "--name")
    private String name;

    @Option(names = "--database")
    private String database;

    
    @Option(names = "--user")
    private String user;
    
    @Option(names = "--password")
    private String password;
    
    
    @Override
    public Object execute() {
        new ExecuteExternalOperation(String.format( "docker exec -i %s sh -c '/usr/bin/mysqldump -B -u %s --password=%s %s'  > %s",name,user, password,database,dump) ).execute();
        return null;
    }

    
	
}

