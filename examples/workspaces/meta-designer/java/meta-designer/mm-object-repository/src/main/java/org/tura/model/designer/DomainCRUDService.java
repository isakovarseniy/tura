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

import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.core.PrImaryKeyStrategy;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class DomainCRUDService extends CRUDProvider {

	public DomainCRUDService(SpaObjectRegistry spaRegistry, String registryName, Registry registry) {
		super(spaRegistry, registryName, registry);
	}


	public void setAdapterLoader(AdapterLoader loader) {
	}


	public void setPkStartegy(PrImaryKeyStrategy pkStartegy) {
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

	}

	private void update(SpaControl control) throws Exception {
		
		
	}

	private void delete(SpaControl control) throws Exception {
	}

}
