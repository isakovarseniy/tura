/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli.metamodel.emf.command;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.cli.ConfigConstants;
import org.tura.metamodel.commons.GeneratotPreferences;
import org.tura.metamodel.commons.JavaComponentWrapper;
import org.tura.metamodel.commons.JavaScriptComponentWrapper;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.generation.HeadlessLogWrapper;

import cli.metamodel.TuraURLStreamHandlerFactory;
import domain.DomainPackage;
import recipe.Component;
import recipe.Ingredient;
import recipe.JavaComponent;
import recipe.JavaScriptComponent;
import recipe.ModelMapper;
import recipe.Recipe;

public class GenerateCommand extends TuraCommand  {

	private String recipeId;

	private String componentId;

	private String ingredientId;

	private String mapperId;

	private String infraId;

	private String modelFile;

	private boolean build;

	private QueryHelper queryHelper = new QueryHelper();

	
	public GenerateCommand() {
	}
	

	public void run() {
		EmfModel model = null;

		try {
			try{
			  URL.setURLStreamHandlerFactory(new TuraURLStreamHandlerFactory());
			}catch(Error e){
				
			}

			String action = null;

			if (mapperId != null) {
				action = "mapperId";
			}
			if (componentId != null) {
				action = "componentId";
			}

			if (ingredientId != null) {
				action = "ingredientId";
			}
			if (recipeId != null) {
				action = "recipeId";
			}
			if (action == null) {
				throw new IllegalArgumentException(
						"One of parameters mapperId/componentId/ingredientId  should be defined");
			}

			GeneratotPreferences.wrapper = new HeadlessLogWrapper(System.out);
			Properties prop = new Properties();
			ByteArrayInputStream in = null;
			try {
				in = new ByteArrayInputStream(
						Files.readAllBytes(
								Paths.get(ConfigConstants.TURA_WORKING_DIRECTORY + "/generation.properties")));
				prop.load(in);
			} catch (IOException e) {
			}

			String s = (String) prop.get("LOG_TEMPLATES");
			if (s != null) {
				GeneratotPreferences.logTemlates = Boolean.parseBoolean(s);
			} else {
				GeneratotPreferences.logTemlates = false;

			}

			s = (String) prop.get("DEBUGING");
			if (s != null) {
				GeneratotPreferences.debigging = Boolean.parseBoolean(s);
			} else {
				GeneratotPreferences.debigging = false;
			}

			EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);

			model = createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);

			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new IllegalArgumentException("Model is empty");
			} else {

				boolean result = false;
				EObject obj = c.iterator().next();

				Ingredient ingredient = null;
				Recipe recipe = null;
				Component component = null;
				ModelMapper mapper = null;

				switch (action) {
					case "mapperId":
						mapper = queryHelper.getModelMapper(obj, mapperId);
						component = (Component) mapper.eContainer();
						ingredient = (Ingredient) component.eContainer();
						recipe = (Recipe) ingredient.eContainer();
						result = generateSourcesForModelMapper(model, mapper, ingredient, component, recipe);
						break;
					case "componentId":
						component = queryHelper.getComponent(obj, componentId);
						ingredient = (Ingredient) component.eContainer();
						recipe = (Recipe) ingredient.eContainer();
						result = generateSourcesForComponent(model, ingredient, component, recipe);
						break;
					case "ingredientId":
						ingredient = queryHelper.getIngredient(obj, ingredientId);
						recipe = (Recipe) ingredient.eContainer();
						result = generateSourcesForIngredient(model, ingredient, recipe);
						break;
					case "recipeId":
						recipe = queryHelper.getRecipe(obj, recipeId);
						result = generateSourcesForRecipe(model, recipe);
						break;
				}
				if (!result) {
					throw new IllegalArgumentException("Generation error");
				}
				System.out.println("Generation  completed");
				if (build) {
					BuildCommand buildCmd = new BuildCommand();
					result = buildCmd.depoymentRecipe(recipe);
					if (!result) {
						throw new IllegalArgumentException("Building error");
					}
				}
			}

		} catch (Throwable e) {
			throw new RuntimeException("Eror during build process", e);
		} finally {
			if (model != null) {
				model.dispose();
			}
		}
	}

	private boolean generateSourcesForRecipe(IModel model, Recipe recipe) {
		for (Ingredient ingredient : recipe.getIngredients()) {
			boolean result = generateSourcesForIngredient(model, ingredient, recipe);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForIngredient(IModel model, Ingredient ingredient, Recipe recipe) {
		if (ingredient.isSkip()) {
			return true;
		}

		for (Component component : ingredient.getComponents()) {
			boolean result = generateSourcesForComponent(model, ingredient, component, recipe);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForComponent(IModel model, Ingredient ingredient, Component component,
			Recipe recipe) {
		if (component.isSkip()) {
			return true;
		}

		for (ModelMapper mapper : component.getMappers()) {

			boolean result = generateSourcesForModelMapper(model, mapper, ingredient, component, recipe);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForModelMapper(IModel model, ModelMapper mapper, Ingredient ingredient,
			Component component, Recipe recipe) {

		if (mapper.isSkip()) {
			return true;
		}
		System.out.println("Generation:  Ingredient -> {" + ingredient.getName() + "} Component -> {"
				+ component.getName() + "} Mapper -> {" + mapper.getName() + "}");

		String templatePath = mapper.getArtifactRef().getTemplate();
		if (templatePath == null) {
			System.err.println("Generation action failed. Ingredient -> {" + ingredient.getName() + "} Component -> {"
					+ component.getName() + "} Mapper -> {" + mapper.getName() + "}");
			System.err.println(" Template Path is null");
		}

		EglTemplate template = null;
		try {

			HashMap<String, Object> configuration = new HashMap<>();
			getConfiguratioin(queryHelper.getBranchedConfiguration(mapper, infraId, mapper.getConfigBranch()),
					configuration, mapper.getConfigBranch());

			EglTemplateFactory factory = new EglTemplateFactory();

			ModelRepository modelRepo = factory.getContext().getModelRepository();
			factory.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
			factory.getContext().setErrorStream(System.err);
			factory.getContext().setOutputStream(System.out);
			modelRepo.addModel(model);

			Component componentWrap = null;
			if (component instanceof JavaComponent) {
				componentWrap = new JavaComponentWrapper((JavaComponent) component);
			}
			if (component instanceof JavaScriptComponent) {
				componentWrap = new JavaScriptComponentWrapper((JavaScriptComponent) component);
			}

			HashMap<String, Object> parameters = new HashMap<>();
			parameters.put("recipe", recipe);
			parameters.put("ingredient", ingredient);
			parameters.put("component", componentWrap);
			parameters.put("model_mapper", mapper);
			parameters.put("configuration", configuration);

			Util.populateTechnologies(parameters, mapper);
			template = Util.loadTemplate(templatePath, parameters, factory);

			if (template != null && template.getParseProblems().isEmpty()) {
				template.process();
				return true;
			} else {
				System.err.println("Generation action failed. Template parsing problem :" + templatePath);
				for (ParseProblem problem : template.getParseProblems()) {
					System.err.println(problem.toString());
				}
				return false;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("Generation action failed. Ingredient -> {" + ingredient.getName() + "} Component -> {"
					+ component.getName() + "} Mapper -> {" + mapper.getName() + "}");
			System.err.println("<command >  --mapperId=" + mapper.getUid() + " --infraId=" + infraId + " --modelFile="
					+ modelFile);
			return false;
		}
	}

	public void run(String recipeId, String componentId, String ingredientId, String mapperId, String infraId,
			Object model, boolean build) {
		this.recipeId = recipeId;
		this.componentId = componentId;
		this.ingredientId = ingredientId;
		this.mapperId = mapperId;
		this.infraId = infraId;
		this.modelFile = (String) model;
		this.build = build;
		run();
	}

}
