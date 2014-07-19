package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

public class SingleDataControlTest2 {

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

		factory = new FactoryDC();
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void scrollDownAddCommitScrollDown() {
		try {
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0; i < 4; i++) {
				dc.nextObject();
			}

			DepartmentsDAO d1 = dc.createObject();
			DepartmentsDAO d2 = dc.createObject();

			d1.setDepartmentName("d1");
			d2.setDepartmentName("d2");

			dc.getShifter().setLogger(logger);
			dc.getShifter().print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			dc.forceRefresh();

			Long id = new Long(10);
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

			id = new Long(10);
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

}
