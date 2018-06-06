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
package org.tura.platform.repository.mixed.test;

import org.tura.platform.object.persistence.JpaRepositoryCommand;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;

public class JpaConnectCommand extends JpaRepositoryCommand{

	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String detailClassName;
	String detailPropery;
	String relation;
	RepositoryCommandType cmdType;
	
	public RepositoryCommandType getCmdType() {
		return cmdType;
	}

	public void setCmdType(RepositoryCommandType cmdType) {
		this.cmdType = cmdType;
	}

	public String getDetailPropery() {
		return detailPropery;
	}

	public void setDetailPropery(String detailPropery) {
		this.detailPropery = detailPropery;
	}

	public Object getMasterPk() {
		return masterPk;
	}

	public void setMasterPk(Object masterPk) {
		this.masterPk = masterPk;
	}

	public String getMasterClassName() {
		return masterClassName;
	}

	public void setMasterClassName(String masterClassName) {
		this.masterClassName = masterClassName;
	}

	public String getMasterProperty() {
		return masterProperty;
	}

	public void setMasterProperty(String masterProperty) {
		this.masterProperty = masterProperty;
	}

	public Object getDetailPk() {
		return detailPk;
	}

	public void setDetailPk(Object detailPk) {
		this.detailPk = detailPk;
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
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {

		RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
		String masterProperty_ = (String) parameters[1];
		RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];
		String detailProperty_ = (String) parameters[3];

		if (cmdType.equals(RepositoryCommandType.connectMasterToDetail)) {
			if (masterPk_.getPath().size() != 1){
				return false;
			}
			try{
			findPersistanceClass(masterPk_.getPath().get(0).getType());
			}catch(RepositoryException e){
				return false;
			}
			
			try{
			findPersistanceClass(detailPk_.getPath().get(detailPk_.getPath().size()-1).getType());
			return false;
			}catch(RepositoryException e){
			}
			
		}

		if (cmdType.equals(RepositoryCommandType.connectDetailToMaster )) {
			if (detailPk_.getPath().size() != 1){
				return false;
			}
			try{
			findPersistanceClass(detailPk_.getPath().get(0).getType());
			}catch(RepositoryException e){
				return false;
			}
			
			try{
			findPersistanceClass(masterPk_.getPath().get(detailPk_.getPath().size()-1).getType());
			return false;
			}catch(RepositoryException e){
			}
		}
		
		try{
		setMasterPk(getPrimaryKey(masterPk_));
		setMasterProperty(masterProperty_);
		setMasterClassName(getPersistanceClassName(masterPk_));
		setDetailPk(getPrimaryKey(detailPk_));
		setDetailClassName(getPersistanceClassName(detailPk_));
		setDetailPropery(detailProperty_);
		setCmdType(cmdType);
		
		}catch(Exception e){
			throw new RepositoryException(e);
		}

		return true;
	}

}
