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

package org.tura.platform.repository.cpa;

import java.io.Serializable;
import java.util.List;

import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.data.AddContainmentObjectData;
import org.tura.platform.repository.data.AddObjectData;
import org.tura.platform.repository.data.AddTopObjectData;
import org.tura.platform.repository.data.RemoveContainmentObjectData;
import org.tura.platform.repository.data.RemoveObjectData;
import org.tura.platform.repository.data.RemoveTopObjectData;
import org.tura.platform.repository.data.UpdateObjectData;

public class ClientObjectProcessor implements Serializable {

	private static final long serialVersionUID = 1855824528387080215L;
	
	private SearchProvider searchProvider;
	
	public ClientObjectProcessor (SearchProvider searchProvider) {
		this.searchProvider = searchProvider;
	}

	@SuppressWarnings("rawtypes")
	public void process(List changes) throws Exception {

		for (Object change : changes) {

			if (change instanceof AddContainmentObjectData) {
				new ClientObjectInstaller(searchProvider).add((AddContainmentObjectData) change);
				continue;
			}
			if (change instanceof AddObjectData) {
				new ClientObjectInstaller(searchProvider).add((AddObjectData) change);
				continue;
			}

			if (change instanceof AddTopObjectData) {
				new ClientObjectInstaller(searchProvider).add((AddTopObjectData) change);
				continue;
			}

			if (change instanceof RemoveContainmentObjectData) {
				new ClientObjectRemover(searchProvider).remove((RemoveContainmentObjectData) change);
				continue;
			}

			if (change instanceof RemoveObjectData) {
				new ClientObjectRemover(searchProvider).remove((RemoveObjectData) change);
				continue;
			}

			if (change instanceof RemoveTopObjectData) {
				new ClientObjectRemover(searchProvider).remove((RemoveTopObjectData) change);
				continue;
			}

			if (change instanceof UpdateObjectData) {
				new ClientObjectUpdate(searchProvider).update((UpdateObjectData) change);
				continue;
			}

		}

	}

}
