package org.tura.example.ui.hrmanager;

import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ HrControllerTest.class, MiscTest.class, Tree2TreeTest.class })
public class TestSute {

	@ClassRule
	public static ExternalResource resource = new ExternalResource() {
		@Override
		protected void before() throws Throwable {
			try {
				RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c startHRApplication");
				AbstractTest.healthCheckt();
			} catch (Exception e) {
				fail();
			}
		}

		@Override
		protected void after() {
			try {
				RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c stopHRApplication");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

}