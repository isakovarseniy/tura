/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.datacontrol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.test.hr.model.DepartmentType;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.QueryException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractSingleDataControlPool {

	protected static Factory factory;

	private static Server server;

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	public static void beforeClass() throws Exception {
		PlatformConfig.TEST_MODE = true;
		server = Server.createTcpServer().start();
		factory = new Factory();

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		Factory.getRepositoryProducer().em = emf.createEntityManager();

		factory.getEntityManager().getTransaction().begin();

		factory.initDB(deparmentString, factory.getEntityManager());
		try {
			factory.initDB(employeeString, factory.getEntityManager());
			factory.getEntityManager().getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@Before
	public void init() throws Exception {
		factory.clean();
	}

	@Test
	public void t1_getApplyCreateModification() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			DepartmentType newrow  = (DepartmentType) repository.create(deparmentClass);
			newrow.setObjId(123L);
			repository.insert(newrow, deparmentClass);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), Long.valueOf(123L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}


	@Test
	public void t2_getApplyRemoveModification() {
		try {
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			repository.remove(row, deparmentClass);
			row = dc.getCurrentObject();
			
			assertEquals(factory.cDept(Long.valueOf(20L)), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t3_getApplyUpdateModification() {
		try {
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();
			dc2.nextObject();
			DepartmentType newrow = dc2.getCurrentObject();
			newrow.setDepartmentName("test dep");

			DepartmentType row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(10)));
			assertEquals(row.getDepartmentName(), "Administration");

			dc.nextObject();
			row = dc.getCurrentObject();
			assertEquals(row.getObjId(), factory.cDept(Long.valueOf(20L)));
			assertEquals(row.getDepartmentName(), "test dep");

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t4_getApplyCreateUpdateModification() {
		try {
			
			CpaRepository repository = Factory.getRepository();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();
			
			DepartmentType newrow = (DepartmentType) repository.create(deparmentClass);
			newrow.setObjId(123L);
			newrow.setDepartmentName("test dep");
			repository.insert(newrow, deparmentClass);

			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), Long.valueOf(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			dc.nextObject();
			row = dc.getCurrentObject();

			assertEquals(row.getObjId(), Long.valueOf(10L));

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t5_savePoint() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DepartmentType row = dc.getCurrentObject();

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();
			DepartmentType newrow = dc2.createObject();
			newrow.setDepartmentId(123L);
			newrow.setDepartmentName("test dep");

			row = dc.getCurrentObject();

			assertEquals(row.getDepartmentId(), Long.valueOf(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			stackProvider.get().savePoint();

			row = dc.getCurrentObject();

			dc.nextObject();
			row = dc.getCurrentObject();
			dc.removeObject();

			row = dc.getCurrentObject();

			assertEquals(factory.cDept(Long.valueOf(20L)), row.getObjId());

			stackProvider.get().rallbackSavePoint();
			dc.prevObject();

			row = dc.getCurrentObject();

			assertEquals(row.getDepartmentId(), Long.valueOf(123L));
			assertEquals(row.getDepartmentName(), "test dep");

			try {
				stackProvider.get().rallbackSavePoint();
				fail("Should be exception");
			} catch (TuraException e1) {

			}

			stackProvider.get().rallbackCommand();

			row = dc.getCurrentObject();
			assertEquals(Long.valueOf(10L), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t6_commitWithsavePoint() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			DepartmentType row = dc.getCurrentObject();

			row = dc.createObject();
			row.setDepartmentName("test department");

			stackProvider.get().savePoint();
			dc.removeObject();

			stackProvider.get().commit();

			row = dc.getCurrentObject();

			assertEquals(Long.valueOf(10L), row.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t7_updateWithDefaultSearchCriteria() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());

			for (int i = 0; i < 2; i++) {

				DepartmentType row = dc.getCurrentObject();
				row.setDepartmentName("test");
				dc.getElResolver().setValue("cmpId", row.getObjId());

				dc2.forceRefresh();
				stackProvider.get().savePoint();

				DepartmentType row2 = dc2.getCurrentObject();
				assertEquals(row.getObjId(), row2.getObjId());

				dc.nextObject();

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t8_updateWithDefaultSearchCriteria() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());

			dc.nextObject();
			DepartmentType row = dc.getCurrentObject();
			row.setDepartmentName("test");
			dc.forceRefresh();

			for (int i = 0; i < 2; i++) {

				row = dc.getCurrentObject();
				dc.getElResolver().setValue("cmpId", row.getObjId());

				dc2.forceRefresh();
				stackProvider.get().savePoint();
				DepartmentType row2 = dc2.getCurrentObject();
				assertEquals(row.getObjId(), row2.getObjId());

				dc.nextObject();

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t11_pooledDataControl() {
		try {
			DataControl<DepartmentType> dc1 = factory.initDepartments("", deparmentString);
			dc1.getElResolver().setValue("departments", dc1);

			DepartmentType row1 = dc1.getCurrentObject();
			
			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);

			DepartmentType row2 = dc2.getCurrentObject();
			Long id = row2.getObjId();
			dc2.removeObject();

			row1 = dc1.getCurrentObject();
			assertNotEquals(row1.getObjId(),id);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void t11_pooledWithRefresDataCalontrol() {
		try {
			
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			

			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);
			dc.getCurrentObject();
			
			stackProvider.get().savePoint();
			dc.forceRefresh();

			DepartmentType dept = dc.getCurrentObject();
			dept.setDepartmentName("qwerty");

			stackProvider.get().savePoint();

			dept = dc.getCurrentObject();
			assertEquals("qwerty", dept.getDepartmentName());
			dc.forceRefresh();

			dept = dc.getCurrentObject();
			assertEquals("qwerty", dept.getDepartmentName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void t11_pooledWithSavePointDataCalontrol() {
		try {

			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);

			dc2.getCurrentObject();

			stackProvider.get().savePoint();

			DepartmentType newrow = (DepartmentType) repository.create(deparmentClass);
			newrow.setObjId(123L);
			repository.insert(newrow, deparmentClass);

			DepartmentType d0 = dc.getCurrentObject();
			assertEquals(Long.valueOf(123L), d0.getObjId());
			dc.nextObject();
			dc.getCurrentObject();
			stackProvider.get().savePoint();

			List<DepartmentType> ls = dc.getScroller();
			ls.get(0);
			ls.get(1);

			dc2.forceRefresh();
			stackProvider.get().rallbackSavePoint();

			DepartmentType d2 = dc.getCurrentObject();
			assertEquals(d2.getObjId(), Long.valueOf(123L));
			
			stackProvider.get().rallbackSavePoint();
			d2 = dc.getCurrentObject();
			assertEquals(d2.getObjId(), Long.valueOf(10L));


		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	
	@Test
	public void t13_ParallelRequest() {
		try {
			CpaRepository repository = Factory.getRepository();
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			
			DataControl<DepartmentType> dc = factory.initDepartments("", deparmentString);
			dc.getElResolver().setValue("departments", dc);

			DataControl<DepartmentType> dc2 = factory.initDepartments("N", deparmentString);
			dc2.getElResolver().setValue("Ndepartments", dc2);
			createQuery(dc2, DepartmentType.class.getCanonicalName());
			
			dc.getCurrentObject();
			dc.createObject();
			DepartmentType dep  = dc.getCurrentObject();
			
			stackProvider.get().commit();

			Long  id  = dep.getObjId();
			
			dc2.getElResolver().setValue("cmpId", id);
			dc2.forceRefresh();
			assertEquals(  id,  dep.getObjId());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
	
	
	private void createQuery(DataControl<?> control, String entity) throws QueryException, NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		ArrayList<SearchCriteria> sc = new ArrayList<>();

		SearchCriteria s = new SearchCriteria();
		s.setName("objId");
		s.setComparator(Operator.EQ.name());
		s.setValue("#{cmpId}");
		sc.add(s);

		control.setDefaultSearchCriteria(sc);

	}

}