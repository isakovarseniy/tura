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

package org.tura.platform.repository.jpa.operation;

import java.util.List;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.operation.SpaExternalDisconnectMasterFromDetailOperation;

public class JpaExternalDisconnectMasterFromDetailOperation extends SpaExternalDisconnectMasterFromDetailOperation{
	
	private static final long serialVersionUID = -9222833218400387761L;

	public JpaExternalDisconnectMasterFromDetailOperation(Registry registry,SpaObjectRegistry spaRegistry) {
		super(registry,spaRegistry);
	}
	
	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		return super.prepare();
	}	

	
}
