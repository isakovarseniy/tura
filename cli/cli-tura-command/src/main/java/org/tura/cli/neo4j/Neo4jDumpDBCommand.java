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

package org.tura.cli.neo4j;

import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "dumpDB"
         ,description="Neo4j dump db command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		 )
public class Neo4jDumpDBCommand extends Neo4jResolver implements Callable<Object> {

	@Option(names = "--dump")
	private String dump;

	@Option(names = "--storage")
	private String storage;

	@Option(names = "--name")
	private String name;



	@Override
	public Object call() throws Exception {
		try{
			getNeo4jCommand();
			if (neo4jCommand == null){
				System.out.println("No provider found");
				return null; 
			}
			Thread.currentThread().setContextClassLoader(neo4jCommand.getClass().getClassLoader());
			return neo4jCommand.dump( dump, storage ,  name);
	   }catch(Exception e){
			throw new RuntimeException(e);
	   }

	}

}
