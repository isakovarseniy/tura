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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
import org.tura.example.ui.hrmanager.simpleform.pageobject.MultiSelectPageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.CheckBoxPrimeReact;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.platform.selenium.primereact.TableRow;


public class MultiSelectTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/multiSelect";
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
	public void t000_multiselet01() {
		driver.get(getUrl(app_url));
		
		MultiSelectPageObject page = new MultiSelectPageObject(driver);
		Table table = page.getTable();
		
		TableRow row = (TableRow) table.getRow(0);
		CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
		ch.setValue(true);
		
		row = (TableRow) table.getRow(1);
		ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
		ch.setValue(true);
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(0);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(1);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		
		table.nextPage();
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(1);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertFalse(ch.getValue());
			}
		}.repeat(10);
		
		
		row = (TableRow) table.getRow(3);
		ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
		ch.setValue(true);
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(3);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		
		table.prevPage();
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(0);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(1);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		
		page.getSubmit().click();
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(0);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		new Repeater() {
			@Override
			public void action() {
				TableRow row = (TableRow) table.getRow(1);
				CheckBoxPrimeReact ch = new CheckBoxPrimeReact( row.getSelectionColumn(),driver);
				assertTrue(ch.getValue());
			}
		}.repeat(10);
		
		
	}
	
}