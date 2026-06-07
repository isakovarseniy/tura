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

package org.tura.cli.postgres;


import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "uploadDB"
         ,description="PostgreSQL upload db command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		 )
public class PostgreSQLUploadDBCommand extends PostgreSQLResolver implements Callable<Object> {
    @Option(names = "--dump")
    private String dump;

    @Option(names = "--name")
    private String name;

	@Option(names = "--user")
	private String username;
	
	@Option(names = "--db")
	private String dbname;


	@Override
	public Object call() throws Exception {
		try{
			getPostgreSQLCommand();
			if (postgreSQLCommand == null){
				System.out.println("No provider found");
				return null; 
			}
			Thread.currentThread().setContextClassLoader(postgreSQLCommand.getClass().getClassLoader());
			return postgreSQLCommand.uploaddump( dump,  name, username, dbname );
	   }catch(Exception e){
			throw new RuntimeException(e);
	   }
	}

}
