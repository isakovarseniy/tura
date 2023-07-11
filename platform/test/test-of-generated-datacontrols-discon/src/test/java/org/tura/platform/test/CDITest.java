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

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.h2.tools.Server;
import org.jboss.weld.environment.se.Weld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.tura.example.ui.datacontroldisconnectedmodel.hrcontroller.CDITestHRController;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDITest  extends CDITestHRController {

	private  Weld w;
	private static Server server;
	private Map<Long,Long> companyConverter  =  new HashMap<Long, Long>();
	private Map<Long,Long> countryConverter  =  new HashMap<Long, Long>();
	private Map<Long,Long> stateConverter   =  new HashMap<Long, Long>();
	private Map<Long,Long> cityConverter  =  new HashMap<Long, Long>();
	private Map<Long,Long> streetConverter   =  new HashMap<Long, Long>();
	private Map<Long,Long> departmentsConverter  =  new HashMap<Long, Long>();
	private Map<Long,Long> employeeConverter   =  new HashMap<Long, Long>();


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
		w = new Weld();
		weld = w.initialize();

		EntityManager em = weld.instance()
				.select(EntityManager.class).get();

		em.getTransaction().begin();

		new CompanyInit(em,companyConverter).init();
		new CountryInit(em, companyConverter,countryConverter).init();
		new StateInit(em,countryConverter, stateConverter).init();
		new CityInit(em,stateConverter,cityConverter).init();
		new StreetInit(em,cityConverter,streetConverter).init();

		new DepartmentsInit(em,streetConverter, departmentsConverter).init();
		try {
			new EmployesesInit(em,departmentsConverter,employeeConverter).init();
			em.getTransaction().commit();
		} catch (ParseException e1) {
			e1.printStackTrace();
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
