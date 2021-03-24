/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.sales.analyzer.process.RunExternalJob;
import org.sales.analyzer.ui.AbstractTest;
import org.sales.analyzer.ui.AdminTest;
import org.sales.analyzer.ui.CaseManagementTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	AdminTest.class,
	CaseManagementTest.class
})
public class CaseMgmSuite {
	
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
					RunExternalJob.execute("../../../../processor/tura-gogo.bat", "-c","startSAApplicationWithData");
				}else{
					RunExternalJob.execute("../../../../processor/tura-gogo.sh", "-c removeAll;startSAApplicationWithData");
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