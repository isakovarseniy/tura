package org.sales.analyzer.suites;

import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.sales.analyzer.process.CaseProcessingTest;
import org.sales.analyzer.process.ImportProcessTest;
import org.sales.analyzer.process.RunExternalJob;
import org.sales.analyzer.services.FileSearchServiceTest;
import org.sales.analyzer.services.JbpmSearchServiceTest;
import org.sales.analyzer.services.JbpmServiceTest;
import org.sales.analyzer.services.KeycloakServiceTest;
import org.sales.analyzer.ui.AdminTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	CaseProcessingTest.class, 
	ImportProcessTest.class, 
	FileSearchServiceTest.class,
	JbpmSearchServiceTest.class,
	JbpmServiceTest.class,
	KeycloakServiceTest.class,
	AdminTest.class
})
public class TestSute {

	@ClassRule
	public static ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			try {
				RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c removeAll;startSAApplication");
			} catch (Exception e) {
				fail();
			}
		}

		@Override
		protected void after() {
			try {
				RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c stopSAApplication");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

}