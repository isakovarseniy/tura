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

package org.tura.platform.repository.neo4j.operation;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.jpa.operation.JpaDisconnectDetailFromMasterOperation;
import org.tura.platform.repository.spa.SpaObjectRegistry;

public class Neo4jDisconnectDetailFromMasterOperation extends JpaDisconnectDetailFromMasterOperation{

	private static final long serialVersionUID = 1L;
	
	public Neo4jDisconnectDetailFromMasterOperation(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}
	
}
