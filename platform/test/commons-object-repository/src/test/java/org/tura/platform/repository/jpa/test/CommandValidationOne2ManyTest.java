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

import objects.test.serialazable.jpa.One2Many1A;
import objects.test.serialazable.jpa.One2Many1B;
import objects.test.serialazable.jpa.One2Many2A;
import objects.test.serialazable.jpa.One2Many2B;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommandValidationOne2ManyTest {

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
	public void t0000_One2Many() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			
			One2Many1A o1 = (One2Many1A) repository.create(One2Many1A.class);
			One2Many1B o2 = (One2Many1B) repository.create(One2Many1B.class);
			
//			try {
//				o1.getOne2Many1B().add(o2);
//				fail();
//			}catch( Exception e) {
//			}
//			
//			repository.insert(o1, One2Many1A.class);
			
//			try {
//				o1.getOne2Many1B().add(o2);
//				fail();
//			}catch( Exception e) {
//			}			
//			
//			repository.insert(o2, One2Many1B.class);
			o1.getOne2Many1B().add(o2);
			
			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(3, commands.size());
			
			List<StorageControl>  array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			o2 = (One2Many1B) repository.create(One2Many1B.class);
			repository.insert(o2, One2Many1B.class);
			o2.setOne2Many1A(o1);
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			try {
				o1.getOne2Many1B().remove(o2);
				fail();
			}catch (Exception e) {
			}
			o1.getOne2Many1B().remove(1);
			
			array = cpaStorageProvider.getStorage().find(One2Many1A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many1B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public void t0000_One2ManyContainment() {
		try {
			Repository transport = repositoryProducer.getJpaRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider = repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider = repositoryProducer.cpaStorageProvider;
			
			One2Many2A o1 = (One2Many2A) repository.create(One2Many2A.class);
			One2Many2B o2 = (One2Many2B) repository.create(One2Many2B.class);
			
			o1.getOne2Many2B().add(o2);
			
			
			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);

			o2 = (One2Many2B) repository.create(One2Many2B.class);
			o1.getOne2Many2B().add(o2);
			
			o1.getOne2Many2B().remove(2);
			
			List<Object> commands = stackProvider.get().getListOfCommand();
			assertEquals(0, commands.size());

			List<StorageControl> array = cpaStorageProvider.getStorage().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Created.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			array = cpaStorageProvider.getStorage().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Removed.name()}) );
			assertEquals(0, array.size());
			
			repository.insert(o1, One2Many2A.class);
			
			array = cpaStorageProvider.getStorage().find(One2Many2A.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(One2Many2B.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(2, array.size());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
