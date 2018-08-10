/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
package org.tura.platform.repository.mixed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.jpa.operation.EntityManagerProvider;
import org.tura.platform.repository.jpa.test.UUIPrimaryKeyStrategy;
import org.tura.platform.repository.spa.ExternalConnectionPreQueryTrigger;
import org.tura.platform.repository.spa.SkipQueryTrigger;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import objects.test.serialazable.jpa.A1;
import objects.test.serialazable.jpa.A3;
import objects.test.serialazable.jpa.A4;
import objects.test.serialazable.jpa.A5;
import objects.test.serialazable.jpa.B1;
import objects.test.serialazable.jpa.C1;
import objects.test.serialazable.jpa.DD1;
import objects.test.serialazable.jpa.F1;
import objects.test.serialazable.jpa.InitJPARepository;
import objects.test.serialazable.jpa.InitSPARepository;
import objects.test.serialazable.jpa.JPAObject1;
import objects.test.serialazable.jpa.JPAObject2;
import objects.test.serialazable.jpa.JPAObject3;
import objects.test.serialazable.jpa.JPAObject4;
import objects.test.serialazable.jpa.P1;
import objects.test.serialazable.jpa.Q1;
import objects.test.serialazable.jpa.Q2;
import objects.test.serialazable.jpa.Q3;
import objects.test.serialazable.jpa.Q4;
import objects.test.serialazable.jpa.SPAObject1;
import objects.test.serialazable.jpa.SPAObject2;
import objects.test.serialazable.jpa.SPAObject3;
import objects.test.serialazable.jpa.SPAObject4;
import objects.test.serialazable.jpa.W1;
import objects.test.serialazable.jpa.W2;
import objects.test.serialazable.jpa.W3;
import objects.test.serialazable.jpa.W4;

public class TriggersValidationTest {

	private static EntityManager em;
	@SuppressWarnings({ "rawtypes", "unused" })
	private static List commandStack;

	private Registry registry = new Registry();
	private SpaObjectRegistry spaRegistry = new SpaObjectRegistry();

	private static EntityManagerProvider emProvider = new EntityManagerProvider() {

		@Override
		public EntityManager getEntityManager() {
			return em;
		}

		@Override
		public void destroyEntityManager() {

		}
	};


	@Test
	public void triggersTest() {
		try {
			registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
			commandStack = new ArrayList<>();

			InitJPARepository initJpa = new InitJPARepository(new SpaRepository(), registry, spaRegistry);
			initJpa.initClassMapping();
			initJpa.initCommandProducer();
			initJpa.initProvider();
			initJpa.initEntityManagerProvider(emProvider);

			InitSPARepository initSpa = new InitSPARepository(new SpaRepository(), registry, spaRegistry);
			initSpa.initClassMapping();
			initSpa.initCommandProducer();
			initSpa.initProvider();
			
			
			PreQueryTrigger trigger = registry.findPreQueryTrigger(JPAObject2.class.getName(), SPAObject2.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(SPAObject2.class.getName(), JPAObject2.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			

			trigger = registry.findPreQueryTrigger(JPAObject1.class.getName(), SPAObject1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(SPAObject1.class.getName(), JPAObject1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			

			trigger = registry.findPreQueryTrigger(JPAObject3.class.getName(), SPAObject3.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(SPAObject3.class.getName(), JPAObject3.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			

			trigger = registry.findPreQueryTrigger(JPAObject4.class.getName(), SPAObject4.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(SPAObject4.class.getName(), JPAObject4.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(P1.class.getName(), A5.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(A5.class.getName(), P1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(B1.class.getName(), A3.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(A3.class.getName(), B1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			

			trigger = registry.findPreQueryTrigger(C1.class.getName(), A3.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(A3.class.getName(), C1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(A1.class.getName(), DD1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(DD1.class.getName(), A1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(W3.class.getName(), Q3.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(Q3.class.getName(), W3.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(Q2.class.getName(), W2.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(W2.class.getName(), Q2.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(W1.class.getName(), Q1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(Q1.class.getName(), W1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());

			
			trigger = registry.findPreQueryTrigger(W4.class.getName(), Q4.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(Q4.class.getName(), W4.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			
			trigger = registry.findPreQueryTrigger(A4.class.getName(), F1.class.getName());
			assertEquals(ExternalConnectionPreQueryTrigger.class.getName(), trigger.getClass().getName());
			
			trigger = registry.findPreQueryTrigger(F1.class.getName(), A4.class.getName());
			assertEquals(SkipQueryTrigger.class.getName(), trigger.getClass().getName());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
