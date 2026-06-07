/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.mixed.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.operation.AddLinkOperation;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import com.octo.java.sql.exp.Operator;

import objects.test.serialazable.jpa.L1;
import objects.test.serialazable.jpa.L2;
import objects.test.serialazable.jpa.L3;
import objects.test.serialazable.jpa.L4;

public class ObjectsLinkTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	@BeforeAll
	public static void beforeClass() throws Exception {
		storageProvider.startServer();
		storageProvider.initSession();
	}

	@Test
	public void linkedObjectTest1() {
		try {
			//Reset sequence
			storageProvider.setSequence(1000); ;
			
			CpaRepository repository = storageProvider.getMixRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			L1 o1 = (L1) repository.create(L1.class);
			L2 o2 = (L2) repository.create(L2.class);
			o2.setDesc("Desc 1");

			AddLinkOperation lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) o1);
			lo.setDetail((ObjectControl) o2);
			lo.addLink("objId", "parentId");

			((ObjectControl) o2).setLinkOperation(lo);

			repository.insert(o1, L1.class);
			repository.insert(o2, L2.class);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, L1.class);
			assertEquals(1, result.getSearchResult().size());
			L1 o1_ = (L1) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, L2.class);
			assertEquals(1, result.getSearchResult().size());
			L2 o2_ = (L2) result.getSearchResult().get(0);

			assertEquals(o1_.getObjId(), o2_.getParentId());

			assertEquals(o1.getObjId(), o1_.getObjId());
			assertEquals(o2_.getParentId(), o2.getParentId());
			assertEquals(o2_.getDesc(), "Desc 1");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void linkedObjectTest2() {
		try {
			CpaRepository repository = storageProvider.getMixRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			L3 o3 = (L3) repository.create(L3.class);
			L4 o4 = (L4) repository.create(L4.class);
			o3.setL4(o4);

			L2 o2 = (L2) repository.create(L2.class);
			o2.setDesc("Desc 2");

			AddLinkOperation lo = new AddLinkOperation();
			lo.setMaster((ObjectControl) o3);
			lo.setDetail((ObjectControl) o2);
			lo.addLink("objId", "parentId");

			((ObjectControl) o2).setLinkOperation(lo);

			repository.insert(o3, L3.class);
			repository.insert(o2, L2.class);

			stackProvider.get().commit();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, L3.class);
			assertEquals(1, result.getSearchResult().size());
			L3 o3_ = (L3) result.getSearchResult().get(0);

			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(o3.getObjId());
			List<SearchCriteria> search = new ArrayList<SearchCriteria>();
			search.add(sc);

			result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, L2.class);
			assertEquals(1, result.getSearchResult().size());
			L2 o2_ = (L2) result.getSearchResult().get(0);

			assertEquals(o3.getObjId(), o2_.getParentId());
			assertEquals(o3_.getObjId(), o2_.getParentId());
			assertEquals(o2_.getDesc(), "Desc 2");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
