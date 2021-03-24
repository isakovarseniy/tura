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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.AbstractTest;
import org.tura.example.ui.hrmanager.simpleform.pageobject.TableViewPageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.Repeater;

public class TableViewTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/tableView";
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
	public void t000_tableView01() {
		driver.get(getUrl(app_url));
		
		TableViewPageObject page = new TableViewPageObject(driver);
		
		Table depTab = page.getDept();
		WebElement el = depTab.getRow(0).getCell(0);
		assertEquals("1601",el.getText());
		assertTrue(depTab.getRow(0).isSelected());
		
		new Repeater() {
			@Override
			public void action() {
				Table empTab = page.getEmployee();
				WebElement el = empTab.getRow(0).getCell(0);
				assertEquals("First Name 1",el.getText());
				assertTrue(empTab.getRow(0).isSelected());
			}
		}.repeat(5);;

		
		depTab.getRow(1).click();
		new Repeater() {
			
			@Override
			public void action() {
				assertFalse(depTab.getRow(0).isSelected());
				assertTrue(depTab.getRow(1).isSelected());
			}
		}.repeat(5);;
		
		
		new Repeater() {
			
			@Override
			public void action() {
				Table empTab = page.getEmployee();
				WebElement el = empTab.getRow(0).getCell(0);
				assertEquals("First Name 3",el.getText());
			}
		}.repeat(5);
		
		
		WebElement header = depTab.getHeader().getCell(0);
		header.click();

		new Repeater() {
			@Override
			public void action() {
				WebElement el = depTab.getRow(1).getCell(0);
				assertEquals("1636",el.getText());
				assertTrue(depTab.getRow(1).isSelected());
			}
		}.repeat(5);
		
		new Repeater() {
			@Override
			public void action() {
				Table empTab = page.getEmployee();
				assertTrue( empTab.isEmpty());
			}
		}.repeat(5);
		
	}
	
}
