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

package org.tura.model.designer.test.suite;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.platform.suite.api.AfterSuite;
import org.junit.platform.suite.api.BeforeSuite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({})
public class TestSuite {

	private static String os_name = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {

		return (os_name.indexOf("win") >= 0);

	}

	@BeforeSuite
	public static void before() throws Throwable {
		try {
			if (isWindows()) {
				RunExternalJob.execute("../../../../cli/cli.bat", "-c", "swMetaDesigner;startMMDesigner");
			} else {
				RunExternalJob.execute("../../../../cli/cli.sh", "-c swMetaDesigner;startMMDesigner");
			}

		} catch (Exception e) {
			fail();
		}
	}

	@AfterSuite
	public static  void after() {
		try {
			if (isWindows()) {
				RunExternalJob.execute("../../../../cli/cli.bat", "-c", "swMetaDesigner;startMMDesigner;stopMMDesigner");
			} else {
				RunExternalJob.execute("../../../../cli/cli.sh", "-c swMetaDesigner;startMMDesigner;stopMMDesigner");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}