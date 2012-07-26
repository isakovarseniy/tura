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
package org.elsoft.platform.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * An example entity bean which can be persistent in database
 * 
 */
@Entity(name = "ObjectsID")
@Table(name = "objectsid")
public class ObjectsID {
	
	@Id
	@SequenceGenerator(name = "OBJ_ID_GEN", sequenceName = "obj_id_gen",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OBJ_ID_GEN")
	@Column(name = "OBJ_ID")
	private Long objId;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

}
