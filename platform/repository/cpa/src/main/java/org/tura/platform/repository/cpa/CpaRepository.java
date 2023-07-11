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

package org.tura.platform.repository.cpa;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public interface CpaRepository extends ProxyFactory, ProxyRepositoryInterface {

	public Repository getTransport();

	public void setTransport(Repository transport);

	public Registry getRegistry();

	public void setRegistry(Registry registry);

	public CpaStorageProvider getStorageProvider();

	public void setStorageProvider(CpaStorageProvider storageProvider);

	public void setProfile(String profile);

	public <T> T create(Class<T> objectClass) throws RepositoryException;

	public void setStackProvider(ProxyCommadStackProvider stackProvider);

	public ProxyCommadStackProvider getStackProvider();

	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException;

	public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException;

	public List<Object> applyChanges(List<Object> changes) throws RepositoryException;

	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException;

	public <T> T load(Object obj, Class<T> objectClass) throws RepositoryException;

	public RepoKeyPath getInternalPath(String cpaid);

	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException;
	
	public void addReadOnlyRefreshRule(Class<?>  clazz ,  RefreshRule rule);

	public Repository getLocalRepository();
	
	public  List<String> getTopObjects();

	public  List<String> getInstantiable();
	
	public  List<String> getNotInstantiable();
	
}
