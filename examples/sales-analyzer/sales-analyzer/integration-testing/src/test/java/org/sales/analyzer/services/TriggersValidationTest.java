/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.spa.ExternalConnectionPreQueryTrigger;
import org.tura.platform.repository.spa.SkipQueryTrigger;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepository;
import org.tura.platform.repository.triggers.PreQueryTrigger;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CountryReference;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.Preferences;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.db.WriteupOutcome;
import org.tura.salesanalyzer.serialized.db.repo.InitJPARepository;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import sales.analyzer.commons.service.impl.UUIPrimaryKeyStrategy;

public class TriggersValidationTest {

	private Registry registry;
	private SpaObjectRegistry spaRegistry;

	@SuppressWarnings({ "rawtypes", "unused" })
	private static List commandStack;
	
	@Test
	public void triggersTest() {
		SpaRepository.SPA_REPOSITORY_DATA_THREAD_LOCAL.get() .set(null);
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();
		
		try {
			registry.setPrImaryKeyStrategy(new UUIPrimaryKeyStrategy());
			commandStack = new ArrayList<>();

			InitJPARepository initJpa = new InitJPARepository( registry, spaRegistry);
			initJpa.initClassMapping();
			initJpa.initCommandProducer();
			initJpa.initProvider();

			InitSPARepository initSpa = new InitSPARepository( registry, spaRegistry);
			initSpa.initClassMapping();
			initSpa.initCommandProducer();
			initSpa.initProvider();

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
