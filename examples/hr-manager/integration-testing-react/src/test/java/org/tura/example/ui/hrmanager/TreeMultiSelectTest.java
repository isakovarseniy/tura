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

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.testform2.pageobject.TestForm1WindowPageObject;
import org.tura.platform.selenium.Menu;
import org.tura.platform.selenium.Messages;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primereact.FalseRepeater;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.platform.selenium.primereact.TreeRow;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeMultiSelectTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/testform2/testForm1Window";
	static private String driver_location = System.getProperty("user.home") + "/.tura/resources/chromedriver";

	private TreeRow tr;
	private Menu menu;

	@BeforeClass
	public static void beforeClass() {
		try {

			service = new ChromeDriverService.Builder().usingDriverExecutable(new File(driver_location))
					.usingAnyFreePort().build();

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
	public void t000_addRollback() {
		driver.get(getUrl(app_url));

		TestForm1WindowPageObject testForm1WindowPageObject = new TestForm1WindowPageObject(driver);

		Tree tree = testForm1WindowPageObject.getFullTree();

		tr = (TreeRow) tree.getRow("1");
		tr.open();

		tr = (TreeRow) tree.getRow("1_1");
		tr.open();

		new Repeater() {
			@Override
			public void action() {
				tr.rightClick();
				menu = testForm1WindowPageObject.getFullTreeContextMenu();
				menu.clickOnItem("Create");
			}
		}.repeat(3);

		new Repeater() {
			@Override
			public void action() {
				assertEquals("NA", tr.getCell(0).getText());
			}
		}.repeat(3);

		tr.rightClick();
		menu.clickOnItem("Create child");

		new Repeater() {
			@Override
			public void action() {
				tree.getRow("1_1_1");
			}
		}.repeat(3);

		testForm1WindowPageObject.getRallback().click();

		new Repeater() {

			@Override
			public void action() {
				Messages messages = testForm1WindowPageObject.getMessages();
				assertEquals("Data rolled back", messages.getValue(0));
			}
		}.repeat(3);

		new Repeater() {
			@Override
			public void action() {
				tree.getRow("1_1");
			}
		}.repeat(3);

	}

	@Test
	public void t001_remove() {
		driver.get(getUrl(app_url));

		TestForm1WindowPageObject testForm1WindowPageObject = new TestForm1WindowPageObject(driver);

		Tree tree = testForm1WindowPageObject.getFullTree();

		tr = (TreeRow) tree.getRow("1");
		tr.open();

		tr = (TreeRow) tree.getRow("1_1");
		tr.open();

		tr = (TreeRow) tree.getRow("1_1_1");
		tr.open();

		tr = (TreeRow) tree.getRow("1_1_1_2");

		new Repeater() {
			@Override
			public void action() {
				tr.rightClick();
				menu = testForm1WindowPageObject.getFullTreeContextMenu();
				menu.clickOnItem("Remove");
			}
		}.repeat(3);

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			tr = (TreeRow) tree.getRow("1");
			String text = tr.getCell(0).findElement(By.cssSelector("span[class*='p-treenode-label']")).getText();
			assertEquals("Company A", text);
		}
	}

	
	@Test
	public void t002_remove() {
		driver.get(getUrl(app_url));

		TestForm1WindowPageObject testForm1WindowPageObject = new TestForm1WindowPageObject(driver);

		Tree tree = testForm1WindowPageObject.getFullTree();

		tr = (TreeRow) tree.getRow("1");
		tr.open();

		tr = (TreeRow) tree.getRow("1_1");
		tr.open();

		new Repeater() {
			@Override
			public void action() {
				tr.rightClick();
				menu = testForm1WindowPageObject.getFullTreeContextMenu();
				menu.clickOnItem("Remove");
			}
		}.repeat(3);
		
		new FalseRepeater() {
			@Override
			public void action() {
				 tree.getRow("1_1");
			}
		}.repeat(10);

		tr = (TreeRow) tree.getRow("1");
		String text = tr.getCell(0).findElement(By.cssSelector("span[class*='p-treenode-label']")).getText();
		assertEquals("Company A", text);
	
		tr = (TreeRow) tree.getRow("2");
		text = tr.getCell(0).findElement(By.cssSelector("span[class*='p-treenode-label']")).getText();
		assertEquals("Company B", text);
		
		
		tr = (TreeRow) tree.getRow("1");
		tr.open();
		
		new FalseRepeater() {
			@Override
			public void action() {
				 tree.getRow("1_1");
			}
		}.repeat(5);
		
	}
	
}
