package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingleDataControlPoolTest {

	private static EntityManager em;
	private static FactoryDC factory;

	private static Logger logger;

	@BeforeClass
	public static void beforeClass() {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

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
	public void t1_getApplyCreateModification() {
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();

			DepartmentsDAO newrow = new DepartmentsDAO();
			newrow.setObjId(123L);

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.C.name(), "1");
			pager.addCommandt(e);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), new Long(123L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t2_getApplyRemoveModification() {
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();

			DepartmentsDAO newrow = new DepartmentsDAO();
			newrow.setObjId(10L);

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.R.name(), "1");
			pager.addCommandt(e);

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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();

			DepartmentsDAO newrow = new DepartmentsDAO();
			newrow.setObjId(10L);
			newrow.setDepartmentName("test dep");

			Pager<?> pager = getPager(dc);

			PoolElement e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.U.name(), "1");
			pager.addCommandt(e);

			row = dc.getCurrentObject();

			assertEquals(row.getDepartmentName(), "test dep");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_getApplyCreateUpdateModification() {
		try {
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();

			Pager<?> pager = getPager(dc);

			DepartmentsDAO newrow = new DepartmentsDAO();
			newrow.setObjId(123L);

			PoolElement e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.C.name(), "1");
			pager.addCommandt(e);

			newrow.setDepartmentName("test dep");

			e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.U.name(), "1");
			pager.addCommandt(e);

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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();

			Pager<?> pager = getPager(dc);

			DepartmentsDAO newrow = new DepartmentsDAO();
			newrow.setObjId(123L);

			PoolElement e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.C.name(), "1");
			pager.addCommandt(e);

			newrow.setDepartmentName("test dep");

			e = new PoolElement(newrow, dc.getObjectKey(newrow),
					dc.getBaseClass(), PoolCommand.U.name(), "1");
			pager.addCommandt(e);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), new Long(123L));
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

			assertEquals(row.getObjId(), new Long(123L));
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
			factory.initCommandStack();
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			DepartmentsDAO row = dc.getCurrentObject();
			
			row = dc.createObject();
			row.setDepartmentName("test department");
			
			dc.getCommandStack().savePoint();
			dc.removeObject();
			
			dc.getCommandStack().commitCommand();
			
			row = dc.getCurrentObject();

			assertEquals(new Long(10L), row.getObjId());
	
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
	
	private Pager<?> getPager(DataControl<?> dc) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = DataControl.class.getDeclaredField("pager");
		field.setAccessible(true);
		return (Pager<?>) field.get(dc);
	}

}