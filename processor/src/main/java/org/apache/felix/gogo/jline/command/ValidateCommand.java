/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.metamodel.commons.GeneratotPreferences;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.generation.HeadlessLogWrapper;

import artifact.ModelQuery;
import domain.DomainPackage;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import recipe.Component;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Recipe;

@Command(name = "validate")
public class ValidateCommand extends TuraCommand implements Runnable {
	int errors = 0;
	int warnings = 0;
	int lines = 0;

	private String MAIN_OBJECT_VALIDATION_RULES = "tura:/generation-templates/validation/mainObjectValidationRules.evl";

	private String MAPPINGS_TYPE_VALIDATION_RULES = "tura:/generation-templates/validation/rules/runtimeTypedefinitionValidationRules.evl";

	private String RECIPE_VALIDATION_RULES = "tura:/generation-templates/validation/mainRecipeValidationRules.evl";
	
	private String ARTIFACT_VALIDATION_RULES = "tura:/generation-templates/validation/mainArtifactValidationRules.evl";
	
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
		errors = 0;
		warnings = 0;
		lines = 0;

		EmfModel model = null;

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

			EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);

			model = createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);

			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				throw new IllegalArgumentException("Model is empty");
			} else {

				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin(queryHelper.getConfiguration(obj, infraId), configuration);

				Ingredient ingredient = null;
				Recipe recipe = null;
				Component component = null;
				ModelMapper mapper = null;
				Map<String, EObject> objectForValidation = new HashMap<>();

				switch (action) {
				case "recipeOnly":
					recipe = queryHelper.getRecipe(obj, recipeId);
					validateRecipe(model, recipe, configuration, objectForValidation);
					break;

				case "artifactsOnly":
					recipe = queryHelper.getRecipe(obj, recipeId);
					validateArtifacts(model, recipe, configuration, objectForValidation);
					break;
				case "mapperId":
					mapper = queryHelper.getModelMapper(obj, mapperId);
					component = (Component) mapper.eContainer();
					ingredient = (Ingredient) component.eContainer();
					recipe = (Recipe) ingredient.eContainer();
					validateObjectsForModelMapper(model, mapper, ingredient, component, recipe, configuration,
							objectForValidation);
					break;
				case "componentId":
					component = queryHelper.getComponent(obj, componentId);
					ingredient = (Ingredient) component.eContainer();
					recipe = (Recipe) ingredient.eContainer();
					validateObjectsForComponent(model, ingredient, component, recipe, configuration,
							objectForValidation);
					break;
				case "ingredientId":
					ingredient = queryHelper.getIngredient(obj, ingredientId);
					recipe = (Recipe) ingredient.eContainer();
					validateObjectsForIngredient(model, ingredient, recipe, configuration, objectForValidation);
					break;
				case "recipeId":
					recipe = queryHelper.getRecipe(obj, recipeId);
					validateObjectsForRecipe(model, recipe, configuration, objectForValidation);
					break;
				}

				if (objectForValidation.size() != 0) {
					SelectiveEvlModule module = new SelectiveEvlModule();
					List<EObject> roots = new ArrayList<>();
					roots.addAll(objectForValidation.values());
					module.setRootEObjects(roots);
					List<UnsatisfiedConstraint> constrains = validate(MAIN_OBJECT_VALIDATION_RULES, model, module);
					if (constrains != null && constrains.size() != 0) {
						printErrors(constrains, null);
					}

					System.out.println("Errors : " + errors + "              Warnings:" + warnings);
					System.out.println("Validation  completed");
				}
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (model != null) {
				model.dispose();
			}
		}
	}


	private void printErrors(List<UnsatisfiedConstraint> constrains, String header) {

		if (header != null) {
			System.out.println(header);
		}
		for (UnsatisfiedConstraint unsatisfiedConstraint : constrains) {
			Stack<String> st = new Stack<>();
			pathBuilder((EObject) unsatisfiedConstraint.getInstance(), st);
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

	private List<UnsatisfiedConstraint> validate(String rulesPath, EmfModel model, IEolExecutableModule module)
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

	private void pathBuilder(EObject obj, Stack<String> path) {

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
		if (obj.eContainer() != null) {
			pathBuilder(obj.eContainer(), path);
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

	private void validateObjectsForRecipe(IModel model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, EObject> objectForValidation) throws Exception {
		for (Ingredient ingredient : recipe.getIngredients()) {
			validateObjectsForIngredient(model, ingredient, recipe, configuration, objectForValidation);
		}
	}

	private void validateObjectsForIngredient(IModel model, Ingredient ingredient, Recipe recipe,
			HashMap<String, Object> configuration, Map<String, EObject> objectForValidation) throws Exception {
		if (ingredient.isSkip()) {
			return;
		}

		for (Component component : ingredient.getComponents()) {
			validateObjectsForComponent(model, ingredient, component, recipe, configuration, objectForValidation);
		}
	}

	private void validateObjectsForComponent(IModel model, Ingredient ingredient, Component component, Recipe recipe,
			HashMap<String, Object> configuration, Map<String, EObject> objectForValidation) throws Exception {
		if (component.isSkip()) {
			return;
		}

		for (ModelMapper mapper : component.getMappers()) {
			validateObjectsForModelMapper(model, mapper, ingredient, component, recipe, configuration,
					objectForValidation);
		}
	}

	@SuppressWarnings("unchecked")
	private void validateObjectsForModelMapper(IModel model, ModelMapper mapper, Ingredient ingredient,
			Component component, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, EObject> objectForValidation) throws Exception {

		if (mapper.isSkip()) {
			return;
		}
		String header = "Validation:  Ingredient -> {" + ingredient.getName() + "} Component -> {" + component.getName()
				+ "} Mapper -> {" + mapper.getName() + "}";

		List<ModelQuery> modelQueryList = mapper.getArtifactRef().getModelQuery();

		List<EObject> array = new ArrayList<>();
		for (ModelQuery modelQuery : modelQueryList) {
			String queryName = modelQuery.getName();
			List<EObject> lst = (List<EObject>) Util.runQuery(mapper, queryName, mapper);
			if (lst != null) {
				array.addAll(lst);
				for (EObject obj : lst) {
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
		List<UnsatisfiedConstraint> constrains = validate(MAPPINGS_TYPE_VALIDATION_RULES, (EmfModel) model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, header);
		}

	}

	private void validateRecipe(EmfModel model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, EObject> objectForValidation)  throws Exception{
		
		List<EObject> array = new ArrayList<>();
		array.add(recipe);

		SelectiveEvlModule module = new SelectiveEvlModule();
		module.setRootEObjects(array);
		List<UnsatisfiedConstraint> constrains = validate(RECIPE_VALIDATION_RULES, (EmfModel) model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, null);
		}
	}
	
	private void validateArtifacts(EmfModel model, Recipe recipe, HashMap<String, Object> configuration,
			Map<String, EObject> objectForValidation) throws Exception {
		
		EvlModule module = new EvlModule();
		List<UnsatisfiedConstraint> constrains = validate(ARTIFACT_VALIDATION_RULES, (EmfModel) model, module);
		if (constrains != null && constrains.size() != 0) {
			printErrors(constrains, null);
		}
		
	}
	
}
