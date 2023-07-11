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
import org.sales.analyzer.services.TriggersValidationTest;
import org.sales.analyzer.ui.AbstractTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	CaseProcessingTest.class, 
	ImportProcessTest.class, 
	FileSearchServiceTest.class,
	JbpmSearchServiceTest.class,
	JbpmServiceTest.class,
	KeycloakServiceTest.class,
	TriggersValidationTest.class
})
public class TestSute {
	
	private static String os_name = System.getProperty("os.name").toLowerCase();

	
	public static boolean isWindows() {

		return (os_name.indexOf("win") >= 0);

	}

	@ClassRule
	public static ExternalResource resource = new ExternalResource() {
		
		@Override
		protected void before() throws Throwable {
			try {
				if ( isWindows()) {
					RunExternalJob.execute("../../../processor/tura-gogo.bat", "-c","removeAll");
					RunExternalJob.execute("../../../../processor/tura-gogo.bat", "-c","startSAApplication");
				}else{
					RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c removeAll;startSAApplication");
				}
				AbstractTest.adminHealthCheckt();
				AbstractTest.caseHealthCheckt();
				
			} catch (Exception e) {
				fail();
			}
		}

		@Override
		protected void after() {
			try {
				if ( isWindows()) {
					
					RunExternalJob.execute("../../../../processor/tura-gogo.bat", "-c","stopSAApplication");
				}else{
					RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c stopSAApplication");
				}

				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

}