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
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;

public class CompessorTest {

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

		factory = new FactoryDC("Compressor");
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Before
	public void before(){
		FactoryDC.list.clear();
	}
	
	
	@Test
	public void t0_updateCommands(){
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();
			
			row.setDepartmentName("test1");
			row.setDescription("test2");
			
			dc.getCommandStack().commitCommand();
			assertEquals(1, FactoryDC.list.size()); 
			
			Object[] array = (Object[]) FactoryDC.list.get(0);
			
			DepartmentsDAO obj = (DepartmentsDAO) array[0];

			assertEquals(new Character('U'),array[1]); 
			assertEquals("test1",obj.getDepartmentName()); 
			assertEquals("test2",obj.getDescription()); 
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void t0_CreateUpdateCommands(){
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();
			row = dc.createObject();
			
			row.setDepartmentName("test1");
			row.setDescription("test2");
			
			dc.getCommandStack().commitCommand();
			assertEquals(1, FactoryDC.list.size()); 
			
			Object[] array = (Object[]) FactoryDC.list.get(0);
			
			DepartmentsDAO obj = (DepartmentsDAO) array[0];

			assertEquals(new Character('I'),array[1]); 
			assertEquals("test1",obj.getDepartmentName()); 
			assertEquals("test2",obj.getDescription()); 
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
		
	}
	
	
	
	
}
