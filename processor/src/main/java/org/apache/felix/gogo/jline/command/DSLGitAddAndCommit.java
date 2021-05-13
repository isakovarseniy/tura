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

package org.apache.felix.gogo.jline.command;

import org.tura.configuration.dsl.commons.GitRepository;

import picocli.CommandLine.Option;

public class DSLGitAddAndCommit extends DSLCommand{

	@Option(names = "--localRepositoryPath", required = true)
	private String localRepositoryPath; 

	@Option(names = "--message")
	private String message = "Init"; 
	
	
	@Override
	public Object execute() throws Exception {
	
        new GitRepository()
    		.setLocalRepositoryPath(localRepositoryPath)
    		.setLocalRepositoryPath(localRepositoryPath)
    		.setMessage(message)
    		.addAndCommitRepository();
		
		return null;
	}


	
	
}
