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

package org.tura.cli.jboss.keycloak;


import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "healthCheck"
         ,description="KeyCloak health check command"
		 ,headerHeading = "%nUsage:"
         ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		 )
public class KeyCloakHealthCheckCommand extends KeyCloakResolver implements Callable<Object>{

    @Option(names = "--realm", required = true)
    private String realm;

    @Option(names = "--host", required = true)
    private String host;

    @Option(names = "--repeats")
    private int rpt;
    

	@Override
	public Object call() throws Exception {
		getKeyCloakCommand();
		if (keycloakCommand == null){
			System.out.println("Provider not found");
			return null; 
		}
		Thread.currentThread().setContextClassLoader(keycloakCommand.getClass().getClassLoader());
	    keycloakCommand.healthCheck(realm,host,rpt);
		return null;


	}
}
