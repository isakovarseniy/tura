package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.example.ui.hrcontroller.datacontrol.BeanFactory;
import org.tura.example.ui.hrcontroller.datacontrol.CompanyDC;
import org.tura.example.ui.hrcontroller.datacontrol.DepartmentDC;
import org.tura.example.ui.hrcontroller.datacontrol.TreeRootCountryDC;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;

public class CDITest {

	private static Logger logger;
	private static WeldContainer weld;

	static {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		weld = new Weld().initialize();
		EntityManager em = weld.instance().select(EntityManager.class).get();

		new CompanyInit(em).init();
		new CountryInit(em).init();
		new StateInit(em).init();
		new CityInit(em).init();
		new StreetInit(em).init();

		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void getCountryControl() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();

			CompanyDC companyDC = bf.getCompanyDC();

			companyDC.getCurrentObject();
			TreeRootCountryDC locationDC = (TreeRootCountryDC) companyDC
					.getCompany2Country();

			CountryDAO row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(1));

			companyDC.nextObject();
			row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(2));
			companyDC.prevObject();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void setPath() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompanyDC();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountryDC();
			boolean isSet = locationDC.setCurrentPosition(new int[] { 0,2 });
			assertEquals(isSet, true);

			StateDAO row = (StateDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(8));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void dependency() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompanyDC();
			CompanyDAO company =  companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartmentDC();

			
			TreeRootCountryDC locationDC = bf.getTreeRootCountryDC();
			boolean isSet = locationDC.setCurrentPosition(new int[] { 0, 3,1,2 });
			assertEquals(isSet, true);

			StreetDAO row = (StreetDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			DepartmentsDAO department =  departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(12));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

}
