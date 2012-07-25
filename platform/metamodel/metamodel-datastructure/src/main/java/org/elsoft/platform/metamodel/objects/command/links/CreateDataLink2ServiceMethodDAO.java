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
package org.elsoft.platform.metamodel.objects.command.links;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.EventDAO;

@Entity(name = "ObjLink2ServiceMethod")
@Table(name = "objlink2servicemethod")
@DiscriminatorValue("OBJLINK2SERVICEMETHOD")
@XmlRootElement
public class CreateDataLink2ServiceMethodDAO extends EventDAO {

	@Column(name = "DOMAIN")
	private String domain;

	@Column(name = "FUNCTIONAL_DOMAIN")
	private String functionalDomain;

	@Column(name = "APPLICATION")
	private String application;

	@Column(name = "TYPE_NAME")
	private String typeName;

	@Column(name = "METHOD_NAME")
	private String methodName;
	
	@Column(name = "METHODTYPE")
	private String methodType;

	@Column(name = "REF_TYPE")
	private Long refType;

	@Column(name = "REF_METHOD")
	private Long refMethod;

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

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Long getRefType() {
		return refType;
	}

	public void setRefType(Long refType) {
		this.refType = refType;
	}

	public Long getRefMethod() {
		return refMethod;
	}

	public void setRefMethod(Long refMethod) {
		this.refMethod = refMethod;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}


}
