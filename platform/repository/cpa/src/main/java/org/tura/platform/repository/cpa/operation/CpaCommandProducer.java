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

package org.tura.platform.repository.cpa.operation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;

public class CpaCommandProducer implements  Serializable{

	private static final long serialVersionUID = 6820889754352511382L;

	private SearchProvider searchProvider;
	
	public CpaCommandProducer(SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}

	public List<CpaRepositoryCommand> removeObject(Object repositoryObject) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<CpaRepositoryCommand> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<CpaRepositoryCommand> list = new ArrayList<>();
		CpaRepositoryCommand cmd = new CpaRemoveInternalOperation(searchProvider);
		cmd.checkCommand(RepositoryCommandType.removeInternal, masterPk,masterProperty,detailObject,detailProperty);
		list.add( cmd);
		return list;
	}

	public List<CpaRepositoryCommand> addObject(Object repositoryObject) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<CpaRepositoryCommand> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) throws RepositoryException {
		List<CpaRepositoryCommand> list = new ArrayList<>();
		CpaRepositoryCommand cmd = new CpaAddInternalOperation(searchProvider);
		cmd.checkCommand(RepositoryCommandType.addInternal, masterPk,masterProperty,detailObject,detailProperty);
		list.add( cmd );
		return list;
	}

	public List<CpaRepositoryCommand> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<CpaRepositoryCommand> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<CpaRepositoryCommand> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	public List<CpaRepositoryCommand> update(RepoKeyPath pk, String property, Object value) throws RepositoryException {
		List<CpaRepositoryCommand> list = new ArrayList<>();
		CpaRepositoryCommand cmd = new CpaUpdateOperation(searchProvider);
		cmd.checkCommand(RepositoryCommandType.update, pk,property,value);
		list.add( cmd );
		return list;
	}

}
