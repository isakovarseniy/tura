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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.tree2tree.pageobject.Tree2TreeMultiselectPageObject;
import org.tura.example.ui.hrmanager.tree2tree.pageobject.Tree2TreeRelationsPageObject;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primereact.FalseRepeater;
import org.tura.platform.selenium.primereact.TreeRow;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tree2TreeTestMultiselectTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/tree2tree/tree2TreeMultiselect";
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
	public void t000_tree2tree() {
		driver.get(getUrl(app_url));

		Tree2TreeMultiselectPageObject tree2TreeRelationsPageObject = new Tree2TreeMultiselectPageObject(driver);
		Tree tree = tree2TreeRelationsPageObject.getTree11();

		TreeRow tr = (TreeRow) tree.getRow("1");
		tr.open();

		WebElement el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Company A", el.getText());

		tr = (TreeRow) tree.getRow("1_1");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Country 1", el.getText());

		tr = (TreeRow) tree.getRow("1_1_1");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("State 1", el.getText());

		tr = (TreeRow) tree.getRow("1_1_1_1");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("City 1", el.getText());

		tr = (TreeRow) tree.getRow("1_1_1_1_1");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Street 1", el.getText());

		tr.click();

		tree2TreeRelationsPageObject = new Tree2TreeMultiselectPageObject(driver);
		tree = tree2TreeRelationsPageObject.getTree22();

		tr = (TreeRow) tree.getRow("1");
		tr.open();

		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Department 1", el.getText());

		tr = (TreeRow) tree.getRow("1_3");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("First Name 1 Last Name 1", el.getText());

		tr = (TreeRow) tree.getRow("1_3_1");
		tr.open();
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Dir1", el.getText());

		tr = (TreeRow) tree.getRow("1_3_1_1");
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("file1", el.getText());

		tree = tree2TreeRelationsPageObject.getTree11();

		tr = (TreeRow) tree.getRow("1_1_1_2");
		tr.open();

		tr.click();

		new FalseRepeater() {
			@Override
			public void action() {
				Tree2TreeRelationsPageObject tree2TreeRelationsPageObject = new Tree2TreeRelationsPageObject(driver);
				Tree tree = tree2TreeRelationsPageObject.getTree2();
				 tree.getRow("1");
			}
		}.repeat(3);
		

		tree2TreeRelationsPageObject = new Tree2TreeMultiselectPageObject(driver);
		tree = tree2TreeRelationsPageObject.getTree11();

		tr = (TreeRow) tree.getRow("1_1_1_1");
		tr.click();

		new FalseRepeater() {
			@Override
			public void action() {
				Tree2TreeRelationsPageObject tree2TreeRelationsPageObject = new Tree2TreeRelationsPageObject(driver);
				Tree tree = tree2TreeRelationsPageObject.getTree2();
				tree.getRow("1");
			}
		}.repeat(3);
		
		

		tree2TreeRelationsPageObject = new Tree2TreeMultiselectPageObject(driver);
		tree = tree2TreeRelationsPageObject.getTree11();

		tr = (TreeRow) tree.getRow("1_1_1_1_1");
		tr.open();

		tr.click();

		tree = tree2TreeRelationsPageObject.getTree22();
		tr = (TreeRow) tree.getRow("1");
		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Department 1", el.getText());

	}

}
