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

import objects.test.serialazable.jpa.Many2Many1A;
import objects.test.serialazable.jpa.Many2Many1B;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class LoadMany2ManyTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	@BeforeAll
	public static void beforeClass() throws Exception {
		storageProvider.startServer();
		storageProvider.initSession();

		storageProvider.startTransaction();
		storageProvider.initData("initDb2");
		storageProvider.commitTransaction();

	}



	@Test
	public void t0000_loadMany2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();

			SearchResult<Many2Many1A> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10, Many2Many1A.class);
			assertEquals(2,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.get().find(Many2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.get().find(Many2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			Many2Many1A o1 =  result.getSearchResult().get(0);
			Many2Many1B o2 = o1.getMany2Many1B().get(0);
			assertNotNull(o2);
			
			array = cpaStorageProvider.get().find(Many2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.get().find(Many2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			StorageControl sc = array.get(0);
			assertEquals(2, sc.getSession());
			
			//Second attempt to access object;
			o2 = o1.getMany2Many1B().get(0);
			
			array = cpaStorageProvider.get().find(Many2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			sc = array.get(0);
			assertEquals(2, sc.getSession());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	@Test
	public void t0001_loadMany2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();
	
			
			SearchResult<Many2Many1B> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10, Many2Many1B.class);
			assertEquals(4,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.get().find(Many2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(4, array.size());
			
			array = cpaStorageProvider.get().find(Many2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			Many2Many1B o1 =  result.getSearchResult().get(0);
			Many2Many1A o2 = o1.getMany2Many1A().get(0);
			assertNotNull(o2);
			
			
			 array = cpaStorageProvider.get().find(Many2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(4, array.size());
			
			array = cpaStorageProvider.get().find(Many2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			StorageControl sc = array.get(0);
			assertEquals(2, sc.getSession());
			
			//Second attempt to access object;
			o2 = o1.getMany2Many1A().get(0);
			
			array = cpaStorageProvider.get().find(Many2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			sc = array.get(0);
			assertEquals(2, sc.getSession());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
}