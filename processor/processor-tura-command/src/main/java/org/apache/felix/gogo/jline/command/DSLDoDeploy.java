/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.tura.configuration.dsl.jboss.DoDeploy;

import picocli.CommandLine.Option;

public class DSLDoDeploy extends DSLCommand{

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;
	@Option(names = "--targetName", required = true)
	private String targetName;
	@Option(names = "--srcResource", required = true)
	private String srcResource;
	@Option(names = "--container", required = false)
	private String container;
	
	
	@Override
	public Object execute() throws Exception {
		DoDeploy cmd = new DoDeploy(jboss_home,targetName,this.session)
                                           .setSourceResource( srcResource)
                                           .setContainer(container);
		if (container != null) {
		   cmd.doDeploy();
		}else {
		   cmd.doDeployExploaded();
		}

		return null;
	}

}
