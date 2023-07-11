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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

import org.apache.felix.gogo.jline.command.api.ConfigConstants;
import org.apache.felix.gogo.jline.command.api.IGenerateCommand;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.epsilon.model.TuraModel;
import org.tura.metamodel.commons.GeneratotPreferences;
import org.tura.metamodel.commons.JavaComponentWrapper;
import org.tura.metamodel.commons.JavaScriptComponentWrapper;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.TuraExtendedProperties;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.generation.HeadlessLogWrapper;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.IngredientProxy;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaComponentProxy;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponentProxy;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.ModelMapperProxy;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.RecipeProxy;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class GenerateCommand extends TuraCommand implements IGenerateCommand {

	private String recipeId;

	private String componentId;

	private String ingredientId;

	private String mapperId;

	private String infraId;

	private String modelFile;

	private boolean build;

	@SuppressWarnings("unchecked")
	public void run() {

//		if (!new LicenseValidation().validate()) {
//			return;
//		}

		try {
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

			GeneratotPreferences.wrapper = new HeadlessLogWrapper();
			Properties prop = new Properties();
			ByteArrayInputStream in = null;
			try {
				in = new ByteArrayInputStream(Files
						.readAllBytes(Paths.get(ConfigConstants.TURA_WORKING_DIRECTORY + "/generation.properties")));
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

			createTuraModel();

			Collection<Object> c = (Collection<Object>) model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new IllegalArgumentException("Model is empty");
			} else {

				boolean result = false;
				QueryHelper queryHelper = new QueryHelper(model);
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin(queryHelper.getConfiguration(infraId), configuration);

				Ingredient ingredient = null;
				Recipe recipe = null;
				Component component = null;
				ModelMapper mapper = null;

				switch (action) {
				case "mapperId":
					mapper = queryHelper.getModelMapper(mapperId);
					component = (Component) Util.getContainer(mapper);
					ingredient = (Ingredient) Util.getContainer(component);
					recipe = (Recipe) Util.getContainer(ingredient);
					result = generateSourcesForModelMapper(model, mapper, ingredient, component, recipe, configuration);
					break;
				case "componentId":
					component = queryHelper.getComponent(componentId);
					ingredient = (Ingredient) Util.getContainer(component);
					recipe = (Recipe) Util.getContainer(ingredient);
					result = generateSourcesForComponent(model, ingredient, component, recipe, configuration);
					break;
				case "ingredientId":
					ingredient = queryHelper.getIngredient(ingredientId);
					recipe = (Recipe) Util.getContainer(ingredient);
					result = generateSourcesForIngredient(model, ingredient, recipe, configuration);
					break;
				case "recipeId":
					recipe = queryHelper.getRecipe(recipeId);
					result = generateSourcesForRecipe(model, recipe, configuration);
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
			throw new RuntimeException(e);
		} finally {
			if (model != null) {
				model.dispose();
			}
		}
	}

	private boolean generateSourcesForRecipe(IModel model, Recipe recipe, HashMap<String, Object> configuration)
			throws Exception {
		for (Ingredient ingredient : recipe.getIngredients()) {
			boolean result = generateSourcesForIngredient(model, ingredient, recipe, configuration);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForIngredient(IModel model, Ingredient ingredient, Recipe recipe,
			HashMap<String, Object> configuration) throws Exception {
		if (ingredient.getSkip()) {
			return true;
		}

		for (Component component : ingredient.getComponents()) {
			boolean result = generateSourcesForComponent(model, ingredient, component, recipe, configuration);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForComponent(IModel model, Ingredient ingredient, Component component, Recipe recipe,
			HashMap<String, Object> configuration) throws Exception {
		if (component.getSkip()) {
			return true;
		}

		for (ModelMapper mapper : component.getMappers()) {
			boolean result = generateSourcesForModelMapper(model, mapper, ingredient, component, recipe, configuration);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForModelMapper(IModel model, ModelMapper mapper, Ingredient ingredient,
			Component component, Recipe recipe, HashMap<String, Object> configuration) throws Exception {

		if (mapper.getSkip()) {
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
		ProxyCommadStackProvider commadStackProvider =   ((TuraModel)model).getRepository().getStackProvider();
		
		try {
			EglTemplateFactory factory = new EglTemplateFactory();

			ModelRepository modelRepo = factory.getContext().getModelRepository();
			factory.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
			factory.getContext().setErrorStream(System.err);
			factory.getContext().setOutputStream(System.out);
			factory.getContext().setExtendedProperties(new TuraExtendedProperties());
			modelRepo.addModel(model);

			Component componentWrap = null;
			if (component instanceof JavaComponent) {
				JavaComponentProxy jc = new JavaComponentProxy((JavaComponentProxy) component);
				componentWrap = new JavaComponentWrapper(jc);
			}
			if (component instanceof JavaScriptComponent) {
				JavaScriptComponentProxy jc = new JavaScriptComponentProxy((JavaScriptComponentProxy) component);
				componentWrap = new JavaScriptComponentWrapper(jc);
			}

			HashMap<String, Object> parameters = new HashMap<>();
			RecipeProxy rp = new RecipeProxy((RecipeProxy) recipe);
			IngredientProxy in = new IngredientProxy((IngredientProxy) ingredient);
			ModelMapperProxy mp = new ModelMapperProxy((ModelMapperProxy) mapper);

			parameters.put("recipe", rp);
			parameters.put("ingredient", in);
			parameters.put("component", componentWrap);
			parameters.put("model_mapper", mp);
			parameters.put("configuration", configuration);

			Util.populateTechnologies(parameters, mp);
			template = Util.loadTemplate(templatePath, parameters, factory);

			commadStackProvider.get().savePoint();

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
		}finally{
			commadStackProvider.get().rallbackSavePoint();
		}
	}

	@Override
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
