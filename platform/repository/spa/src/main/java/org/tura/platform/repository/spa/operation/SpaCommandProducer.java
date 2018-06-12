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
package org.tura.platform.repository.spa.operation;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.CommandProducer;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class SpaCommandProducer implements CommandProducer{

	private String registry;
	Repository masterProvider;
	Repository detailProvider;

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


	public SpaCommandProducer(String registry) {
		this.registry = registry;
	}

	
	@Override
	public List<Object> removeObject(Object repositoryObject) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.removeObject, repositoryObject);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaRemoveObjectOperation();
		cmd.checkCommand(RepositoryCommandType.removeObject, repositoryObject);
		list.add( cmd);
		return list;
	}

	@Override
	public List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.removeInternal, masterPk,masterProperty,detailObject,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaRemoveInternalOperation();
		cmd.checkCommand(RepositoryCommandType.removeInternal, masterPk,masterProperty,detailObject,detailProperty);

		list.add( cmd);
		return list;
	}

	@Override
	public List<Object> addObject(Object repositoryObject) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.addObject, repositoryObject);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaAddObjectOperation();
		cmd.checkCommand(RepositoryCommandType.addObject, repositoryObject);
		list.add( cmd );
		return list;
	}

	@Override
	public List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.addInternal, masterPk,masterProperty,detailObject,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaAddInternalOperation();
		cmd.checkCommand(RepositoryCommandType.addInternal, masterPk,masterProperty,detailObject,detailProperty);
		list.add( cmd );
		return list;
	}

	@Override
	public List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.disconnectMasterFromDetail, masterPk,masterProperty,detailPk,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaDisconnectMasterFromDetailOperation();
		cmd.checkCommand(RepositoryCommandType.disconnectMasterFromDetail, masterPk,masterProperty,detailPk,detailProperty);
		list.add( cmd );
		return list;
	}

	@Override
	public List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.disconnectDetailFromMaster, masterPk,masterProperty,detailPk,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaDisconnectDetailFromMasterOperation();
		cmd.checkCommand(RepositoryCommandType.disconnectDetailFromMaster, masterPk,masterProperty,detailPk,detailProperty);
		list.add(cmd );
		return list;
	}

	@Override
	public List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.connectMasterToDetail, masterPk,masterProperty,detailPk,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaConnectMasterToDetailOperation();
		cmd.checkCommand(RepositoryCommandType.connectMasterToDetail, masterPk,masterProperty,detailPk,detailProperty);
		list.add( cmd);
		return list;
	}

	@Override
	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.connectDetailToMaster, masterPk,masterProperty,detailPk,detailProperty);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaConnectDetailToMasterOperation();
		cmd.checkCommand(RepositoryCommandType.connectDetailToMaster, masterPk,masterProperty,detailPk,detailProperty);

		list.add( cmd);
		return list;
	}

	@Override
	public List<Object> update(RepoKeyPath pk, String property, Object value) throws RepositoryException {
		List<Object> list =   SpaObjectRegistry.getInstance().getRegistry(registry).findCommand(RepositoryCommandType.update, pk,property,value);
		if (list  != null && list.size() > 0  ){
			return  list;
		}
		list = new ArrayList<>();
		SpaRepositoryCommand cmd = new SpaUpdateOperation();
		cmd.checkCommand(RepositoryCommandType.update, pk,property,value);
		list.add( cmd );
		return list;
	}

}
