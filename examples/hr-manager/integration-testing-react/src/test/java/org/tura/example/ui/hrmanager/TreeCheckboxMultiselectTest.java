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

package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.testform2.pageobject.TestFormWindowPageObject;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.platform.selenium.primereact.TreeRow;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeCheckboxMultiselectTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/testform2/testFormWindow";
	static private String driver_location = System.getProperty("user.home") + "/.tura/resources/"+getChromeDriverName();

	@BeforeClass
	public static void beforeClass() {
		try {

			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File(driver_location)).usingAnyFreePort()
					.build();

			service.start();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@AfterClass
	public static void createAndStopService() {
		service.stop();
	}

	@Before
	public void createDriver() {
		driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
	
	@Test
	public void t000_selection1() {
		driver.get(getUrl(app_url));

		TestFormWindowPageObject testFormWindowPageObject = new TestFormWindowPageObject(driver);
		
		Tree tree = testFormWindowPageObject.getTreeCheckBox();
		TreeRow tr = (TreeRow) tree.getRow("1");
		tr.open();
		
		tr = (TreeRow) tree.getRow("1_1");
		tr.open();
		
		tr = (TreeRow) tree.getRow("1_1_1");
		tr.open();
		
        tr.check();
		
		tr = (TreeRow) tree.getRow("1_1_1_1");
        tr.check();

		tr = (TreeRow) tree.getRow("1_1_1");
		tr.close();
        
		
		new Repeater() {
			@Override
			public void action() {
				Tree tree = testFormWindowPageObject.getTreeCheckBox();
				TreeRow tr = (TreeRow) tree.getRow("1_1_1");
				assertTrue(tr.isSelected());
				assertFalse(tr.isPartialSelected());
			}
		}.repeat(3);
		
		
	}
}