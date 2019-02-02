/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * https://github.com/isakovarseniy/tura
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.gogo.jline.command;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.tura.configuration.dsl.commons.ConfigConstants;

import picocli.CommandLine.Option;

public class MavenBuildProject implements Runnable {

	@Option(names = "--pom.xml", description = "pom.xml file location", required = true)
	private String pomxml;

	@Option(names = "--P", description = "profile")
	private List<String> profile;

	@Option(names = "--D", description = "options")
	private List<String> options;

	@Override
	public void run() {
		InvocationRequest request = new DefaultInvocationRequest();
		request.setGoals(Arrays.asList(new String[] { "clean", "install" }));
		request.setPomFile(new File(pomxml));
		request.setProfiles(profile);

		String mavenOpts = "";
		if (options != null) {
			for (String opt : options) {
				mavenOpts = " -D" + opt + " ";
			}
		}
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
