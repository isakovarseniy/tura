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

package org.tura.platform.repository.spa.test;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public class NutRepository implements Repository{

	private static final long serialVersionUID = -4325708688289465506L;

	@Override
	public Object create(String objectClass) throws RepositoryException {
		return null;
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		return new SearchResult(new ArrayList<>(), 0);
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List applyChanges( List changes) throws RepositoryException {
		return null;
	}

	@Override
	public Object find(Object pk, String objectClass) throws RepositoryException {
		return null;
	}

}
