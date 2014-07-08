package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

public class DataControlTest {

	private EntityManager em;
	private FactoryDC factory;

	public DataControlTest() throws ParseException {

		factory = new FactoryDC();
		
		em = factory.getEntityManager();
		new DepartmentsInit(em).init();
		new EmployesesInit(em).init();

	}

	@Test
	public void test() {
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

}
