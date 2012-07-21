/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipse.wb.elsoft.menucontribution.handlers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class GenarateFormJob implements Runnable {

	protected String infrastructure;
	protected String recipe;
	protected String application;
	protected String functionalDomain;
	protected String domain;

	@Override
	public void run() {
		MessageConsole myConsole = new SaveFormJob()
				.findConsole(SaveFormJob.CONSOLE_NAME);
		MessageConsoleStream out = myConsole.newMessageStream();

		final PrintStream oldOut = System.out;
		final PrintStream olderr = System.err;

		System.setOut(new PrintStream(out));
		System.setErr(new PrintStream(out));

		try {
			Runtime runtime = Runtime.getRuntime();

			System.out
					.println("mvn -f /home/platform/GITRepo/tura/platform/metamodel/artifact-generator/pom.xml exec:java -Dexec.args=\""
							+ domain
							+ " "
							+ functionalDomain
							+ " "
							+ application
							+ " '"
							+ infrastructure
							+ "'"
							+ " '"
							+ recipe + "'" + " UI_CONTAINER UI_CONTAINER\"");

			String[] cmd = new String[] {
					"mvn",
					"-f",
					"/home/platform/GITRepo/tura/platform/metamodel/artifact-generator/pom.xml",
					"exec:java",
					"-Dexec.args=" + domain + " " + functionalDomain + " "
							+ application + " '" + infrastructure + "'" + " '"
							+ recipe + "'" + " UI_CONTAINER UI_CONTAINER\"" };

			Process process = runtime.exec(cmd);

			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.setOut(oldOut);
			System.setErr(olderr);

		}
	}
}
