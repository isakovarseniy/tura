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

package org.tura.platform.repository.spa;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class SkipQueryTrigger  implements PreQueryTrigger{

	private static final long serialVersionUID = 2698066640566718797L;
	protected Registry registry;

	public SkipQueryTrigger(Registry registry){
		this.registry = registry;
	}

	@Override
	public void preQueryTrigger(List<SearchCriteria> search, List<OrderCriteria> order) throws Exception {
		SearchCriteria sc = new SearchCriteria();
		sc.setName(RepositoryObjectLoader.SKIP_QUERY);
		search.add(sc);
	}
	
	
}
