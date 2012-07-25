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
package org.elsoft.platform.metamodel.processor.datasource.model;

import org.elsoft.platform.metamodel.objects.type.ParameterDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;



public class Parameter {

	private IndependentType type;
	private String name;
	private String expression;
	private String value;
	private Boolean overwitten;

	public Parameter(TypeDAO paramType,ParameterDAO param) {
       type = new IndependentType(paramType);
       name = param.getParameterName();
       expression = param.getDefaultExpression();
       value = param.getDefaultValue();
       overwitten = param.getOverwritten();
	}

	public IndependentType getType() {
		return type;
	}

	public void setType(IndependentType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getOverwitten() {
		return overwitten;
	}

	public void setOverwitten(Boolean overwitten) {
		this.overwitten = overwitten;
	}

}
