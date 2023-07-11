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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.StorageCommandProcessor;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryData;

public class CpaStorageUpdater implements StorageCommandProcessor, Serializable {

	private static final long serialVersionUID = -1689224604816572773L;
	private SpaObjectRegistry spaRegistry;
	@SuppressWarnings("unused")
	private Registry registry;
	private SpaRepositoryData spaRepositoryData;
	public static String KEY_PROXY_REPOSITORY = "proxy-repository";

	public void setRegistry(SpaObjectRegistry spaRegistry, Registry registry) {
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	@Override
	public List<Object> process(SpaRepositoryData spaRepositoryData) throws Exception {
		this.spaRepositoryData = spaRepositoryData;
		persistCachedObjects();
		return null;
	}

	public SpaRepositoryData getSpaRepositoryData() {
		return spaRepositoryData;
	}

	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}

	private void persistCachedObjects() throws Exception {
		List<SpaControl> preparedObjects = getListOfPreparedObjects();

		for (SpaControl control : preparedObjects) {
			completeCommand(control);
		}
	}

	private void completeCommand(SpaControl control) throws Exception {
		CRUDProvider provider = findCRUDProvider(control);
		provider.execute(control);
	}

	private CRUDProvider findCRUDProvider(SpaControl obj) throws Exception {
		Class<?> clazz = Class.forName(obj.getType());
		CRUDProvider provider = spaRegistry.getRegistry(obj.getRegistryName()).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		provider.setKeyMapper(spaRepositoryData.getKeyMapper());

		return provider;
	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();

		for (String h : spaRepositoryData.getCache().keySet()) {
			Map<Object, SpaControl> typedList = spaRepositoryData.getCache().get(h);
			list.addAll(typedList.values());
		}
		list.addAll(spaRepositoryData.getNomergeRules());

		Collections.sort(list, new Comparator<SpaControl>() {

			@Override
			public int compare(SpaControl o1, SpaControl o2) {
				return o1.compareTo(o2);
			}
		});
		return list;
	}

}
