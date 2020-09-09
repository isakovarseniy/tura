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

import java.util.List;

import org.tura.configuration.dsl.commons.ArtifactGenerator;

import picocli.CommandLine.Option;

public class DSLGenerateArtifact extends DSLCommand {

	@Option(names = "--property")
	private List<String> properties;

	@Option(names = "--artifactTargetLocation")
	private String artifactTargetLocation;

	@Option(names = "--artifactName")
	private String artifactName;
	
	@Option(names = "--templateLocation")
	private String templateLocation;
	
	
	@Override
	public Object execute() throws Exception {

		ArtifactGenerator dsl = new ArtifactGenerator( artifactTargetLocation,  artifactName,  templateLocation,this.session);

		if (properties != null) {
			for (String p : properties) {
				int index = p.indexOf(":");
				if ( index != -1) {
					String key = p.substring(0,index);
					String value = p.substring(index+1);
					dsl.addProperties(key, value);
				}else {
					throw new IllegalArgumentException("Wrong property " + p);
				}
			}
		}
		dsl.run();

		return null;
	}
	
	
}
