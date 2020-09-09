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

package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.testform1.pageobject.TestForm2PageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.Repeater;

public class TestForm2Test extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/testform1/testForm2";
	static private String driver_location = System.getProperty("user.home") + "/.tura/resources/chromedriver";

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
	public void t000_TestForm1() {
		try {
			driver.get(getUrl(app_url));

			TestForm2PageObject testForm2Page = new TestForm2PageObject(driver);
			Table t = testForm2Page.getDepartmentTable();

			t.getRow(0).getCell(0).findElement(By.cssSelector("div[class*='p-checkbox-box']")).click();
			t.getRow(1).getCell(0).findElement(By.cssSelector("div[class*='p-checkbox-box']")).click();
			t.getRow(2).getCell(0).findElement(By.cssSelector("div[class*='p-checkbox-box']")).click();

			
			new Repeater() {
				
				@Override
				public void action() {
					assertTrue(t.getRow(0).isSelected());
					assertTrue(t.getRow(1).isSelected());
					assertTrue(t.getRow(2).isSelected());
				}
			}.repeat(3);
			
		
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
