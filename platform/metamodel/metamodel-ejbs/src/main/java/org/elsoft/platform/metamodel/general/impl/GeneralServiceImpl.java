/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.general.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.metamodel.general.GeneralService;
import org.elsoft.platform.metamodel.objects.ELsoftObject;
import org.elsoft.platform.persistence.ELsoftEntityService;

@Stateless
@WebService(endpointInterface = "org.elsoft.platform.metamodel.general.GeneralService", serviceName = "GeneralService")
public class GeneralServiceImpl extends ELsoftEntityService implements
		GeneralService {

	@PersistenceContext(unitName = "metamodel")
	private EntityManager em;

	@Override
	public ELsoftObject create(String objectClass) {
		try {
			@SuppressWarnings("unchecked")
			Class<ELsoftObject> clazz = (Class<ELsoftObject>) this.getClass()
					.getClassLoader().loadClass(objectClass);
			ELsoftObject obj = clazz.newInstance();
			obj.setObjId(this.getObjsectID(em));
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ELsoftObject> find(List<SearchCriteria> search,
			List<OrderCriteria> order, Integer startIndex, Integer endIndex,
			String objectClass) {
		try {
			Class<ELsoftObject> clazz = (Class<ELsoftObject>) this.getClass()
					.getClassLoader().loadClass(objectClass);

			return (List<ELsoftObject>) this.getObjects(clazz, search, order, em, startIndex,
					endIndex);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void remove(ELsoftObject entity) {
		this.removeObject(entity, em);
	}

	@Override
	public void update(ELsoftObject entity) {
		this.mergeObject(entity, em);
	}

	@Override
	public void insert(ELsoftObject entity) {
		this.persistObject(entity, em);
	}

}
