package org.tura.platform.test;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import org.tura.platform.hr.controls.CDICommandStack;
import org.tura.platform.hr.controls.CompanyDC;
import org.tura.platform.hr.controls.LocationDC;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.objects.CompanyDAO;
import org.tura.platform.hr.objects.CountryDAO;

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
		CDICommandStack st = weld.instance().select(CDICommandStack.class)
				.get();
		EntityManager em = st.getEm();

		new CityInit(em).init();
		new CompanyInit(em).init();
		new CountryInit(em).init();
		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		new StateInit(em).init();
		new StreetInit(em).init();

	}

	@Test
	public void getCountryControl() {
		try {
			CompanyDC companyDC = weld.instance().select(CompanyDC.class).get();
			companyDC.getElResolver().setValue("company", companyDC);

			CompanyDAO company = companyDC.getCurrentObject();
			LocationDC locationDC = (LocationDC) companyDC.getDetail();

			CountryDAO obj = (CountryDAO) locationDC.getCurrentObject();
			System.out.println(obj.getObjId());

			companyDC.nextObject();
			obj = (CountryDAO) locationDC.getCurrentObject();
			System.out.println(obj.getObjId());

			System.out.println("");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
