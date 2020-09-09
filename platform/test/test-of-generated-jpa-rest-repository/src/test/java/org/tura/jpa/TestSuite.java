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

package org.tura.jpa;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;

import objects.test.serialazable.jpa.One2One1B;
import objects.test.serialazable.jpa.ProxyRepository;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	RestRepositoryTest.class
	}
)
public class TestSuite {
	
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
					RunExternalJob.execute("../../../processor/tura-gogo.bat", "-c","startRestServer");
				}else{
					RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c removeAll;startRestServer");
				}
				
				healthCheckt();
			} catch (Exception e) {
				fail();
			}
		}

		@Override
		protected void after() {
			try {
				if ( isWindows()) {
					RunExternalJob.execute("../../../processor/tura-gogo.bat", "-c","stopRestServer");
				}else{
					RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c stopRestServer");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

	
	public static void healthCheckt() throws Exception {
		for (int i = 0; i < 100; i++) {
			try {
				System.out.println("try "+i);
				ProxyRepository repository = RestRepositoryTest.getRepository();
				repository.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0, 0, One2One1B.class.getName());
				return;
			} catch (Exception e) {
				System.out.println("Error ..."+i);
				Thread.sleep(2000);
			}
		}
		throw new Exception("Connection error");
	}

	
}
