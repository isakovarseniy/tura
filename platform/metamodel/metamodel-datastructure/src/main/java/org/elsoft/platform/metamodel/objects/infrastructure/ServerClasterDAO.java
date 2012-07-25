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
package org.elsoft.platform.metamodel.objects.infrastructure;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.elsoft.platform.metamodel.objects.ELsoftObject;


@Entity(name = "ServerClaster")
@Table(name = "serverclaster")
public class ServerClasterDAO extends ELsoftObject{

	@Column(name = "CLASTER_NAME") // (ACTIVE/ACTIVE, ACTIVE/PASSIVE)
	private String clasterName;

	
	@Column(name = "CLASTER_TYPE") // (ACTIVE/ACTIVE, ACTIVE/PASSIVE)
	private String clasterType;


	@Column(name = "LAVEL") // (1..7)
	private Integer lavel;



	public String getClasterType() {
		return clasterType;
	}


	public void setClasterType(String clasterType) {
		this.clasterType = clasterType;
	}


	public Integer getLavel() {
		return lavel;
	}


	public void setLavel(Integer lavel) {
		this.lavel = lavel;
	}


	public String getClasterName() {
		return clasterName;
	}


	public void setClasterName(String clasterName) {
		this.clasterName = clasterName;
	}

	
}
