/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.frame.plugins;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.uuiclient.model.plugin.PluginRepository;
import org.tura.platform.uuiclient.model.plugin.WinPlugin;
import org.tura.model.designer.Constants;

public class CreatePluginResource {
	
	@Test
	public void createWindowPlugins() {
		
		PluginRepository repository = new PluginRepository() {
			
		};

		WinPlugin plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.NAVIGATION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.NAVIGATION_PLUGIN);
		plugin.setHeader("Navigator");
		plugin.setLibraryURL("/mm-navigator-client");
		plugin.setApplication("MmdesignerNavigatorNavigatorWin");
		repository.addPlugin(plugin);
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.MESSAGES_LIBRARY_PLUGIN);
		plugin.setHeader("Messages");
		plugin.setLibraryURL("/mm-messages-client");
		plugin.setApplication("MmdesignerMessagesMessages");


		Map<String, String> params = new HashMap<>();
		params.put("appMessageLibraries", "");
		params.put("libraryId", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);
		

		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.LANGUAGES_PLUGIN);
		plugin.setHeader("Languages");
		plugin.setLibraryURL("/mm-messages-client");
		plugin.setApplication("MmdesignerMessagesLanguages");

		params = new HashMap<>();
		params.put("appMessageLibraries", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TECHNOLOGIES_PLUGIN);
		plugin.setHeader("Technologies");
		plugin.setLibraryURL("/mm-technologies-client");
		plugin.setApplication("MmdesignerTechnologiesTechWin");
		repository.addPlugin(plugin);		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.ARTIFACT_PLUGIN);
		plugin.setHeader("Artifacts");
		plugin.setLibraryURL("/mm-artifacts-client");
		plugin.setApplication("MmdesignerArtifactsArtifactsWin");

		params = new HashMap<>();
		params.put("artifactGroup", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);				
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.TECHNOLOGIES_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TECHNOLOGIES_PLUGIN);
		plugin.setHeader("Technologies");
		plugin.setLibraryURL("/mm-technologies-client");
		plugin.setApplication("MmdesignerTechnologiesTechWin");
		repository.addPlugin(plugin);		
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.STYLELIB_PLUGIN);
		plugin.setHeader("StyleLibrary");
		plugin.setLibraryURL("/mm-styles-client");
		plugin.setApplication("MmdesignerStylesStylesLibraryWin");

		params = new HashMap<>();
		params.put("styleLibrary", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);			
		

		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAPPER_CONTEXT_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TREE_SELECTION_PLUGIN);
		plugin.setHeader("Selection");
		plugin.setLibraryURL("/mm-tree-selection-client");
		plugin.setApplication("MmdesignerTreeselectionTreeSelectionWin");

		params = new HashMap<>();
		params.put("applicationId", "#{applicationId}");
		plugin.setParameters(params);
		repository.addPlugin(plugin);			
		

		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.RECIPE_CONTEXT_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TREE_SELECTION_PLUGIN);
		plugin.setHeader("Selection");
		plugin.setLibraryURL("/mm-tree-selection-client");
		plugin.setApplication("MmdesignerTreeselectionTreeSelectionWin");

		params = new HashMap<>();
		params.put("applicationId", "#{applicationId}");
		plugin.setParameters(params);
		repository.addPlugin(plugin);			
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.RECIPE_ARTIFACT_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TREE_SELECTION_PLUGIN);
		plugin.setHeader("Selection");
		plugin.setLibraryURL("/mm-tree-selection-client");
		plugin.setApplication("MmdesignerTreeselectionTreeSelectionWin");

		params = new HashMap<>();
		params.put("applicationId", "#{applicationId}");
		plugin.setParameters(params);
		repository.addPlugin(plugin);				
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAPPER_VERSION_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.VERSIONS_SELECTION_PLUGIN);
		plugin.setHeader("Versions");
		plugin.setLibraryURL("/mm-mapper-client");
		plugin.setApplication("MmdesignerMapperVersionsSelectionWin");

		params = new HashMap<>();
		params.put("appMappersId", "#{appMappersId}");
		plugin.setParameters(params);
		repository.addPlugin(plugin);			
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.RECIPE_VERSION_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.VERSIONS_SELECTION_PLUGIN);
		plugin.setHeader("Versions");
		plugin.setLibraryURL("/mm-mapper-client");
		plugin.setApplication("MmdesignerMapperVersionsSelectionWin");
		
		params = new HashMap<>();
		params.put("appMappersId", "#{appMappersId}");
		plugin.setParameters(params);
		repository.addPlugin(plugin);			
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.RECIPE_CLASSIFIER_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TECHNOLOGIES_PLUGIN);
		plugin.setHeader("Technologies");
		plugin.setLibraryURL("/mm-technologies-client");
		plugin.setApplication("MmdesignerTechnologiesTechWin");
		repository.addPlugin(plugin);		
		
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.MAPPING_CONFIGURATION_PLUGIN);
		plugin.setHeader("Mapping configuration");
		plugin.setLibraryURL("/mm-mapper-client");
		plugin.setApplication("MmdesignerMapperConfigMapperWin");

		params = new HashMap<>();
		params.put("appMappersId", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);				
		

		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.MAPPING_PLUGIN);
		plugin.setHeader("Mapping");
		plugin.setLibraryURL("/mm-mapper-client");
		plugin.setApplication("MmdesignerMapperMapperWin");
		

		params = new HashMap<>();
		params.put("mapperId", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);				
		
		
		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.MAIN_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.RECIPE_PLUGIN);
		plugin.setHeader("Recipe");
		plugin.setLibraryURL("/mm-recipe-client");
		plugin.setApplication("MmdesignerRecipeRecipeWin");
		

		params = new HashMap<>();
		params.put("recipesId", "");
		plugin.setParameters(params);
		repository.addPlugin(plugin);				


		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.TYPE_PROPERTIES_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.PROPERTIES_PLUGIN);
		plugin.setHeader("Properties");
		plugin.setLibraryURL("/mm-properties-client");
		plugin.setApplication("MmdesignerPropertiesPropertiesWin");
		repository.addPlugin(plugin);				
		

		plugin = new WinPlugin();
		plugin.setExtensionPoint(Constants.PROPERTIES_CLASSIFIER_SELECTION_WINDOW_EXTENSION);
		plugin.setPluginType(Constants.TECHNOLOGIES_PLUGIN);
		plugin.setHeader("Technologies");
		plugin.setLibraryURL("/mm-technologies-client");
		plugin.setApplication("MmdesignerTechnologiesTechWin");
		repository.addPlugin(plugin);				

		
		
		
		try {
			repository.savePluginResources("windPlugins.json");
		} catch (TuraException e) {
			e.printStackTrace();
			fail();
		}
		
	}

}
