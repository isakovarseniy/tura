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

import org.tura.cli.postgres.IPostgreSQLCommand;

public class PostgreSqlCommand implements IPostgreSQLCommand{

    @Override
    public Object dump(String dump, String name , String username, String dbname) throws Exception {
        return new PostgreSQLDumpDB().execute( dump,  name, username , dbname );
    }

    @Override
    public Object uploaddump(String dump, String name, String username, String dbname) throws Exception {
        return new PostgreSQLUploadDump().execute( dump,  name ,username , dbname);
    }

    @Override
    public Object healthCheck(String name, String user, String password,int rpt) {
        return new PostgreSQLHealthCheck( name, user, password, rpt).execute();
    }

    
    
}
