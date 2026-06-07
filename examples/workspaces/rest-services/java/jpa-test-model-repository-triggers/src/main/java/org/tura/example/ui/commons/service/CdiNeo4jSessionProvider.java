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

package org.tura.example.ui.commons.service;

import org.neo4j.ogm.session.Session;
import org.tura.platform.repository.neo4j.operation.Neo4jSessionProvider;

public class CdiNeo4jSessionProvider implements Neo4jSessionProvider{

	@Override
	public Session getSession() {
		return CdiServerTransactionAdapter.getSession();
	}

	@Override
	public void destroySession() {
	}

}
