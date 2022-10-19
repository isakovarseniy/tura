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

package org.tura.platform.repository.cpa;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public interface ProxyRepositoryInterface {

	public void setStackProvider(ProxyCommadStackProvider stackProvider) ;
	
	public void setTransport(Repository transport) ;

	public void setStorageProvider(CpaStorageProvider storageProvider) ;

	public void setRegistry(Registry registry) ;

	public void setProfile(String profile) ;

}
