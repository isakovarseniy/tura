/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.repository.jpa.operation;

import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class JpaControl extends SpaControl{

	private RelOperation operation;
	private Object detailPk;
	private String masterProperty;
	private String detailType;
	
	
	public JpaControl(Object master, Object masterPk, OperationLevel level, String registryName) {
		super(master, masterPk, level,registryName);
	}
	
	public String getDetailType() {
		return detailType;
	}


	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	
	public RelOperation getOperation() {
		return operation;
	}

	public void setOperation(RelOperation operation) {
		this.operation = operation;
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

}
