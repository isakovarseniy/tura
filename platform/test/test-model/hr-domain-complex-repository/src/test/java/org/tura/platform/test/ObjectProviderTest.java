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
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.elsoft.platform.hr.objects.complex.model.CityObject;
import org.elsoft.platform.hr.objects.complex.model.CompanyObject;
import org.elsoft.platform.hr.objects.complex.model.CountryObject;
import org.elsoft.platform.hr.objects.complex.model.DepartmentsObject;
import org.elsoft.platform.hr.objects.complex.model.EmployeeObject;
import org.elsoft.platform.hr.objects.complex.model.FileObject;
import org.elsoft.platform.hr.objects.complex.model.StateObject;
import org.elsoft.platform.hr.objects.complex.model.StreetObject;
import org.elsoft.platform.hr.objects.complex.model.VehicleObject;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.hr.init.CityInit;
import org.tura.platform.hr.init.CompanyInit;
import org.tura.platform.hr.init.CountryInit;
import org.tura.platform.hr.init.DepartmentsInit;
import org.tura.platform.hr.init.EmployesesInit;
import org.tura.platform.hr.init.FileInit;
import org.tura.platform.hr.init.StateInit;
import org.tura.platform.hr.init.StreetInit;
import org.tura.platform.hr.init.VehicleInit;
import org.tura.platform.object.TuraObject;
import org.tura.platform.repository.Repository;
import org.tura.platform.tura.complex.domain.livecycle.CityObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CompanyObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.CountryObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.DepartmentObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.EmployeeObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.FileObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StateObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.StreetObjectLiveCycle;
import org.tura.platform.tura.complex.domain.livecycle.VehicleObjectLiveCycle;
import org.tura.platform.tura.complex.domain.provider.ComplexObjectTuraProvider;

public class ObjectProviderTest {

	private EntityManager em;

	private static Logger logger;

	private Repository repo;

	private List<Object> list = new ArrayList<>();

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

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ComplexRepository", config.getProperties());
		em = emf.createEntityManager();

		em.getTransaction().begin();
		em.createNativeQuery("DROP SEQUENCE obj_id_gen").executeUpdate();
		em.createNativeQuery("CREATE SEQUENCE obj_id_gen START WITH 1000000").executeUpdate();
		em.getTransaction().commit();
		new CompanyInit(em).init();
		new CountryInit(em).init();
		new StateInit(em).init();
		new CityInit(em).init();
		new StreetInit(em).init();

		new DepartmentsInit(em).init();
		try {
			new EmployesesInit(em).init();

			new FileInit(em).init();
			new VehicleInit(em).init();

		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		repo = new Repository();
		ComplexObjectTuraProvider provider = new ComplexObjectTuraProvider();
		list.clear();
		TestingJpaService service = new TestingJpaService(list);
		service.setEntityManager(em);
		provider.setService(service);
		provider.setRepository(repo);

		provider.setObjectLiveCycle(CompanyObject.class.getName(), new CompanyObjectLiveCycle(service));
		provider.setObjectLiveCycle(CountryObject.class.getName(), new CountryObjectLiveCycle(service));
		provider.setObjectLiveCycle(StateObject.class.getName(), new StateObjectLiveCycle(service));
		provider.setObjectLiveCycle(CityObject.class.getName(), new CityObjectLiveCycle(service));
		provider.setObjectLiveCycle(StreetObject.class.getName(), new StreetObjectLiveCycle(service));
		provider.setObjectLiveCycle(DepartmentsObject.class.getName(), new DepartmentObjectLiveCycle(service));
		provider.setObjectLiveCycle(EmployeeObject.class.getName(), new EmployeeObjectLiveCycle(service));
		provider.setObjectLiveCycle(FileObject.class.getName(), new FileObjectLiveCycle(service));
		provider.setObjectLiveCycle(VehicleObject.class.getName(), new VehicleObjectLiveCycle(service));
	}

	@Test
	@SuppressWarnings("rawtypes")
	public void a0_load() {
		try {

			ArrayList<SearchCriteria> searchCriteria = new ArrayList<>();
			ArrayList<OrderCriteria> orderCriteria = new ArrayList<>();

			List ls = repo.find(searchCriteria, orderCriteria, 0, 10, CompanyObject.class.getName());

			CompanyObject company = (CompanyObject) ls.get(0);

			assertEquals(2, ls.size());

			CountryObject country = company.getCountryObject().iterator().next();
			assertEquals(5, country.getStateObject().size());

			StateObject state = country.getStateObject().iterator().next();
			assertEquals(1, state.getCityObject().size());

			CityObject city = state.getCityObject().iterator().next();
			assertEquals(4, city.getStreetObject().size());

			StreetObject street = city.getStreetObject().iterator().next();
			assertEquals(2, street.getDepartmentsObject().size());

			DepartmentsObject department = street.getDepartmentsObject().iterator().next();
			assertEquals(9, department.getEmployeeObject().size());

			EmployeeObject employee = department.getEmployeeObject().iterator().next();
			assertEquals(4, employee.getFileObject().size());
			assertEquals(2, employee.getVehicleObject().size());

			FileObject file = employee.getFileObject().iterator().next();
			assertEquals(3, file.getFileObject().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	@SuppressWarnings("rawtypes")
	public void a1_save() {
		try {

			ArrayList<SearchCriteria> searchCriteria = new ArrayList<>();
			ArrayList<OrderCriteria> orderCriteria = new ArrayList<>();

			List ls = repo.find(searchCriteria, orderCriteria, 0, 10, CompanyObject.class.getName());

			CompanyObject company = (CompanyObject) ls.get(0);

			Iterator<CountryObject> itr =  company.getCountryObject().iterator();
			CountryObject country = itr.next();

			company.getCountryObject().remove(country);

			repo.update(company, CompanyObject.class.getName());

			
			int uCount = 0;
			int rCount=0;
			for (Object obj : list) {
				Object[] array = (Object[]) obj;
//				TuraObject a0 = (TuraObject) array[0];
				char operation = (char) array[1];
				if (operation == 'U')
					uCount++;
				if (operation == 'R')
					rCount++;
			}
			assertEquals(106, rCount);
			assertEquals(7, uCount);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}