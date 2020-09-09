/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
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
        new DoDeploy(jboss_home,targetName,this.session)
        .setSourceResource( srcResource)
        .doDeployExploaded();

		return null;
	}

}
