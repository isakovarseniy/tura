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


@Entity(name = "Type")
@Table(name = "type_metadata")
public class TypeDAO extends ELsoftObject{

	@Column(name = "DOMAIN")
	private String domain;

	@Column(name = "FUNCTIONAL_DOMAIN")
	private String functionalDomain;

	@Column(name = "APPLICATION")
	private String application;

	@Column(name = "TYPE_NAME")
	private String typeName;
	
	@Column(name = "TYPE_OF_TYPE")
	private String typeOfType;


	@Column(name = "GENERIC_TYPE")
	private Long genericType;
	

	public Long getGenericType() {
		return genericType;
	}

	public void setGenericType(Long genericType) {
		this.genericType = genericType;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFunctionalDomain() {
		return functionalDomain;
	}

	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeOfType() {
		return typeOfType;
	}

	public void setTypeOfType(String typeOfType) {
		this.typeOfType = typeOfType;
	}
	
}
