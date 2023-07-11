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

import org.apache.felix.gogo.jline.command.api.IValidateCommand;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "validate")
public class ValidateCommandWrapper implements Runnable {

	private ServiceLoader<IValidateCommand> loader;

	private IValidateCommand validateCommand;

	
	@Option(names = "--recipeId", description = "Recipe identificator")
	private String recipeId;

	@Option(names = "--componentId", description = "Component identificator")
	private String componentId;

	@Option(names = "--ingredientId", description = "Ingredient identificator")
	private String ingredientId;

	@Option(names = "--mapperId", description = "Ingredient identificator")
	private String mapperId;

	@Option(names = "--recipeOnly", description = "Recipe only validation")
	private boolean recipeOnly;

	@Option(names = "--artifactsOnly", description = "Artifacts only validation")
	private boolean artifactsOnly;
	
	@Option(names = "--infraId", description = "Recipe configuration", required = true)
	private String infraId;

	@Option(names = "--modelFile", description = "Model file location", required = true)
	private String modelFile;

	public void run() {
		this.getValidateCommand().run(recipeId, componentId, ingredientId, mapperId, recipeOnly, artifactsOnly, infraId, modelFile);
	}
	
	public IValidateCommand getValidateCommand() {
		if (validateCommand == null) {
			loader = ServiceLoader.load(IValidateCommand.class);
			Iterator<IValidateCommand> iterator = loader.iterator();
			if (iterator.hasNext()) {
				validateCommand = iterator.next();
			}
		}
		return validateCommand;
	}
	
	
}
