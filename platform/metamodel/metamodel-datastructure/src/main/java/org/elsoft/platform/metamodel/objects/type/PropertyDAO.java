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


@Entity(name = "Property")
@Table(name = "property")
public class PropertyDAO extends ELsoftObject{

	
	@Column(name = "PROPERTY_TYPE")
	private Long propertyType;

	@Column(name = "PROPERTY_NAME")
	private String propertyName;

	@Column(name = "PRIMARY_KEY")
	private Boolean primaryKey=false;

	@Column(name = "OPTM_LOCK")
	private Boolean optLock=false;
	
	public Boolean getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Long getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(Long propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Boolean getOptLock() {
		return optLock;
	}

	public void setOptLock(Boolean optLock) {
		this.optLock = optLock;
	}


}
