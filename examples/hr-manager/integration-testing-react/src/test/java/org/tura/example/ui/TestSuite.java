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

package org.tura.example.ui;

import static org.junit.Assert.fail;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
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

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	DatascrollerViewTest.class,
	FatalErrorHandelingTest.class,
	InputViewTest.class,
	ListSelectionTest.class,
	MultiSelectTest.class,
	PollViewTest.class,
	RadioSelectionTest.class,
	SimpleViewTest.class,
	TableViewTest.class,
	TestForm1Test.class, 
	TestForm2Test.class ,
	Tree2TreeTest.class ,
	Tree2TreeTestMultiselectTest.class,
	TreeMultiSelectTest.class,
	TimeLinerTest.class,
	CalendarTest.class,
	HrControllerTest.class
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
					RunExternalJob.execute("../../../processor/tura-gogo.bat", "-c","startHRApplication");
				}else{
					RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c removeAll;startHRApplication");
				}
				AbstractTest.healthCheckt();
			} catch (Exception e) {
				fail();
			}
		}

		@Override
		protected void after() {
			try {
				if ( isWindows()) {
					RunExternalJob.execute("../../../processor/tura-gogo.bat", "-c" , "stopHRApplication");
				}else{
					RunExternalJob.execute("../../../processor/tura-gogo.sh", "-c stopHRApplication");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	};

}