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
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.test.hr.model.DepartmentType;

import com.octo.java.sql.exp.Operator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleDataControl {

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
		
		
//		ConsoleHandler handler = new ConsoleHandler();
//		handler.setFormatter(new LogFormatter());
//		logger.addHandler(handler);
//		logger.setLevel(Level.INFO);


		Properties properties = new Properties();
		String propFile = "config.properties";		
		InputStream io = SingleDataControl.class.getClassLoader().getResourceAsStream(propFile);
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
	public void t1_getObject() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(10));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t2_scrolling() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Long id = new Long(10);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

			id = new Long(270);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_defaultSearchCriteriaWithConstant() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			
			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s .setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue(new Long(30));
			sc.add(s);
			
			dc.setDefaultSearchCriteria(sc);
			
			
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(40));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_defaultSearchCriteriaWithExpression() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getElResolver().setValue("limit", new Long(30));
			
			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s .setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue("#{limit}");
			sc.add(s);
			
			dc.setDefaultSearchCriteria(sc);
			
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(40));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t5_removeScrollDownScrollUpCpmmitScrollDown() {
		try {
			Repository repo = factory.getRepository();

			em.getTransaction().begin();
			
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();

			int beforeRemove = dc.getScroller().size();

			for (int i = 0; i < 4; i++) {
				dc.removeObject();
			}

			int afterRemove = dc.getScroller().size();

			int diff = beforeRemove - afterRemove;

			assertEquals(diff, 4);

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			dc.forceRefresh();

			Long id = new Long(50);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

			id = new Long(270);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

			repo.applyChanges(null);
			em.getTransaction().commit();
			
			em.getTransaction().begin();

			id = new Long(50);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());
			
			em.getTransaction().commit();

			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t6_defaultSearchCriteriaWithConstantUpdateRequery() {
		try {
			Repository repo = factory.getRepository();
			em.getTransaction().begin();
			
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			
			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s .setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(new Long(70));
			sc.add(s);
			
			dc.setDefaultSearchCriteria(sc);
			
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(70));

			dc.getCurrentObject().setDepartmentName("test");
			dc.getCurrentObject().setDepartmentName("qwerty");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			repo.applyChanges(null);
			em.getTransaction().commit();

			em.getTransaction().begin();

			dc.forceRefresh();
			row = dc.getCurrentObject();
			assertEquals("qwerty", row.getDepartmentName());
			
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t7_preQueryPostQueryTriggers() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");

			dc.getElResolver().setValue("departments", dc);
			dc.setPreQueryTrigger(new DepartmentDCPreQueryTrigger());
			dc.setPostQueryTrigger(new DepartmentDCPostQueryTrigger());
			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(70));
			assertEquals(row.getDepartmentName(), "test");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t8_scrollDownAddCommitScrollDown() {
		try {
			Repository repo = factory.getRepository();
			em.getTransaction().begin();
			
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.setPostCreateTrigger(new DeparmentPostCreatTrigger());

			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.nextObject();
			}

			int beforeRemove = dc.getScroller().size();

			DepartmentType d1 = dc.createObject();
			assertEquals(d1.getDepartmentName(), "test");
			DepartmentType d2 = dc.createObject();
			assertEquals(d2.getDepartmentName(), "test");

			int afterRemove = dc.getScroller().size();

			int diff = beforeRemove - afterRemove;

			assertEquals(diff, -2);

			d1.setDepartmentName("d1");
			d2.setDepartmentName("d2");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.forceRefresh();

			Long id = new Long(50);
			for (int i = 0; i < 4; i++) {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			}

			id = d2.getObjId();
			for (int i = 0; i < 2; i++) {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 1L;
				dc.nextObject();
			}

			id = new Long(90);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			repo.applyChanges(null);
			em.getTransaction().commit();

			em.getTransaction().begin();
			
			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			dc.forceRefresh();

			id = d1.getObjId();
			for (int i = 0; i < 2; i++) {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 1L;
				dc.nextObject();
			}

			id = new Long(50);
			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());
			
			em.getTransaction().rollback();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t9_removeLastRow() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();

			do {
				DepartmentType row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				dc.nextObject();
			} while (dc.hasNext());

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(270L));
			dc.removeObject();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(260L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t10_seek() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			DepartmentType o = dc.getCurrentObject();

			
			List<Object[]> options = new ArrayList<>();
			try {
				List<?> scroler = dc.getScroller();

				Iterator<?> itr = scroler.iterator();
				while (itr.hasNext()) {
					Object obj = itr.next();
					Object objLabel = Reflection.call(obj, "getObjId");
					Object objValue = Reflection.call(obj, "getDepartmentName");
					options.add(new Object[] { objLabel, objValue });
				}
				boolean isSet = dc.setCurrentPosition(0);
				assertEquals(true, isSet);

				assertEquals(o.getObjId(), dc.getCurrentObject().getObjId());
				
				
				isSet = dc.setCurrentPosition(26);
				assertEquals(true, isSet);
				assertEquals((long)270, (long)(dc.getCurrentObject().getObjId()));
				
				isSet = dc.setCurrentPosition(-3);
				assertEquals(false, isSet);
				
				isSet = dc.setCurrentPosition(40);
				assertEquals(false, isSet);
				
				
				isSet = dc.setCurrentPosition(25);
				assertEquals(true, isSet);
				assertEquals((long)260, (long)(dc.getCurrentObject().getObjId()));
				
				
			} catch (Exception e) {
				e.printStackTrace();
				fail(e.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t11_rallback() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			DepartmentType o = dc.getCurrentObject();
			
			dc.createObject();
			
			dc.getCommandStack().rallbackCommand();

			DepartmentType o1 = dc.getCurrentObject();
			assertEquals(o.getObjId(), o1.getObjId());
			
			

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void t12_create() {
		final  int[] createRow = {0};

		try {
			
			DataControl<DepartmentType> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.addEventLiteners(new EventListener(){

				@Override
				public void handleEventListener(Event event) throws TuraException {
					createRow[0]++;
				}
				
			});
			
			dc.createObject();
			assertEquals(1, createRow[0]);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	
	
	public class DeparmentPostCreatTrigger implements PostCreateTrigger {

		@Override
		public void execute(DataControl<?> datacontrol, Object obj)
				throws TuraException {
          try{
			Reflection.call(obj,"setDepartmentName","test");
          }catch(Exception e){
        	  throw new TuraException(e);
          }

		}

	}

	public class DepartmentDCPreQueryTrigger implements PreQueryTrigger {

		@Override
		public void execute(DataControl<?> datacontrol) throws TuraException {
			try {

				SearchCriteria s = new SearchCriteria();
				s .setName("objId");
				s.setComparator(Operator.EQ.name());
				s.setValue(new Long(70));
				s.setClassName(Long.class.getName());
				
				datacontrol.getSearchCriteria().add(s);
				
			} catch (Exception e) {
				throw new TuraException(e);
			}

		}
	}

	public class DepartmentDCPostQueryTrigger implements PostQueryTrigger {

		@Override
		public void execute(DataControl<?> datacontrol, Object obj)
				throws TuraException {

			DepartmentType d = (DepartmentType) obj;
			d.setDepartmentName("test");
		}

	}

}
