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

import java.util.List;

import org.tura.configuration.dsl.jboss.Module;

import picocli.CommandLine.Option;

public class DSLModule extends DSLCommand {

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--serverType", required = true)
	private String serverType;

	@Option(names = "--configPath", required = true)
	private List<String> configPath;

	@Option(names = "--property")
	private List<String> properties;

	@Option(names = "--container")
	private String container;

	@Option(names = "--relativeLocation", required = true)
	private String relativeLocation;

	@Override
	public Object execute() throws Exception {

		Module dsl = new Module(jboss_home,this.session)
				.setApplication(application)
				.setServerType(serverType)
				.setContainerId(container)
				.setRelativeLocation(relativeLocation);

		for (String confPath : configPath) {
			dsl.addConfigPath(confPath);
		}

		if (properties != null) {
			for (String p : properties) {
				int index = p.indexOf(":");
				if (index != -1) {
					String key = p.substring(0, index);
					String value = p.substring(index + 1);
					dsl.addProperties(key, value);
				} else {
					throw new IllegalArgumentException("Wrong property " + p);
				}
			}
		}
		dsl.run();

		return null;
	}

}
