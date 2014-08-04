package org.tura.platform.test;

import static org.junit.Assert.fail;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.platform.hr.controls.DepartmentsDC;

public class CDITest {

	@Test
	public void getDepartmentControl() {
		try {
			WeldContainer weld = new Weld().initialize();
			DepartmentsDC dc = weld.instance()
					.select(DepartmentsDC.class).get();
			dc.getElResolver().setValue("department", dc);

			dc.getCurrentObject();
			
			dc.getEmployeesdc();

			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());

		}
	}

}
