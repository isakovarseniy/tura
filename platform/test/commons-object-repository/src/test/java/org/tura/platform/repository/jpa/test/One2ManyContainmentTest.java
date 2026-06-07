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
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.One2Many2A;
import objects.test.serialazable.jpa.One2Many2B;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class One2ManyContainmentTest {

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
	public void t0000_One2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();

			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class);

			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			repository.insert(o1, One2Many2A.class);

			List<StorageControl> array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					10, One2Many2A.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2B.class);
			assertEquals(2, result.getSearchResult().size());

			
			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			repository.remove(o1, One2Many2A.class);
			
			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2A.class);
			assertEquals(0, result.getSearchResult().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2B.class);
			assertEquals(0, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t0001_One2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();

			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class);

			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			List<StorageControl> array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name() }) );
			assertEquals(2, array.size());
			
			repository.insert(o1, One2Many2A.class);
			
			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name() }) );
			assertEquals(2, array.size());

			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name() }) );
			assertEquals(2, array.size());
			
			
			SearchResult<?> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					10, One2Many2A.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2B.class);
			assertEquals(2, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name() }) );
			assertEquals(2, array.size());
			
			int size = o1.getOne2Many2B().size();
			for (int i = 0 ; i < size ; i++) {
				o1.getOne2Many2B().remove(0);
			}
			
			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Updated.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name() }) );
			assertEquals(2, array.size());
			
			stackProvider.get().commit();

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());
			
			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2A.class);
			assertEquals(1, result.getSearchResult().size());
			o1 = (One2Many2A) result.getSearchResult().get(0);
			assertEquals(0, o1.getOne2Many2B().size());

			result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10,
					One2Many2B.class);
			assertEquals(0, result.getSearchResult().size());

			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name(),ObjectStatus.Removed.name() }) );
			assertEquals(0, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
