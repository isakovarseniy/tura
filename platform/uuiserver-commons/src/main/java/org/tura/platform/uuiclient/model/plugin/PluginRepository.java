/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.model.plugin;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.datacontrol.commons.TuraException;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class PluginRepository {

	private Map<String, Map<String, Plugin>> registry = new HashMap<>();

	public void loadPluginResources(String resource) throws TuraException {
		try {
			if (resource == null) {
				return;
			}
			String[] resources = resource.split(";");
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);
			for (String res : resources) {
				byte[] buffer = Files.readAllBytes(Paths.get(res));
				Plugins plugins = mapper.readValue(buffer, Plugins.class);

				for (Plugin plugin : plugins.getPlugins()) {
					Map<String, Plugin> extHash = registry.get(plugin.getExtensionPoint());
					if (extHash == null) {
						extHash = new HashMap<String, Plugin>();
						registry.put(plugin.getExtensionPoint(), extHash);
					}
					extHash.put(plugin.getPluginType(), plugin);
				}
			}
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	public void savePluginResources(String resource) throws TuraException {
		try {
			if (resource == null) {
				return;
			}
			Plugins plugins = new Plugins();
			for (Map.Entry<String, Map<String, Plugin>> entry : registry.entrySet()) {
				plugins.getPlugins().addAll(entry.getValue().values());
			}
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);
			byte[] buffer = mapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(plugins);
			Files.write(Paths.get(resource), buffer);

		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

	public void addPlugin(Plugin plugin) {
		Map<String, Plugin> extHash = registry.get(plugin.getExtensionPoint());
		if (extHash == null) {
			extHash = new HashMap<String, Plugin>();
			registry.put(plugin.getExtensionPoint(), extHash);
		}
		extHash.put(plugin.getPluginType(), plugin);
	}

	public void removePlugin(Plugin plugin) {
		Map<String, Plugin> extHash = registry.get(plugin.getExtensionPoint());
		if (extHash == null) {
			return;
		}
		extHash.remove(plugin.getPluginType());
	}

	public Plugin getPlugin( String extensionPoint, String pluginType) {
		Map<String, Plugin> extHash = registry.get(extensionPoint);
		if (extHash == null) {
			return null;
		}
		return extHash.get(pluginType);
	}

}
