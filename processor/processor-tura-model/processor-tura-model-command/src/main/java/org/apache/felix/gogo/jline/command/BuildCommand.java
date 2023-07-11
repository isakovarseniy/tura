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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;

import org.apache.felix.gogo.jline.command.api.IBuildCommand;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.model.designer.repository.serialized.recipe.DeploymentComponent;
import org.tura.model.designer.repository.serialized.recipe.Recipe;

public class BuildCommand extends TuraCommand implements IBuildCommand{

	private String recipeId;

	private String infraId;

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

	@SuppressWarnings("unchecked")
	public void run() {
		try {

			createTuraModel();

			Collection<Object> c = (Collection<Object>) model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
			} else {

				QueryHelper queryHelper = new QueryHelper(model);
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin(queryHelper.getConfiguration( infraId), configuration);
				Recipe recipe = queryHelper.getRecipe( recipeId);
				boolean result = depoymentRecipe(recipe);
				if (result) {
					return;
				} else {
					throw new RuntimeException("Eror during build process");
				}

			}

		} catch (Throwable e) {
			e.printStackTrace();
			throw new RuntimeException("Eror during build process",e);
		}finally {
			if (model != null) {
				model.dispose();
			}
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

				if (!component.getSkip() && artifactExecutionString != null) {
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
					if (!component.getSkip()) {
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

	@Override
	public void run(String recipeId, String infraId, Object model) {
		this.recipeId=recipeId;
		this.infraId  =  infraId;
		this.modelFile = (String) model;
		run();
	}

}
