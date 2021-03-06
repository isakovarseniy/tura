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


import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceRelationBuilder;
import org.tura.platform.repository.persistence.RelOperation;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class JpaDisconnectMasterFromDetailOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = 865156751889453775L;
	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String detailClassName;
	String relation;

	public JpaDisconnectMasterFromDetailOperation(Registry registry,SpaObjectRegistry spaRegistry){
		super(registry,spaRegistry);
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

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try{
			SearchProvider sp = this.providerHash.get(getMasterClassName());
			
			Object master = sp.find(getMasterPk(),getMasterClassName() );
			Object detail = sp.find(getDetailPk(),getDetailClassName() );

			if (master == null || detail == null) {
				// Seems objects already disconnected and removed previosly
				return null ;
			}

			RelOperation operation = PersistanceRelationBuilder.build( getRelation());
			
	        JpaControl masterControl = new JpaControl(master, getMasterPk(), OperationLevel.DISCONNECT,registryName);
	        masterControl.setDetailPk(getDetailPk());
	        masterControl.setMasterProperty(getMasterProperty());
	        masterControl.setOperation(operation);
			masterControl.setDetailType(getDetailClassName());

	        List<SpaControl> list= new ArrayList<>();
	        list.add(masterControl);
	        return list;

		}catch(Exception e){
			throw new RepositoryException(e);
		}
	}
	
	
	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		try {
			RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
			String masterProperty_ = (String) parameters[1];
			RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];

			setMasterPk(getJpaPrimaryKey(masterPk_));
			setMasterProperty(masterProperty_);
			setRelation(getJpaRelationType(masterPk_, masterProperty_));
			setMasterClassName(getJpaPersistanceClassName(masterPk_));
			setDetailPk(getJpaPrimaryKey(detailPk_));
			setDetailClassName(getJpaPersistanceClassName(detailPk_));

			this.knownObjects.add(getMasterClassName());
			this.knownObjects.add(getDetailClassName());

			return true;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}


}
