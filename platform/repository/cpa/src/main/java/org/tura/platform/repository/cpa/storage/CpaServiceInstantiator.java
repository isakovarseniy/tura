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

package org.tura.platform.repository.cpa.storage;

import java.util.Arrays;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class CpaServiceInstantiator implements Instantiator {

	private SpaObjectRegistry spaRegistry;
	private String registryName;
	private Registry registry;
	private CpaStorageProvider cpaStoragesProvider;

	private static String[] knownObjects = new String[] { CpaCRUDService.class.getName(),
			CpaSearchService.class.getName(), };

	public CpaServiceInstantiator(SpaObjectRegistry spaRegistry, String registryName, Registry registry,
			CpaStorageProvider cpaStoragesProvider) {
		this.spaRegistry = spaRegistry;
		this.registryName = registryName;
		this.registry = registry;
		this.cpaStoragesProvider = cpaStoragesProvider;
	}


	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(String className) {
		try {
			return (T) newInstance(Class.forName(className));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (CpaSearchService.class.equals(clazz)) {
			return (T) new CpaSearchService(spaRegistry, registryName, registry, cpaStoragesProvider.getStorage());
		}
		if (CpaCRUDService.class.equals(clazz)) {
			return (T) new CpaCRUDService(spaRegistry, registryName, registry,cpaStoragesProvider.getStorage());
		}

		throw new RuntimeException("Unknown class " + clazz);
	}

	@Override
	public boolean check(Class<?> clazz) {
		return check(clazz.getName());
	}

	@Override
	public boolean check(String clazzName) {
		return Arrays.asList(knownObjects).contains(clazzName);
	}

}
