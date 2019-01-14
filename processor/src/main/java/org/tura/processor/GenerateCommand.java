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

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.processor.connection.PlatformURLStreamHandlerFactory;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import domain.DomainPackage;
import recipe.Component;
import recipe.Ingredient;
import recipe.ModelMapper;
import recipe.Recipe;

@Parameters(separators = "=", commandDescription = "Generate source code for recipe")
public class GenerateCommand extends TuraCommand {

	@Parameter(names = "--recipeId", description = "Recipe identificator")
	private String recipeId;

	@Parameter(names = "--componentId", description = "Component identificator")
	private String componentId;

	@Parameter(names = "--ingredientId", description = "Ingredient identificator")
	private String ingredientId;

	@Parameter(names = "--mapperId", description = "Ingredient identificator")
	private String mapperId;

	@Parameter(names = "--infraId", description = "Recipe configuration", required = true)
	private String infraId;

	@Parameter(names = "--modelFile", description = "Model file location", required = true)
	private String modelFile;

	public void execute() {
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
				System.err.println("One of parameters mapperId/componentId/ingredientId  should be defined");
				System.exit(-1);
			}

			URL.setURLStreamHandlerFactory(new PlatformURLStreamHandlerFactory());
			
			EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(), DomainPackage.eINSTANCE);

			EmfModel model = createEmfModelByURI("Model", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);

			Collection<EObject> c = model.getAllOfType("domain::Domain");
			if (c.isEmpty()) {
				System.err.println("Model is empty");
			} else {

				boolean result = false;
				EObject obj = c.iterator().next();
				QueryHelper queryHelper = new QueryHelper();
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin( queryHelper.getConfiguration(obj, infraId),  configuration);

				
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
					result = generateSourcesForModelMapper(model, mapper, ingredient, component, recipe, configuration);
					break;
				case "componentId":
					component = queryHelper.getComponent(obj, componentId);
					ingredient = (Ingredient) component.eContainer();
					recipe = (Recipe) ingredient.eContainer();
					result = generateSourcesForComponent(model, ingredient, component, recipe, configuration);
					break;
				case "ingredientId":
					ingredient = queryHelper.getIngredient(obj, ingredientId);
					recipe = (Recipe) ingredient.eContainer();
					result = generateSourcesForIngredient(model, ingredient, recipe, configuration);
					break;
				case "recipeId":
					recipe = queryHelper.getRecipe(obj, recipeId);
					result = generateSourcesForRecipe(model, recipe, configuration);
					break;
				}
				if (!result) {
					System.exit(-1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	private boolean generateSourcesForRecipe(IModel model, Recipe recipe, HashMap<String, Object> configuration) {
		for (Ingredient ingredient : recipe.getIngredients()) {
			boolean result = generateSourcesForIngredient(model, ingredient, recipe, configuration);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	private boolean generateSourcesForIngredient(IModel model, Ingredient ingredient, Recipe recipe,
			HashMap<String, Object> configuration) {
		if (ingredient.isSkip()) {
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
			HashMap<String, Object> configuration) {
		if (component.isSkip()) {
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
			Component component, Recipe recipe, HashMap<String, Object> configuration) {

		if (mapper.isSkip()) {
			return true;
		}
		System.out.println("Generation action failed. Ingredient -> {" + ingredient.getName() + "} Component -> {"
				+ component.getName() + "} Mapper -> {" + mapper.getName() + "}");		
		
		String templatePath = mapper.getArtifactRef().getTemplate();
		if (templatePath == null) {
			System.err.println("Generation action failed. Ingredient -> {" + ingredient.getName() + "} Component -> {"
					+ component.getName() + "} Mapper -> {" + mapper.getName() + "}");
			System.err.println(" Template Path is null");
		}

		EglTemplate template = null;
		try {

			EglTemplateFactory factory = new EglTemplateFactory();

			ModelRepository modelRepo = factory.getContext().getModelRepository();
			factory.getContext().getNativeTypeDelegates().add(new EolClasspathNativeTypeDelegate());
			factory.getContext().setErrorStream(System.err);
			factory.getContext().setOutputStream(System.out);
			modelRepo.addModel(model);

			HashMap<String, Object> parameters = new HashMap<>();
			parameters.put("recipe", recipe);
			parameters.put("ingredient", ingredient);
			parameters.put("component", component);
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
			System.err.println("<command >  --mapperId="+mapperId+ " --infraId="+infraId+ " --modelFile="+modelFile);
			return false;
		}
	}

}
