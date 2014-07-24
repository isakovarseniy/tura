package org.tura.platform.test;

import static com.octo.java.sql.query.Query.c;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.runners.MethodSorters;

import java.text.ParseException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.PostCreateTrigger;
import org.tura.platform.datacontrol.command.PostQueryTrigger;
import org.tura.platform.datacontrol.command.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

import com.octo.java.sql.exp.Operator;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleDataControlTest {

	private static EntityManager em;
	private static FactoryDC factory;

	private static Logger logger;

	static {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);

		factory = new FactoryDC("SingleDataControl");
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void t1_getObject() {
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();
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
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Long id = new Long(10);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
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
				DepartmentsDAO row = dc.getCurrentObject();
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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getDefaultQuery().where(c("objId"))
					.op(Operator.GT, new Long(30));
			DepartmentsDAO row = dc.getCurrentObject();
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
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getElResolver().setValue("limit", new Long(30));
			dc.getDefaultQuery().where(c("objId")).op(Operator.GT, "#{limit}");
			DepartmentsDAO row = dc.getCurrentObject();
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
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.removeObject();
			}
			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			dc.forceRefresh();

			Long id = new Long(50);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
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
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

			dc.getCommandStack().commitCommand();

			id = new Long(50);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t6_defaultSearchCriteriaWithConstantUpdateRequery() {
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getDefaultQuery().where(c("objId"))
					.op(Operator.EQ, new Long(70));
			DepartmentsDAO row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(70));

			row.setDepartmentName("test");
			row.setDepartmentName("qwerty");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.getCommandStack().commitCommand();

			dc.forceRefresh();
			row = dc.getCurrentObject();
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
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");

			dc.getElResolver().setValue("departments", dc);
			dc.setPreQueryTrigger(new DepartmentDCPreQueryTrigger());
			dc.setPostQueryTrigger(new DepartmentDCPostQueryTrigger());
			DepartmentsDAO row = dc.getCurrentObject();
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
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.setPostCreateTrigger(new DeparmentPostCreatTrigger());

			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.nextObject();
			}

			DepartmentsDAO d1 = dc.createObject();
			assertEquals(d1.getDepartmentName(), "test");
			DepartmentsDAO d2 = dc.createObject();
			assertEquals(d2.getDepartmentName(), "test");

			d1.setDepartmentName("d1");
			d2.setDepartmentName("d2");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.forceRefresh();

			Long id = new Long(50);
			for (int i = 0; i < 4; i++) {
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			}

			id = new Long(2);
			for (int i = 0; i < 2; i++) {
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id - 1L;
				dc.nextObject();
			}

			id = new Long(90);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
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

			dc.getCommandStack().commitCommand();

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			dc.forceRefresh();

			id = new Long(1);
			for (int i = 0; i < 2; i++) {
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 1L;
				dc.nextObject();
			}

			id = new Long(50);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
				logger.info(row.getObjId().toString());
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
			logger.info(dc.getCurrentObject().getObjId().toString());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public class DeparmentPostCreatTrigger implements PostCreateTrigger {

		@Override
		public void execute(DataControl<?> datacontrol, Object obj)
				throws TuraException {

			DepartmentsDAO d = (DepartmentsDAO) obj;
			d.setDepartmentName("test");

		}

	}

	public class DepartmentDCPreQueryTrigger implements PreQueryTrigger {

		@Override
		public void execute(DataControl<?> datacontrol) throws TuraException {
			try {
				datacontrol.getQuery().where(c("objId"))
						.op(Operator.EQ, new Long(70));
			} catch (Exception e) {
				throw new TuraException(e);
			}

		}
	}

	public class DepartmentDCPostQueryTrigger implements PostQueryTrigger {

		@Override
		public void execute(DataControl<?> datacontrol, Object obj)
				throws TuraException {

			DepartmentsDAO d = (DepartmentsDAO) obj;
			d.setDepartmentName("test");
		}

	}

}
