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

import org.elsoft.platform.hr.objects.CompanyDAO;
import org.elsoft.platform.hr.objects.CountryDAO;
import org.elsoft.platform.hr.objects.DepartmentsDAO;
import org.elsoft.platform.hr.objects.StateDAO;
import org.elsoft.platform.hr.objects.StreetDAO;
import org.elsoft.platform.hr.objects.simple.model.Company;
import org.elsoft.platform.hr.objects.simple.model.Street;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.BeanFactory;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.CompanyDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.DepartmentDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.ICompanyArtifitialFields;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.PopupCompanyDCProviderDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.TreeRootCountryDC;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.TreePath;
import org.tura.platform.datacontrol.Util;
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
import org.tura.platform.primefaces.model.GridModel;
import org.tura.platform.primefaces.model.LazyDataGridModel;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest  implements DomainFactory{

	private static Logger logger;
	private  Weld w;
	private  WeldContainer weld;

	private ArrayList<String> delitedRows = new ArrayList<>();

	@After
	public void after() {
		EntityManager em = weld.instance().select(EntityManager.class).get();
		if (em.isOpen())
			em.close();

		weld = null;
		w.shutdown();
	}

	@BeforeClass
	public static void beforeClass() {
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
		em.createNativeQuery("DROP SEQUENCE obj_id_gen").executeUpdate();
		em.createNativeQuery("CREATE SEQUENCE obj_id_gen START WITH 1000000")
				.executeUpdate();
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

			companyDC.getCommandStack().commitCommand();

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

			CompanyDAO company = companyDC.getCurrentObject();
			TreeRootCountryDC locationDC = bf.getTreeRootCountry();

			CountryDAO row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(1));

			companyDC.nextObject();
			row = (CountryDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(2));
			companyDC.prevObject();

			ICompanyArtifitialFields artf = (ICompanyArtifitialFields) company;
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

			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });

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
			companyDC.getCurrentObject();
			companyDC.nextObject();
			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			DepartmentsDAO department = departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			StreetDAO row = (StreetDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));

			isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1) });
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
	public void a4_rallback() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			CompanyDC companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			CompanyDAO company = companyDC.getCurrentObject();
			String saveCompanyName = company.getCompanyName();
			company.setCompanyName("New Company Name");
			assertEquals(company.getObjId(), new Long(2));

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });

			assertEquals(isSet, true);

			StateDAO row = (StateDAO) locationDC.getCurrentObject();
			String saveStreetName = row.getName();
			row.setName("New Street Name");
			assertEquals(row.getObjId(), new Long(8));

			companyDC.getCommandStack().rallbackCommand();

			companyDC = bf.getCompany();
			companyDC.getCurrentObject();
			companyDC.nextObject();

			company = companyDC.getCurrentObject();
			assertEquals(company.getCompanyName(), saveCompanyName);

			locationDC = bf.getTreeRootCountry();
			isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 2) });
			assertEquals(isSet, true);

			row = (StateDAO) locationDC.getCurrentObject();
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

			CompanyDAO obj1 = (CompanyDAO) dc1.getCurrentObject();
			assertEquals(new Long(1L), obj1.getObjId());
			DepartmentsDAO obj2 = (DepartmentsDAO) dc2.getCurrentObject();
			assertNull(obj2);

			boolean isSet = dc1.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("company2country", 0),
					new TreePath("country2state", 0),
					new TreePath("state2city", 0),
					new TreePath("city2street", 0) });
			assertEquals(isSet, true);

			obj2 = (DepartmentsDAO) dc2.getCurrentObject();
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

			CompanyDAO row = companyDC.getCurrentObject();
			String name = row.getCompanyName();

			CompanyDAO row2 = popupDC.getCurrentObject();
			popupDC.getCommandStack().savePoint();
			row2 = popupDC.getCurrentObject();
			row2.setCompanyName("test");

			row = companyDC.getCurrentObject();
			assertEquals("test", row.getCompanyName());

			companyDC.getCommandStack().rallbackCommand();
			row = companyDC.getCurrentObject();
			assertEquals(name, row.getCompanyName());

			row2 = popupDC.getCurrentObject();
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

			CompanyDAO company = companyDC.getCurrentObject();

			company = companyDC.createObject();
			company.setCompanyName("Company 3");
			company.setDescription("Company 3 description");

			CountryDAO country =  (CountryDAO) treeLocation.createObject();
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

			CompanyDAO company = companyDC.getCurrentObject();

			company = companyDC.createObject();
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

			CompanyDAO company = companyDC.getCurrentObject();

			company = companyDC.createObject();
			company.setCompanyName("Company 3");
			company.setDescription("Company 3 description");

			CountryDAO country = (CountryDAO) treeLocation.createObject();
			country.setName("CNT1");

			country = (CountryDAO) treeLocation.createObject();
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
			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			DepartmentsDAO department = departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			StreetDAO row = (StreetDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));
			
			assertNotNull(companyDC.getCurrentObject());
			assertNotNull(locationDC.getCurrentObject());
			assertNotNull(departmentDC.getCurrentObject());
			
			companyDC.islolate();
			
			CompanyDAO newrow = getNewCompanyDAO();
			newrow.setObjId(123L);

			Pager<?> pager = getPager(companyDC);
	          
	        PoolElement e = new PoolElement(newrow, companyDC.getObjectKey(newrow), companyDC.getBaseClass(), PoolCommand.C.name(), "1");
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
			CompanyDAO company = companyDC.getCurrentObject();
			assertEquals(company.getObjId(), new Long(2));

			DepartmentDC departmentDC = bf.getDepartment();
			assertEquals(departmentDC.isBlocked(), true);

			DepartmentsDAO department = departmentDC.getCurrentObject();
			assertNull(department);

			TreeRootCountryDC locationDC = bf.getTreeRootCountry();
			boolean isSet = locationDC.setCurrentPosition(new TreePath[] {
					new TreePath(null, 0), new TreePath("country2state", 3),
					new TreePath("state2city", 1),
					new TreePath("city2street", 2) });

			assertEquals(isSet, true);

			StreetDAO row = (StreetDAO) locationDC.getCurrentObject();
			assertEquals(row.getObjId(), new Long(12));

			department = departmentDC.getCurrentObject();
			assertEquals(department.getObjId(), new Long(200));
			
			assertNotNull(companyDC.getCurrentObject());
			assertNotNull(locationDC.getCurrentObject());
			assertNotNull(departmentDC.getCurrentObject());
			
			
			DataControl<?> streetDC =  Util.getDataControl(row);
			
			streetDC.islolate();
			
			StreetDAO newrow =  getNewStreetDAO();
			newrow.setObjId(123L);
			newrow.setParentId(row.getParentId());

			Pager<?> pager = getPager(streetDC);
	          
	        PoolElement e = new PoolElement(newrow, streetDC.getObjectKey(newrow), streetDC.getBaseClass(), PoolCommand.C.name(), "1");
	        pager.addCommand(e);

	        streetDC.flush();
	        
			StreetDAO row1 = (StreetDAO) locationDC.getCurrentObject();

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
					
					String key = objName.substring(0, objName.indexOf("$$"))
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

	@Override
	public CompanyDAO getNewCompanyDAO() throws Exception {
		return new Company();
	}


	@Override
	public StreetDAO getNewStreetDAO() throws Exception {
		return  new Street();
	}

}
