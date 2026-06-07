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

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
@JsonSubTypes({
		@JsonSubTypes.Type(value = WinPlugin.class, name = "WindPlugin") })
public class Plugin implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String pluginType;
	private String extensionPoint;
	
	public String getPluginType() {
		return pluginType;
	}
	
	public void setPluginType(String pluginType) {
		this.pluginType = pluginType;
	}
	public String getExtensionPoint() {
		return extensionPoint;
	}
	public void setExtensionPoint(String extensionPoint) {
		this.extensionPoint = extensionPoint;
	}

}
