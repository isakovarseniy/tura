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

package org.tura.platform.repository.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.RepoKeyPath;

public class UpdateObjectData implements Serializable{

	private static final long serialVersionUID = 8079343032199551089L;
	private RepoKeyPath pk;
	private Object value;
	private String property;
	private String propertyType;
	
	private Map<String,Object> params = new HashMap<>();
	
	
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public RepoKeyPath getPk() {
		return pk;
	}
	public void setPk(RepoKeyPath pk) {
		this.pk = pk;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	
}
