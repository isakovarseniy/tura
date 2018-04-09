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
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.AddMany2Many1B2Many2Many1AOnMany2Many1BData;
import objects.test.serialazable.jpa.Many2Many1A;
import objects.test.serialazable.jpa.Many2Many1B;
import objects.test.serialazable.jpa.ProxyRepository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class Many2ManyNoContainmentAbstractTest {


	public abstract EntityManager getEntityManager();
	public abstract ProxyRepository getRepository();
	public abstract ProxyCommadStackProvider getStackProvider();
	
	@Test
	public void t0000_One2Many() {
		try {
			ProxyRepository repository = getRepository();

			getEntityManager().getTransaction().begin();

			Many2Many1A o1 = (Many2Many1A) repository.create(Many2Many1A.class.getName());
			repository.insert(o1, Many2Many1A.class.getName());

			Many2Many1B o2 = (Many2Many1B) repository.create(Many2Many1B.class.getName());
			repository.insert(o2, Many2Many1B.class.getName());
			
			AddMany2Many1B2Many2Many1AOnMany2Many1BData m2m = new AddMany2Many1B2Many2Many1AOnMany2Many1BData();
			m2m.setMany2Many1AObjId(o1.getObjId());
			m2m.setMany2Many1BObjId(o2.getObjId());
			getStackProvider().addCommand(m2m);
			
			repository.applyChanges(null);
			getEntityManager().getTransaction().commit();
			
			getEntityManager().getTransaction().begin();

			SearchResult result =  repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Many2Many1A.class.getName());

			assertEquals(1, result.getSearchResult().size());

			result =  repository.find(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), 0, 100, Many2Many1B.class.getName());
			
			assertEquals(1, result.getSearchResult().size());


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
