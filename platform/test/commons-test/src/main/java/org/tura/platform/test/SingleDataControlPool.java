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

import static org.junit.Assert.*;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Stack;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.CommandStack.SavePoint;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.command.base.DataControlCommand;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.data.CommandStackData;
import org.tura.platform.datacontrol.data.PoolData;
import org.tura.platform.datacontrol.data.ShiftControlData;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.hr.model.DepartmentType;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.QueryException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleDataControlPool {

	private static EntityManager em;
	private static Factory factory;

	private static Logger logger;
	private static Server server;


	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		
		Properties properties = new Properties();
		String propFile = "config.properties";		
		InputStream io = SingleDataControlPool.class.getClassLoader().getResourceAsStream(propFile);
		if (io != null){
			properties.load(io);
		}else{
			throw new Exception(propFile + " is not found"); 
		}
		
		String clazzName = properties.getProperty("factory");
		Class<?> clazz = Class.forName(clazzName);
		Constructor<?> constructor =    clazz.getConstructor(new Class<?>[]{String.class});
		factory = (Factory)constructor.newInstance("SingleDataControl");
		
		
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
	public void t1_getApplyCreateModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			DepartmentType newrow = factory.getNewDepartmentType();
			newrow.setObjId(123L);

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(),
					dc.getBaseClass(), PoolCommand.C.name(), "1");
			pager.addCommand(e);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), new Long(123L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	@Test
	public void t1_getApplyUpdateModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			DepartmentType newrow = factory.getNewDepartmentType();
			newrow.setObjId(row.getObjId());
			newrow.setDescription("Updated object");
			
			
			//emulate behavior of pager 
			newrow = (DepartmentType) ((ObjectControl)newrow).clone();
			

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(),
					dc.getBaseClass(), PoolCommand.U.name(), "1");
			pager.addCommand(e);

			row = dc.getCurrentObject();

			assertEquals(row.getDescription(), "Updated object");
			assertNotNull(getStackProvider((ObjectControl) row));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
	
	
	@Test
	public void t2_getApplyRemoveModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			DepartmentType newrow = factory.getNewDepartmentType();
			newrow.setObjId(10L);

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(),
					dc.getBaseClass(), PoolCommand.R.name(), "1");
			pager.addCommand(e);

			row = dc.getCurrentObject();

			assertEquals(new Long(20L), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_getApplyUpdateModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();
			dc2.nextObject();
			DepartmentType newrow = dc2.getCurrentObject();
			newrow.setDepartmentName("test dep");

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(10));
			assertEquals(row.getDepartmentName(), "Administration");

			dc.nextObject();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(20L));
			assertEquals(row.getDepartmentName(), "test dep");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_getApplyCreateUpdateModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			Pager<?> pager = getPager(dc);

			DepartmentType newrow = factory.getNewDepartmentType();
			newrow.setObjId(123L);

			PoolElement e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(),
					dc.getBaseClass(), PoolCommand.C.name(), "1");
			pager.addCommand(e);

			newrow.setDepartmentName("test dep");

			e = new PoolElement(newrow, ((ObjectControl) newrow).getKey(),
					dc.getBaseClass(), PoolCommand.U.name(), "1");
			pager.addCommand(e);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), new Long(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			dc.nextObject();
			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), new Long(10L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t5_savePoint() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DepartmentType row = dc.getCurrentObject();

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();
			DepartmentType newrow = dc2.createObject();
			newrow.setDepartmentId(123L);
			newrow.setDepartmentName("test dep");

			row = dc.getCurrentObject();

			assertEquals(row.getDepartmentId(), new Long(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			dc.getCommandStack().savePoint();

			row = dc.getCurrentObject();

			dc.nextObject();
			row = dc.getCurrentObject();
			dc.removeObject();

			row = dc.getCurrentObject();

			assertEquals(new Long(20L), row.getObjId());

			dc.getCommandStack().rallbackSavePoint();
			dc.prevObject();

			row = dc.getCurrentObject();

			assertEquals(row.getDepartmentId(), new Long(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			try {
				dc.getCommandStack().rallbackSavePoint();
				fail("Should be exception");
			} catch (TuraException e1) {

			}

			dc.getCommandStack().rallbackCommand();

			row = dc.getCurrentObject();
			assertEquals(new Long(10L), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t6_commitWithsavePoint() {
		try {
			em.getTransaction().begin();
			Repository repo = factory.getRepository();
			
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			row = dc.createObject();
			row.setDepartmentName("test department");

			dc.getCommandStack().savePoint();
			dc.removeObject();

			repo.applyChanges(null);
			em.getTransaction().commit();

			row = dc.getCurrentObject();

			assertEquals(new Long(10L), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t7_updateWithDefaultSearchCriteria() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());

			for (int i = 0; i < 2; i++) {

				DepartmentType row = dc.getCurrentObject();
				row.setDepartmentName("test");
				dc.getElResolver().setValue("cmpId", row.getObjId());

				dc2.forceRefresh();
				dc2.getCommandStack().savePoint();

				DepartmentType row2 = dc2.getCurrentObject();
				assertEquals(row.getObjId(), row2.getObjId());

				dc.nextObject();

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t8_updateWithDefaultSearchCriteria() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());

			dc.nextObject();
			DepartmentType row = dc.getCurrentObject();
			row.setDepartmentName("test");
			dc.forceRefresh();

			for (int i = 0; i < 2; i++) {

				row = dc.getCurrentObject();
				dc.getElResolver().setValue("cmpId", row.getObjId());

				dc2.forceRefresh();
				dc2.getCommandStack().savePoint();
				DepartmentType row2 = dc2.getCurrentObject();
				assertEquals(row.getObjId(), row2.getObjId());

				dc.nextObject();

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	/*  Do not enable this test                                                              */
	/*  This is example of wrong using of datacontrol                          */
	/*  We cannot set field value without setting of current row           */
	/*  itr.next() will scroll list to next row without setting this row as a */ 
	/*  current row for datacontrol                                                        */
	public void t9_randomUpdateWithDefaultSearchCriteria() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());

			DepartmentType row = dc.getCurrentObject();
			ShiftControlData d = getShiftControlData(dc);

			Iterator<DepartmentType> itr = dc.getScroller().iterator();
			for (int i = 0; i < 2; i++) {
				row = itr.next();
				row.setDepartmentName("test" + i);
			}

			dc.getElResolver().setValue("cmpId", row.getObjId());

			
			ShiftControlData d2 = getShiftControlData(dc2);
			
			Stack<SavePoint> savePoints = getCommands(dc.getCommandStack());
			String id = getId(dc.getCommandStack());

			CommandStackData csd = (CommandStackData) savePoints.get(0).getData().get(id);
			List<DataControlCommand> cmdLst = csd.getTransaction();
			
			//FIXIT ROW BELOW
//			row = (DepartmentType) cmdLst.get(0).getParameters().get(0).getObj();
			// assertEquals(new Long (10), row.getObjId());

			//FIXIT ROW BELOW
//			row = (DepartmentType) cmdLst.get(1).getParameters().get(0).getObj();
			// assertEquals(new Long (20), row.getObjId());

			
			dc2.forceRefresh();
			dc.getCommandStack().savePoint();

			DepartmentType row2 = dc2.getCurrentObject();
			assertEquals(new Long(20), row2.getObjId());

			row2.setDepartmentName("test3");

			itr = dc.getScroller().iterator();
			row = (DepartmentType) itr.next();
			assertEquals("test0", row.getDepartmentName());

			row = (DepartmentType) itr.next();
			assertEquals("test3", row.getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	
	@Test
	public void t10_isolationDataCalontrol() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			DepartmentType row = dc.getCurrentObject();

			DataControl<DepartmentType> dc2 = factory.initDepartments("N");
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();

			dc2.islolate();
			DepartmentType   obj = dc2.createObject();
			obj.setDepartmentName("test department");
			obj.setDescription("test description");
			
			dc.forceRefresh();
			DepartmentType row1 = dc.getCurrentObject();
			
			assertEquals(row.getObjId(), row1.getObjId());

			dc2.flush();
			dc.forceRefresh();
			row1 = dc.getCurrentObject();
			assertEquals(obj.getObjId(), row1.getObjId());
			
			dc.nextObject();
			row1 = dc.getCurrentObject();
			assertEquals(row.getObjId(), row1.getObjId());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
	
	private void createQuery(DataControl<?> control, String entity)
			throws QueryException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		ArrayList<SearchCriteria> sc = new ArrayList<>();

		SearchCriteria s = new SearchCriteria();
		s .setName("objId");
		s.setComparator(Operator.EQ.name());
		s.setValue("#{cmpId}");
		sc.add(s);
		
		control.setDefaultSearchCriteria(sc);
		
		
	}

	@SuppressWarnings("unchecked")
	private Stack<SavePoint> getCommands(CommandStack cs)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Field field = CommandStack.class.getDeclaredField("savePoints");
		field.setAccessible(true);

		return (Stack<SavePoint>) field.get(cs);

	}

	private String getId(CommandStack cs) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = CommandStack.class.getDeclaredField("id");
		field.setAccessible(true);

		return (String) field.get(cs);

	}
	
	private ShiftControlData getShiftControlData(DataControl<?> dc)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException, TuraException {
		Pager<?> pager = getPager(dc);
		return pager.getShifter().getShiftControlData();
		
	}

	@SuppressWarnings("unused")
	private PoolData getPoolData(DataControl<?> dc) throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Pager<?> pager = getPager(dc);
		Method m = Pager.class
				.getMethod("getPoolData", new Class<?>[] {});
		m.setAccessible(true);
		return (PoolData) m.invoke(pager, new Object[] {});
	}

	private Pager<?> getPager(DataControl<?> dc) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = DataControl.class.getDeclaredField("pager");
		field.setAccessible(true);
		return (Pager<?>) field.get(dc);
	}

	private ProxyCommadStackProvider getStackProvider(ObjectControl oc)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = oc.getClass().getDeclaredField("stackProvider");
		field.setAccessible(true);
		return (ProxyCommadStackProvider) field.get(oc);
	}
	
	
}