package org.tura.platform.test;

import static org.junit.Assert.fail;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.controls.DepartmentsDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

public class CDITest {

	@Test
	public void getDepartmentControl() {
		try {
			WeldContainer weld = new Weld().initialize();
			DataControl<DepartmentsDAO> dc = weld.instance()
					.select(DepartmentsDC.class).get();
			dc.getElResolver().setValue("department", dc);

			dc.getCurrentObject();

			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());

		}
	}

}
