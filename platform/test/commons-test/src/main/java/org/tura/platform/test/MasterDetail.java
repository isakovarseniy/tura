/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

import com.octo.java.sql.exp.Operator;

public abstract class MasterDetail {

	private static EntityManager em;
	private static Factory factory;

	private static Logger logger;
	private static Server server;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		server = Server.createTcpServer().start();
		
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);

		Properties properties = new Properties();
		String propFile = "config.properties";		
		InputStream io = MasterDetail.class.getClassLoader().getResourceAsStream(propFile);
		if (io != null){
			properties.load(io);
		}else{
			throw new Exception(propFile + " is not found"); 
		}
		
		String clazzName = properties.getProperty("factory");
		Class<?> clazz = Class.forName(clazzName);
		Constructor<?> constructor =    clazz.getConstructor(new Class<?>[]{String.class});
		factory = (Factory)constructor.newInstance("MasterDetail");

		em = factory.getEntityManager();
		em.getTransaction().begin();
		
		factory.initDB("Departments", em);
		try {
			factory.initDB("Employes", em);
			em.getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Before
	public void init(){
		factory.clean();
	}	
	
	@Test
	public void getObject(){
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			ArrayList<OrderCriteria> ord = new ArrayList<>();
			
			OrderCriteria o = new OrderCriteria();
			o.setName("objId");
			o.setOrder("ASC");
			ord.add(o);
			
			dce.setDefaultOrderCriteria(ord);
			
			
			factory.setRelatioin(dcd, dce);
//			Relation relation = new Relation();
//			relation.setParent(dcd);
//			relation.setChild(dce);
//			PropertyLink  link =   new PropertyLink ("objId", "parentId");
//			relation.getLinks().add(link);
//			
//			dcd.addChildren("departmentsToemployees", relation);
			
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
			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
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
			
//			Relation relation = new Relation();
//			relation.setParent(dcd);
//			relation.setChild(dce);
//			PropertyLink  link =   new PropertyLink ("objId", "parentId");
//			relation.getLinks().add(link);
//			
//			dcd.addChildren("departmentsToemployees", relation);
			
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
			Repository repo = factory.getRepository();

			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			
			factory.setRelatioin(dcd, dce);
			
//			Relation relation = new Relation();
//			relation.setParent(dcd);
//			relation.setChild(dce);
//			PropertyLink  link =   new PropertyLink ("objId", "parentId");
//			relation.getLinks().add(link);
//			
//			dcd.addChildren("departmentsToemployees", relation);

			EmployeeType rowe = dce.createObject();
			rowe.setFirstName("test");

			repo.applyChanges(null);

			assertEquals(getParent(rowe),  Long.valueOf(10));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void t11_rallback() {
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			factory.setRelatioin(dcd, dce);
			
			
			dcd.getCurrentObject();
			EmployeeType o = dce.getCurrentObject();
			
			
			dce.createObject();
			
			dce.getCommandStack().rallbackCommand();

			EmployeeType o1 = dce.getCurrentObject();
			assertEquals(o.getObjId(), o1.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	
	@Test
	public void removeDetailObject(){
		try {
			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			

			factory.setRelatioin(dcd, dce);
			
//			Relation relation = new Relation();
//			relation.setParent(dcd);
//			relation.setChild(dce);
//			PropertyLink  link =   new PropertyLink ("objId", "parentId");
//			relation.getLinks().add(link);
//			
//			dcd.addChildren("departmentsToemployees", relation);
			dcd.removeObject();

			DepartmentType rowd = dcd.getCurrentObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			dcd.getShifter().setLogger(logger);
			dcd.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			logger.info("++++++++++++++++++++++++++++++++++++++++++");
			dce.getShifter().setLogger(logger);
			dce.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
		    assertEquals(rowd.getObjId(),  factory.cDept( Long.valueOf(20)));
		    assertEquals(getParent(rowe),  factory.cDept(Long.valueOf(20)));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void t12_findObjectKey() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);
			

			factory.setRelatioin(dcd, dce);

			
			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			String key = oc.getKey();
			
			ObjectControl oc1 = (ObjectControl) dce.findObject(null, key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getKey());
			
            assertTrue( dce.setCurrentPosition(10));
			obj = dce.getCurrentObject();
			oc = (ObjectControl) obj;
			key = oc.getKey();
            
			assertTrue(dce.setCurrentPosition(0));
			dce.getCurrentObject();
			
			ArrayList<SearchCriteria> search = new ArrayList<SearchCriteria>();
			SearchCriteria sc = new SearchCriteria("objId", Operator.EQ.name(), obj.getObjId(), Long.class.getName() );
			search.add(sc);
			
			oc1 = (ObjectControl) dce.findObject(search, key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getKey());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t13_findObjectKey() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);
			CommandStack cs = dce.getCommandStack();

			factory.setRelatioin(dcd, dce);

			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			String key = oc.getKey();
			
			cs.savePoint();
			dce.removeObject();
			ObjectControl oc1 = (ObjectControl) dce.findObject(null, key);
			assertNull(oc1);
			
			cs.rallbackSavePoint();
			
			oc1 = (ObjectControl) dce.findObject(null, key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getKey());
			
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	@Test
	public void t14_findObjectKey() {
		try {

			DataControl<DepartmentType> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeeType> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			dce.setPageSize(5);

			factory.setRelatioin(dcd, dce);
			
			EmployeeType obj = dce.getCurrentObject();
			ObjectControl oc = (ObjectControl) obj;
			String key = oc.getKey();
			
			assertTrue( dce.setCurrentPosition(10));
			obj = dce.getCurrentObject();
			obj.setEmail("qwerty");
			
			oc = (ObjectControl) obj;
			key = oc.getKey();
            
			assertTrue(dce.setCurrentPosition(0));
			dce.getCurrentObject();
			
			
			ObjectControl oc1 = (ObjectControl) dce.findObject(null, key);
			assertNotNull(oc1);
            assertEquals(key, oc1.getKey());
			
		}catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
	
	
	public abstract Long getParent(EmployeeType emp);


	
}
