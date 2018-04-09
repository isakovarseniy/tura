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
package org.tura.platform.repository.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.IndepObject2;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class BusinessObjectAbstractTest {


	public abstract ProxyRepository getRepository();
	public abstract EntityManager getEntityManager();

	@Test
	public void t0000_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());

			o1.getIndepObject2().add(o2);

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();
			repository.remove(o1, IndepObject1.class.getName());
			repository.remove(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class.getName());
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class.getName());
			assertEquals(0, result.getSearchResult().size());

			getEntityManager().getTransaction().commit();

		} catch (Exception e) {
			if (getEntityManager().getTransaction().isActive()) {
				getEntityManager().getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_loadObject() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class.getName());
			repository.insert(o1, IndepObject1.class.getName());

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class.getName());
			repository.insert(o2, IndepObject2.class.getName());

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(0, o1.getIndepObject2().size());

			getEntityManager().getTransaction().commit();

		} catch (Exception e) {
			if (getEntityManager().getTransaction().isActive()) {
				getEntityManager().getTransaction().rollback();
			}
			e.printStackTrace();
			fail();
		}

	}

}