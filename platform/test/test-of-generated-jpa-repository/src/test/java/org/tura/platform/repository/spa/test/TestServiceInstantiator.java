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
package org.tura.platform.repository.spa.test;

import java.util.Arrays;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class TestServiceInstantiator implements Instantiator{

	private static String[] knownObjects = new String[] { 
			CRUDService.class.getName(),
			SearchService.class.getName()
			};
	
	
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	
	public TestServiceInstantiator(Registry registry, SpaObjectRegistry spaRegistry){
		this.registry = registry;
		this.spaRegistry=spaRegistry;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (CRUDService.class.equals(clazz)){
			return (T) new CRUDService();
		}
		if (SearchService.class.equals(clazz)) {
			return (T) new SearchService(registry, spaRegistry);
		}

		return null;
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
