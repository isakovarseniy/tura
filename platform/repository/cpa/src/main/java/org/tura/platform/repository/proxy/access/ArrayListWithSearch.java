/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.proxy.access;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;

public class ArrayListWithSearch<E> extends ArrayList<E> implements SearchableList<E> {

	private static final long serialVersionUID = 2016518821808666471L;

	@Override
	public List<SearchCriteria> getSearchCriteria() throws Exception {
		return null;
	}

	@Override
	public void setSearchCriteria(List<SearchCriteria> searchCriteria) throws Exception {

	}

	@Override
	public List<OrderCriteria> getOrderCriteria() throws Exception {
		return null;
	}

	@Override
	public void setOrderCriteria(List<OrderCriteria> orderCriteria) throws Exception {

	}

	@Override
	public Object InternalSearch(RepoKeyPath key) throws Exception {
			for (Object obj : this) {
				ObjectControl oc = (ObjectControl) obj;
				if(  oc.isRemoved()) {
					continue;
				}
				if (key.equals(oc.getPath())) {
					return obj;
				}
			}
			return null;
	}

}
