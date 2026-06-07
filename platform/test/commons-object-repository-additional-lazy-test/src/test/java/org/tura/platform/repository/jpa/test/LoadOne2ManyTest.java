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
import java.util.Map;

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
import org.tura.platform.repository.cpa.storage.ObjectRef;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.Ref;
import org.tura.platform.repository.cpa.storage.RelationControl;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class LoadOne2ManyTest {

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
		storageProvider.initData("initDb3");
		storageProvider.commitTransaction();

	}	
	
	

	
	
	@Test
	public void t0000_loadOne2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();
			
			SearchResult<One2Many1A> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10, One2Many1A.class);
			assertEquals(1,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			One2Many1A o1 =  result.getSearchResult().get(0);
			One2Many1B o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);

			array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			StorageControl sc = array.get(0);
			assertEquals(2, sc.getSession());

			//Second attempt to access object;
			o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, sc.getSession());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t0001_loadOne2Many() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = storageProvider.getCpaStorageProvider();
			
			SearchResult<One2Many1B> result = repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10, One2Many1B.class);
			assertEquals(2,result.getSearchResult().size());
			
			List<StorageControl> array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(0, array.size());
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			One2Many1B o2 = result.getSearchResult().get(0);
			One2Many1A o1 = o2.getOne2Many1A();
			assertNotNull(o1);
			
			array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			o2 = o1.getOne2Many1B().get(0);
			assertNotNull(o2);
			
			array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			
			String cpaid = ((One2Many1A) o1).getCpaid();
			Map<ObjectRef, Map<RelationControl, List<Ref>>> filtered = cpaStorageProvider.get().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ObjectRef  ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			Map<RelationControl, List<Ref>> mp = filtered.get(ref);
			assertEquals(1, mp.values().size());
			 List<Ref> lst = mp.values().iterator().next();
		     assertEquals(2, lst.size());
			
			cpaid = ((One2Many1B) o2).getCpaid();
			filtered = cpaStorageProvider.get().findRelations(cpaid);
			assertEquals(1,filtered.size());
			ref = filtered.keySet().iterator().next();
			assertEquals(cpaid,ref.getCpaId());
			assertEquals(cpaid,ref.getExtCpaId());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}		
	
	
	
}
