/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.data.UpdateObjectData;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class BasicRepository extends RepositoryHelper implements Repository {

	private Registry registry;

	public BasicRepository(Registry registry) {
		super(registry);
		this.registry = registry;
	}


	private TransactionAdapter getTransactrionAdapter() throws RepositoryException {
		TransactionAdapter ta = registry.getTransactrionAdapter();
		if (ta == null) {
			throw new RepositoryException("Transaction adapter is not initailizated");
		}
		return ta;
	}

	public Object create(String repositoryClass) throws RepositoryException {
		try {
			findPersistanceClass(repositoryClass);
			Object repositoryObject = Class.forName(repositoryClass).newInstance();

			PrImaryKeyStrategy prImaryKeyStrategy = findPrImaryKeyStrategy();
			if (prImaryKeyStrategy != null) {
				prImaryKeyStrategy.generatePk(repositoryObject);
			}

			PostCreateTrigger trigger = findPostCreateTrigger(repositoryClass);
			if (trigger != null) {
				trigger.postCreate(repositoryObject);
			}

			return repositoryObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	private PrImaryKeyStrategy findPrImaryKeyStrategy() {
		return registry.getPrImaryKeyStrategy();
	}

	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String repositoryClass) throws RepositoryException {

		try {
			Repository provider = findProvider(repositoryClass);
			Class<?> persistanceClass = findPersistanceClass(repositoryClass);

			List<SearchCriteria> newSearch = prepareSearchCriteria(searchCriteria);
			
			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(repositoryClass);
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(newSearch, orderCriteria);
			}

			SearchResult result = provider.find(newSearch, orderCriteria, startIndex, endIndex,
					persistanceClass.getName());

			List<Object> records = new ArrayList<>();

			for (Object object : result.getSearchResult()) {
				Map<String, Object> context = new HashMap<>();
				RepositoryObjectLoader loader = new RepositoryObjectLoader(searchCriteria, orderCriteria, context,registry);
				records.add(loader.loader(object, getPersistancePrimaryKey(object), Class.forName(repositoryClass) ,new ObjectGraph()));

				@SuppressWarnings("unchecked")
				List<Rule> rules = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
				if (rules != null) {
					for (Rule rule : rules) {
						rule.execute();
					}
				}

			}
			result.setSearchResult(records);

			return result;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}
	
	private List<SearchCriteria> prepareSearchCriteria(List<SearchCriteria> search) {
		List<SearchCriteria> newSearch = new ArrayList<>();
		for (SearchCriteria sc : search){
			if (sc.getParentClass() == null && sc.getProperty() == null){
				newSearch.add(sc);
			}
		}
		
		return newSearch;
	}	

	@SuppressWarnings("rawtypes")
	public void applyChanges(List changes) throws RepositoryException {
		try {
			getTransactrionAdapter().begin();

			for (Object change : changes) {
				if (change instanceof AddContainmentObjectData) {
					new RepositoryObjectInstaller(registry).add((AddContainmentObjectData) change);
					continue;
				}
				if (change instanceof AddObjectData) {
					new RepositoryObjectInstaller(registry).add((AddObjectData) change);
					continue;
				}

				if (change instanceof AddTopObjectData) {
					new RepositoryObjectInstaller(registry).add((AddTopObjectData) change);
					continue;
				}

				if (change instanceof RemoveContainmentObjectData) {
					new RepositoryObjectRemover(registry).remove((RemoveContainmentObjectData) change);
					continue;
				}

				if (change instanceof RemoveObjectData) {
					new RepositoryObjectRemover(registry).remove((RemoveObjectData) change);
					continue;
				}

				if (change instanceof RemoveTopObjectData) {
					new RepositoryObjectRemover(registry).remove((RemoveTopObjectData) change);
					continue;
				}

				if (change instanceof UpdateObjectData) {
					new RepositoryObjectUpdate(registry).update((UpdateObjectData) change);
					continue;
				}

			}
			getTransactrionAdapter().commit();

		} catch (Exception e) {
			try {
				getTransactrionAdapter().rollback();
			} catch (Exception e1) {
			}
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

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

}
