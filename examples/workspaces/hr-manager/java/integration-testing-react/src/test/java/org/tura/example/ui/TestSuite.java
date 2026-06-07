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

package org.tura.example.ui;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.platform.suite.api.AfterSuite;
import org.junit.platform.suite.api.BeforeSuite;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.tura.example.ui.hrmanager.AbstractTest;
import org.tura.example.ui.hrmanager.HrControllerTest;
import org.tura.example.ui.hrmanager.RunExternalJob;
import org.tura.example.ui.hrmanager.TestForm1Test;
import org.tura.example.ui.hrmanager.TestForm2Test;
import org.tura.example.ui.hrmanager.Tree2TreeTest;
import org.tura.example.ui.hrmanager.Tree2TreeTestMultiselectTest;
import org.tura.example.ui.hrmanager.TreeMultiSelectTest;
import org.tura.example.ui.simpleform.CalendarTest;
import org.tura.example.ui.simpleform.DatascrollerViewTest;
import org.tura.example.ui.simpleform.FatalErrorHandelingTest;
import org.tura.example.ui.simpleform.InputViewTest;
import org.tura.example.ui.simpleform.ListSelectionTest;
import org.tura.example.ui.simpleform.MultiSelectTest;
import org.tura.example.ui.simpleform.PollViewTest;
import org.tura.example.ui.simpleform.RadioSelectionTest;
import org.tura.example.ui.simpleform.SimpleViewTest;
import org.tura.example.ui.simpleform.TableViewTest;
import org.tura.example.ui.simpleform.TimeLinerTest;

@Suite
@SelectClasses({ DatascrollerViewTest.class, FatalErrorHandelingTest.class, InputViewTest.class,
		ListSelectionTest.class, MultiSelectTest.class, PollViewTest.class, RadioSelectionTest.class,
		SimpleViewTest.class, TableViewTest.class, TestForm1Test.class, TestForm2Test.class, Tree2TreeTest.class,
		Tree2TreeTestMultiselectTest.class, TreeMultiSelectTest.class, TimeLinerTest.class, CalendarTest.class,
		HrControllerTest.class })
public class TestSuite {

	private static String os_name = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {

		return (os_name.indexOf("win") >= 0);

	}

	@BeforeSuite
	public static void beforeSuite() {
		try {
			if (isWindows()) {
				RunExternalJob.execute("../../../../../examples/workspaces/hr-manager/etc/hr_cmd.bat startHRApplication");
			} else {
				RunExternalJob.execute( "sh", "-c",  "../../../../../examples/workspaces/hr-manager/etc/hr_cmd.sh startHRApplication");
			}
			AbstractTest.healthCheckt();
		} catch (Exception e) {
			fail();
		}
	}

	@AfterSuite
	public static void afterSuite() {
		try {
			if (isWindows()) {
				RunExternalJob.execute("../../../../../examples/workspaces/hr-manager/etc/hr_cmd.bat removeHRApplication");
				
			} else {
				RunExternalJob.execute( "sh", "-c",  "../../../../../examples/workspaces/hr-manager/etc/hr_cmd.sh removeHRApplication");
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}