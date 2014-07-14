package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;

import javax.persistence.EntityManager;
import static com.octo.java.sql.query.Query.c;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

import com.octo.java.sql.exp.Operator;

public class SingleDataControlTest {

	private static EntityManager em;
	private  static FactoryDC factory;

	
	static{
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
	public void getObject() {
		try {
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
	public void scrolling() {
		try {
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			Long id = new Long(10);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
System.out.println(row.getObjId());				
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
System.out.println(dc.getCurrentObject().getObjId());				

			id = new Long(270);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
System.out.println(row.getObjId());				
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
System.out.println(dc.getCurrentObject().getObjId());				

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void defaultSearchCriteriaWithConstant() {
		try {
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.getDefaultQuery().where(c("objId")).op(Operator.GT, new Long(30));
			DepartmentsDAO row = dc.getCurrentObject();
			assertEquals(row.getObjId(), new Long(40));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void defaultSearchCriteriaWithExpression() {
		try {
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
	public void removeAndScroll() {
		try {
			DataControl<DepartmentsDAO> dc = factory.initDepartments("");
			dc.getElResolver().setValue("departments", dc);
			dc.setPageSize(5);
			dc.getCurrentObject();
			for (int i = 0 ; i< 4; i++) {
				dc.removeObject();
			} 
			
			dc.forceRefresh();

			Long id = new Long(50);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
System.out.println(row.getObjId());				
				assertEquals(row.getObjId(), id);
				id = id + 10L;
				dc.nextObject();
			} while (dc.hasNext());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
System.out.println(dc.getCurrentObject().getObjId());				

			id = new Long(270);
			do {
				DepartmentsDAO row = dc.getCurrentObject();
System.out.println(row.getObjId());				
				assertEquals(row.getObjId(), id);
				id = id - 10L;
				dc.prevObject();
			} while (dc.hasPrev());
			// Check last row
			assertEquals(dc.getCurrentObject().getObjId(), id);
System.out.println(dc.getCurrentObject().getObjId());				
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
}
