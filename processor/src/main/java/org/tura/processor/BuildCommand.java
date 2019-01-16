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
package org.tura.processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import domain.DomainPackage;
import recipe.DeploymentComponent;
import recipe.Recipe;

@Parameters(separators = "=", commandDescription = "Build recipe")
public class BuildCommand extends TuraCommand {

	@Parameter(names = "--recipeId", description = "Recipe identificator", required = true)
	private String recipeId;

	@Parameter(names = "--infraId", description = "Recipe configuration", required = true)
	private String infraId;

	@Parameter(names = "--modelFile", description = "Model file location", required = true)
	private String modelFile;

	public String getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}

	public String getInfraId() {
		return infraId;
	}

	public void setInfraId(String infraId) {
		this.infraId = infraId;
	}

	public String getModelFile() {
		return modelFile;
	}

	public void setModelFile(String modelFile) {
		this.modelFile = modelFile;
	}

	public void execute() {
		try {

			EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);

			EmfModel model = createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);

			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				System.err.println("Model is empty");
			} else {

				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin(queryHelper.getConfiguration(obj, infraId), configuration);
				Recipe recipe = queryHelper.getRecipe(obj, recipeId);
				boolean result = depoymentRecipe(recipe);
				if (result) {
					return;
				} else {
					System.exit(-1);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

	}

	public boolean depoymentRecipe(Recipe recipe) {

		if (recipe.getDeplymentStep() == null || recipe.getDeplymentStep().size() == 0) {
			System.err.println("Deployment Sequence is not defined properly");
			return false;
		}

		if (recipe.getStartSeq() == null) {
			System.err.println("Start step  is not defined");
			return false;
		}

		DeploymentComponent component = recipe.getStartSeq().getFirstStep();
		try {
			while (component != null) {
				String artifactExecutionString = null;
				try {
					artifactExecutionString = new Util().getArtifactExecution(component.getMapper());
				} catch (IOException e) {
				}

				if (!component.isSkip() && artifactExecutionString != null) {
					System.out.println("Execution: " + artifactExecutionString);
					Process proc = Runtime.getRuntime().exec(artifactExecutionString);

					StreamPumper inputPumper = new StreamPumper(proc.getInputStream());
					StreamPumper errorPumper = new StreamPumper(proc.getErrorStream());

					// starts pumping away the generated output/error
					inputPumper.start();
					errorPumper.start();

					// Wait for everything to finish
					proc.waitFor();
					inputPumper.join();
					errorPumper.join();
					proc.destroy();

					System.out.println("Execution result : " + proc.exitValue());
					if (proc.exitValue() != 0) {
						System.err.println("Exception during deployment name=" + component.getMapper().getName()
								+ " uid =" + component.getMapper().getUid());
						return false;
					}

				} else {
					if (!component.isSkip()) {
						System.err.println(component.getMapper().getName() + " has empty execution string");
					}
				}
				component = component.getDeploymentComponentLink();

			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

		return true;
	}

	class StreamPumper extends Thread {
		private BufferedReader din;
		private boolean endOfStream = false;
		private static final int SLEEP_TIME = 5;

		public StreamPumper(InputStream is) {
			this.din = new BufferedReader(new InputStreamReader(is));
		}

		private void outputLog(String line) {
			System.out.println(line);
		}

		public void pumpStream() throws IOException {
			if (!endOfStream) {
				String line = din.readLine();

				if (line != null) {
					outputLog(line);
				} else {
					endOfStream = true;
				}
			}
		}

		public void run() {
			try {
				try {
					while (!endOfStream) {
						pumpStream();
						sleep(SLEEP_TIME);
					}
				} catch (InterruptedException ie) {
					// ignore
				}
				din.close();
			} catch (IOException ioe) {
				// ignore
			}
		}
	}

}
