/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.test.hr.model.DepartmentType;
import org.tura.platform.test.hr.model.EmployeeType;

import com.octo.java.sql.exp.Operator;

public class MasterDetail {

	private static EntityManager em;
	private static Factory factory;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass() throws Exception{
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
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			
			DepartmentType rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			assertEquals(rowd.getObjId(), new Long(10));
			assertEquals(rowe.getObjId(), new Long(201));
			
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
			s.setValue(new Long(30));
			sc.add(s);
			
			dce.setDefaultSearchCriteria(sc);
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			
			DepartmentType rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			assertEquals(rowd.getObjId(), new Long(10));
			assertEquals(rowe.getObjId(), new Long(201));
			
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
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);

			EmployeeType rowe = dce.createObject();
			rowe.setFirstName("test");

			repo.applyChanges(null);

			assertEquals(rowe.getParentId(), new Long(10));
			
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
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			dcd.removeObject();

			DepartmentType rowd = dcd.getCurrentObject();
			EmployeeType rowe = dce.getCurrentObject();
			
			dcd.getShifter().setLogger(logger);
			dcd.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			logger.info("++++++++++++++++++++++++++++++++++++++++++");
			dce.getShifter().setLogger(logger);
			dce.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
		    assertEquals(rowd.getObjId(), new Long(20));
		    assertEquals(rowe.getParentId(), new Long(20));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	


	
}
