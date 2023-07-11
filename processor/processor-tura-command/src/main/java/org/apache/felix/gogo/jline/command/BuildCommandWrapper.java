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

import java.util.Iterator;
import java.util.ServiceLoader;

import org.apache.felix.gogo.jline.command.api.IBuildCommand;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "build")
public class BuildCommandWrapper implements Runnable {

	private ServiceLoader<IBuildCommand> loader;

	private IBuildCommand buildCommand;

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
		this.getBuildCommand().run(recipeId, infraId, modelFile);
	}

	public IBuildCommand getBuildCommand() {
		if (buildCommand == null) {
			loader = ServiceLoader.load(IBuildCommand.class);
			Iterator<IBuildCommand> iterator = loader.iterator();
			if (iterator.hasNext()) {
				buildCommand = iterator.next();
			}
		}
		return buildCommand;
	}
}
