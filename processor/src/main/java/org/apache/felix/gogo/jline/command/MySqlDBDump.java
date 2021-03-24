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
        new ExecuteExternalOperation(String.format( "docker exec -i %s sh -c \"/usr/bin/mysqldump -B -u %s --password=%s %s\"  > %s",name,user, password,database,dump) ).execute();
        return null;
    }

    
	
}

