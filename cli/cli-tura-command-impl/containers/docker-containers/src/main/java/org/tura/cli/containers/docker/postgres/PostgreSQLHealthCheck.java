/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.containers.docker.postgres;

import java.util.ArrayList;
import java.util.List;

import org.tura.cli.containers.docker.Docker;
import org.tura.cli.dsl.HealthCheck;

public class PostgreSQLHealthCheck extends HealthCheck{

    private String name;
    private String user;
    private String password;

    public PostgreSQLHealthCheck( String name, String user, String password, int rpt){
        super(rpt);
        this.name = name;
        this.user = user;
        this.password = password;
    }

    @Override
    public int call() throws Exception {
        String command = String.format( "/usr/lib/postgresql/9.6/bin/psql -U %s %s -c SELECT 1   ", user, password);
        List<String> lcmd = new ArrayList<>();
        lcmd.add("sh");
        lcmd.add("-c");
        lcmd.add(command);
        
        String[] cmd = lcmd.toArray(new String[3]);
        
        Long code =  (Long) new Docker().cmd(name, cmd,null,false);
        return code.intValue();
    }

}
