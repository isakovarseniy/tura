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

import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "@class")
@JsonSubTypes({
		@JsonSubTypes.Type(value = ObjectProfileCriteria.class, name = "ObjectProfileCriteria") })
public class SearchCriteria implements Serializable {

	private static final long serialVersionUID = -4139161436826790643L;
	private String parentClass;
	private String property;
	private String name;
	private String comparator;
	private Object value;
	private String className;

	public SearchCriteria() {
	}

	public SearchCriteria(String name, String comparator, Object value, String className) {
		this.name = name;
		this.comparator = comparator;
		this.value = value;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getComparator() {
		return comparator;
	}

	public void setComparator(String comparator) {
		this.comparator = comparator;
	}

	public String getParentClass() {
		return parentClass;
	}

	public void setParentClass(String parentClass) {
		this.parentClass = parentClass;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("parentClass = " + parentClass);
		builder.append("property = " + property);
		builder.append("name = " + name);
		builder.append("comparator = " + comparator);
		if (value != null) {
			builder.append("value = " + value.toString());
		}
		builder.append("className = " + className);
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(parentClass);
		builder.append(property);
		builder.append( name);
		builder.append(comparator);
		if (value != null) {
			builder.append( value.toString());
		}
		builder.append( className);
		return builder.toHashCode();
	}
	
	
}
