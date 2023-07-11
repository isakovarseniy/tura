/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.text.ParseException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class AbstractMasterDetailDataControlPool {

	protected static Factory factory;

	private static Server server;

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	protected abstract void setParent(DepartmentType dep, EmployeeType newrow,CpaRepository repository) throws Exception ;
	
	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	public static void beforeClass() throws Exception{
		PlatformConfig.TEST_MODE = true;
		server = Server.createTcpServer().start();
		factory = new Factory();

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		Factory.getRepositoryProducer().em = emf.createEntityManager();

		factory.getEntityManager().getTransaction().begin();

		factory.initDB(deparmentString, factory.getEntityManager());
		try {
			factory.initDB(employeeString, factory.getEntityManager());
			factory.getEntityManager().getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	
	
	@Before
	public void init() throws Exception{
		factory.clean();
	}	
	
	@Test
	public void t1_getApplyCreateModification() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);

			DataControl<DepartmentType> dcd1 = factory.initDepartments("N", deparmentString);
			dcd.getElResolver().setValue("Ndepartments", dcd1);
			
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			factory.setRelatioin(dcd, dce);

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
	
	

	@Test
	public void t2_getApplyCreateModificationIsolated() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			
			DataControl<DepartmentType> dcd1 = factory.initDepartments("N", deparmentString);
			dcd.getElResolver().setValue("Ndepartments", dcd1);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);

			factory.setRelatioin(dcd, dce);
			
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
	
	
	@Test
	public void t3_getApplyCreateModificationMasterIsolated() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			factory.setRelatioin(dcd, dce);

			
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
	
	@Test
	public void t4_getApplyCreateModificationMasterIsolated() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			factory.setRelatioin(dcd, dce);

			
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
