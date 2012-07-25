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

@Entity(name = "ObjectLink2BusinessObjectMethod")
@Table(name = "ObjectLink2BusinessObjectMethod")
@DiscriminatorValue("OBJECTLINK2BUSINESSOBJECTMETHOD")
@XmlRootElement
public class CreateDataLink2BusinessObjectMethodDAO extends EventDAO{

	@Column(name = "DOMAIN")
	private String domain;
	@Column(name = "FUNCTIONALDOMAIN")
	private String functionalDomain;
	@Column(name = "BUSINESSOBJECTNAME")
	private String businessObjectName;

	@Column(name = "METHODTYPE")
	private String methodType;

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

	public String getBusinessObjectName() {
		return businessObjectName;
	}

	public void setBusinessObjectName(String businessObjectName) {
		this.businessObjectName = businessObjectName;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public Long getRefMethod() {
		return refMethod;
	}

	public void setRefMethod(Long refMethod) {
		this.refMethod = refMethod;
	}


	
	
}
