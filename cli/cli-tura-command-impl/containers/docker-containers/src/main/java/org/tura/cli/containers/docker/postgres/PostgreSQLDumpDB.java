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

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.tura.cli.containers.docker.Docker;

public class PostgreSQLDumpDB extends Docker{

    public Object execute(String dump, String name,String username, String dbname) throws Exception {
        if (username == null){
            username = "postgres";
        }
        if (dbname == null){
            dbname = "postgres";
        }

        FileOutputStream fos = new FileOutputStream(dump,true);
        PrintStream dumpStream = new PrintStream(new FileOutputStream(dump));         
        try {
            
            List<String> lcmd = new ArrayList<>();
            lcmd.add("sh");
            lcmd.add("-c");
            lcmd.add(String.format( "/usr/lib/postgresql/9.6/bin/pg_dump -Fc -U %s   %s ",username, dbname));
            
            String[] cmd =   lcmd.toArray(new String[3]);
            Long code =  (Long) new Docker().cmd(name, cmd,dumpStream,true);

            return code;
        	
        }finally {
        	dumpStream.flush();
        	fos.flush();
        	dumpStream.close();
        	fos.close();
        }

    }

}
