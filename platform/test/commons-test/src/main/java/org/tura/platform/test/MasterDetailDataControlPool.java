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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.EmployeesDAO;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.datacontrol.metainfo.Relation;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;

public abstract class MasterDetailDataControlPool {

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
		InputStream io = MasterDetailDataControlPool.class.getClassLoader().getResourceAsStream(propFile);
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
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
			em.getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void t1_getApplyCreateModification() {
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
			
			DepartmentsDAO dep =  dcd.getCurrentObject();

			EmployeesDAO newrow = factory.getNewEmployeesDAO();
			newrow.setObjId(123L);
			newrow.setParentId(dep.getObjId());
			
	        Pager<?> pager = getPager(dce);
	        
	        PoolElement e = new PoolElement(newrow, dce.getObjectKey(newrow), dce.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);
	        
			EmployeesDAO rowe = dce.getCurrentObject();

			assertEquals( new Long(123L),rowe.getObjId());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void t2_getApplyCreateModificationIsolated() {
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
			
			DepartmentsDAO dep =  dcd.getCurrentObject();

			EmployeesDAO newrow = factory.getNewEmployeesDAO();
			newrow.setObjId(123L);
			newrow.setParentId(dep.getObjId());

			EmployeesDAO rowe = dce.getCurrentObject();
			
			
	        Pager<?> pager = getPager(dce);
	          
	        dce.islolate();
	        
	        PoolElement e = new PoolElement(newrow, dce.getObjectKey(newrow), dce.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);
	        
	        
			EmployeesDAO rowe1 = dce.getCurrentObject();

			assertEquals( rowe1.getObjId(),rowe.getObjId());

	        dce.flush();
			
			rowe = dce.getCurrentObject();

			assertEquals( new Long(123L),rowe.getObjId());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	
	@Test
	public void t3_getApplyCreateModificationMasterIsolated() {
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

			dcd.islolate();
			
			DepartmentsDAO rowd =  dcd.getCurrentObject();
			EmployeesDAO rowe = dce.getCurrentObject();

			DepartmentsDAO newrow = factory.getNewDepartmentsDAO();
			newrow.setObjId(123L);


			Pager<?> pager = getPager(dcd);
	          
	        PoolElement e = new PoolElement(newrow, dcd.getObjectKey(newrow), dcd.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);
	        
	        
	        DepartmentsDAO rowd1 = dcd.getCurrentObject();
			EmployeesDAO rowe1 = dce.getCurrentObject();
			

			assertEquals( rowd.getObjId(),rowd1.getObjId());
			assertEquals( rowe.getObjId(),rowe1.getObjId());

			dcd.flush();
			
			rowd =  dcd.getCurrentObject();
			rowe = dce.getCurrentObject();

			assertEquals( new Long(123L),rowd.getObjId());
			assertNull(rowe);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	
	private Pager<?> getPager(DataControl<?> dc) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        Field field = DataControl.class.getDeclaredField("pager");
        field.setAccessible(true);
        return (Pager<?>) field.get(dc);	
	}

}
