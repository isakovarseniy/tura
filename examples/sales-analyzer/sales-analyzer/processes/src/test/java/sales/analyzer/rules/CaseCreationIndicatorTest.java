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
	
	
	
}
