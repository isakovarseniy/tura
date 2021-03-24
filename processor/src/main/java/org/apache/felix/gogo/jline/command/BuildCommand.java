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

import domain.DomainPackage;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import recipe.DeploymentComponent;
import recipe.Recipe;

@Command(name = "build")
public class BuildCommand extends TuraCommand implements Runnable{

	@Option(names = "--recipeId", description = "Recipe identificator", required = true)
	private String recipeId;

	@Option(names = "--infraId", description = "Recipe configuration", required = true)
	private String infraId;

	@Option(names = "--modelFile", description = "Model file location", required = true)
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

	public void run() {
		EmfModel model = null;
		try {
//			if ( !new LicenseValidation().validate()) {
//				return;
//			}
			

			EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);

			model = createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);

			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new RuntimeException("Model is empty");
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
					throw new RuntimeException("Eror during build process");
				}

			}

		} catch (Exception e) {
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
