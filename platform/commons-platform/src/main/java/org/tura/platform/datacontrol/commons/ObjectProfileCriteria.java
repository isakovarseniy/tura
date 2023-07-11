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

package org.tura.platform.datacontrol.commons;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
public class ObjectProfileCriteria extends SearchCriteria {

	private static final long serialVersionUID = 6053975586859765976L;
	private String profile;

	public ObjectProfileCriteria() {
	}

	public ObjectProfileCriteria(String profile) {
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public Object getValue() {
		return null;
	}

	@Override
	public String getClassName() {
		return null;
	}

	@Override
	public String getComparator() {
		return null;
	}

	@Override
	public String getParentClass() {
		return null;
	}

	@Override
	public String getProperty() {
		return null;
	}

}
