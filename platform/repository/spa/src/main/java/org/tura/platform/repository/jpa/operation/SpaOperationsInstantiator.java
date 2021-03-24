/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.operation;

import java.util.Arrays;

import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.operation.SpaAddInternalOperation;
import org.tura.platform.repository.spa.operation.SpaAddObjectOperation;
import org.tura.platform.repository.spa.operation.SpaConnectDetailToMasterOperation;
import org.tura.platform.repository.spa.operation.SpaConnectMasterToDetailOperation;
import org.tura.platform.repository.spa.operation.SpaDisconnectDetailFromMasterOperation;
import org.tura.platform.repository.spa.operation.SpaDisconnectMasterFromDetailOperation;
import org.tura.platform.repository.spa.operation.SpaExternalConnectDetailToMasterOperation;
import org.tura.platform.repository.spa.operation.SpaExternalConnectMasterToDetailOperation;
import org.tura.platform.repository.spa.operation.SpaExternalDisconnectDetailFromMasterOperation;
import org.tura.platform.repository.spa.operation.SpaExternalDisconnectMasterFromDetailOperation;
import org.tura.platform.repository.spa.operation.SpaRemoveInternalOperation;
import org.tura.platform.repository.spa.operation.SpaRemoveObjectOperation;
import org.tura.platform.repository.spa.operation.SpaUpdateOperation;

public class SpaOperationsInstantiator implements Instantiator {

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

	public SpaOperationsInstantiator(Registry registry, SpaObjectRegistry spaRegistry) {
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	private static String[] knownObjects = new String[] { 
			SpaAddInternalOperation.class.getName(),
			SpaAddObjectOperation.class.getName(), 
			SpaConnectDetailToMasterOperation.class.getName(),
			SpaConnectMasterToDetailOperation.class.getName(), 
			SpaDisconnectDetailFromMasterOperation.class.getName(),
			SpaDisconnectMasterFromDetailOperation.class.getName(),
			SpaExternalConnectDetailToMasterOperation.class.getName(),
			SpaExternalConnectMasterToDetailOperation.class.getName(),
			SpaExternalDisconnectDetailFromMasterOperation.class.getName(),
			SpaExternalDisconnectMasterFromDetailOperation.class.getName(), 
			SpaRemoveInternalOperation.class.getName(),
			SpaRemoveObjectOperation.class.getName(), 
			SpaUpdateOperation.class.getName() };

	
	
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

		if (SpaAddInternalOperation.class.equals(clazz)){
			return (T) new SpaAddInternalOperation(registry, spaRegistry);
		}
		if (SpaAddObjectOperation.class.equals(clazz)) {
			return (T) new SpaAddObjectOperation(registry, spaRegistry);
		}
		if (SpaConnectDetailToMasterOperation.class.equals(clazz)) {
			return (T) new SpaConnectDetailToMasterOperation(registry, spaRegistry);
		}
		if (SpaConnectMasterToDetailOperation.class.equals(clazz)) {
			return (T) new SpaConnectMasterToDetailOperation(registry, spaRegistry);
		}
		if (SpaDisconnectDetailFromMasterOperation.class.equals(clazz)) {
			return (T) new SpaDisconnectDetailFromMasterOperation(registry, spaRegistry);
		}
		if (SpaDisconnectMasterFromDetailOperation.class.equals(clazz)) {
			return (T) new SpaDisconnectMasterFromDetailOperation(registry, spaRegistry);
		}
		if (SpaExternalConnectDetailToMasterOperation.class.equals(clazz)) {
			return (T) new SpaExternalConnectDetailToMasterOperation(registry, spaRegistry);
		}
		if (SpaExternalConnectMasterToDetailOperation.class.equals(clazz)) {
			return (T) new SpaExternalConnectMasterToDetailOperation(registry, spaRegistry);
		}
		if (SpaExternalDisconnectDetailFromMasterOperation.class.equals(clazz)) {
			return (T) new SpaExternalDisconnectDetailFromMasterOperation(registry, spaRegistry);
		}
		if (SpaExternalDisconnectMasterFromDetailOperation.class.equals(clazz)) {
			return (T) new SpaExternalDisconnectMasterFromDetailOperation(registry, spaRegistry);
		}
		if (SpaRemoveInternalOperation.class.equals(clazz)) {
			return (T) new SpaRemoveInternalOperation(registry, spaRegistry);
		}
		if (SpaRemoveObjectOperation.class.equals(clazz)) {
			return (T) new SpaRemoveObjectOperation(registry, spaRegistry);
		}

		if (SpaUpdateOperation.class.equals(clazz)) {
			return (T) new SpaUpdateOperation(registry, spaRegistry);
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
