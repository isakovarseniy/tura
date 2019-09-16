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

import org.tura.configuration.dsl.jboss.DoDeploy;

import picocli.CommandLine.Option;

public class DSLDoDeploy extends DSLCommand{

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;
	@Option(names = "--targetName", required = true)
	private String targetName;
	@Option(names = "--srcResource", required = true)
	private String srcResource;
	
	
	@Override
	public Object execute() throws Exception {
        new DoDeploy(jboss_home,targetName)
        .setSourceResource( srcResource)
        .doDeployExploaded();

		return null;
	}

}
