/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.BeanFactory;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.CompanyArtifitialFieldsAdapter;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.CompanyDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.DepartmentDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.PopupCompanyDCProviderDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.TreeRootCountryDC;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.datacontrol.pool.PoolCommand;
import org.tura.platform.datacontrol.pool.PoolElement;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.objects.serialization.Company;
import org.tura.platform.hr.objects.serialization.Street;
import org.tura.platform.hr.objects.serialization.State;
import org.tura.platform.hr.objects.serialization.Country;
import org.tura.platform.hr.objects.serialization.Department;


import org.tura.platform.primefaces.model.GridModel;
import org.tura.platform.primefaces.model.LazyDataGridModel;

import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest  {

	private static Logger logger;
	private  Weld w;
	private  WeldContainer weld;
	private static Server server;

	private ArrayList<String> delitedRows = new ArrayList<>();

	@After
	public void after() {
		EntityManager em = weld.instance().select(EntityManager.class).get();
		if (em.isOpen())
			em.close();

		weld = null;
		w.shutdown();
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}
	

	@BeforeClass
	public static void beforeClass() throws Exception {
		server = Server.createTcpServer().start();
		
		
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);		
	}
	
	@Before
	public void before() {
		w = new Weld();
		weld = w.initialize();

		EntityManager em = weld.instance()
				.select(EntityManager.class).get();

		em.getTransaction().begin();

		new CompanyInit(em).init();
		new CountryInit(em).init();
		new StateInit(em).init();
		new CityInit(em).init();
		new StreetInit(em).init();

		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();
			em.getTransaction().commit();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void a5_remove() {
		try {

			ArrayList<String> fact = new ArrayList<>();
			fact.add("Street_3");
			fact.add("Street_7");
			fact.add("Street_11");
			fact.add("Street_15");

			fact.add("Street_4");
			fact.add("Street_8");
			fact.add("Street_12");
			fact.add("Street_16");

			fact.add("City_3");
			fact.add("City_4");

			fact.add("State_6");
			fact.add("State_7");
			fact.add("State_8");
			fact.add("State_9");
			fact.add("State_10");

			fact.add("Country_2");

			fact.add("Company_2");

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			
			Repository repository = weld.instance().select(Repository.class).get();

			RemoveObjectTracer tracer = new RemoveObjectTracer();

			CompanyDC companyDC = bf.getCompany();
			companyDC.addEventLiteners(tracer);

			bf.getTreeRootCountry().addEventLiteners(tracer);

			companyDC.nextObject();
			companyDC.getCurrentObject();
			companyDC.removeObject();

			assertEquals(delitedRows.size() - fact.size(), 0);

			for (String key : delitedRows) {
				assertEquals(fact.contains(key), true);
				fact.remove(key);
			}
			assertEquals(fact.size(), 0);

			repository.applyChanges(null);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void a0_getCountryControl() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();

			CompanyDC companyDC = bf.getCompany();

			Company company = (Company) companyDC.getCurrentObject();
			TreeRootCountryDC locationDC = bf.getTreeRootCountry();

			Country row = (Country) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(1));

			companyDC.nextObject();
			row = (Country) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(2));
			companyDC.prevObject();

			CompanyArtifitialFieldsAdapter artf = new CompanyArtifitialFieldsAdapter((ObjectControl) company);
			
			artf.setTestfield1("12345");
			assertEquals(artf.getTestfield1(), "12345");

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

			Company company = (Company) companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });

			assertEquals(isSet, true);

			State row = (State) locationDC.getCurrentObject();
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
			companyDC.getCurrentObject();
			companyDC.nextObject();
			Company company = (Company) companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			Department department = (Department) departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			Street row = (Street) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = (Department) departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));

			isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1) });
			assertEquals(isSet, true);

			assertEquals(departmentDC.isBlocked(), true);

			department = (Department) departmentDC.getCurrentObject();
			assertNull(department);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void a4_rallback() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			Company company = (Company) companyDC.getCurrentObject();
			String saveCompanyName = company.getCompanyName();
			company.setCompanyName("New Company Name");
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });

			assertEquals(isSet, true);

			State row = (State) locationDC.getCurrentObject();
			String saveStreetName = row.getName();
			row.setName("New Street Name");
			assertEquals(row.getObjId(), new Long(8));

			companyDC.getCommandStack().rallbackCommand();

			companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			company = (Company) companyDC.getCurrentObject();
			assertEquals(company.getCompanyName(), saveCompanyName);

			locationDC = bf.getTreeRootCountry();
			isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });
			assertEquals(isSet, true);

			row = (State) locationDC.getCurrentObject();
			assertEquals(row.getName(), saveStreetName);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void a6_tree_access() {
		try {

			org.tura.example.ui.hrmanager.tree2tree.datacontrol.BeanFactory bf = weld
					.instance()
					.select(org.tura.example.ui.hrmanager.tree2tree.datacontrol.BeanFactory.class)
					.get();

			IDataControl dc1 = bf.getTreeRootCompany();
			dc1.setCurrentPosition(new TreePath[] { new TreePath(null, 0) });

			IDataControl dc2 = bf.getTreeRootDepartment();
			dc2.setCurrentPosition(new TreePath[] { new TreePath(null, 0) });

			Company obj1 = (Company) dc1.getCurrentObject();
			assertEquals(new Long(1L), obj1.getObjId());
			Department obj2 = (Department) dc2.getCurrentObject();
			assertNull(obj2);

			boolean isSet = dc1.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("company2country", 0),
					new TreePath("country2state", 0),
					new TreePath("state2city", 0),
					new TreePath("city2street", 0) });
			assertEquals(isSet, true);

			obj2 = (Department) dc2.getCurrentObject();
			assertEquals(new Long(10L), obj2.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void a7_pool_rallback() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			PopupCompanyDCProviderDC popupDC = bf.getPopupCompanyDCProvider();
			bf.setCmpId(1L);

			Company row = (Company) companyDC.getCurrentObject();
			String name = row.getCompanyName();

			Company row2 = (Company) popupDC.getCurrentObject();
			popupDC.getCommandStack().savePoint();
			row2 = (Company) popupDC.getCurrentObject();
			row2.setCompanyName("test");

			row = (Company) companyDC.getCurrentObject();
			assertEquals("test", row.getCompanyName());

			companyDC.getCommandStack().rallbackCommand();
			row = (Company) companyDC.getCurrentObject();
			assertEquals(name, row.getCompanyName());

			row2 = (Company) popupDC.getCurrentObject();
			row2.setCompanyName("test");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void a8_rallbackWithGridModel() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			GridModel model = new GridModel(companyDC, logger);

			LazyDataGridModel lazy = model.getLazyModel();
			List ls = lazy.load(0, 5, null, null);
			companyDC.getCommandStack().rallbackCommand();
			ls = lazy.load(0, 5, null, null);
			if (ls == null || ls.size() == 0)
				fail("Result is empty");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void a9_addNewCompany() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			TreeRootCountryDC treeLocation = bf.getTreeRootCountry();

			Company company = (Company) companyDC.getCurrentObject();

			company = (Company) companyDC.createObject();
			company.setCompanyName("Company 3");
			company.setDescription("Company 3 description");

			Country country =  (Country) treeLocation.createObject();
			country.setName("qq");

			companyDC.removeObject();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	@Test
	public void a9_1addNewCompany() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			TreeRootCountryDC treeLocation = bf.getTreeRootCountry();

			Company company = (Company) companyDC.getCurrentObject();

			company = (Company) companyDC.createObject();
			company.setCompanyName("Company 3");
			company.setDescription("Company 3 description");

			treeLocation.createObject();
	
			companyDC.removeObject();

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
	
	
	@Test
	public void a10_addNewCompany() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			TreeRootCountryDC treeLocation = bf.getTreeRootCountry();

			Company company = (Company) companyDC.getCurrentObject();

			company = (Company) companyDC.createObject();
			company.setCompanyName("Company 3");
			company.setDescription("Company 3 description");

			Country country = (Country) treeLocation.createObject();
			country.setName("CNT1");

			country = (Country) treeLocation.createObject();
			country.setName("CNT2");

			boolean isSet = treeLocation
					.setCurrentPosition(new TreePath[] { new TreePath(null, 0) });
			assertEquals(isSet, true);

			isSet = treeLocation
					.setCurrentPosition(new TreePath[] { new TreePath(null, 1) });
			assertEquals(isSet, true);

			isSet = treeLocation
					.setCurrentPosition(new TreePath[] { new TreePath(null, 10) });
			assertEquals(isSet, false);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	
	@Test
	public void a11_addNewCompanyIsolatedPool() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();
			Company company = (Company) companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			Department department = (Department) departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			Street row = (Street) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = (Department) departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));
			
			assertNotNull(companyDC.getCurrentObject());
			assertNotNull(locationDC.getCurrentObject());
			assertNotNull(departmentDC.getCurrentObject());
			
			companyDC.islolate();

			Pager<?> pager = getPager(companyDC);
			
			Company newrow = getNewCompany(pager);
			newrow.setObjId(123L);

	          
	        PoolElement e = new PoolElement(newrow, ((ObjectControl)newrow).getKey() , companyDC.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);

	        companyDC.flush();
	        
	        assertNull(locationDC.getCurrentObject());
	        assertNull(departmentDC.getCurrentObject());
	        

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
	
	
	@Test
	public void a12_addNewCompanyIsolatedPool() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();
			Company company = (Company) companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			Department department = (Department) departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			Street row = (Street) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = (Department) departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));
			
			assertNotNull(companyDC.getCurrentObject());
			assertNotNull(locationDC.getCurrentObject());
			assertNotNull(departmentDC.getCurrentObject());
			
			
			DataControl<?> streetDC = (DataControl<?>) ((ObjectControl)row).getAttributes().get(Constants.DATA_CONTROL);
			
			
			streetDC.islolate();

			Pager<?> pager = getPager(streetDC);
			
			Street newrow =  getNewStreet(pager);
			newrow.setObjId(123L);
			newrow.setParentId(row.getParentId());

	          
	        PoolElement e = new PoolElement(newrow, ((ObjectControl)newrow).getKey(), streetDC.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);

	        streetDC.flush();
	        
			Street row1 = (Street) locationDC.getCurrentObject();

	        assertEquals(newrow.getObjId(), row1.getObjId());
	        assertNull(departmentDC.getCurrentObject());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
		
	
	
	@Test
	public void a13_removeTree() {
		try {
			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			TreeRootCountryDC treeLocation = bf.getTreeRootCountry();
			companyDC.getCurrentObject();
			
			boolean isSet = treeLocation
					.setCurrentPosition(new TreePath[] { new TreePath(null, 0),new TreePath("country2state", 0) });
			assertEquals(isSet, true);
			
			treeLocation.removeObject();
			
			companyDC.getCommandStack().rallbackCommand();
			companyDC.getCurrentObject();
			int i = companyDC.getScroller().size();

			if (i == 0)
				fail("Scroler size cannot be 0");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

		
	}		
	
	private Pager<?> getPager(DataControl<?> dc) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        Field field = DataControl.class.getDeclaredField("pager");
        field.setAccessible(true);
        return (Pager<?>) field.get(dc);	
	}
	
	class RemoveObjectTracer implements EventListener {

		@Override
		public void handleEventListener(Event event) throws TuraException {
			try {
				if (event instanceof RowRemovedEvent
						&& ((RowRemovedEvent) event).getObj() != null) {

					String objName = ((RowRemovedEvent) event).getObj()
							.getClass().getSimpleName();
					
					String key = objName.substring(0, objName.indexOf("Proxy"))
							+ "_"
							+ Reflection.call(
									((RowRemovedEvent) event).getObj(),
									"getObjId");
					delitedRows.add(key);
				}
			} catch (Exception e) {
				logger.log(Level.INFO, e.getMessage());
			}

		}

	}

	public Company getNewCompany(Pager<?> pager) throws Exception {
        Field field = pager.getClass().getDeclaredField("repository");
        field.setAccessible(true);
        Repository repository =  (Repository) field.get(pager);	

		return (Company) repository.create(Company.class.getName());
	}


	public Street getNewStreet(Pager<?> pager) throws Exception {
        Field field = pager.getClass().getDeclaredField("repository");
        field.setAccessible(true);
        Repository repository =  (Repository) field.get(pager);	

        return  (Street) repository.create(Street.class.getName());
	}

}
