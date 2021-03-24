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

package org.tura.platform.repository.priority;

import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class LinkControl extends SpaControl{

	private Object masterPk;
	private String masterType;
	private Object detailPk;
	private String detailType;
	private RepoKeyPath extendedMasterPk;
	private RepoKeyPath extendedDetailPk;
    private RelOperation relation;
	private boolean oposit;
    
    
	public LinkControl(Object object, Object key, OperationLevel level, String registryName) {
		super(object, key, level, registryName);
	}
    
	public boolean isOposit() {
		return oposit;
	}

	public void setOposit(boolean oposit) {
		this.oposit = oposit;
	}
    
    public RelOperation getRelation() {
		return relation;
	}
	public void setRelation(RelOperation relation) {
		this.relation = relation;
	}
	public String getMasterType() {
		return masterType;
	}
	public void setMasterType(Object masterObject) {
		this.masterType = masterObject.getClass().getName();
		if (masterObject instanceof Adapter){
			this.masterType = ((Adapter)masterObject).getObjectType();
		}
	}
	public String getDetailType() {
		return detailType;
	}
	public void setDetailType(Object detailObject) {
		this.detailType = detailObject.getClass().getName();
		if (detailObject instanceof Adapter){
			this.detailType = ((Adapter)detailObject).getObjectType();
		}
	}
	
	public RepoKeyPath getExtendedMasterPk() {
		return extendedMasterPk;
	}
	public void setExtendedMasterPk(RepoKeyPath extendedMasterPk) {
		this.extendedMasterPk = extendedMasterPk;
	}
	public RepoKeyPath getExtendedDetailPk() {
		return extendedDetailPk;
	}
	public void setExtendedDetailPk(RepoKeyPath extendedDetailPk) {
		this.extendedDetailPk = extendedDetailPk;
	}
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
	

}
