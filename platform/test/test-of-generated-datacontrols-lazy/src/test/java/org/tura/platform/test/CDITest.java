/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.datacontrollazymodel.hrcontroller.CDITestHRController;
import org.tura.example.ui.datacontrollazymodel.hrcontroller.datacontrol.BeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.PreferencesInit;
import org.tura.platform.hr.init.ProspectInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.init.UserInit;
import org.tura.platform.hr.objects.serialization.PreferenceKk;
import org.tura.platform.hr.objects.serialization.Prospect;
import org.tura.platform.hr.objects.serialization.Regions;
import org.tura.platform.hr.objects.serialization.UserKk;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest extends CDITestHRController {

	private Weld w;
	private static Server server;
	private Map<Long, Long> companyConverter = new HashMap<Long, Long>();
	private Map<Long, Long> countryConverter = new HashMap<Long, Long>();
	private Map<Long, Long> stateConverter = new HashMap<Long, Long>();
	private Map<Long, Long> cityConverter = new HashMap<Long, Long>();
	private Map<Long, Long> streetConverter = new HashMap<Long, Long>();
	private Map<Long, Long> departmentsConverter = new HashMap<Long, Long>();
	private Map<Long, Long> employeeConverter = new HashMap<Long, Long>();
	private Map<Long, Long> userConverter = new HashMap<Long, Long>();
	
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
	}

	@Before
	public void before() {
		try {
			w = new Weld();
			weld = w.initialize();

			EntityManager em = weld.instance().select(EntityManager.class).get();

			em.getTransaction().begin();

			new CompanyInit(em, companyConverter).init();
			new CountryInit(em, companyConverter, countryConverter).init();
			new StateInit(em, countryConverter, stateConverter).init();
			new CityInit(em, stateConverter, cityConverter).init();
			new StreetInit(em, cityConverter, streetConverter).init();

			new DepartmentsInit(em, streetConverter, departmentsConverter).init();
			new ProspectInit(em).init();
			new EmployesesInit(em, departmentsConverter, employeeConverter).init();

			new UserInit(em,userConverter).init();
			new PreferencesInit(em,userConverter).init();

			em.getTransaction().commit();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void userPreferences01Test() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			DataControl<UserKk> dc = bf.getUser();
			UserKk user = dc.getCurrentObject();
			bf.getPreference();

			bf.setUserId(user.getObjId());
			DataControl<UserKk> dcUsr = bf.getUserHelper();

			dcUsr.forceRefresh();
			UserKk userH = dcUsr.getCurrentObject();
			assertEquals(user.getObjId(), userH.getObjId());

			dcUsr.removeObject();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void userPreferences02Test() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			DataControl<UserKk> dc = bf.getUser();
			DataControl<PreferenceKk> dcPref =bf.getPreference();
			
			dc.removeAll();
			dcPref.createObject();
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}


	@Test
	public void prospectRegionTest() {
		try {

			BeanFactory bf = weld.instance().select(BeanFactory.class).get();
			@SuppressWarnings("rawtypes")
			DataControl dc = bf.getProspect();

			Prospect p = (Prospect) dc.getCurrentObject();
			assertEquals("Prospect", p.getName());

			List<Long> selected = new ArrayList<Long>();
			selected.add(1L);
			selected.add(2L);
			changeSelection(bf, selected);

			List<Regions> list = bf.getRegions().getScroller();
			assertEquals(2, list.size());

			Long[] check = new Long[] { 1L, 2L };
			List<Long> checkList = Arrays.asList(check);
			for (Regions r : list) {
				assertTrue(checkList.contains(r.getCountryId()));
			}

			selected.clear();
			selected.add(3L);
			selected.add(4L);
			selected.add(5L);

			changeSelection(bf, selected);

			list = bf.getRegions().getScroller();
			assertEquals(3, list.size());

			check = new Long[] { 3L, 4L, 5L };
			checkList = Arrays.asList(check);
			for (Regions r : list) {
				assertTrue(checkList.contains(r.getCountryId()));
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void changeSelection(BeanFactory bf, List<Long> selected) throws Exception {

		DataControl dc = (DataControl) bf.getRegions();
		List<Object> regions = dc.getScroller();

		List<Long> removeRegion = new ArrayList<Long>();

		for (Object obj : regions) {
			Regions r = (Regions) obj;
			if (!selected.contains(r.getCountryId())) {
				removeRegion.add(r.getObjId());
			}
		}

		for (Long id : removeRegion) {
			int i = 0;
			boolean found = false;
			for (Object obj : regions) {
				Regions r = (Regions) obj;
				if (r.getObjId().equals(id)) {
					found = true;
					break;
				}
				i++;
			}
			if (found) {
				dc.setCurrentPosition(i);
				dc.removeObject();
			}
		}

		for (Long obj : selected) {
			boolean found = false;
			for (Object o : regions) {
				Regions r = (Regions) o;
				if (r != null && r.getObjId().equals(obj)) {
					found = true;
					break;
				}
			}
			if (!found) {
				Regions r = (Regions) dc.createObject();
				r.setCountryId(obj);
			}
			@SuppressWarnings("unused")
			Regions r = (Regions) dc.getCurrentObject();
		}

	}

	@Override
	public Long cCompany(Long id) {
		return this.companyConverter.get(id);
	}

	@Override
	public Long cCountry(Long id) {
		return this.countryConverter.get(id);
	}

	@Override
	public Long cState(Long id) {
		return this.stateConverter.get(id);
	}

	@Override
	public Long cCity(Long id) {
		return this.cityConverter.get(id);
	}

	@Override
	public Long cStreet(Long id) {
		return this.streetConverter.get(id);
	}

	@Override
	public Long cDepartment(Long id) {
		return this.departmentsConverter.get(id);
	}

	@Override
	public Long cEmployee(Long id) {
		return this.employeeConverter.get(id);
	}

}
