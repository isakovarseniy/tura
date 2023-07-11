/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.operation;


import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class CpaControl extends SpaControl{
	
	private Object extendedMasterObject;
	private Object extendedDetailObject;
	private Object detailPk;
	private Object detailObject;
	private String masterProperty;
	private String detailProperty;
	private String relationId;
	private RelationType  cpaRelationType;
	private boolean lazy;

	public CpaControl(Object object, Object key, OperationLevel level, String registryName) {
		super(object, key, level, registryName);
	}
	
	
	public String getMasterProperty() {
		return masterProperty;
	}

	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}

	public String getDetailProperty() {
		return detailProperty;
	}

	public void setDetailProperty(String detailProperty) {
		this.detailProperty = detailProperty;
	}

	public Object getDetailObject() {
		return detailObject;
	}

	public void setDetailObject(Object detailObject) {
		this.detailObject = detailObject;
	}

	
	public Object getDetailPk() {
		return detailPk;
	}

	public void setDetailPk(Object detailPk) {
		this.detailPk = detailPk;
	}

	public Class<?> getDetailType(){
		return this.detailObject.getClass();
	}


	public String getRelationId() {
		return relationId;
	}


	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}


	public RelationType getCpaRelationType() {
		return cpaRelationType;
	}


	public void setCpaRelationType(RelationType cpaRelationType) {
		this.cpaRelationType = cpaRelationType;
	}


	public Object getExtendedMasterObject() {
		return extendedMasterObject;
	}


	public void setExtendedMasterObject(Object extendedMasterObject) {
		this.extendedMasterObject = extendedMasterObject;
	}


	public Object getExtendedDetailObject() {
		return extendedDetailObject;
	}


	public void setExtendedDetailObject(Object extendedDetailObject) {
		this.extendedDetailObject = extendedDetailObject;
	}


	public boolean isLazy() {
		return lazy;
	}


	public void setLazy(boolean lazy) {
		this.lazy = lazy;
	}
	
	
}
