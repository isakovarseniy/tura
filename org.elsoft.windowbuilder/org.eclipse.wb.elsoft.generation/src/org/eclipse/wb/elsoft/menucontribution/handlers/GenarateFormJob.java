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

import java.io.PrintStream;
import java.util.HashMap;

import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.wb.elsoft.propertyeditor.Activator;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.suite.ApplicationHandler;
import org.elsoft.platform.metamodel.suite.RecipeHandler;

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
			
			ApplicationHandler ah = Activator.rf.getRoot().clean()
					.searchString("domainName", domain).seek()
					.getFunctionalDomain().clean()
					.searchString("functionalDomainName", functionalDomain)
					.seek().getApplicationHandler().clean()
					.searchString("applicationName", application).seek();
			
			HashMap<String, Object> infrastructureContext = ah
					.getInfrastructureLayer().clean()
					.searchString("zoneName", infrastructure).seek()
					.loadProperties(Activator.rf);

			RecipeHandler rh = ah.getRecipeHandler()
					.searchString("recipeName", recipe).seek();

			rh.buildRecipe(Activator.rf, infrastructureContext,
					MetamodelPlatformLevel.UI_CONTAINER,
					MetamodelPlatformLevel.UI_CONTAINER, domain,
					functionalDomain, application);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.setOut(oldOut);
			System.setErr(olderr);

		}
	}
}
