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

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;
import objects.test.serialazable.jpa.One2Many2A;
import objects.test.serialazable.jpa.One2Many2B;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CommandValidationOne2ManyTest {

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
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			
			One2Many1A o1 = (One2Many1A) repository.create(One2Many1A.class);
			One2Many1B o2 = (One2Many1B) repository.create(One2Many1B.class);
			
			o1.getOne2Many1B().add(o2);
			
			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(3, commands.size());
			
			List<StorageControl>  array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			o2 = (One2Many1B) repository.create(One2Many1B.class);
			repository.insert(o2, One2Many1B.class);
			o2.setOne2Many1A(o1);
			
			array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			
			boolean b = o1.getOne2Many1B().remove(o2);
			if  ( !b) {
				fail();
			}
			try {
			o1.getOne2Many1B().remove(1);
			fail();
			}catch( Exception e) {
				
			}
			
			array = cpaStorageProvider.get().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public void t0000_One2ManyContainment() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			
			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class);
			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class);
			
			o1.getOne2Many2B().add(o2);
			
			
			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);
			
			o1.getOne2Many2B().remove(2);
			
			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			List<StorageControl> array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());
			
			repository.insert(o1, One2Many2A.class);
			
			array = cpaStorageProvider.get().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.get().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
