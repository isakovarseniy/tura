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

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.model.plugin.Plugin;
import org.tura.platform.uuiclient.model.plugin.PluginRepository;
import org.tura.platform.uuiclient.model.plugin.WinPlugin;
import org.tura.platform.uuiclient.rest.EventDescription;

public class WindowsPluginModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<WinDesc> windows = new ArrayList<WinDesc>();

	private int maxIndex;

	private int activeWindow;

	private WindowsPluginModelCallBack callback;

	public WindowsPluginModel(Object callback, String modelId) {
		this.callback = (WindowsPluginModelCallBack) callback;
	}

	public WindowsPluginModel() {
	}

	@SuppressWarnings("unchecked")
	public void onAddWindowEvent(EventDescription event, ELResolver elResolver) {
		String type = (String) event.findParameter("type").getValue();
		Map<String, String> params = (Map<String, String>) event.findParameter("params").getValue();
		addWindows(type, params, elResolver);
	}

	public void onRemoveWindowEvent(EventDescription event) {
//		this.setFirst((int) event.findParameter("index").getValue());
	}

	public void addWindows(String type, Map<String, String> params, ELResolver elResolver) {
		PluginRepository pluginRepository = callback.getPluginRepository();
		Plugin plugin = pluginRepository.getPlugin(callback.getExtension(), type);
		if (plugin == null) {
			return;
		}

		WinDesc win = toWinDesc((WinPlugin) plugin, params, elResolver);
		int index = maxIndex++;
		win.setKey(index);
		windows.add(win);
		activeWindow = windows.size() - 1;
	}

	public void removeWindows(int index) {
		windows.remove(index);
		if (activeWindow >= windows.size()) {
			activeWindow--;
		}
	}

	private WinDesc toWinDesc(WinPlugin plugin, Map<String, String> params, ELResolver elResolver) {
		WinDesc win = new WinDesc(plugin.getLibraryURL(), plugin.getApplication(),  plugin.getPluginType());
		for (Entry<String, String> entry : plugin.getParameters().entrySet()) {
			String value = null;
			if (params != null) {
				value = params.get(entry.getKey());
			}
			if (value == null) {
				value = entry.getValue();
			}

			if (value != null) {
				value = (String) resolve(value, elResolver);
				win.getParams().put(entry.getKey(), value);
			}
		}
		win.setHeader((String) resolve(plugin.getHeader(), elResolver));
		return win;
	}

	private Object resolve(String expression, ELResolver elResolver) {
		if (expression.length() > 3 && "#{".equals(expression.substring(0, 2))) {
			return elResolver.getValue(expression);
		} else {
			return expression;
		}
	}

	public List<WinDesc> getWindows() {
		return windows;
	}

	public void setWindows(List<WinDesc> windows) {
		this.windows = windows;
	}

	public int getMaxIndex() {
		return maxIndex;
	}

	public void setMaxIndex(int maxIndex) {
		this.maxIndex = maxIndex;
	}

	public int getActiveWindow() {
		return activeWindow;
	}

	public void setActiveWindow(int activeWindow) {
		this.activeWindow = activeWindow;
	}

	public class WinDesc implements Serializable {
		private static final long serialVersionUID = 1L;
		String libraryURL;
		String application;
		String type;
		int key;
		String header;
		Map<String,Object> params = new HashMap<String, Object>();

		public WinDesc() {
		};

		public WinDesc(String libraryURL, String application , String type) {
			this.type = type;
			this.libraryURL = libraryURL;
			this.application = application;
		};

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public String getLibraryURL() {
			return libraryURL;
		}

		public void setLibraryURL(String libraryURL) {
			this.libraryURL = libraryURL;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getHeader() {
			return header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public String getApplication() {
			return application;
		}

		public void setApplication(String application) {
			this.application = application;
		}

		public Map<String, Object> getParams() {
			return params;
		}

		public void setParams(Map<String, Object> params) {
			this.params = params;
		}

		
	}
}
