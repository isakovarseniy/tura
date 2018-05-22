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
package org.tura.platform.repository.test.spa;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.CommandProducer;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;

public class SPACommandProducer implements CommandProducer {

	@Override
	public List<Object> removeObject(Object repositoryObject) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		RemoveObjectData data = new RemoveObjectData();
		data.setObject(repositoryObject);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		RemoveInternalData data = new RemoveInternalData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailObject(detailObject);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> addObject(Object repositoryObject) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		AddObjectData data = new AddObjectData();
		data.setObject(repositoryObject);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		AddInternalData data = new AddInternalData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailObject(detailObject);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		DisconnectData data = new DisconnectData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailPk(detailPk);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		DisconnectData data = new DisconnectData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailPk(detailPk);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		ConnectData data = new ConnectData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailPk(detailPk);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		ConnectData data = new ConnectData();
		data.setMasterPk(masterPk);
		data.setMasterProperty(masterProperty);
		data.setDetailPk(detailPk);
		data.setDetailProperty(detailProperty);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> update(RepoKeyPath pk, String property, Object value) throws RepositoryException {
		List<Object> list = new ArrayList<>();
		UpdateObjectData data = new UpdateObjectData();
		data.setPk(pk);
		data.setProperty(property);
		data.setValue(value);
		list.add(data);
		return list;
	}

}
