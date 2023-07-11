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

package org.tura.platform.repository.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.repository.RepositoryProducer;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.cpa.storage.CpaStorageProvider;
import org.tura.platform.repository.cpa.storage.ObjectStatus;
import org.tura.platform.repository.cpa.storage.StorageControl;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

import objects.test.serialazable.jpa.Button;
import objects.test.serialazable.jpa.Canvas;
import objects.test.serialazable.jpa.InputText;
import objects.test.serialazable.jpa.TabCanvas;
import objects.test.serialazable.jpa.Trigger;
import objects.test.serialazable.jpa.TriggerProxy;
import objects.test.serialazable.jpa.UObject;
import objects.test.serialazable.jpa.WAria;
import objects.test.serialazable.jpa.Window;

public class MetamodelTest {

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
	public void t0000_createMetamodelObject() {
		try {
			Repository transport = repositoryProducer.getMetamodelRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);
			ProxyCommadStackProvider stackProvider =  repository.getStackProvider();
			CpaStorageProvider cpaStorageProvider  = repositoryProducer.cpaStorageProvider;
			
			Window o1 = (Window) repository.create(Window.class);
			repository.insert(o1, Window.class);
			
			TabCanvas o2 = (TabCanvas) repository.create(TabCanvas.class);
			repository.insert(o2, TabCanvas.class);
			
			
			List<StorageControl> array = cpaStorageProvider.getStorage().find(Window.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(TabCanvas.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			
			array = cpaStorageProvider.getStorage().find(Window.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(TabCanvas.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			InputText it = (InputText) repository.create(InputText.class);
			o1.getUiElement().add(it);
			
			Button bt = (Button) repository.create(Button.class);
			o1.getUiElement().add(bt);
			
			Trigger trg1 = (Trigger) repository.create(Trigger.class);
			trg1.setOperation("onClick");
			bt.setOnClick(trg1);
			
			Trigger trg2 = (Trigger) repository.create(Trigger.class);
			trg1.setOperation("action");
			bt.setAction(trg2);

			WAria wa = (WAria) repository.create(WAria.class);
			o1.setAria(wa);
			
			array = cpaStorageProvider.getStorage().find(InputText.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Button.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(WAria.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Inserted.name()}) );
			assertEquals(1, array.size());
			
			stackProvider.get().commit();
			
			array = cpaStorageProvider.getStorage().find(InputText.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Button.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(WAria.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Window.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(TabCanvas.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			

			array = cpaStorageProvider.getStorage().find(UObject.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			assertEquals(2, o1.getUiElement().size());
			
			repositoryProducer.em.clear();
			
			SearchResult<?> result = repository.find(new ArrayList<>(), new  ArrayList<>(), 0, 100, Canvas.class);
			assertEquals(2, result.getNumberOfRows());
			
			array = cpaStorageProvider.getStorage().find(InputText.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Button.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Window.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());

			array = cpaStorageProvider.getStorage().find(TabCanvas.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());			

			array = cpaStorageProvider.getStorage().find(WAria.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(1, array.size());
			
			array = cpaStorageProvider.getStorage().find(Trigger.class, 0, Long.MAX_VALUE, Arrays.asList(new String[] {  ObjectStatus.Loaded.name()}) );
			assertEquals(2, array.size());
			
			Object parent  =   ((TriggerProxy)trg1).eContainer();
			assertNotNull(parent);
			assertTrue(parent  instanceof Button);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}	
	
	
}
