/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.example.ui.hrmanager.simpleform.pageobject.FatalErrorPagePageObject;
import org.tura.example.ui.hrmanager.simpleform.pageobject.FatallErrorViewPageObject;
import org.tura.platform.selenium.primereact.Repeater;

public class FatalErrorHandelingTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/fatallErrorView";
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
	public void t000_exceptionHandeling01() {
		driver.get(getUrl(app_url));

		FatallErrorViewPageObject page = new FatallErrorViewPageObject(driver);
		page.getSubmit().click();
		
		new Repeater() {

			@Override
			public void action() {
				FatalErrorPagePageObject page = new FatalErrorPagePageObject(driver);
				assertEquals("Fatal Error",page.getMessage().getValue());
			}
			
		}.repeat(10);
		
	}
	
	

}