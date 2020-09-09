/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

public class JpaConnectMasterToDetailOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -4327077827556937113L;
	Object masterPk;
	String masterClassName;
	String masterProperty;
	Object detailPk;
	String detailClassName;
	String relation;
	String repositoryType;
	String masterRepositortClassName;

	public JpaConnectMasterToDetailOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
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

	public String getMasterRepositortClassName() {
		return masterRepositortClassName;
	}

	public void setMasterRepositortClassName(String masterRepositortClassName) {
		this.masterRepositortClassName = masterRepositortClassName;
	}

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {

			SearchProvider sp = this.providerHash.get(getMasterClassName());
			Object master = sp.find(getMasterPk(), getMasterClassName());

			RelOperation operation = PersistanceRelationBuilder.build(getRelation());

			JpaControl masterControl = new JpaControl(master, getMasterPk(), OperationLevel.CONNECT,registryName);
			masterControl.setDetailPk(getDetailPk());
			masterControl.setMasterProperty(getMasterProperty());
			masterControl.setOperation(operation);
			masterControl.setDetailType(getDetailClassName());

			List<SpaControl> list = new ArrayList<>();
			list.add(masterControl);
			return list;

		} catch (Exception e) {
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
			setMasterClassName(getJpaPersistanceClassName(masterPk_));
			setRelation(getJpaRelationType(masterPk_, masterProperty_));
			setDetailPk(getJpaPrimaryKey(detailPk_));
			setDetailClassName(getJpaPersistanceClassName(detailPk_));

			setMasterRepositortClassName(getJpaRepositoryClassName(masterPk_));

			this.knownObjects.add(getMasterClassName());
			this.knownObjects.add(getDetailClassName());

			return true;
		} catch (Exception e) {
			throw new RepositoryException(e);

		}
	}

}
