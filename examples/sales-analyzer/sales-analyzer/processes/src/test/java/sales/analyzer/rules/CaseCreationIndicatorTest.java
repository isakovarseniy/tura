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

package sales.analyzer.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sales.analyzer.process.commons.model.MonthlyFileRuleModel;

public class CaseCreationIndicatorTest {

	@Test
	public void ruleCaseGenerationTest() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession();

			MonthlyFileRuleModel model = new MonthlyFileRuleModel();

			model.setMonth_1_amount((float) 10.0);
			model.setMonth_2_amount((float) 20.0);
			model.setMonth_3_amount((float) 30.0);

			kSession.insert(model);
			kSession.fireAllRules();

			assertTrue(model.isWillCaseGenerate());

		} catch (Exception e) {
			fail();
		}

	}

	@Test
	public void ruleNoCaseGenerationTest() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession();

			MonthlyFileRuleModel model = new MonthlyFileRuleModel();

			model.setMonth_1_amount((float) 20.0);
			model.setMonth_2_amount((float) 20.0);
			model.setMonth_3_amount((float) 30.0);

			kSession.insert(model);
			kSession.fireAllRules();

			assertFalse(model.isWillCaseGenerate());

		} catch (Exception e) {
			fail();
		}

	}
	
	@Test
	public void ruleNoCaseGenerationTest1() {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession();

			MonthlyFileRuleModel model = new MonthlyFileRuleModel();

			model.setMonth_1_amount((float) 0.0);
			model.setMonth_2_amount((float) 20.0);
			model.setMonth_3_amount((float) 30.0);

			kSession.insert(model);
			kSession.fireAllRules();

			assertFalse(model.isWillCaseGenerate());

		} catch (Exception e) {
			fail();
		}

	}
	
	
}
