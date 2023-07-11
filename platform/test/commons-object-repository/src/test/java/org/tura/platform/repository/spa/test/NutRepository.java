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
	public <T> T create(Class<T> objectClass) throws RepositoryException {
		return null;
	}

	@Override
	public <T> SearchResult<T>  find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, Class<T> objectClass) throws RepositoryException {
		return new SearchResult<T>(new ArrayList<T>(), 0);
	}

	@Override
	public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public <T>  void remove(Object obj, Class<T> objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Object> applyChanges( List changes) throws RepositoryException {
		return null;
	}

	@Override
	public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
		return null;
	}

}
