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

package org.tura.cli.jboss.wildfly;

import java.util.List;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "runJbossCli"
               , description = "Run jboss-cli command"
			   , headerHeading = "%nUsage:"
			   , synopsisHeading = "%n"
			   , parameterListHeading = "%nParameters:%n"
			   , optionListHeading = "%nOptions:%n")
public class WildflyConfigurationCommand extends WildFlyResolver implements Callable<Object> {

	@Option(names = "--container", required = true)
	private String containerId;

	@Option(names = "--property")
	private List<String> properties;

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--cliFile", required = true)
	private String cliFile;


	@Override
	public Object call() throws Exception {
		getJbossCommand();
		if (jbossCommand == null){
			System.out.println("Provider not found");
			return null; 
		}
		Thread.currentThread().setContextClassLoader(jbossCommand.getClass().getClassLoader());
	    jbossCommand.runJbossCli(containerId,properties,jboss_home,cliFile);
		return null;


	}
}
