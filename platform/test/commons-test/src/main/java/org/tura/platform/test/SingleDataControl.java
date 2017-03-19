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

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.objects.jpa.Department;

import com.octo.java.sql.exp.Operator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleDataControl {

	private static EntityManager em;
	private static Factory factory;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass() throws Exception {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		Properties properties = new Properties();
		String propFile = "config.properties";
		InputStream io = SingleDataControl.class.getClassLoader().getResourceAsStream(propFile);
		if (io != null) {
			properties.load(io);
		} else {
			throw new Exception(propFile + " is not found");
		}

		String clazzName = properties.getProperty("factory");
		Class<?> clazz = Class.forName(clazzName);
		Constructor<?> constructor = clazz.getConstructor(new Class<?>[] { String.class });
		factory = (Factory) constructor.newInstance("SingleDataControl");

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
	public void t1_getObject() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			Department row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(10));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t2_scrolling() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Long id = new Long(10);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

			id = new Long(270);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_defaultSearchCriteriaWithConstant() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue(new Long(30));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			Department row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(40));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_defaultSearchCriteriaWithExpression() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getElResolver().setValue("limit", new Long(30));

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.GT.name());
			s.setValue("#{limit}");
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			Department row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(40));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t5_removeScrollDownScrollUpCpmmitScrollDown() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
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
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

			id = new Long(270);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

			dc.getCommandStack().commitCommand();

			id = new Long(50);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t6_defaultSearchCriteriaWithConstantUpdateRequery() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);

			ArrayList<SearchCriteria> sc = new ArrayList<>();

			SearchCriteria s = new SearchCriteria();
			s.setName("objId");
			s.setComparator(Operator.EQ.name());
			s.setValue(new Long(70));
			sc.add(s);

			dc.setDefaultSearchCriteria(sc);

			Department row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(70));

			factory.adaptDepartment(dc.getCurrentObject()).setDepartmentName("test");
			factory.adaptDepartment(dc.getCurrentObject()).setDepartmentName("qwerty");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.getCommandStack().commitCommand();

			dc.forceRefresh();
			row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals("qwerty", row.getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t7_preQueryPostQueryTriggers() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");

			dc.getElResolver().setValue("departments", dc);
			dc.setPreQueryTrigger(new DepartmentDCPreQueryTrigger());
			dc.setPostQueryTrigger(new DepartmentDCPostQueryTrigger());
			Department row = factory.adaptDepartment(dc.getCurrentObject());
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
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.setPostCreateTrigger(new DeparmentPostCreatTrigger());

			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.nextObject();
			}

			int beforeRemove = dc.getScroller().size();

			Department d1 = factory.adaptDepartment(dc.createObject());
			assertEquals(d1.getDepartmentName(), "test");
			Department d2 = factory.adaptDepartment(dc.createObject());
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
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			}

			id = new Long(2);
			for (int i = 0; i < 2; i++) {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 1L;
				dc.nextObject();
			}

			id = new Long(90);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.getCommandStack().commitCommand();

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			dc.forceRefresh();

			id = new Long(1);
			for (int i = 0; i < 2; i++) {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 1L;
				dc.nextObject();
			}

			id = new Long(50);
			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(factory.adaptDepartment(dc.getCurrentObject()).getObjId(), id);
			logger.info(factory.adaptDepartment(dc.getCurrentObject()).getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t9_removeLastRow() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();

			do {
				Department row = factory.adaptDepartment(dc.getCurrentObject());
				logger.info(row.getObjId().toString());
				dc.nextObject();
			} while (dc.hasNext());

			Department row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(270L));
			dc.removeObject();
			row = factory.adaptDepartment(dc.getCurrentObject());
			assertEquals(row.getObjId(), new Long(260L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t10_seek() {
		try {
			factory.initCommandStack();
			DataControl<Object> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Department o = factory.adaptDepartment(dc.getCurrentObject());

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

				assertEquals(o.getObjId(), factory.adaptDepartment(dc.getCurrentObject()).getObjId());

				isSet = dc.setCurrentPosition(26);
				assertEquals(true, isSet);
				assertEquals((long) 270, (long) (factory.adaptDepartment(dc.getCurrentObject()).getObjId()));

				isSet = dc.setCurrentPosition(-3);
				assertEquals(false, isSet);

				isSet = dc.setCurrentPosition(40);
				assertEquals(false, isSet);

				isSet = dc.setCurrentPosition(25);
				assertEquals(true, isSet);
				assertEquals((long) 260, (long) (factory.adaptDepartment(dc.getCurrentObject()).getObjId()));

			} catch (Exception e) {
				e.printStackTrace();
				fail(e.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public class DeparmentPostCreatTrigger implements PostCreateTrigger {

		@Override
		public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {

			try {
				Department d = factory.adaptDepartment(obj);
				d.setDepartmentName("test");
			} catch (Exception e) {
				throw new TuraException(e);
			}
		}
	}

	public class DepartmentDCPreQueryTrigger implements PreQueryTrigger {

		@Override
		public void execute(DataControl<?> datacontrol) throws TuraException {
			try {

				SearchCriteria s = new SearchCriteria();
				s.setName("objId");
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
		public void execute(DataControl<?> datacontrol, Object obj) throws TuraException {

			try {
				Department d = factory.adaptDepartment(obj);
				d.setDepartmentName("test");
			} catch (Exception e) {
				throw new TuraException(e);
			}
		}

	}

}
