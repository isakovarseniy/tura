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

package org.sales.analyzer.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.ExternalConnectionPreQueryTrigger;
import org.tura.platform.repository.spa.SkipQueryTrigger;
import org.tura.platform.repository.triggers.PreQueryTrigger;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.Preferences;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.db.WriteupOutcome;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class TriggersValidationTest {

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

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();

	}
	
	
	@Test
	public void triggersTest() {
		
		try {
			repositoryProducer.getRepository();
			Registry registry = repositoryProducer.registry;

			PreQueryTrigger trigger = registry.findPreQueryTrigger(Role.class.getName(), PermissionReferences.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			trigger = registry.findPreQueryTrigger(PermissionReferences.class.getName(), Role.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(User.class.getName(), CountryReference.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			trigger = registry.findPreQueryTrigger(CountryReference.class.getName(), User.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(User.class.getName(), StateReference.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			trigger = registry.findPreQueryTrigger(StateReference.class.getName(), User.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(User.class.getName(), CityRefeence.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(CityRefeence.class.getName(), User.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			
			trigger = registry.findPreQueryTrigger(User.class.getName(), Preferences.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			

			trigger = registry.findPreQueryTrigger(Preferences.class.getName(), User.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			
			trigger = registry.findPreQueryTrigger(CaseProcess.class.getName(), WriteupOutcome.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			
			trigger = registry.findPreQueryTrigger(WriteupOutcome.class.getName(), CaseProcess.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(Role.class.getName(), RoleReference.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(RoleReference.class.getName(), Role.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
