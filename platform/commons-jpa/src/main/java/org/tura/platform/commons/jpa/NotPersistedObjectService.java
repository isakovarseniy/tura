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
package org.tura.platform.commons.jpa;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;

import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.persistence.TuraObject;

import com.octo.java.sql.query.SelectQuery;

public class NotPersistedObjectService implements Serializable {

	private static final long serialVersionUID = -3829440325332622485L;

	private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		return this.em;
	}

	public TuraObject create(String objectClass) throws Exception {
		Class<?> clazz = (Class<?>) this.getClass().getClassLoader().loadClass(objectClass);
		TuraObject obj = (TuraObject) clazz.newInstance();
		long id = ByteBuffer.wrap(UUID.randomUUID().toString().getBytes()).asLongBuffer().get();
		obj.setObjId(id);
		return obj;

	}

	@SuppressWarnings("rawtypes")
	public List<?> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws Exception {

		return new LazyList();
	}

	public void update(TuraObject entity) {
	}

	public void insert(TuraObject entity) {
	}

}
