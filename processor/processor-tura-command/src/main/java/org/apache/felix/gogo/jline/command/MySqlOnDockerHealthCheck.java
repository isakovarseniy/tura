/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.apache.felix.gogo.jline.command;

import picocli.CommandLine.Option;

public class MySqlOnDockerHealthCheck extends HealthCheck{

    
    @Option(names = "--name")
    private String name;

    @Option(names = "--repeats")
    private int rpt;

    @Option(names = "--user")
    private String user;
    
    @Option(names = "--password")
    private String password;
    
    public String getCommand() {
    	if ( user != null && password != null) {
            return String.format(" docker exec %s sh -c \"/usr/bin/mysql -u %s -p%s -e 'SELECT 1;' \" ",name,user,password);
    	}else {
           return String.format(" docker exec %s sh -c \"/usr/bin/mysql -e 'SELECT 1;' \" ",name);
    	}
    }



    @Override
    public int getNumberOrRepeats() {
        return rpt;
    }
    
}