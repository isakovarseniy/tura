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

package org.tura.example.ui.simpleform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

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
import org.tura.example.ui.hrmanager.simpleform.pageobject.InputViewPageObject;
import org.tura.platform.selenium.primereact.Repeater;

public class InputViewTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/inputView";
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
	public void t000_inputView01() {
		driver.get(getUrl(app_url));

		InputViewPageObject page = new InputViewPageObject(driver);
		
		String inputText = page.getInputText().getValue();
		assertEquals("",inputText );
		
		Boolean chb = page.getCheckbox().getValue();
		assertFalse(chb);

		String password = page.getPassword().getValue();
		assertEquals("",password );
		
		String date = page.getDate().getValue();
		assertEquals("",date );
		
		page.getSubmitButton().click();
		
		String inputTextMsg = page.getInputTextMessage().getValue();
		assertEquals("Input text error",inputTextMsg );
		
		String chMsg = page.getCheckboxMessage().getValue();
		assertEquals("Checkbox error",chMsg );
		
		String psdMsg = page.getPasswordMessage().getValue();
		assertEquals("Password error",psdMsg );

		page.getImage();
		String id = page.getOutputIndicator().getValue();
		assertNotNull(id);
		assertNotEquals("",id );
		
		
		page.getDate().setValue("03/12/2019");

		page.getSubmitButton().click();

		new Repeater() {
			@Override
			public void action() {
				String id1 = page.getOutputIndicator().getValue();
				assertNotNull(id1);
				assertNotEquals("",id1 );
				assertNotEquals(id,id1 );
			}
		};
		
		date = page.getDate().getValue();
		assertEquals("03/12/2019", date);
		

	}
}