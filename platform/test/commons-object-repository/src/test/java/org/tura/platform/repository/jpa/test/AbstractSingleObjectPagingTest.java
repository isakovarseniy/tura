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

package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.init.Factory;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;
import org.tura.platform.repository.proxy.access.TopLazyList;
import org.tura.platform.test.hr.model.DepartmentType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public abstract class AbstractSingleObjectPagingTest {

	private static Logger logger;
	private static Server server;
	private static RepositoryProducer repositoryProducer;
	private static Factory factory = new Factory();

	public static Class<?> deparmentClass;
	public static Class<?> employeeClass;
	public static String deparmentString;
	public static String employeeString;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		PlatformConfig.TEST_MODE = true;
		
		repositoryProducer = new RepositoryProducer();
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();

		repositoryProducer.em.getTransaction().begin();
		factory.initDB(deparmentString, repositoryProducer.em);
		try {
			factory.initDB(employeeString, repositoryProducer.em);
			repositoryProducer.em.getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	@Test
	public void t0000_paging() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			Long id = 10L;
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				Long rId = factory.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}

			List<StorageControl> array = cpaStorageProvider.getStorage().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(7, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0001_paging() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);

			DepartmentType dpt = (DepartmentType) list.get(0);
			Long rId = factory.cDept(10L);
			assertEquals(rId, dpt.getObjId());

			dpt = (DepartmentType) list.get(26);
			rId = factory.cDept(270L);
			assertEquals(rId, dpt.getObjId());

			try {
				dpt = (DepartmentType) list.get(30);
				fail();
			} catch (Throwable e) {

			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0003_paging() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			Long id = 10L;
			DepartmentType d1 = (DepartmentType) list.get(0);

			
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				Long rId = factory.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}
			Long rId = factory.cDept(10l);
			assertEquals(rId, d1.getObjId());

			List<StorageControl> array = cpaStorageProvider.getStorage().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(8, array.size());

			d1 = null;
			System.gc();

			id = 10L;
			for (Object d : list) {
				DepartmentType dpt = (DepartmentType) d;
				rId = factory.cDept(id);
				assertEquals(rId, dpt.getObjId());
				id = id + 10;
			}
			array = cpaStorageProvider.getStorage().findAny(deparmentClass, 0, Long.MAX_VALUE);
			assertEquals(7, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings("resource")
	@Test
	public void t0004_paging() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			PlatformConfig.LOADSTEP = 20;
			TopLazyList<?> list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);

			DepartmentType d3 = (DepartmentType) list.get(3);
			DepartmentType d4 = (DepartmentType) list.get(4);

			list.remove(3);

			try {
				d3.getObjId();
				fail();
			} catch (Exception e) {

			}

			DepartmentType dpt = (DepartmentType) list.get(25);
			Long rId = factory.cDept(270L);
			assertEquals(rId, dpt.getObjId());

			d3 = (DepartmentType) list.get(3);
			assertEquals(d4.getObjId(), d3.getObjId());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	@Test
	public void t0005_paging() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			@SuppressWarnings("unused")
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			PlatformConfig.LOADSTEP = 20;
			TopLazyList list = new TopLazyList<>(deparmentClass, cpaStorageProvider, repository);
			
			list.get(0);
			DepartmentType d1 = (DepartmentType) list.create();
			list.add(3,d1);
			Long o1 = d1.getObjId();
			
			DepartmentType dpt = (DepartmentType) list.get(27);
			Long rId = factory.cDept(270L);
			assertEquals(rId, dpt.getObjId());
			
			list.get(0);
			dpt = (DepartmentType) list.get(3);
			assertEquals(o1, dpt.getObjId());
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}	
	
}
