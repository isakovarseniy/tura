/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.rest;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import org.tura.platform.uuiclient.cdi.FileScopeStore;
import org.tura.platform.uuiclient.cdi.RequestScopeStorage;
import org.tura.platform.uuiclient.cdi.ScopeStorage;

public class StorageProvider{
	
	@Produces
	@Named("storage")
	public  ScopeStorage getStorage(){
		if ( System.getProperty("tura.request.file.storage") != null ) {
			return new FileScopeStore(System.getProperty("java.io.tmpdir"));
		}
		return new RequestScopeStorage();
	}

}
