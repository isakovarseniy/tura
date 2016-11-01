/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.tree2tree.pageobject.Tree2TreeRelationsPageObject;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primefaces.SeleniumActionExecutor;
import org.tura.platform.selenium.primefaces.TreeRow;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tree2TreeTest {
	
	static WebDriver driver;
	static ChromeDriverService service;

	@BeforeClass
	public static void beforeClass() {
		try {
			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(
							new File("/Users/arseniy/Downloads/chromedriver"))
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
		driver = new RemoteWebDriver(service.getUrl(),
				DesiredCapabilities.chrome());
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@Test
	public void t000_tree2tree() {
		driver.get("http://localhost:8080/hrapplication/hrmanager/tree2tree/Tree2TreeRelations.xhtml");
		

	
		new SeleniumActionExecutor(driver,Tree2TreeRelationsPageObject.getTree2SearchCriteria()){
			public void action(WebDriver driver){
				Tree2TreeRelationsPageObject tree2TreeRelationsPageObject = new Tree2TreeRelationsPageObject(driver);
				Tree tree =   tree2TreeRelationsPageObject.getTree1();

				TreeRow tr = (TreeRow) tree.getRow("0");
				tr.open();
				
				WebElement el = tr.getCell(1);
				assertEquals("Company A", el.getText());
				
				tr = (TreeRow) tree.getRow("0_0");
				tr.open();
				el = tr.getCell(1);
				assertEquals("Country 1", el.getText());
				
				
				tr = (TreeRow) tree.getRow("0_0_0");
				tr.open();
				el = tr.getCell(1);
				assertEquals("State 1", el.getText());
				
				tr = (TreeRow) tree.getRow("0_0_0_0");
				tr.open();
				el = tr.getCell(1);
				assertEquals("City 1", el.getText());		
				

				tr = (TreeRow) tree.getRow("0_0_0_0_0");
				tr.open();
				el = tr.getCell(1);
				assertEquals("Street 1", el.getText());		
				
				tr.click();
			}
		}.run();		
	
		Tree2TreeRelationsPageObject tree2TreeRelationsPageObject = new Tree2TreeRelationsPageObject(driver);
		Tree tree =  tree2TreeRelationsPageObject.getTree2();

		TreeRow tr = (TreeRow) tree.getRow("0");
		tr.open();
		
		WebElement el = tr.getCell(1);
		assertEquals("Department 1", el.getText());
		
		tr = (TreeRow) tree.getRow("0_0");
		tr.open();
		el = tr.getCell(1);
		assertEquals("First Name 1 Last Name 1", el.getText());
		
		
		tr = (TreeRow) tree.getRow("0_0_0");
		tr.open();
		el = tr.getCell(1);
		assertEquals("Dir1", el.getText());

		tr = (TreeRow) tree.getRow("0_0_0_0");
		el = tr.getCell(1);
		assertEquals("file1", el.getText());

		
	}	
	
}
