/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import java.io.File;
import java.util.Arrays;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Option;

public class MavenSetVersion implements Runnable{

	@Option(names = "--pom.xml", description = "pom.xml file location", required = true)
	private String pomxml;

	@Option(names = "--version", required = true)
	private String version;
	

	@Option(names = "--tycho")
	private boolean tycho;

	
	@Override
	public void run() {
		InvocationRequest request = new DefaultInvocationRequest();
		
		if (tycho ) {
			request.setGoals(Arrays.asList(new String[] { "tycho-versions:set-version" }));
		}else {
			request.setGoals(Arrays.asList(new String[] { "versions:set" }));
		}
		request.setPomFile(new File(pomxml));

		String mavenOpts ="-DnewVersion=" + version+" -DgenerateBackupPoms=false";
		request.setMavenOpts(mavenOpts);

		Invoker invoker = new DefaultInvoker();
		invoker.setMavenHome(new File(ConfigConstants.MAVEN_HOME));
		InvocationResult result;
		try {
			result = invoker.execute(request);
		} catch (MavenInvocationException e) {
			throw new RuntimeException(e);
		}

		if (result.getExitCode() != 0) {
			throw new IllegalStateException("Build failed.");
		}

	}
	
	
}
