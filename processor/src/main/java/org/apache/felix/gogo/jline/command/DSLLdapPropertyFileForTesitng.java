/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which is available at https://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.apache.felix.gogo.jline.command;

import java.util.List;

import org.tura.configuration.dsl.jboss.LdapPropertyFileForTesitng;

import picocli.CommandLine.Option;

public class DSLLdapPropertyFileForTesitng extends DSLCommand{
	
	
	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--configPath", required = true)
	private List<String> configPath;
	
	@Option(names = "--serverType", required = true)
	private String serverType;
	
	
	
	@Override
	public Object execute() throws Exception {
		
		LdapPropertyFileForTesitng dsl = new LdapPropertyFileForTesitng()
                .setApplication(application)
                .setServerType(serverType);

		for (String confPath : configPath){
			dsl.addConfigPath(confPath);
		}
		dsl.run();
		
		return null;
		
	}

}