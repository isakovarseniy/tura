/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.object.persistence.operation;

import javax.persistence.EntityManager;

import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.persistence.PersistanceMapper;

public class DefaultAddObjectOperation extends JPAOperation {

	EntityManager em;
	Object object;

	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void execute() throws Exception {
		em.persist(getObject());
	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {

		Object repositoryObject_ = parameters[0];

		PersistanceMapper mapper = findPersistanceMapper(repositoryObject_.getClass().getName());
		Object persistanceObject = mapper.copyFromRepository2Persistence(repositoryObject_);
		setObject(persistanceObject);

		return false;
	}

}
