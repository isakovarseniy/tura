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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.CommandProducer;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;
import org.tura.platform.repository.spa.SpaRepositoryData;

public class CpaCommandProducer implements CommandProducer {

	private static final long serialVersionUID = 1874197683177283326L;
	private String registryName;
	private Repository masterProvider;
	private Repository detailProvider;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private Map<String,Object> params;
	private SpaRepositoryData spaRepositoryData;
	

	public CpaCommandProducer(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		this.registryName = registryName;
		this.spaRegistry = spaRegistry;
		this.registry = registry;

	}
	
	
	@Override
	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}

	public Repository getMasterProvider() {
		return masterProvider;
	}

	public void setMasterProvider(Repository masterProvider) {
		this.masterProvider = masterProvider;
	}

	public Repository getDetailProvider() {
		return detailProvider;
	}

	public void setDetailProvider(Repository detailProvider) {
		this.detailProvider = detailProvider;
	}

	@Override
	public List<Object> removeObject(Object repositoryObject) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,RepositoryCommandType.removeObject,
				repositoryObject);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaRemoveObjectOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.removeObject, repositoryObject);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,RepositoryCommandType.removeInternal,
				masterPk, masterProperty, detailObject, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaRemoveInternalOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.removeInternal, masterPk, masterProperty, detailObject, detailProperty);

		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> addObject(Object repositoryObject) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,RepositoryCommandType.addObject,
				repositoryObject);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaAddObjectOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.addObject, repositoryObject);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,RepositoryCommandType.addInternal,
				masterPk, masterProperty, detailObject, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaAddInternalOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.addInternal, masterPk, masterProperty, detailObject, detailProperty);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {

		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,
				RepositoryCommandType.disconnectMasterFromDetail, masterPk, masterProperty, detailPk, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaDisconnectMasterFromDetailOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.disconnectMasterFromDetail, masterPk, masterProperty, detailPk,
				detailProperty);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,
				RepositoryCommandType.disconnectDetailFromMaster, masterPk, masterProperty, detailPk, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaDisconnectDetailFromMasterOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.disconnectDetailFromMaster, masterPk, masterProperty, detailPk,
				detailProperty);
		list.add(cmd);
		return list;

	}

	@Override
	public List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,
				RepositoryCommandType.connectMasterToDetail, masterPk, masterProperty, detailPk, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaConnectMasterToDetailOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.connectMasterToDetail, masterPk, masterProperty, detailPk,
				detailProperty);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,
				RepositoryCommandType.connectDetailToMaster, masterPk, masterProperty, detailPk, detailProperty);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaConnectDetailToMasterOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.connectDetailToMaster, masterPk, masterProperty, detailPk,
				detailProperty);
		list.add(cmd);
		return list;

	}

	@Override
	public List<Object> update(RepoKeyPath pk, String property, Object value, String valueType) throws RepositoryException {
		List<Object> list = spaRegistry.getRegistry(registryName).findCommand(spaRepositoryData, params,RepositoryCommandType.update, pk,
				property, value);
		if (list != null && list.size() > 0) {
			return list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new CpaUpdateOperation(registry, spaRegistry);
		cmd.setRegistryName(registryName);
		cmd.setParams(params);
		cmd.setSpaRepositoryData(spaRepositoryData);
		cmd.checkCommand(RepositoryCommandType.update, pk, property, value,valueType);
		list.add(cmd);
		return list;
	}

	@Override
	public List<Object> link(RepoKeyPath masterPk, RepoKeyPath detailPk, List<List<String>> links)
			throws RepositoryException {
		return new ArrayList<>();
	}

	@Override
	public void setCallParams(Map<String, Object> params) {
		this.params = params;
	}

}
