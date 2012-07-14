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
package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "TreeLeaf")
@Table(name = "treeleaf")
@DiscriminatorValue("TREELEAF")
@XmlRootElement
public class CreateUITreeLeafDAO extends FormElementDAO{
	
	@Column(name = "DATA_FIELD")
	private Long dataField;

	public Long getDataField() {
		return dataField;
	}

	public void setDataField(Long dataField) {
		this.dataField = dataField;
	}

	@Column(name = "REQUIRED")
	private boolean required;


	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	
}





