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

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.One2Many3A;
import objects.test.serialazable.jpa.One2Many3B;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class One2ManyNoAssosiationAbstractTest {

	public abstract ProxyRepository getRepository();
	public abstract EntityManager getEntityManager();

	@Test
	public void t0000_One2Many() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			One2Many3A o1 = (One2Many3A) repository.create(One2Many3A.class.getName());

			repository.insert(o1, One2Many3A.class.getName());

			One2Many3B o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			o2.setRef(o1.getObjId());
			repository.insert(o2, One2Many3B.class.getName());

			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			o2.setRef(o1.getObjId());
			repository.insert(o2, One2Many3B.class.getName());

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many3A.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many3B.class.getName());
			assertEquals(2, result.getSearchResult().size());

			for (Object o : result.getSearchResult()) {
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getRef());
			}

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many3A.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);

			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria();
			search.add(sc);
			sc.setClassName(Long.class.getName());
			sc.setName("ref");
			sc.setValue(o1.getObjId());
			sc.setComparator(Operator.EQ.name());

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 0, One2Many3B.class.getName());
			assertEquals(2, result.getSearchResult().size());

			for (Object o : result.getSearchResult()) {
				One2Many3B o3 = (One2Many3B) o;
				assertEquals(o1.getObjId(), o3.getRef());
			}

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			for (Object o : result.getSearchResult()) {
				repository.remove(o, One2Many3B.class.getName());
			}

			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many3A.class.getName());
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many3A) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0,
					One2Many3B.class.getName());
			assertEquals(0, result.getSearchResult().size());

			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			o2.setRef(o1.getObjId());
			repository.insert(o2, One2Many3B.class.getName());

			o2 = (One2Many3B) repository.create(One2Many3B.class.getName());
			o2.setRef(o1.getObjId());
			repository.insert(o2, One2Many3B.class.getName());

			repository.applyChanges(null);

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