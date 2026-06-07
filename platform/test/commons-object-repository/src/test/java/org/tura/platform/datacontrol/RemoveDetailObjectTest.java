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
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.access.TopLazyList;

import com.octo.java.sql.query.SelectQuery.Order;

import objects.test.serialazable.jpa.Department2;
import objects.test.serialazable.jpa.Employee2;

public class RemoveDetailObjectTest {

	private static StorageProvider storageProvider = StorageFactory.getStorage();
	
	public static Class<?> deparmentClass =  Department2.class;
	public static Class<?> employeeClass  = Employee2.class;
	public static String deparmentString = "Department2";
	public static String employeeString  = "Employee2";
	
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
		try {
			storageProvider.initData("InitDB0",employeeString);
			storageProvider.commitTransaction();
		} catch (ParseException e) {
			e.printStackTrace();
		}

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
			list.setOrderCriteria(getOrderBy());
			Department2 obj  =  (Department2) list.get(0);
			
			List<Employee2>  empList = obj.getEmployee2();
			Employee2 emp  =   empList.get(0);
			Long id = emp.getObjId();
			
			empList.remove(emp);
			emp  =   empList.get(0);
			assertNotEquals(id,  emp.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
			e.printStackTrace();
			fail();
		}
	}
		
   @Test	
	@SuppressWarnings("resource")
	public void t002_remove() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = storageProvider.getCpaStorageProvider();
			
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			list.setOrderCriteria(getOrderBy());
			Department2 obj  =  (Department2) list.get(0);
			
			List<Employee2>  empList = obj.getEmployee2();
			Employee2 emp  =   empList.get(0);
			Long id = emp.getObjId();

			
			empList.get(10);
			
			empList.remove(emp);
			emp  =   empList.get(0);
			assertNotEquals(id,  emp.getObjId());
			stackProvider.get().commit();
			
		}catch(Exception e){
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
