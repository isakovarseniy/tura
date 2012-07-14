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


@Entity(name = "BusinessObject")
@Table(name = "business_object")
public class BusinessObjectDAO extends ELsoftObject{
	
	@Column(name = "MNT_TYPE_REF")
	private Long refMntType;
	
	@Column(name = "BUSINESS_OBJECT_TYPENAME")
	private String businessObjectTypeName;


	public String getBusinessObjectTypeName() {
		return businessObjectTypeName;
	}

	public void setBusinessObjectTypeName(String businessObjectTypeName) {
		this.businessObjectTypeName = businessObjectTypeName;
	}

	public Long getRefMntType() {
		return refMntType;
	}

	public void setRefMntType(Long refMntType) {
		this.refMntType = refMntType;
	}
	
}
