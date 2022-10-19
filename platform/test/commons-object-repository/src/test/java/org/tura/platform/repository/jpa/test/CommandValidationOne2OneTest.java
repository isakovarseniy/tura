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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
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
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.JPAObject5;
import objects.test.serialazable.jpa.JPAObject6;
import objects.test.serialazable.jpa.One2One2A;
import objects.test.serialazable.jpa.One2One2B;
import objects.test.serialazable.jpa.One2One3A;
import objects.test.serialazable.jpa.One2One3B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommandValidationOne2OneTest {

	private static Logger logger;
	private static Server server;
	private static RepositoryProducer repositoryProducer;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		repositoryProducer = new RepositoryProducer();
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);

		// ConsoleHandler handler = new ConsoleHandler();
		// handler.setFormatter(new LogFormatter());
		// logger.addHandler(handler);
		// logger.setLevel(Level.INFO);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();

	}

	@Test
	public void t0000_One2OneContainent() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;

			JPAObject6 o1 = (JPAObject6) repository.create(JPAObject6.class);
			JPAObject5 o2 = (JPAObject5) repository.create(JPAObject5.class);
			o1.setJPAObject5(o2);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			JPAObject6 o1_ = (JPAObject6) repository.create(JPAObject6.class);
			o1_.setJPAObject5(o2);

			commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			repository.insert(o2, JPAObject5.class);

			commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());

			List<StorageControl> array = cpaStorageProvider.getStorage().find(JPAObject6.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(JPAObject5.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			assertTrue(o2.getAttached());
			assertTrue(o1_.getAttached());

			o1_ = (JPAObject6) repository.create(JPAObject6.class);
			o2.setJPAObject6(o1_);

			array = cpaStorageProvider.getStorage().find(JPAObject6.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(JPAObject5.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(JPAObject6.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			assertTrue(o1_.getAttached());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0001_One2OneContainentOposit() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;

			One2One2A o1 = (One2One2A) repository.create(One2One2A.class);
			One2One2B o2 = (One2One2B) repository.create(One2One2B.class);
			o1.setOne2One2B(o2);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			One2One2B o2_ = (One2One2B) repository.create(One2One2B.class);
			o2_.setOne2One2A(o1);

			commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			repository.insert(o2_, One2One2B.class);

			commands = stackProvider.get().getListOfCommand();
			assertEquals(1, commands.size());

			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			assertTrue(o2_.getAttached());
			assertTrue(o1.getAttached());

			o1 = (One2One2A) repository.create(One2One2A.class);
			o2_.setOne2One2A(o1);

			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One2B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One2A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(1, array.size());

			assertTrue(o1.getAttached());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0002_One2OneNonContainent() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;

			One2One3A o1 = (One2One3A) repository.create(One2One3A.class);
			One2One3B o2 = (One2One3B) repository.create(One2One3B.class);
			o1.setOne2One3B(o2);

			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(3, commands.size());

			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			assertTrue(o1.getAttached());
			assertTrue(o2.getAttached());

			One2One3B o2_ = (One2One3B) repository.create(One2One3B.class);
			o1.setOne2One3B(o2_);

			array = cpaStorageProvider.getStorage().find(One2One3A.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Inserted.name() }));
			assertEquals(2, array.size());

			array = cpaStorageProvider.getStorage().find(One2One3B.class, 0, Long.MAX_VALUE,
					Arrays.asList(new String[] { ObjectStatus.Removed.name() }));
			assertEquals(0, array.size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}