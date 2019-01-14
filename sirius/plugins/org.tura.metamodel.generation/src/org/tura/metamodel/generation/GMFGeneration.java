/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.generation;

import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.tura.metamodel.commons.GeneratotPreferences;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.preferences.IPreferenceConstants;
import org.tura.metamodel.epsilon.command.EGLCommand;

import recipe.Component;
import recipe.Configuration;
import recipe.HashProperty;
import recipe.Infrastructure;
import recipe.Ingredient;
import recipe.KeyValuePair;
import recipe.ModelMapper;
import recipe.Property;
import recipe.Recipes;

public class GMFGeneration {

	private IProgressMonitor monitor;

	private boolean generationError = false;

	public GMFGeneration(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	public boolean isGenerationError() {
		return generationError;
	}

	public void setGenerationError(boolean generationError) {
		this.generationError = generationError;
	}

	public void generate(DiagramEditPart diagramEditPart, View view,Infrastructure infrastructure) {
		runGMFGeneration(view, infrastructure, diagramEditPart);
	}

	private void getConfiguratioin(Configuration conf ,HashMap<String,Object> configuration){
		QueryHelper helper = new QueryHelper();
		try{
		if (conf != null){
  		   for (Property prop : conf.getProperties()){
			  String p = System.getProperty(prop.getConfVarRef().getName());
			  if ( p != null){
				  configuration.put(prop.getConfVarRef().getName(), p);
			  }else{
				  configuration.put(prop.getConfVarRef().getName(), prop.getValue());
			  }
		   }
  		   
 		   for (HashProperty prop : conf.getHashProperties()){
 			  HashMap <String,String> hash = new HashMap<String, String>();

 			  for (KeyValuePair pair : prop.getHash())
 				 hash.put(pair.getKey(), pair.getValue());
 			  
			  configuration.put(prop.getConfHashRef().getName(), hash);
		   }
  		   
		   if (  helper.getConfigExtensionUp(conf) != null)
			   getConfiguratioin(helper.getConfigExtensionUp(conf),configuration);
		}
		}catch(Exception e){
			
		}
	}

	private void runGMFGeneration(View target,Infrastructure infrastructure,DiagramEditPart diagramEditPart) {

		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode("org.tura.metamodel.commons.preferences");
		if ("true".equals(pref.get(IPreferenceConstants.LOG_TEMPLATES, "false"))) {
			GeneratotPreferences.logTemlates = true;
		}else{
			GeneratotPreferences.logTemlates = false;
		}
		if ("true".equals(pref.get(IPreferenceConstants.DEBUGING, "false"))) {
			GeneratotPreferences.debigging = true;
		}else{
			GeneratotPreferences.debigging = false;;
		}
		
		if (target.isSetElement() && target.getElement() != null) {
			try {
				HashMap<String, Object> configuration = new HashMap<>();
				getConfiguratioin( new QueryHelper().getConfiguration(infrastructure),  configuration);
				Recipes recipes = (Recipes) infrastructure.eContainer();
				InMemoryEmfModel model = new InMemoryEmfModel(recipes.eResource()){
					//Take Global registry 
					//Override original method to avoid exception  "Unavailable type"
					protected Registry getPackageRegistry() {
						if (registry == null) {
								registry = EPackage.Registry.INSTANCE;
						}
						return registry;
					}
				};
				EditingDomain editingDomain = diagramEditPart.getEditingDomain();

				for (Ingredient ingredient : recipes.getRecipe().getIngredients()) {
					if (ingredient.isSkip()){
						continue;
					}
					for (Component comp : ingredient.getComponents()) {
						if (comp.isSkip()){
							continue;
						}
						monitor.beginTask(
								"Component generation:" + comp.getName(), comp
										.getMappers().size());
						for (ModelMapper mapper : comp.getMappers()) {
							if (mapper.isSkip()){
								continue;
							}
							monitor.subTask("Mapper generation :"+ mapper.getName());
							if (mapper.getArtifactRef().getTemplate() != null) {
								EglTemplate template = null;
								try {
									String templatePath = mapper.getArtifactRef().getTemplate();

									EglTemplateFactory factory = new EglTemplateFactory();

									ModelRepository modelRepo = factory.getContext().getModelRepository();
									factory.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
									modelRepo.addModel(model);

									HashMap<String, Object> parameters = new HashMap<>();
									parameters.put("recipe",recipes.getRecipe());
									parameters.put("ingredient", ingredient);
									parameters.put("component", comp);
									parameters.put("model_mapper", mapper);
									parameters.put("configuration",configuration);

									Util.populateTechnologies(parameters,mapper);
									template = Util.loadTemplate(templatePath,parameters, factory);

									if (template != null && template.getParseProblems().isEmpty()) {
									editingDomain.getCommandStack().execute(new EGLCommand(factory,template));
									} else {
										LogUtil.logInfo("Generation action failed. Template parsing problem :"+ templatePath);
										generationError = true;
									}
								} catch (Throwable e) {
									LogUtil.log("Generation action failed. Ingredient -> {"
															+ ingredient.getName()
															+ "} Component -> {"
															+ comp.getName()
															+ "} Mapper -> {"
															+ mapper.getName()
															+ "}", e);
									generationError = true;
								}
							}
							monitor.worked(1);
						}
					}
				}
			} catch(Throwable e) {
				LogUtil.log(e);
			}
		}
	}

}
