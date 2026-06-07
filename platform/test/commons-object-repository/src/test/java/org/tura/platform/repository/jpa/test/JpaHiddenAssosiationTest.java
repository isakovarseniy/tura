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
import org.junit.jupiter.api.Test;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.test.suite.RepositoryTestSuite;

import objects.test.serialazable.jpa.JPAHideRelationA1;
import objects.test.serialazable.jpa.JPAHideRelationB1;

public class JpaHiddenAssosiationTest {

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
	public void t0000_createHiddenAssosiationObject() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			JPAHideRelationA1 o1 = repository.create(JPAHideRelationA1.class);
			JPAHideRelationB1 o2 = repository.create(JPAHideRelationB1.class);
			
			o1.setJPAHideRelationB1(o2);
			
			repository.insert(o1, JPAHideRelationA1.class);
			
			stackProvider.get().commit();

  		     storageProvider.clearSession();
			repository = storageProvider.getRepository();
			stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repository.getStorageProvider();

			
			SearchResult<?> result = repository.find(new ArrayList<>(), new  ArrayList<>(), 0, 100, JPAHideRelationA1.class);
			assertEquals(1, result.getNumberOfRows());
			
			List<StorageControl> array  = cpaStorageProvider.get().find(JPAHideRelationA1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			if ( RepositoryTestSuite.isLazyObjectRepository()) {
				array  = cpaStorageProvider.get().find(JPAHideRelationB1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
				assertEquals(0, array.size());
				JPAHideRelationA1 _o1 = (JPAHideRelationA1) result.getSearchResult().get(0);
				_o1.getJPAHideRelationB1();
				array  = cpaStorageProvider.get().find(JPAHideRelationB1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
				assertEquals(1, array.size());
			}else {
				array  = cpaStorageProvider.get().find(JPAHideRelationB1.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
				assertEquals(1, array.size());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
