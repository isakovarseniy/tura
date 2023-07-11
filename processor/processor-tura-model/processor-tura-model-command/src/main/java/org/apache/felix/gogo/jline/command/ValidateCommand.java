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
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

import org.apache.felix.gogo.jline.command.api.ConfigConstants;
import org.apache.felix.gogo.jline.command.api.IValidateCommand;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.tura.metamodel.commons.GeneratotPreferences;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.generation.HeadlessLogWrapper;
import org.tura.model.designer.repository.serialized.artifact.ModelQuery;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.Recipe;

public class ValidateCommand extends TuraCommand implements IValidateCommand {
	int errors = 0;
	int warnings = 0;
	int lines = 0;

	private String MAIN_OBJECT_VALIDATION_RULES = "tura:/generation-templates/validation/mainObjectValidationRules.evl";

	private String MAPPINGS_TYPE_VALIDATION_RULES = "tura:/generation-templates/validation/rules/runtimeTypedefinitionValidationRules.evl";

	private String RECIPE_VALIDATION_RULES = "tura:/generation-templates/validation/mainRecipeValidationRules.evl";
	
	private String ARTIFACT_VALIDATION_RULES = "tura:/generation-templates/validation/mainArtifactValidationRules.evl";
	
	private String recipeId;

	private String componentId;

	private String ingredientId;

	private String mapperId;

	private boolean recipeOnly;

	private boolean artifactsOnly;
	
	private String infraId;

	@SuppressWarnings("unused")
	private String modelFile;

