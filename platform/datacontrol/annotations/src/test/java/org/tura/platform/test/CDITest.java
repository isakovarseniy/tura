package org.tura.platform.test;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.controls.DepartmentsDC;
import org.tura.platform.hr.objects.DepartmentsDAO;

public class CDITest {
	
	
    @Test
    public void getDepartmentControl() {
        WeldContainer weld = new Weld().initialize();
        DataControl<DepartmentsDAO> department = weld.instance().select(DepartmentsDC.class).get();
        System.out.println("");
    }
	

}
