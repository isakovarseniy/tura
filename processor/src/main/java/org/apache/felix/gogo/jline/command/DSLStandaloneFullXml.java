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

import org.tura.configuration.dsl.jboss.StandaloneFullXml;

import picocli.CommandLine.Option;

public class DSLStandaloneFullXml extends DSLCommand {

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

	@Override
	public Object execute() throws Exception {

		StandaloneFullXml dsl = new StandaloneFullXml(jboss_home)
				.setApplication(application)
				.setServerType(serverType)
				.setContainerId(container);

		for (String confPath : configPath) {
			dsl.addConfigPath(confPath);
		}
		if (properties != null) {
			for (String p : properties) {
				String[] ps = p.split(":");
				if (ps.length != 2) {
					throw new IllegalArgumentException("Wrong property " + p);
				}
				dsl.addProperties(ps[0], ps[1]);
			}
		}
		dsl.run();

		return null;
	}

}
