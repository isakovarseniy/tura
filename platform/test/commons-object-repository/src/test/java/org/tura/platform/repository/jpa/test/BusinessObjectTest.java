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

package org.tura.platform.repository.jpa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.IndepObject2;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BusinessObjectTest {

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
	public void t0000_loadObject() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			o1.getIndepObject2().add(o2);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@SuppressWarnings("rawtypes")
	@Test
	public void t0001_loadObject() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			
			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			stackProvider.get().commit();

			SearchResult result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(0, o1.getIndepObject2().size());

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0003_loadObject() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();

			IndepObject1 o1 = (IndepObject1) repository.create(IndepObject1.class);
			repository.insert(o1, IndepObject1.class);

			IndepObject2 o2 = (IndepObject2) repository.create(IndepObject2.class);
			repository.insert(o2, IndepObject2.class);

			o1.getIndepObject2().add(o2);

			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			
			o1 = (IndepObject1) result.getSearchResult().get(0);

			assertEquals(1, o1.getIndepObject2().size());

			o2 = o1.getIndepObject2().get(0);

			repository.setProfile(IndepObject2ExceptionProfile.class.getName());
			storageProvider.getRegistry().addProfile(IndepObject2ExceptionProfile.class.getName(),  IndepObject2ExceptionProfile.class);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (IndepObject1) result.getSearchResult().get(0);

			if ( RepositoryTestSuite.lazyObjectRepository ) {
				   assertEquals(1, o1.getIndepObject2().size());
			}else {
				   assertEquals(0, o1.getIndepObject2().size());
			}

			SearchResult<IndepObject2>result1 = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(1, result1.getSearchResult().size());
			o2 =  result1.getSearchResult().get(0);

			o1 = o2.getIndepObject1();
			assertNotNull(o1);

			repository.remove(o1, IndepObject1.class);
			repository.remove(o2, IndepObject2.class);

			stackProvider.get().commit();

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject1.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 100,
					IndepObject2.class);
			assertEquals(0, result.getSearchResult().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}



}