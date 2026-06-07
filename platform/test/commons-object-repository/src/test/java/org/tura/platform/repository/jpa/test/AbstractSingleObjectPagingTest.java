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
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.access.TopLazyList;
import org.tura.platform.test.hr.model.DepartmentType;

import com.octo.java.sql.query.SelectQuery.Order;

@TestMethodOrder(MethodOrderer.MethodName.class)
public abstract class AbstractSingleObjectPagingTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}

	public static void beforeClass() throws Exception {
		PlatformConfig.TEST_MODE = true;
		
		storageProvider.startServer();
		storageProvider.initSession();

		storageProvider.startTransaction();;
		storageProvider.initData("InitDB0", deparmentString,employeeString);
		storageProvider.commitTransaction();

	}

	@SuppressWarnings("resource")
	@Test
	public void t0000_paging() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());
			Long id = 10L;
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				Long rId = storageProvider.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}

			List<StorageControl> array = cpaStorageProvider.get().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(7, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0001_paging() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());

			DepartmentType dpt = (DepartmentType) list.get(0);
			Long rId = storageProvider.cDept(10L);
			assertEquals(rId, dpt.getObjId());

			dpt = (DepartmentType) list.get(26);
			rId = storageProvider.cDept(270L);
			assertEquals(rId, dpt.getObjId());

			try {
				dpt = (DepartmentType) list.get(30);
				fail();
			} catch (Throwable e) {

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0003_paging() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());
			Long id = 10L;
			DepartmentType d1 = (DepartmentType) list.get(0);

			
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				Long rId = storageProvider.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}
			Long rId = storageProvider.cDept(10l);
			assertEquals(rId, d1.getObjId());

			List<StorageControl> array = cpaStorageProvider.get().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(8, array.size());

			d1 = null;
			System.gc();

			id = 10L;
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				rId = storageProvider.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}
			array = cpaStorageProvider.get().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(7, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0004_paging() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());

			DepartmentType d3 = (DepartmentType) list.get(3);
			DepartmentType d4 = (DepartmentType) list.get(4);

			list.remove(3);

			try {
				d3.getObjId();
				fail();
			} catch (Exception e) {

			}

			DepartmentType dpt = (DepartmentType) list.get(25);
			Long rId = storageProvider.cDept(270L);
			assertEquals(rId, dpt.getObjId());

			d3 = (DepartmentType) list.get(3);
			assertEquals(d4.getObjId(), d3.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	@Test
	public void t0005_paging() {
		try {
			CpaRepository repository = storageProvider.getRepository();

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			PlatformConfig.LOADSTEP = 20;
			TopLazyList list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());
			
			list.get(0);
			DepartmentType d1 = (DepartmentType) list.create();
			list.add(3,d1);
			Long o1 = d1.getObjId();
			
			DepartmentType dpt = (DepartmentType) list.get(27);
			Long rId = storageProvider.cDept(270L);
			assertEquals(rId, dpt.getObjId());
			
			list.get(0);
			dpt = (DepartmentType) list.get(3);
			assertEquals(o1, dpt.getObjId());
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	private List< OrderCriteria> getOrderBy(){
		OrderCriteria order = new OrderCriteria("objId",Order.ASC.name());
		List<OrderCriteria> orders = new ArrayList<OrderCriteria>();
		orders.add(order);
		return orders;
		
	}
	
}
