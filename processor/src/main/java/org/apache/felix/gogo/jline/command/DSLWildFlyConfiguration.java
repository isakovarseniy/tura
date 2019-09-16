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

import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.configuration.dsl.commons.CopyFile;

import picocli.CommandLine.Option;

public class DSLWildFlyConfiguration extends DSLCommand{

	@Option(names = "--jboss_home", required = true)
	private String jboss_home;

	@Option(names = "--application", required = true)
	private String application;

	@Option(names = "--serverType", required = true)
	private String serverType;

	@Option(names = "--container")
	private String container;

    private static String targetPath = "${JBOSS_HOME}/bin";
    private static String sourceName = ConfigConstants.TURA_CONFIG_REPOSITORY+ "/${application}/${JBOSS_VERSION}/assets/standalone.conf";
	
	
	
	@Override
	public Object execute() throws Exception {
		
		String target = targetPath.replace("${JBOSS_HOME}", jboss_home);
		String source = sourceName.replace("${application}", application).replace("${JBOSS_VERSION}", serverType);
		new CopyFile()
		   .setContainer(container)
		   .setSourceResource(source)
		   .setTargetLocation(target)
		   .copyFromExternal();

		return null;
	}
	
	
}
