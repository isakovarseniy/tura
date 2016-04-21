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

import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.hr.objects.UserDAO;
import org.elsoft.platform.hr.objects.simple.model.User;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.model.DomainObject;
import org.tura.platform.object.model.RepositoryException;
import org.tura.platform.repository.DataProvider;
import org.tura.platform.repository.ObjectProvider;
import org.tura.platform.repository.Repository;

@ObjectProvider
public class SimpleNotPersistedObjectProvider implements DataProvider {

	private HashMap<String, String> domainModelClassMapper = new HashMap<>();

	
	
	public SimpleNotPersistedObjectProvider() {
	}
	
	
	public void setRepository(Repository repository){
		init(repository);
	}
	
	private  void init(Repository repository) {
		repository.addProvider(this, UserDAO.class.getName());
		repository.addProvider(this, TuraObject.class.getName());
		
		domainModelClassMapper.put(UserDAO.class.getName(), User.class.getName());
		domainModelClassMapper.put(TuraObject.class.getName(), DomainObject.class.getName());
	}	
	
	
	public SimpleNotPersistedObjectProvider(Repository repository){
		init(repository);
	}
	
	
	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			String domainModelClass = domainModelClassMapper.get(objectClass);
			Object domainObject = Class.forName(domainModelClass).newInstance();
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
