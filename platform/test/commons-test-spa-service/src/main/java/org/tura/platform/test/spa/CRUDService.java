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

package org.tura.platform.test.spa;

import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.PrImaryKeyStrategy;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class CRUDService extends CRUDProvider {

	public static Map<String, ProcessCallback> callbacks = new HashMap<>();
	private PrImaryKeyStrategy pkStartegy;

	public CRUDService(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		super(spaRegistry, registryName, registry);
	}

	private AdapterLoader loader;

	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
	}


	public void setPkStartegy(PrImaryKeyStrategy pkStartegy) {
		this.pkStartegy = pkStartegy;
	}


	@Override
	public void execute(SpaControl control) throws Exception {
		if (control.getLevel().equals(OperationLevel.INSERT)) {
			insert(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.UPDATE)) {
			update(control);
			return;
		}
		if (control.getLevel().equals(OperationLevel.DELETE)) {
			delete(control);
			return;
		}
		throw new Exception("Unknown operation");

	}

	private void insert(SpaControl control) throws Exception {
		nillPk(control.getObject(), control.getType());

		pkStartegy.generatePk(control.getObject());

		Object newPK = mapPk(control.getType(), control.getObject(), control.getKey());

		
		Object insertObject = control.getObject();
		if (insertObject instanceof Adapter) {
			insertObject = loader.unWrapObject(control.getObject());
		}
		
		ProcessCallback callback = callbacks.get(control.getType());
		if (callback != null) {
			callback.preInsert(insertObject);
			control.setObject(insertObject);
		}
		SearchBase.put(newPK, insertObject, control.getType());

	}

	private void update(SpaControl control) throws Exception {
		
		Object obj = SearchBase.get(control.getKey(), control.getType());

		Object updatedObject = control.getObject();
		if (updatedObject instanceof Adapter) {
			updatedObject = loader.unWrapObject(control.getObject());
		}
		ProcessCallback callback = callbacks.get(control.getType());
		if (callback != null) {
			callback.preUpdate(updatedObject, obj);
			control.setObject(updatedObject);
		}
		
		SearchBase.update(control.getKey(), updatedObject, control.getType());
		
	}

	private void delete(SpaControl control) throws Exception {
		Object obj = SearchBase.get(control.getKey(), control.getType());
		ProcessCallback callback = callbacks.get(control.getType());
		if (callback != null) {
			callback.preDelete(obj);
		}
		SearchBase.remove(control.getKey(), control.getType());
	}

}
