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
package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.RelEnum;
import org.tura.platform.repository.persistence.RelOperation;

public class DefaultDisconnectMasterFromDetailOperation extends JPAOperation {

	EntityManager em;
	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String detailClassName;
	String relation;

	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
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

	public void execute() throws Exception {
		Object master = em.find(Class.forName(getMasterClassName()), getMasterPk());
		Object detail = em.find(Class.forName(getDetailClassName()), getDetailPk());

		if (master == null || detail == null) {
			// Seems objects already disconnected and removed previosly
			return;
		}

		RelOperation operation = RelEnum.valueOf(getRelation()).getOperation();
		operation.disconnect(master, detail, getMasterProperty());

	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		try {
			RepoKeyPath masterPk_ = (RepoKeyPath) parameters[0];
			String masterProperty_ = (String) parameters[1];
			RepoKeyPath detailPk_ = (RepoKeyPath) parameters[2];

			setMasterPk(getPrimaryKey(masterPk_));
			setMasterProperty(masterProperty_);
			setRelation(getRelationType(masterPk_, masterProperty_));
			setMasterClassName(getPersistanceClassName(masterPk_));
			setDetailPk(getPrimaryKey(detailPk_));
			setDetailClassName(getPersistanceClassName(detailPk_));

			return true;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}
