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

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;

import com.octo.java.sql.exp.Operator;

public class MasterDetailTest {

	private static EntityManager em;
	private static FactoryDC factory;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass(){
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);

		factory = new FactoryDC("MasterDetail");
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void getObject(){
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeesDAO> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			
			DepartmentsDAO rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeesDAO rowe = dce.getCurrentObject();
			
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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeesDAO> dce = factory.initEmployees("");
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
			
			DepartmentsDAO rowd = dcd.getCurrentObject();
			dcd.nextObject();
			EmployeesDAO rowe = dce.getCurrentObject();
			
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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeesDAO> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);

			EmployeesDAO rowe = dce.createObject();
			rowe.setFirstName("test");
			dce.getCommandStack().commitCommand();
			assertEquals(rowe.getParentId(), new Long(10));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void removeDetailObject(){
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dcd = factory.initDepartments("");
			dcd.getElResolver().setValue("departments", dcd);
			
			DataControl<EmployeesDAO> dce = factory.initEmployees("");
			dce.getElResolver().setValue("employees", dce);
			
			
			Relation relation = new Relation();
			relation.setParent(dcd);
			relation.setChild(dce);
			PropertyLink  link =   new PropertyLink ("objId", "parentId");
			relation.getLinks().add(link);
			
			dcd.addChildren("departmentsToemployees", relation);
			dcd.removeObject();

			DepartmentsDAO rowd = dcd.getCurrentObject();
			EmployeesDAO rowe = dce.getCurrentObject();
			
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
