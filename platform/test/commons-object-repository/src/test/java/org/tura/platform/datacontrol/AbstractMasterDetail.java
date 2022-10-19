/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

import com.octo.java.sql.exp.Operator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class AbstractMasterDetail {

	protected static Factory factory;

	private static Server server;

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

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
	public void getObject(){
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			ArrayList<OrderCriteria> ord = new ArrayList<>();
			
			OrderCriteria o = new OrderCriteria();
			o.setName("objId");
			o.setOrder("ASC");
			ord.add(o);
			
			dce.setDefaultOrderCriteria(ord);
			
			factory.setRelatioin(dcd, dce);
			
			DepartmentType rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			assertEquals(rowd.getObjId(),  factory.cDept(Long.valueOf(10)));
			assertEquals(rowe.getObjId(),  factory.cEmp(Long.valueOf(201)));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void getObjectWithDefailtWhere(){
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s .setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue( factory.cDept(Long.valueOf(30)));
			sc.add(s);
			
			dce.setDefaultSearchCriteria(sc);
			
			ArrayList<OrderCriteria> ord = new ArrayList<>();
			
			OrderCriteria o = new OrderCriteria();
			o.setName("objId");
			o.setOrder("ASC");
			ord.add(o);
			
			dce.setDefaultOrderCriteria(ord);
			
			
			factory.setRelatioin(dcd, dce);
			
			DepartmentType rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			assertEquals(rowd.getObjId(),  factory.cDept(Long.valueOf(10)));
			assertEquals(rowe.getObjId(),  factory.cEmp(Long.valueOf(201)));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

	@Test
	public void createDetailObject(){
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			
			factory.setRelatioin(dcd, dce);

			EmployeeType rowe = dce.createObject();
			rowe.setFirstName("test");

			stackProvider.get().commit();

			DepartmentType parent =  (DepartmentType) dce.getPager().getParentObject();
			
			assertEquals(parent.getObjId(),  Long.valueOf(10));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void t11_rallback() {
		try {
			
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			
			factory.setRelatioin(dcd, dce);
			
			dcd.getCurrentObject();
			EmployeeType o = dce.getCurrentObject();
			Long id = o.getObjId();
			
			dce.createObject();
			
			stackProvider.get().rallbackCommand();

			EmployeeType o1 = dce.getCurrentObject();
			assertEquals(id, o1.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	
	@Test
	public void removeDetailObject(){
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			

			factory.setRelatioin(dcd, dce);
			dcd.removeObject();

			DepartmentType rowd = dcd.getCurrentObject();
			
			DepartmentType parent =  (DepartmentType) dce.getPager().getParentObject();
			
		    assertEquals(rowd.getObjId(),  factory.cDept( Long.valueOf(20)));
		    assertEquals(parent.getObjId(),  factory.cDept(Long.valueOf(20)));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void t12_findObjectKey() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);
			

			factory.setRelatioin(dcd, dce);
			
			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			ObjectControl oc1 = (ObjectControl) dce.findObject( key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
            assertTrue( dce.setCurrentPosition(10));
			obj = dce.getCurrentObject();
			oc = (ObjectControl) obj;
			key = oc.getPath();
            
			assertTrue(dce.setCurrentPosition(0));
			dce.getCurrentObject();
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria("objId", Operator.EQ.name(), obj.getObjId(), Long.class.getName() );
			search.add(sc);
			
			oc1 = (ObjectControl) dce.findObject(key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t13_findObjectKey() {
		try {

			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();

			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);

			factory.setRelatioin(dcd, dce);

			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			stackProvider.get().savePoint();
			dce.removeObject();
			ObjectControl oc1 = (ObjectControl) dce.findObject( key);
			assertNull(oc1);
			
			stackProvider.get().rallbackSavePoint();
			
			oc1 = (ObjectControl) dce.findObject( key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	@Test
	public void t14_findObjectKey() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);

			factory.setRelatioin(dcd, dce);
			
			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			RepoKeyPath key = oc.getPath();
			
			assertTrue( dce.setCurrentPosition(10));
			obj = dce.getCurrentObject();
			obj.setEmail("qwerty");
			
			oc = (ObjectControl) obj;
			key = oc.getPath();
            
			assertTrue(dce.setCurrentPosition(0));
			dce.getCurrentObject();
			
			
			ObjectControl oc1 = (ObjectControl) dce.findObject(key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getPath());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	@Test
	public void t15_scrollAndRemove() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("", deparmentString);
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("",employeeString);
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);

			factory.setRelatioin(dcd, dce);

			
			DataControl<DepartmentType> dcd1 = factory.initDepartments("new", deparmentString);
			dcd1.getElResolver().setValue("newdepartments", dcd1);
			
			
			Long id = Long.valueOf(10);
			do {
				DepartmentType row = dcd.getCurrentObject();
				assertEquals(row.getObjId(), factory.cDept(id));
				id = id + 10L;
				dcd.nextObject();
			} while (dcd.hasNext());
			// Check last row
			assertEquals(dcd.getCurrentObject().getObjId(), factory.cDept(id));
			assertEquals(dce.getCurrentObject().getObjId(), factory.cEmp(212L));
			DepartmentType  obj  =  dcd.getCurrentObject();
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria("objId", Operator.EQ.name(), obj.getObjId(), Long.class.getName() );
			search.add(sc);

			
			dcd1.setDefaultSearchCriteria(search);
			dcd1.forceRefresh();
			assertEquals(obj.getObjId(), dcd1.getCurrentObject().getObjId());
			dcd1.removeObject();
			
			assertEquals(dcd.getCurrentObject().getObjId(), factory.cDept(260L));
			assertEquals(dce.getCurrentObject().getObjId(), factory.cEmp(214L));
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}				
	
}
