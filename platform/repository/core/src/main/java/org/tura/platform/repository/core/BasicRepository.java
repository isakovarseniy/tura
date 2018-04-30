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
package org.tura.platform.repository.core;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class BasicRepository implements Repository {

	private PersistenceProvider findProvider(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findProvider(repositoryClass);
	}

	private Class<?> findPersistanceClass(String repositoryClass) throws RepositoryException {
		try {
			return Class.forName(Registry.getInstance().findPersistanceClass(repositoryClass));
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findPostCreateTrigger(repositoryClass);
	}

	private PreQueryTrigger findPreQueryTrigger(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findPreQueryTrigger(repositoryClass);
	}

	public Object create(String repositoryClass) throws RepositoryException {
		try {
			findPersistanceClass(repositoryClass);
			Object repositoryObject = Class.forName(repositoryClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(repositoryClass);
			if (trigger != null) {
				trigger.postCreate(repositoryObject);
			}
			return repositoryObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String repositoryClass) throws RepositoryException {

		try {
			PersistenceProvider provider = findProvider(repositoryClass);
			Class<?> persistanceClass = findPersistanceClass(repositoryClass);
			
			PreQueryTrigger preQueryTrigger =   findPreQueryTrigger(repositoryClass);
			if (preQueryTrigger != null){
				preQueryTrigger.preQueryTrigger(searchCriteria, orderCriteria);
			}

			List<?> list = provider.findObjects(searchCriteria, orderCriteria, startIndex, endIndex, persistanceClass);
			Long numberOfRows = provider.findNumberOfRowsQuery(searchCriteria, orderCriteria);

			List<Object> records = new ArrayList<>();

			for (Object object : list) {
				RepositoryObjectLoader loader = new RepositoryObjectLoader(searchCriteria, orderCriteria);
				records.add(loader.loader(object, persistanceClass));
			}

			return new SearchResult(records, numberOfRows);

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void applyChanges(List changes) throws RepositoryException {
		try {
			for (Object change : changes) {
				DataProvider provider = cmdHash.get(change.getClass().getName());
				Command cmd = provider.getCommand(change.getClass().getName());
				cmd.execute(change);
			}
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void insert(Object obj, String objectClass) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void remove(Object obj, String objectClass) {
		throw new UnsupportedOperationException();

	}

}
