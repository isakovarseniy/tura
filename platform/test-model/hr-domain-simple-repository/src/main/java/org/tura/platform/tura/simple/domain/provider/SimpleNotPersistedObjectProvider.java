/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.tura.simple.domain.provider;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

import org.elsoft.platform.hr.objects.UserDAO;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.Repository;
import org.tura.platform.repository.DataProvider;

public class SimpleNotPersistedObjectProvider implements DataProvider {

	public SimpleNotPersistedObjectProvider(Repository repository){
		repository.addProvider(this, UserDAO.class.getName());
	}
	
	
	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object domainObject = Class.forName(objectClass).newInstance();
			TuraObject obj = (TuraObject) domainObject;
			long id = ByteBuffer.wrap(UUID.randomUUID().toString().getBytes()).asLongBuffer().get();
			obj.setObjId(id);
			return domainObject;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<?> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		return new LazyList();
	}

	@Override
	public void update(Object request, String objectClass) throws RepositoryException {
		
	}

	@Override
	public void insert(Object request, String objectClass) throws RepositoryException {
		
	}

	@Override
	public void remove(Object request, String objectClass) throws RepositoryException {
		
	}

}
