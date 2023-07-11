/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.Registry;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
public abstract class ProxyData implements Serializable , CloneableCommand{

	private static final long serialVersionUID = 5093832246017157053L;
	protected String relationType;
	protected String masterProperty;
	protected String detailProperty;
	protected Registry registry;
	protected Map<String,Object> params = new HashMap<>();
	
	
	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}
	public String getDetailProperty() {
		return detailProperty;
	}
	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}
	public Map<String, Object> getParams() {
		return params;
	}

	@Override
	public void setRegistry(Registry registry) {
		this.registry =  registry;
	}
	@Override
	public void cleanRegistry() {
		this.registry = null;
	}	
	
	
}
