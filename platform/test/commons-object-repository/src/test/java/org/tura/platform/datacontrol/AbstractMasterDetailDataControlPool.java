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


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.StorageFactory;
import org.tura.platform.repository.init.StorageProvider;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

@TestMethodOrder(MethodOrderer.MethodName.class)
public abstract class AbstractMasterDetailDataControlPool {

	private static StorageProvider storageProvider = StorageFactory.getStorage();

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	protected abstract void setParent(DepartmentType dep, EmployeeType newrow,CpaRepository repository) throws Exception ;
	
	
	@AfterAll
	public static void afterClass() throws Exception {
		storageProvider.stopServer();
	}
	
	
	public static void beforeClass() throws Exception{
		PlatformConfig.TEST_MODE = true;
		storageProvider.startServer();
		storageProvider.initSession();
		

		storageProvider.startTransaction();
		storageProvider.initData("InitDB0", deparmentString,employeeString);
		storageProvider.commitTransaction();

	}
	
	
	@BeforeEach
	public void init() throws Exception{
		storageProvider.clean();
	}	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t1_getApplyCreateModification() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			
			DataControl<DepartmentType> dcd = (DataControl<DepartmentType>) storageProvider.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);

			DataControl<DepartmentType> dcd1 = (DataControl<DepartmentType>) storageProvider.initDepartments("N", deparmentString);
			dcd.getElResolver().setValue("Ndepartments", dcd1);
			
			
			DataControl<EmployeeType> dce = (DataControl<EmployeeType>) storageProvider.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			storageProvider.setRelatioin(dcd, dce);

			DepartmentType dep1 =  dcd1.getCurrentObject();
			
			EmployeeType newrow = (EmployeeType) repository.create(employeeClass);
			setParent(dep1, newrow,repository);
			
			EmployeeType rowe = dce.getCurrentObject();

			assertEquals(  newrow.getObjId(),rowe.getObjId());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

	@SuppressWarnings("unchecked")
	@Test
	public void t2_getApplyCreateModificationIsolated() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			
			DataControl<DepartmentType> dcd = (DataControl<DepartmentType>) storageProvider.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			
			DataControl<DepartmentType> dcd1 = (DataControl<DepartmentType>) storageProvider.initDepartments("N", deparmentString);
			dcd.getElResolver().setValue("Ndepartments", dcd1);
			
			DataControl<EmployeeType> dce = (DataControl<EmployeeType>) storageProvider.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);

			storageProvider.setRelatioin(dcd, dce);
			
			DepartmentType dep1 =  dcd1.getCurrentObject();

			EmployeeType rowe = dce.getCurrentObject();
			
			EmployeeType newrow = (EmployeeType) repository.create(employeeClass);

			EmployeeType rowe1 = dce.getCurrentObject();

			assertEquals( rowe1.getObjId(),rowe.getObjId());
			
			setParent(dep1, newrow,repository);

			rowe = dce.getCurrentObject();

			assertEquals(  newrow.getObjId()  ,rowe.getObjId());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void t3_getApplyCreateModificationMasterIsolated() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			
			DataControl<DepartmentType> dcd = (DataControl<DepartmentType>) storageProvider.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = (DataControl<EmployeeType>) storageProvider.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			storageProvider.setRelatioin(dcd, dce);

			
			DepartmentType rowd =  dcd.getCurrentObject();
			EmployeeType rowe = dce.getCurrentObject();

			
			DepartmentType newrow = (DepartmentType) repository.create(deparmentClass);

	        DepartmentType rowd1 = dcd.getCurrentObject();
			EmployeeType rowe1 = dce.getCurrentObject();
			

			assertEquals( rowd.getObjId(),rowd1.getObjId());
			assertEquals( rowe.getObjId(),rowe1.getObjId());

			repository.insert(newrow, deparmentClass);
			
			rowd =  dcd.getCurrentObject();
			rowe = dce.getCurrentObject();

			assertEquals( newrow.getObjId(),rowd.getObjId());
			assertNull(rowe);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void t4_getApplyCreateModificationMasterIsolated() {
		try {
			CpaRepository repository = storageProvider.getRepository();
			
			DataControl<DepartmentType> dcd = (DataControl<DepartmentType>) storageProvider.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = (DataControl<EmployeeType>) storageProvider.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			storageProvider.setRelatioin(dcd, dce);

			
			DepartmentType rowd =  dcd.getCurrentObject();
			EmployeeType rowe = dce.getCurrentObject();

			DepartmentType newrow = (DepartmentType) repository.create(deparmentClass);
			newrow.setDepartmentName("qqq");
			repository.insert(newrow, deparmentClass);
			
			rowd =  dcd.getCurrentObject();
			rowe = dce.getCurrentObject();

			assertEquals( newrow.getObjId(),rowd.getObjId());
			assertEquals( "qqq",rowd.getDepartmentName());
			assertNull(rowe);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

	
}
