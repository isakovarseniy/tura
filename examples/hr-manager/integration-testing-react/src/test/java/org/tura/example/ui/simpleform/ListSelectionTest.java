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

package org.tura.example.ui.simpleform;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.AbstractTest;
import org.tura.example.ui.hrmanager.simpleform.pageobject.ListSelectionPageObject;
import org.tura.platform.selenium.DropDownSelection;
import org.tura.platform.selenium.SelectMany;
import org.tura.platform.selenium.primereact.Repeater;


public class ListSelectionTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/listSelection";
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
	public void t000_listSelection01() {
		driver.get(getUrl(app_url));
		
		ListSelectionPageObject page = new ListSelectionPageObject(driver);
		
		DropDownSelection el = page.getDropdown1();
		assertEquals("Select value", el.getValue());
		el.setValue("Department 1");

		new Repeater() {

			@Override
			public void action() {
				DropDownSelection el = page.getDropdownemp();
				el.setValue("Last Name 1");
				assertEquals("Last Name 1", el.getValue());
			}
			
		}.repeat(10);


		el = page.getDropdown1();
		el.setValue("Department 2");

	
		new Repeater() {
			
			@Override
			public void action() {
				DropDownSelection el = page.getDropdownemp();
				assertEquals("Select value", el.getValue());
			}
		}.repeat(10);

		el = page.getDropdownemp();
		el.setValue("Last Name 4");
		
		new Repeater() {
			
			@Override
			public void action() {
				DropDownSelection el = page.getDropdownemp();
				assertEquals("Last Name 4", el.getValue());
			}
		}.repeat(10);
		
		
	}
	
	@Test
	public void t000_listSelection02() {
		driver.get(getUrl(app_url));
		
		ListSelectionPageObject page = new ListSelectionPageObject(driver);
		
		SelectMany el = page.getMultiselect();
		assertEquals("Select value", el.getValue());
		el.click();
		
		el.setValue("Department 1");
		el.setValue("Department 2");

		new Repeater() {
			@Override
			public void action() {
				SelectMany el = page.getMultiselect();
				assertEquals("Department 1,Department 2", el.getValue());
			}
		}.repeat(10);

		el.click();
		new Repeater() {
			
			@Override
			public void action() {
				page.getSubmitBtn().click();
			}
		}.repeat(10);
		
		new Repeater() {
			
			@Override
			public void action() {
				assertEquals("16011602", page.getOutpupRes().getValue());
			}
		}.repeat(10);
		
	}
	
	
}