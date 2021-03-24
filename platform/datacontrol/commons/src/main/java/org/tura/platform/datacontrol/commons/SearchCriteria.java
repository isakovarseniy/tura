/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SearchCriteria")
public class SearchCriteria implements Serializable{

	private static final long serialVersionUID = -4139161436826790643L;
	private String parentClass;
	private String property; 
	private String name;
	private String comparator;
	private Object value;
	private String className;
	
	public SearchCriteria(){
	}

	public SearchCriteria(String name,String comparator,Object value,String className){
		this.name=name;
		this.comparator=comparator;
		this.value=value;
		this.className=className;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	@XmlElement
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	@XmlElement
	public String getComparator() {
		return comparator;
	}
	public void setComparator(String comparator) {
		this.comparator = comparator;
	}

	@XmlElement
	public String getParentClass() {
		return parentClass;
	}

	public void setParentClass(String parentClass) {
		this.parentClass = parentClass;
	}

	@XmlElement
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("parentClass = "+parentClass);
		builder.append("property = "+property);
		builder.append("name = "+name);
		builder.append("comparator = "+comparator);
		if ( value != null) {
			builder.append("value = "+value.toString());
		}
		builder.append("className = "+className);
		return builder.toString();
	}
}
