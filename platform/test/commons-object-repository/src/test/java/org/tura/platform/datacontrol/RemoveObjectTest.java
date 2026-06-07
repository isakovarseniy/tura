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

package org.tura.platform.datacontrol;


import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.access.TopLazyList;
import org.tura.platform.test.hr.model.DepartmentType;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;

public class RemoveObjectTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();
	
	public static Class<?> deparmentClass =  Department2.class;
	public static Class<?> employeeClass  = Employee2.class;
	public static String deparmentString = "Department2";
	
	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}
	
	@BeforeAll
	public static void beforeClass() throws Exception{
		
		PlatformConfig.TEST_MODE = true;
		PlatformConfig.LOADSTEP = 3;
		storageProvider.startServer();
		storageProvider.initSession();

		storageProvider.startTransaction();

		storageProvider.initData("InitDB0", deparmentString);
	    storageProvider.commitTransaction();

	}
	
	@BeforeEach
	public void init() throws Exception{
		storageProvider.clean();
	}	
	
	
	@SuppressWarnings("resource")
	@Test
	public void t001_remove() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			DepartmentType obj  =  (DepartmentType) list.get(0);
			Long id = obj.getObjId();
			assertTrue(  list.remove(obj));
			obj  =  (DepartmentType) list.get(0);
			assertNotEquals(id,  obj.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
	
	@SuppressWarnings("resource")
	@Test
	public void t002_remove() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			DepartmentType obj  =  (DepartmentType) list.get(0);
			Long id = obj.getObjId();
			list.get(10);
			assertTrue(  list.remove(obj));
			obj  =  (DepartmentType) list.get(0);
			assertNotEquals(id,  obj.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
	
	
}
