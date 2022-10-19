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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.ObjectProfileCriteria;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.CommandLifecycle.LifecycleReturn;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddLinkData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.data.UpdateObjectData;
import org.tura.platform.repository.spa.SpaRepositoryData;
import org.tura.platform.repository.triggers.PostCreateTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class BasicRepository extends RepositoryHelper implements Repository {

	private static final long serialVersionUID = 6266970411524948146L;

	private Registry registry;

	public BasicRepository() {

	}

	public BasicRepository(Registry registry) {
		super(registry);
		this.registry = registry;
	}

	private TransactionAdapter getTransactionAdapter() throws RepositoryException {
		TransactionAdapter ta = registry.getTransactrionAdapter();
		if (ta == null) {
			throw new RepositoryException("Transaction adapter is not initailizated");
		}
		return ta;
	}

	public <T>T create(Class<T> repositoryClass) throws RepositoryException {
		try {
			findPersistanceClass(repositoryClass.getName());
			T repositoryObject =repositoryClass.getDeclaredConstructor().newInstance();

			PrImaryKeyStrategy prImaryKeyStrategy = findPrImaryKeyStrategy();
			if (prImaryKeyStrategy != null) {
				prImaryKeyStrategy.generatePk(repositoryObject);
			}

			PostCreateTrigger trigger = findPostCreateTrigger(repositoryClass.getName());
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

	public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> repositoryClass) throws RepositoryException {

		try {
			
			SpaRepositoryData spaRepositoryData = new SpaRepositoryData();
			
			Repository provider = findProvider(repositoryClass.getName(),spaRepositoryData);
			Class<?> persistanceClass = findPersistanceClass(repositoryClass.getName());

			List<SearchCriteria> newSearch = prepareSearchCriteria(searchCriteria);
			List<OrderCriteria> newOrder = prepareOrderCriteria(orderCriteria);

			ObjectGraphProfile profile = loadProfile(newSearch);

			PreQueryTrigger preQueryTrigger = findPreQueryTrigger(repositoryClass);
			if (preQueryTrigger != null) {
				preQueryTrigger.preQueryTrigger(newSearch, newOrder);
			}

			SearchResult<?> result = provider.find(newSearch, newOrder, startIndex, endIndex, persistanceClass);

			List<T> records = new ArrayList<>();

			for (Object object : result.getSearchResult()) {
				Map<String, Object> context = new HashMap<>();
				RepositoryObjectLoader loader = new RepositoryObjectLoader(registry,spaRepositoryData);
				loader.setOrderCriteria(orderCriteria);
				loader.setSearchCriteria(searchCriteria);
				loader.setContext(context);
				records.add((T) loader.loader(object, getPersistancePrimaryKey(object), repositoryClass,
						new ObjectGraph(), profile));

				@SuppressWarnings("unchecked")
				List<Rule> rules = (List<Rule>) context.get(RepositoryObjectLoader.RULES_LIST);
				if (rules != null) {
					for (Rule rule : rules) {
						rule.execute();
					}
				}
			}
			return new SearchResult<>(records, result.getNumberOfRows());

		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	private ObjectGraphProfile loadProfile(List<SearchCriteria> searchCriteria) {
		ObjectGraphProfile profile = new ObjectGraphProfile();
		SearchCriteria s = null;
		for (SearchCriteria sc : searchCriteria) {
			if (sc instanceof ObjectProfileCriteria) {
				profile = findProfileImplementation(((ObjectProfileCriteria) sc).getProfile());
				s = sc;
				break;
			}
		}
		if (s != null) {
			searchCriteria.remove(s);
		}
		return profile;
	}

	private List<SearchCriteria> prepareSearchCriteria(List<SearchCriteria> search) {
		List<SearchCriteria> newSearch = new ArrayList<>();
		for (SearchCriteria sc : search) {
			if (sc.getParentClass() == null && sc.getProperty() == null) {
				newSearch.add(sc);
			}
		}

		return newSearch;
	}

	private List<OrderCriteria> prepareOrderCriteria(List<OrderCriteria> search) {
		List<OrderCriteria> newOrder = new ArrayList<>();
		for (OrderCriteria sc : search) {
			if (sc.getParentClass() == null && sc.getProperty() == null) {
				newOrder.add(sc);
			}
		}

		return newOrder;
	}

	public List<Object> applyChanges(List<Object> changes) throws RepositoryException {
		CommandLifecycle cl = getCommandLifecycle();
		SpaRepositoryData spaRepositoryData = new SpaRepositoryData();
		
		try {
			cl.beforeTransaction();
			getTransactionAdapter().begin();

			changes = cl.preprocessChangeSequence(changes);

			for (Object change : changes) {
				LifecycleReturn lf = cl.preprocess(change);
				if (LifecycleReturn.Skip.equals(lf)) {
					continue;
				}
				if (LifecycleReturn.Break.equals(lf)) {
					break;
				}
				if (LifecycleReturn.Error.equals(lf)) {
					throw cl.getException();
				}

				try {

					if (change instanceof AddContainmentObjectData) {
						 new RepositoryObjectInstaller(registry,spaRepositoryData) .add((AddContainmentObjectData) change);
						continue;
					}
					if (change instanceof AddObjectData) {
						new RepositoryObjectInstaller(registry,spaRepositoryData).add((AddObjectData) change);
						continue;
					}

					if (change instanceof AddTopObjectData) {
						new RepositoryObjectInstaller(registry,spaRepositoryData).add((AddTopObjectData) change);
						continue;
					}

					if (change instanceof RemoveContainmentObjectData) {
						new RepositoryObjectRemover(registry,spaRepositoryData).remove((RemoveContainmentObjectData) change);
						continue;
					}

					if (change instanceof RemoveObjectData) {
						new RepositoryObjectRemover(registry,spaRepositoryData).remove((RemoveObjectData) change);
						continue;
					}

					if (change instanceof RemoveTopObjectData) {
						new RepositoryObjectRemover(registry,spaRepositoryData).remove((RemoveTopObjectData) change);
						continue;
					}

					if (change instanceof UpdateObjectData) {
						new RepositoryObjectUpdate(registry,spaRepositoryData).update((UpdateObjectData) change);
						continue;
					}
					
					if (change instanceof AddLinkData) {
						new RepositoryObjectLinker(registry,spaRepositoryData).linkObjects((AddLinkData) change);
						continue;
					}

					
				} finally {
					lf = cl.postprocess(change);
					if (LifecycleReturn.Break.equals(lf)) {
						break;
					}
					if (LifecycleReturn.Error.equals(lf)) {
						throw cl.getException();
					}
				}

			}
			List<Object> response = registry.getStorageCommandProcessor().process(spaRepositoryData);

			cl.beforeCommit();
			getTransactionAdapter().commit();
			cl.afterCommit();

			return response;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				cl.beforeRollback();
				getTransactionAdapter().rollback();
				cl.afterRollback();
			} catch (Exception e1) {
			}
			throw new RepositoryException(e);
		}
	}


	@Override
	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

}
