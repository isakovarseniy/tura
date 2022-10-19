/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommandProducer  extends Serializable , SpaRepositoryDataAware{

	List<Object> removeObject( Object repositoryObject) throws RepositoryException;
	List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty) throws RepositoryException;
	List<Object> addObject( Object repositoryObject) throws RepositoryException;
	List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty) throws RepositoryException;;
	List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty) throws RepositoryException;
	List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty) throws RepositoryException;
	List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty) throws RepositoryException;
	List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty) throws RepositoryException;
	List<Object> update(RepoKeyPath pk, String property, Object value, String valueType) throws RepositoryException;
	List<Object> link(RepoKeyPath masterPk, RepoKeyPath detailPk,List<List<String>> links) throws RepositoryException;
	
	
	void setMasterProvider(Repository masterProvider);
	void setDetailProvider(Repository detailProvider);
	void setCallParams( Map<String,Object> params);

	
}
