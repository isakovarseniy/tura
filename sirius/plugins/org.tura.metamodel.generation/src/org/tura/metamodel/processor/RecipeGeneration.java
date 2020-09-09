/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.processor;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import recipe.Component;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Recipe;

public class RecipeGeneration {

	public void generation(Infrastructure infrastructure,Recipe recipe) {

		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelTransformationJob job = new MetamodelTransformationJob("Generation");
		

		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);
		job.setRecipe(recipe);

		job.schedule();

	}
	
	public void generation(Infrastructure infrastructure, Recipe recipe, Ingredient ingredient ) {
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelTransformationJob job = new MetamodelTransformationJob("Generation");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);
		job.setIngredient(ingredient);

		job.schedule();

	}	
	
	public void generation(Infrastructure infrastructure, Recipe recipe, Ingredient ingredient,  Component component ) {
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelTransformationJob job = new MetamodelTransformationJob("Generation");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);
		job.setComponent(component);

		job.schedule();

	}	

	public void generation(Infrastructure infrastructure, Recipe recipe, Ingredient ingredient,  Component component , ModelMapper mapper) {
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelTransformationJob job = new MetamodelTransformationJob("Generation");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);
		job.setMapper(mapper);

		job.schedule();

	}	

	
	
	public void deployment(Infrastructure infrastructure) {
		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		MetamodelDeploymentJob job = new MetamodelDeploymentJob("Deployment");
		job.setEditorPart(editorPart);
		job.setInfrastructure(infrastructure);

		job.schedule();

		
	}	
	

}
