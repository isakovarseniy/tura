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
package org.tura.platform.repository.spa.test;

import java.util.HashMap;
import java.util.Map;

import org.tura.platform.repository.core.Adapter;
import org.tura.platform.repository.core.AdapterLoader;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class CRUDService implements CRUDProvider{

	private AdapterLoader loader;
	
	
	public void setAdapterLoader(AdapterLoader loader) {
		this.loader = loader;
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
		 Map<Object,Object> h = SearchBase.base.get(control.getType());
		 if (h == null){
			 h = new HashMap<>();
			 SearchBase.base.put(control.getType(), h);
		 }
		 Object obj = h.get(control.getKey());
		 if (obj != null) {
			 throw new Exception("Object already exists");
		 }
		 
		 if (control.getObject() instanceof Adapter) {
			 h.put(control.getKey(), loader.unWrapObject(control.getObject()));
			 return;
		 }
		 
		 h.put(control.getKey(), control.getObject());

	}
	
	private void update(SpaControl control) throws Exception {
		 Map<Object,Object> h = SearchBase.base.get(control.getType());
		 Object obj = h.get(control.getKey());
		 if (obj == null) {
			 throw new Exception("Could not find an object");
		 }

		 if (control.getObject() instanceof Adapter) {
			 h.put(control.getKey(), loader.unWrapObject(control.getObject()));
			 return;
		 }
		 
		 h.put(control.getKey(), control.getObject());
	}

	private void delete(SpaControl control) throws Exception {
		 Map<Object,Object> h = SearchBase.base.get(control.getType());
		 Object obj = h.get(control.getKey());
		 if (obj == null) {
			 throw new Exception("Could not find an object to delete");
		 }
		 h.remove(control.getKey());
	}
	
}

