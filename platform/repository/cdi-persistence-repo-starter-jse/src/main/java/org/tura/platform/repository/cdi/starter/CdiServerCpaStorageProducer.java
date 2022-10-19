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

package org.tura.platform.repository.cdi.starter;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.tura.platform.repository.cdi.ServerCpaStorage;
import org.tura.platform.repository.cpa.storage.CpaStorage;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class CdiServerCpaStorageProducer {
	
    @Produces
    @ApplicationScoped
    @ServerCpaStorage
	public CpaStorage getCpaStorage() {
    	CpaStorage  cpaStorage = new CpaStorage(UUID.randomUUID().toString());
		ProxyCommadStackProvider stackProvider = new CdiServerCommadStackProvider();
		cpaStorage.setCommadStackProvider(stackProvider);
		return cpaStorage;
	}

}
