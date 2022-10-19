/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.convert;

import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.epl.EplModule;
import org.junit.Test;
import org.tura.convert.epsilon.EpsilonResourcesLoader;
import org.tura.convert.model.SrcModelLoader;

import artifact.Classifier;
import domain.DomainPackage;
import mapper.Mappers;
import mapper.MappingLayer;
import recipe.Component;
import recipe.Ingredient;
import recipe.JavaComponent;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.Query;
import recipe.QueryVariable;
import recipe.Recipe;

public class CopyPackageTest {

	@Test
	public void queryTest() {
		try {

			@SuppressWarnings("unused")
			Object recipe = (EObject) runQuery("query1.eol", null, false);
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void queryRecipe() {
		try {

			Recipe oldRecipe = (Recipe) runQuery("queryRecipe.eol",null,false);
			Recipe recipe = (Recipe) new org.eclipse.emf.ecore.util.EcoreUtil.Copier().copy(oldRecipe);
			
			recipe.setUid(UUID.randomUUID().toString());
			recipe.getDeplymentStep().clear();
			
			for ( Mappers mapper : oldRecipe.getMappers()) {
				recipe.getMappers().add(mapper);
			}				
			
			for (Ingredient  ingredient : recipe.getIngredients()) {
				
				Map<String,Object> params = new HashMap<>();
				params.put("ingredientId", ingredient.getUid());
				Ingredient oldIngredient = (Ingredient) runQuery("queryIngredient.eol",params,true);
				ingredient.setControllerLayer(oldIngredient.getControllerLayer());
				for ( MappingLayer layer :oldIngredient.getVewLayer()) {
					ingredient.getVewLayer().add(layer);
				}
				for ( MappingLayer layer : oldIngredient.getModelLayer()) {
					ingredient.getModelLayer().add(layer);
				}				
				
				for ( Mappers mapper : oldIngredient.getMappers()) {
					ingredient.getMappers().add(mapper);
				}				
				
				ingredient.setUid(UUID.randomUUID().toString());
				
				for ( Component component : ingredient.getComponents()) {
					
					params = new HashMap<>();
					params.put("componentId", component.getUid());
					Component oldComponent = (Component) runQuery("queryComponent.eol",params,true);

					component.setUid(UUID.randomUUID().toString());
					if ( oldComponent instanceof JavaComponent) {
						JavaComponent oldJavaComponent = (JavaComponent) oldComponent;
						JavaComponent javaComponent = (JavaComponent) component;
						javaComponent.setVersionRef(oldJavaComponent.getVersionRef());
						javaComponent.setMapperRef(oldJavaComponent.getMapperRef());
					}
					
					for ( ModelMapper mapper : component.getMappers()) {
						
						params = new HashMap<>();
						params.put("mapperId", mapper.getUid());
						ModelMapper oldMapper = (ModelMapper) runQuery("queryModelMapper.eol",params,true);

						mapper.setUid(UUID.randomUUID().toString());
						mapper.setArtifactRef(oldMapper.getArtifactRef());
					
						
						for ( int i = 0; i<  mapper.getQueries().size(); i++) {
							
							Query oldQuery = oldMapper.getQueries().get(i); 
							Query query = mapper.getQueries().get(i);
							query.setUid(UUID.randomUUID().toString());
							query.setQueryRef(oldQuery.getQueryRef());
							
							for(   int j = 0; j<  query.getVariables().size(); j++) {
								QueryVariable oldVar = oldQuery.getVariables().get(j);
								QueryVariable var = query.getVariables().get(j);
								var.setUid(UUID.randomUUID().toString());
								var.setQueryParamRef(oldVar.getQueryParamRef());
								if ( "JPA test package".equals(var.getValue())) {
									var.setValue("JPA test package No Lazy");
									oldVar.setValue("JPA test package Lazy");
								}
								
								if ( "JPA 2 test package".equals(var.getValue())) {
									var.setValue("JPA 2 test package Non Lazy");
									oldVar.setValue("JPA 2 test package Lazy");
								}
								
							}
						}
						
						for ( int i = 0; i<  mapper.getClassifiers().size(); i++) {
							
							Classifier oldClassifier = oldMapper.getClassifiers().get(i);
							Classifier classifier = mapper.getClassifiers().get(i);
							classifier.setUid(UUID.randomUUID().toString());
							classifier.setHint(oldClassifier.getHint());
							
						}
						
						for ( int i = 0; i<  mapper.getTechnologies().size(); i++) {
							MappingTecnologiy oldTechnology = oldMapper.getTechnologies().get(i);
							MappingTecnologiy mappingTecnologiy = mapper.getTechnologies().get(i);
							mappingTecnologiy.setUid(UUID.randomUUID().toString());
							mappingTecnologiy.setTechRef(oldTechnology.getTechRef());
							mappingTecnologiy.setValueRef(oldTechnology.getValueRef());
							
						}
					}
				}
			}
			
			
			Map<String,Object> params = new HashMap<>();
			params.put("newRecipe", recipe);
			runQuery("addRecipe.eol",params,true);

			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void copyPackage() {
		try {

//Copy  types
//			runRules("copyPackage.epl", "Simple model", "T simple","2");
//			runRules("copyPackage.epl", "Complex model", "T complex","2");
			
			runRules("copyPackage.epl", "HR model no lazy","HR model disconnected","");
//			runRules("copyPackage.epl",  "T simple", "Complex model","");
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {

		}

	}

	private Object runQuery(String filename, Map<String, Object> params, boolean store) throws Exception {

		EolModule module = new EolModule();

		String modelFile = SrcModelLoader.class.getResource("hr.domain").toURI().toString();
		EmfModel model = createEmfModelByURI("mdl", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(model);

		modelFile = EpsilonResourcesLoader.class.getResource(filename).toURI().toString();

		module.parse(URI.create(modelFile));
		printParsingError(module.getParseProblems());
		
		if (params != null) {
			for (String key : params.keySet()) {
				module.getContext().getFrameStack().put(Variable.createReadOnlyVariable(key, params.get(key)));
			}
		}
		
		Object result = module.execute();
		if (store) {
			model.store();
		}
		return result;
	}

	private void runRules(String rulesFile, String fromPackage, String toPackage, String suffix) throws Exception {
		EolModule module = new EolModule();

		String modelFile = SrcModelLoader.class.getResource("hr.domain").toURI().toString();
		EmfModel model = createEmfModelByURI("mdl", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(model);

		EplModule eplModule = new EplModule();
		modelFile = EpsilonResourcesLoader.class.getResource(rulesFile).toURI().toString();
		eplModule.getContext().getModelRepository().addModel(model);
		eplModule.parse(URI.create(modelFile));

		printParsingError(eplModule.getParseProblems());

		eplModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("fromPackage", fromPackage));
		eplModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("toPackage", toPackage));
		eplModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("suffix", suffix));

		eplModule.execute();
		model.store();

	}

	protected void printParsingError(List<ParseProblem> prblems) throws Exception {
		if (!prblems.isEmpty()) {
			for (ParseProblem problem : prblems) {
				System.err.println(problem.toString());
			}
			throw new Exception("Ecl parsing exception");
		}
	}

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		properties.put(EmfModel.PROPERTY_EXPAND, true);
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected String getFileURI(String fileName) throws URISyntaxException {
		URI uri = Paths.get(fileName).toUri();
		return uri.toString();
	}

}
