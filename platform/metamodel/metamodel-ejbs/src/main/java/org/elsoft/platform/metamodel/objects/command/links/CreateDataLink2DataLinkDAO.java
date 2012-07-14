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

@Entity(name = "ObjLink2ObjLink")
@Table(name = "objlink2objlink")
@DiscriminatorValue("OBJLINK2OBJLINK")
@XmlRootElement
public class CreateDataLink2DataLinkDAO extends EventDAO {

	@Column(name = "RELATION_NAME")
	private String relationName;

	@Column(name = "MASTERFIELD")
	private String masterField;

	@Column(name = "DETAILFIELD")
	private String detailField;

	@Column(name = "TREE_RELATION")
	private Boolean treeRelation;
	
	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getMasterField() {
		return masterField;
	}

	public void setMasterField(String masterField) {
		this.masterField = masterField;
	}

	public String getDetailField() {
		return detailField;
	}

	public void setDetailField(String detailField) {
		this.detailField = detailField;
	}

	public Boolean getTreeRelation() {
		return treeRelation;
	}

	public void setTreeRelation(Boolean treeRelation) {
		this.treeRelation = treeRelation;
	}


}
