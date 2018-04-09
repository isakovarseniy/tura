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

import objects.test.serialazable.jpa.One2One2A;
import objects.test.serialazable.jpa.One2One2B;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class One2OneOpositContaintmentAbstractTest {

	public abstract EntityManager getEntityManager();
	public abstract ProxyRepository getRepository();


	
	@Test
	public void t0000_One2One1() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class.getName());

			One2One2B o2 = (One2One2B) repository.create(One2One2B.class.getName());

			o2.setOne2One2A(o1);
			repository.insert(o2, One2One2B.class.getName());
			repository.applyChanges(null);

			getEntityManager().getTransaction().commit();
			
			getEntityManager().getTransaction().begin();
			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
			repository.remove(result.getSearchResult().get(0), One2One2A.class.getName());
			
			repository.applyChanges(null);
			
			getEntityManager().getTransaction().commit();
			
			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class.getName());
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class.getName());
			assertEquals(1,result.getSearchResult().size());

			getEntityManager().getTransaction().commit();
			
			getEntityManager().getTransaction().begin();
			repository.remove(result.getSearchResult().get(0), One2One2B.class.getName());
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

	@Test
	public void t0001_One2One1() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class.getName());
			
			One2One2B o2 = (One2One2B) repository.create(One2One2B.class.getName());
			
			o2.setOne2One2A(o1);
			
			repository.insert(o2, One2One2B.class.getName());
			repository.applyChanges(null);
			
			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			
			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class.getName());
			assertEquals(1,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class.getName());
			assertEquals(1,result.getSearchResult().size());

			
			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();
			repository.remove(result.getSearchResult().get(0), One2One2B.class.getName());
			repository.applyChanges(null);
			
			getEntityManager().getTransaction().commit();
			
			getEntityManager().getTransaction().begin();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class.getName());
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class.getName());
			assertEquals(0,result.getSearchResult().size());
			
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
	public void t0002_One2One1() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class.getName());
			
			One2One2B o2 = (One2One2B) repository.create(One2One2B.class.getName());
			
			o2.setOne2One2A(o1);
			
			repository.insert(o2, One2One2B.class.getName());
			repository.applyChanges(null);
			
			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();
			
			o2.setOne2One2A(null);

			repository.applyChanges(null);
			
			getEntityManager().getTransaction().commit();

			getEntityManager().getTransaction().begin();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2A.class.getName());
			assertEquals(0,result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One2B.class.getName());
			assertEquals(1,result.getSearchResult().size());
			
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
