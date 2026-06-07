/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.tura.example.ui.hrmanager.testform2.pageobject.TestFormWindowPageObject;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.platform.selenium.primereact.TreeRow;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class TreeCheckboxMultiselectTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/testform2/testFormWindow";
	static private String driver_location = System.getProperty("user.home") + "/.tura/resources/"+getChromeDriverName();



	@BeforeEach
	public void createDriver() {
		ChromeOptions option = new ChromeOptions();
		option.setBinary(new File(driver_location));
		driver = new ChromeDriver( new ChromeOptions());
	}

	@AfterEach
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