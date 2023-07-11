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

package org.tura.platform.repository.cpa.operation;

import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class CpaUpdateStorageControl extends  SpaControl{

	private String property;
	private  Object value;
	private  Class<?> loadedBy;
	
	public CpaUpdateStorageControl(Object object, Object key, OperationLevel level, String registryName) {
		super(object, key, level, registryName);
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Class<?> getLoadedBy() {
		return loadedBy;
	}

	public void setLoadedBy(Class<?> loadedBy) {
		this.loadedBy = loadedBy;
	}

	
	
}
