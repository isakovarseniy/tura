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

package org.tura.platform.repository.cpa;

import java.util.List;

import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.cpa.operation.CpaCommandProducer;
import org.tura.platform.repository.cpa.operation.CpaRepositoryCommand;
import org.tura.platform.repository.data.UpdateObjectData;

public class ClientObjectUpdate {

	private SearchProvider searchProvider;

	public ClientObjectUpdate( SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}
	
	public void update(UpdateObjectData data) throws Exception {
		CpaCommandProducer cmp = new CpaCommandProducer(searchProvider);
		List<CpaRepositoryCommand> commands = cmp.update(data.getPk(), data.getProperty() , data.getValue());
		for (CpaRepositoryCommand cmd : commands) {
			cmd.prepare();
		}

	}

}
