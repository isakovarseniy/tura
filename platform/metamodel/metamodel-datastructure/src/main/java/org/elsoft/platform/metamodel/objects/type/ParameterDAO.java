/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.objects.type;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.elsoft.platform.metamodel.objects.ELsoftObject;

@Entity(name = "Parameter")
@Table(name = "parameter")
public class ParameterDAO extends ELsoftObject{
	
	@Column(name = "PARAMETER_TYPE")
	private Long parameterType;

	@Column(name = "PARAMETER_NAME")
	private String parameterName;
	
	@Column(name = "DEFAULT_VALUE")
    private String defaultValue;
    
	@Column(name = "DEFAULT_EXPRESSION")
	private String defaultExpression;

	@Column(name = "OVERWRITTEN")
	private Boolean overwritten=false;

	
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDefaultExpression() {
		return defaultExpression;
	}

	public void setDefaultExpression(String defaultExpression) {
		this.defaultExpression = defaultExpression;
	}

	public Long getParameterType() {
		return parameterType;
	}

	public void setParameterType(Long parameterType) {
		this.parameterType = parameterType;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public Boolean getOverwritten() {
		return overwritten;
	}

	public void setOverwritten(Boolean overwritten) {
		this.overwritten = overwritten;
	}
	
}


