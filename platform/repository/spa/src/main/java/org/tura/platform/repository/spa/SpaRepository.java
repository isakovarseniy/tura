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
package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.BeforeBeginTransaction;
import org.tura.platform.repository.core.BeforeCommitTransaction;
import org.tura.platform.repository.core.BeforeRollbackTransaction;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryEvent;
import org.tura.platform.repository.core.RepositoryEventsListener;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.triggers.PostCreateTrigger;

public class SpaRepository implements Repository, RepositoryEventsListener {

	private Map<String, Map<Object, SpaControl>> cache = new HashMap<>();
	private int sequence;
	private String registry;

	public SpaRepository(String registry) {
		this.registry = registry;
	}

	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(objectClass);
			if (trigger != null) {
				trigger.postCreate(obj);
			}
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		try {
			SearchProvider provider = findSearchProvider(objectClass);
			return provider.find(searchCriteria, orderCriteria, startIndex, endIndex);
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void applyChanges(List changes) throws RepositoryException {
		try {
			for (Object change : changes) {
				if (change instanceof SpaRepositoryCommand) {
					throw new RepositoryException(change.getClass().getName() + " is not an instance of "
							+ SpaRepositoryCommand.class.getName());
				}
				SpaRepositoryCommand cmd = (SpaRepositoryCommand) change;
				List<String> listOfKnownObjects = cmd.getListOfKnownObjects();
				injectSearchProviders(cmd, listOfKnownObjects);
				cmd.setRegistry(registry);
				List<SpaControl> objects = cmd.prepare();
				populateCache(objects);
			}

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public void notify(RepositoryEvent event) throws Exception {
		if (event instanceof BeforeBeginTransaction) {
			cleanupCache();
		}
		if (event instanceof BeforeRollbackTransaction) {
			cleanupCache();
			rallback();
		}
		if (event instanceof BeforeCommitTransaction) {
			persistCachedObjects();
			cleanupCache();
		}
	}

	private void persistCachedObjects() throws Exception {
		List<SpaControl> preparedObjects = getListOfPreparedObjects();
		for (SpaControl control : preparedObjects) {
			CRUDProvider provider = findCRUDProvider(control);
			provider.execute(control);
		}
	}

	private CRUDProvider findCRUDProvider(SpaControl obj) throws Exception {
		Class<?> clazz = Class.forName(obj.getType());
		CRUDProvider provider = SpaObjectRegistry.getInstance().getRegistry(registry).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		return provider;
	}

	private void populateCache(List<SpaControl> list) throws RepositoryException {
		for (SpaControl control : list) {
			control.setSequence(sequence++);

			Map<Object, SpaControl> listOfObjectsPerType = (Map<Object, SpaControl>) cache.get(control.getType());
			if (listOfObjectsPerType == null) {
				listOfObjectsPerType = new HashMap<>();
				cache.put(control.getType(), listOfObjectsPerType);
			}
			SpaControl preparedObject = (SpaControl) listOfObjectsPerType.get(control.getKey());
			if (preparedObject == null) {
				listOfObjectsPerType.put(control.getKey(), control);
			} else {
				merge(listOfObjectsPerType, preparedObject, control);
			}
		}
	}

	private void injectSearchProviders(SpaRepositoryCommand cmd, List<String> listOfKnownObjects) throws Exception {
		for (String className : listOfKnownObjects) {
			SearchProvider provider = findSearchProvider(className);
			cmd.addSearchProvider(className, provider);
		}
	}

	private void cleanupCache() {
		cache.clear();
		sequence = 0;
	}

	private void rallback() {
		cleanupCache();
	}

	private PostCreateTrigger findPostCreateTrigger(String objectClass) throws Exception {
		return SpaObjectRegistry.getInstance().getRegistry(registry).findPostCreateTrigger(objectClass);
	}

	private SearchProvider findSearchProvider(String className) throws Exception {
		SearchProvider provider = SpaObjectRegistry.getInstance().getRegistry(registry).findSearchProvider(className);
		if (provider == null) {
			throw new RepositoryException("Cannot find  SearchProvider for class " + className);
		}
		return provider;

	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();

		for (String h : cache.keySet()) {
			Map<Object, SpaControl> typedList = cache.get(h);
			list.addAll(typedList.values());
		}
		Collections.sort(list, new Comparator<SpaControl>() {

			@Override
			public int compare(SpaControl o1, SpaControl o2) {
				return o1.compareTo(o2);
			}
		});
		return null;
	}

	private void merge(Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control)
			throws RepositoryException {
		preparedObject.getLevel().getRule().merge(listOfObjectsPerType, preparedObject, control);
	}

}
