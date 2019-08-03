package org.sales.analyzer.suites;

import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.sales.analyzer.process.RunExternalJob;
import org.sales.analyzer.ui.CaseManagementTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	CaseManagementTest.class
})
public class CaseMgmSuite {

	@ClassRule
	public static ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			try {
				RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c removeAll;startSAApplicationWithData");
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