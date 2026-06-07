/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.jpa;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.platform.suite.api.AfterSuite;
import org.junit.platform.suite.api.BeforeSuite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.cpa.CpaRepository;

import objects.test.serialazable.jpa.One2One1B;

@Suite
@SelectClasses({ 
	RestRepositoryTest.class,
	EmulatorTest.class
	}
)
public class TestSuite {
	
	private static String os_name = System.getProperty("os.name").toLowerCase();

	
	public static boolean isWindows() {

		return (os_name.indexOf("win") >= 0);

	}

	@BeforeSuite
	public static void beforeSuite() {
		try {
			if ( isWindows()) {
				RunExternalJob.execute("../../../examples/workspaces/rest-services/etc/rest_cmd.bat", "startRestServer");
			}else{
				RunExternalJob.execute( "sh", "-c", "../../../examples/workspaces/rest-services/etc/rest_cmd.sh startRestServer");
			}
			
			healthCheckt();
		} catch (Exception e) {
			fail();
		}
	}
	
	@AfterSuite
	public static void afterSuite() {
		try {
			if ( isWindows()) {
				RunExternalJob.execute("../../../examples/workspaces/rest-services/etc/rest_cmd.bat", "removeRestServer");
			}else{
				RunExternalJob.execute("sh", "-c", "../../../examples/workspaces/rest-services/etc/rest_cmd.sh removeRestServer");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void healthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				System.out.println("try "+i);
				CpaRepository repository = RestRepositoryTest.getRepository();
				repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 10, One2One1B.class);
				return;
			} catch (Exception e) {
				System.out.println("Error ..."+i);
				Thread.sleep(2000);
			}
		}
		throw new Exception("Connection error");
	}

	
}
