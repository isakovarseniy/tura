/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer;

import java.util.Arrays;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class DomainServicesInstantiator implements Instantiator {


	  private Registry registry;
	  private SpaObjectRegistry spaRegistry;
	  private String registryName;

	  public DomainServicesInstantiator(Registry registry, SpaObjectRegistry spaRegistry, String registryName) {
	    this.spaRegistry = spaRegistry;
	    this.registry = registry;
	    this.registryName = registryName;
	  }
	
		private static String[] knownObjects = new String[] { 
				DomainCRUDService.class.getName(),
				DomainSearchService.class.getName()
	};

	@Override
	public <T> T newInstance(String className) {
		throw new RuntimeException("Unknown class " + className);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (DomainCRUDService.class.equals(clazz)){
			DomainCRUDService crudService = new DomainCRUDService(spaRegistry, registryName, registry);
			crudService.setPkStartegy(new UUIPrimaryKeyStrategy());
			return (T) crudService;
		}
		if (DomainSearchService.class.equals(clazz)) {
			return (T) new DomainSearchService(spaRegistry, registryName, registry);
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

