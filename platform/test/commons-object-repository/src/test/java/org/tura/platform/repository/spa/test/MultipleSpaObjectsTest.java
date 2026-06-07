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

package org.tura.platform.repository.spa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.spa.SearchBase;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A2;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.F1;
import objects.test.serialazable.jpa.F2;

public class MultipleSpaObjectsTest {

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
	public void t0000_saveAndRemoveObject() {
		try {
			SearchBase.base.clear();
			
			CpaRepository repository = storageProvider.getSpaRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			
			A1 a1 = (A1) repository.create(A1.class);
			A2 a2 = (A2) repository.create(A2.class);
			a1.setA2(a2);
			repository.insert(a1, A1.class);

			stackProvider.get().commit();
			
			A4 a4 = (A4) repository.create(A4.class);
			a2.getA4().add(a4);

			F1 f1 = (F1) repository.create(F1.class);
			a4.setF1(f1);
			f1.setComment("Comment");
			
			F2 f2 = (F2) repository.create(F2.class);
			f1.setF2(f2);
			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());
			
			A1  a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			A4 a4_ = a1_.getA2().getA4().get(0);
			assertNotNull (a4_.getF1());
			assertNotNull (a4_.getF1().getF2());
			
			a4_.getF1().setF2(null);
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());
			
			a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			a4_ = a1_.getA2().getA4().get(0);
			assertNotNull (a4_.getF1());
			assertNull (a4_.getF1().getF2());
			
			a4_.setF1(null);
			stackProvider.get().commit();
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, A1.class);
			assertEquals(1, result.getNumberOfRows());

			a1_= (A1) result.getSearchResult().get(0);
			assertEquals(a1.getObjId(), a1_.getObjId());
			
			assertEquals(1, a1_.getA2().getA4().size());
			a4_ = a1_.getA2().getA4().get(0);
			assertNull (a4_.getF1());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100, F1.class);
			assertEquals(0, result.getNumberOfRows());
	
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
	
}