	@SuppressWarnings("unchecked")
	public void run() {
		errors = 0;
		warnings = 0;
		lines = 0;

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
			if (recipeOnly) {
				action = "recipeOnly";
			}
			
			if (artifactsOnly) {
				action = "artifactsOnly";
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

				QueryHelper queryHelper = new QueryHelper(model);
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin(queryHelper.getConfiguration( infraId), configuration);

				Ingredient ingredient = null;
				Recipe recipe = null;
				Component component = null;
				ModelMapper mapper = null;
				Map<String, Object> objectForValidation = new HashMap<>();

				switch (action) {
				case "recipeOnly":
					recipe = queryHelper.getRecipe( recipeId);
					validateRecipe(model, recipe, configuration, objectForValidation);
					break;

				case "artifactsOnly":
					recipe = queryHelper.getRecipe( recipeId);
					validateArtifacts(model, recipe, configuration, objectForValidation);
					break;
				case "mapperId":
					mapper = queryHelper.getModelMapper( mapperId);
					component = (Component) Util.getContainer(mapper);
					ingredient = (Ingredient) Util.getContainer(component);
					recipe = (Recipe) Util.getContainer(ingredient);
					validateObjectsForModelMapper(model, mapper, ingredient, component, recipe, configuration,
							objectForValidation);
					break;
				case "componentId":
					component = queryHelper.getComponent( componentId);
					ingredient = (Ingredient) Util.getContainer(component);
					recipe = (Recipe) Util.getContainer(ingredient);
					validateObjectsForComponent(model, ingredient, component, recipe, configuration,
							objectForValidation);
					break;
				case "ingredientId":
					ingredient = queryHelper.getIngredient( ingredientId);
					recipe = (Recipe)Util.getContainer( ingredient );
					validateObjectsForIngredient(model, ingredient, recipe, configuration, objectForValidation);
					break;
				case "recipeId":
					recipe = queryHelper.getRecipe( recipeId);
					validateObjectsForRecipe(model, recipe, configuration, objectForValidation);
					break;
				}

				if (objectForValidation.size() != 0) {
					SelectiveEvlModule module = new SelectiveEvlModule();
					List<Object> roots = new ArrayList<>();
					roots.addAll(objectForValidation.values());
					module.setRootEObjects(roots);
					Collection<UnsatisfiedConstraint> constrains = validate(MAIN_OBJECT_VALIDATION_RULES, model, module);
					if (constrains != null && constrains.size() != 0) {
						printErrors(constrains, null);
					}

					System.out.println("Errors : " + errors + "              Warnings:" + warnings);
					System.out.println("Validation  completed");
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


	private void printErrors(Collection<UnsatisfiedConstraint> constrains, String header) {

		if (header != null) {
			System.out.println(header);
		}
		for (UnsatisfiedConstraint unsatisfiedConstraint : constrains) {
			Stack<String> st = new Stack<>();
			pathBuilder((Object) unsatisfiedConstraint.getInstance(), st);
			System.out.println(buildPath(st));

			if (unsatisfiedConstraint.getConstraint().isCritique()) {

				if (!unsatisfiedConstraint.getConstraint().isInfo()) {
					warnings++;
					System.out.println("********** WARNING " + lines + " " + unsatisfiedConstraint.getMessage());
				}
			} else {
				errors++;
				System.out.println("********** ERROR " + lines + " " + unsatisfiedConstraint.getMessage());
			}

			lines++;
		}

	}

	private Collection<UnsatisfiedConstraint> validate(String rulesPath, Model model, EvlModule module)
			throws Exception {

		URL url = new URL(rulesPath);
		module.parse(url.toURI());

		if (module.getParseProblems().size() > 0) {
			for (ParseProblem problem : module.getParseProblems()) {
				System.out.println(problem.toString());
			}
			return null;
		}

		ModelRepository modelRepo = module.getContext().getModelRepository();
		modelRepo.addModel(model);
		module.execute();

		IEvlModule evlModule = (IEvlModule) module;

		return evlModule.getContext().getUnsatisfiedConstraints();
	}

	private void pathBuilder(Object obj, Stack<String> path) {

		String name = null;
		try {
			name = (String) obj.getClass().getMethod("getName").invoke(obj);
		} catch (Exception e) {
			try {
				name = (String) obj.getClass().getMethod("getUid").invoke(obj);
			} catch (Exception e1) {
			}
		}
		if (name == null) {
			name = obj.getClass().getSimpleName();
		}
		path.push(name);
		Object container = Util.getContainer(obj);
		if (container != null) {
			pathBuilder(container, path);
		}
	}

	private String buildPath(Stack<String> path) {
		String p = "";
		while (!path.isEmpty()) {
			String name = path.pop();
			p = p + "/" + name;
		}
		return p;
	}

	private void validateObjectsForRecipe(Model model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, Object> objectForValidation) throws Exception {
		for (Ingredient ingredient : recipe.getIngredients()) {
			validateObjectsForIngredient(model, ingredient, recipe, configuration, objectForValidation);
		}
	}

	private void validateObjectsForIngredient(Model model, Ingredient ingredient, Recipe recipe,
			HashMap<String, Object> configuration, Map<String, Object> objectForValidation) throws Exception {
		if (ingredient.getSkip()) {
			return;
		}

		for (Component component : ingredient.getComponents()) {
			validateObjectsForComponent(model, ingredient, component, recipe, configuration, objectForValidation);
		}
	}

	private void validateObjectsForComponent(Model model, Ingredient ingredient, Component component, Recipe recipe,
			HashMap<String, Object> configuration, Map<String, Object> objectForValidation) throws Exception {
		if (component.getSkip()) {
			return;
		}

		for (ModelMapper mapper : component.getMappers()) {
			validateObjectsForModelMapper(model, mapper, ingredient, component, recipe, configuration,
					objectForValidation);
		}
	}

	@SuppressWarnings("unchecked")
	private void validateObjectsForModelMapper(Model model, ModelMapper mapper, Ingredient ingredient,
			Component component, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, Object> objectForValidation) throws Exception {

		if (mapper.getSkip()) {
			return;
		}
		String header = "Validation:  Ingredient -> {" + ingredient.getName() + "} Component -> {" + component.getName()
				+ "} Mapper -> {" + mapper.getName() + "}";

		List<ModelQuery> modelQueryList = mapper.getArtifactRef().getModelQuery();

		List<Object> array = new ArrayList<>();
		for (ModelQuery modelQuery : modelQueryList) {
			String queryName = modelQuery.getName();
			List<Object> lst = (List<Object>) Util.runQuery(mapper, queryName, mapper);
			if (lst != null) {
				array.addAll(lst);
				for (Object obj : lst) {
					String uuid = (String) obj.getClass().getMethod("getUid").invoke(obj);
					objectForValidation.put(uuid, obj);
				}
			}
		}
		SelectiveEvlModule module = new SelectiveEvlModule();
		module.setRootEObjects(array);
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("component", component));
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("ingredient", ingredient));
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("recipe", recipe));
		Collection<UnsatisfiedConstraint> constrains = validate(MAPPINGS_TYPE_VALIDATION_RULES, model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, header);
		}

	}

	private void validateRecipe(Model model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, Object> objectForValidation)  throws Exception{
		
		List<Object> array = new ArrayList<>();
		array.add(recipe);

		SelectiveEvlModule module = new SelectiveEvlModule();
		module.setRootEObjects(array);
		Collection<UnsatisfiedConstraint> constrains = validate(RECIPE_VALIDATION_RULES,  model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, null);
		}
	}
	
	private void validateArtifacts(Model model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, Object> objectForValidation) throws Exception {
		
		EvlModule module = new EvlModule();
		Collection<UnsatisfiedConstraint> constrains = validate(ARTIFACT_VALIDATION_RULES,  model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, null);
		}
		
	}


	@Override
	public void run(String recipeId, String componentId, String ingredientId, String mapperId, boolean recipeOnly,
			boolean artifactsOnly, String infraId, Object model) {
		this.recipeId=recipeId;
		this.componentId = componentId;
		this.ingredientId = ingredientId;
		this.mapperId = mapperId;
		this.recipeOnly = recipeOnly;
		this.artifactsOnly = artifactsOnly;
		this.infraId =  infraId;
		this.modelFile = (String) model;
		run();
	}
	
}
