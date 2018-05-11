/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.object.persistence.data;

public class ConnectData {

	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String  detailClassName;
	String relation;
	
	public Object getMasterPk() {
		return masterPk;
	}
	public void setMasterPk(Object masterPk) {
		this.masterPk = masterPk;
	}
	public Object getDetailPk() {
		return detailPk;
	}
	public void setDetailPk(Object detailPk) {
		this.detailPk = detailPk;
	}
	public String getMasterProperty() {
		return masterProperty;
	}
	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}

	public String getMasterClassName() {
		return masterClassName;
	}
	public void setMasterClassName(String masterClassName) {
		this.masterClassName = masterClassName;
	}
	public String getDetailClassName() {
		return detailClassName;
	}
	public void setDetailClassName(String detailClassName) {
		this.detailClassName = detailClassName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}
