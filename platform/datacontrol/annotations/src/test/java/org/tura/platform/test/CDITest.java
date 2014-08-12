package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
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
import org.tura.platform.hr.objects.CountryDAO;
import org.tura.platform.hr.objects.StateDAO;

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

			companyDC.getCurrentObject();
			LocationDC locationDC = (LocationDC) companyDC.getDetail();

			CountryDAO row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(1));

			companyDC.nextObject();
			row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(2));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	@Test
	public void setPath() {
		try {
			CompanyDC companyDC = weld.instance().select(CompanyDC.class).get();
			companyDC.getElResolver().setValue("company", companyDC);

			companyDC.getCurrentObject();
			LocationDC locationDC = (LocationDC) companyDC.getDetail();
			locationDC.setCurrentPosition(new int[]{1,12});
			
			StateDAO row  = (StateDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(13));
			
			companyDC.nextObject();
			CountryDAO country  = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(country.getObjId(), new Long(2));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
