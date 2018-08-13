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
package org.tura.platform.repository.jpa.operation;

import java.util.Arrays;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class JpaOperationsInstantiator implements Instantiator {

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

	public JpaOperationsInstantiator(Registry registry, SpaObjectRegistry spaRegistry) {
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	private static String[] knownObjects = new String[] { 
			JpaAddObjectOperation.class.getName(),
			JpaConnectDetailToMasterOperation.class.getName(), 
			JpaConnectMasterToDetailOperation.class.getName(),
			JpaDisconnectDetailFromMasterOperation.class.getName(),
			JpaDisconnectMasterFromDetailOperation.class.getName(),
			JpaExternalConnectDetailToMasterOperation.class.getName(),
			JpaExternalConnectMasterToDetailOperation.class.getName(),
			JpaExternalDisconnectDetailFromMasterOperation.class.getName(),
			JpaExternalDisconnectMasterFromDetailOperation.class.getName(), 
			JpaRemoveObjectOperation.class.getName(),
			JpaUpdateOperation.class.getName() 
			};

	@SuppressWarnings("unchecked")
	@Override
	public <T> T newInstance(Class<T> clazz) {
		if (JpaAddObjectOperation.class.equals(clazz)) {
			return (T) new JpaAddObjectOperation(registry, spaRegistry);
		}

		if (JpaConnectDetailToMasterOperation.class.equals(clazz)) {
			return (T) new JpaConnectDetailToMasterOperation(registry, spaRegistry);
		}
		if (JpaConnectMasterToDetailOperation.class.equals(clazz)) {
			return (T) new JpaConnectMasterToDetailOperation(registry, spaRegistry);
		}
		if (JpaDisconnectDetailFromMasterOperation.class.equals(clazz)) {
			return (T) new JpaDisconnectDetailFromMasterOperation(registry, spaRegistry);
		}
		if (JpaDisconnectMasterFromDetailOperation.class.equals(clazz)) {
			return (T) new JpaDisconnectMasterFromDetailOperation(registry, spaRegistry);
		}
		if (JpaExternalConnectDetailToMasterOperation.class.equals(clazz)) {
			return (T) new JpaExternalConnectDetailToMasterOperation(registry, spaRegistry);
		}
		if (JpaExternalConnectMasterToDetailOperation.class.equals(clazz)) {
			return (T) new JpaExternalConnectMasterToDetailOperation(registry, spaRegistry);
		}
		if (JpaExternalDisconnectDetailFromMasterOperation.class.equals(clazz)) {
			return (T) new JpaExternalDisconnectDetailFromMasterOperation(registry, spaRegistry);
		}
		if (JpaExternalDisconnectMasterFromDetailOperation.class.equals(clazz)) {
			return (T) new JpaExternalDisconnectMasterFromDetailOperation(registry, spaRegistry);
		}
		if (JpaRemoveObjectOperation.class.equals(clazz)) {
			return (T) new JpaRemoveObjectOperation(registry, spaRegistry);
		}
		if (JpaUpdateOperation.class.equals(clazz)) {
			return (T) new JpaUpdateOperation(registry, spaRegistry);
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
