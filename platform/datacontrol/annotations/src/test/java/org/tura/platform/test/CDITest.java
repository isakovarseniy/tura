package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import junit.framework.Assert;

import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.hrcontroller.datacontrol.BeanFactory;
import org.tura.example.ui.hrcontroller.datacontrol.CompanyDC;
import org.tura.example.ui.hrcontroller.datacontrol.DepartmentDC;
import org.tura.example.ui.hrcontroller.datacontrol.TreeRootCountryDC;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest {

	private static Logger logger;
	private static WeldContainer weld;
	private ArrayList<String> delitedRows = new  ArrayList<>();

	static {
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);

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
	public void a0_getCountryControl() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();

			CompanyDC companyDC = bf.getCompany();

			companyDC.getCurrentObject();
			TreeRootCountryDC locationDC = bf.getTreeRootCountry();

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
	public void a1_setPath() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
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
	public void a2_dependency() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.nextObject();
			CompanyDAO company =  companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);
			
			DepartmentsDAO department = departmentDC.getCurrentObject();
			assertNull(department);
			
			
			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new int[] { 0, 3,1,2 });
			assertEquals(isSet, true);

			StreetDAO row = (StreetDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department =  departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));

			isSet = locationDC.setCurrentPosition(new int[] { 0, 3,1 });
			assertEquals(isSet, true);

			assertEquals(departmentDC.isBlocked(), true);
			
			department = departmentDC.getCurrentObject();
			assertNull(department);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void a3_remove() {
		try {
			
			ArrayList<String> fact = new  ArrayList<>();
			fact.add("StreetDAO_3");
			fact.add("StreetDAO_7");
			fact.add("StreetDAO_11");
			fact.add("StreetDAO_15");
			
			fact.add("StreetDAO_4");
			fact.add("StreetDAO_8");
			fact.add("StreetDAO_12");
			fact.add("StreetDAO_16");
			
			fact.add("CityDAO_3");
			fact.add("CityDAO_4");
			
			fact.add("StateDAO_6");
			fact.add("StateDAO_7");
			fact.add("StateDAO_8");
			fact.add("StateDAO_9");
			fact.add("StateDAO_10");
			
			fact.add("CountryDAO_2");
			
			fact.add("CompanyDAO_2");
			
			
			
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			
			RemoveObjectTracer tracer = new RemoveObjectTracer();
			
			CompanyDC companyDC = bf.getCompany();
			companyDC.addEventLiteners(tracer);
			
			bf.getTreeRootCountry().addEventLiteners(tracer);

			bf.getTreeRootCountry().setCurrentPosition(new int[]{0});
			
			
			companyDC.nextObject();
			companyDC.getCurrentObject();
			companyDC.removeObject();


			assertEquals(delitedRows.size()-fact.size(), 0);
			
			for ( String key : delitedRows){
				assertEquals(fact.contains(key),true);
			}
			
			companyDC.getCommandStack().commitCommand();
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	class RemoveObjectTracer implements EventListener  {

		@Override
		public void handleEventListener(Event event) throws TuraException {
			try{
			if (event instanceof RowRemovedEvent && ((RowRemovedEvent) event).getObj() != null ){
				
				String objName = ((RowRemovedEvent) event).getObj().getClass().getSimpleName();
				String  key =  objName.substring( 0,objName.indexOf("$$") ) +"_"+ Reflection.call( ((RowRemovedEvent) event).getObj(), "getObjId" );
				delitedRows.add(key);
				
			}
			}catch(Exception e){
				logger.log(Level.INFO, e.getMessage());
			}
			
		}
		
	}
		

}
