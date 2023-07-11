/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.AbstractTest;
import org.tura.example.ui.hrmanager.simpleform.pageobject.DataScrollerPageObject;
import org.tura.platform.selenium.DataScroller;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.primereact.InputTextPrimeReact;
import org.tura.platform.selenium.primereact.Repeater;

public class DatascrollerViewTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/simpleform/dataScroller";
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
	public void t000_datascrollerView01() {
		driver.get(getUrl(app_url));
		
		DataScrollerPageObject page = new DataScrollerPageObject(driver);
		DataScroller scroller =  page.getScroll();
		WebElement el =scroller.getRow(2);
		

        InputText objId  = getObjId(el);
        assertEquals("1603",objId.getValue());

        InputText department  = getDepartmentd(el);
        assertEquals("Department 3",department.getValue());
        department.setValue("Department 3 fixed");
        
		el =scroller.getRow(4);
        department  = getDepartmentd(el);
        assertEquals("Department 5",department.getValue());
        department.setValue("Department 5 fixed");
        
        
        scroller.nextPage();
		
		new Repeater() {
			
			@Override
			public void action() {
				WebElement el =scroller.getRow(0);
				InputText department  = getDepartmentd(el);
		        assertEquals("Department 11",department.getValue());
				
			}
		}.repeat(10);;

        scroller.prevPage();
        
		new Repeater() {
			
			@Override
			public void action() {
				WebElement el =scroller.getRow(2);
				InputText department  = getDepartmentd(el);
		        assertEquals("Department 3Department 3 fixed",department.getValue());

				el =scroller.getRow(4);
				department  = getDepartmentd(el);
		        assertEquals("Department 5Department 5 fixed",department.getValue());

			}
		}.repeat(10);;

		
	}
	
	
	public InputText getObjId(WebElement el) {
        WebElement[] element = { null };
        new Repeater() {
            @Override
            public void action() {
                element[0] = el.findElement(DataScrollerPageObject.getTurab7f899c92f1b4aabBa9a7ded689aa86dSearchCriteria());
            }
        }.repeat(10);
        
        InputText objId  = new InputTextPrimeReact(element[0], driver);
        return objId;
	}

	
	public InputText getDepartmentd(WebElement el) {
        WebElement[] element = { null };
        new Repeater() {
            @Override
            public void action() {
                element[0] = el.findElement(DataScrollerPageObject.getTuradbf08a343ecb4d6dB98aB952b6eb69f8SearchCriteria());
            }
        }.repeat(10);
        
        InputText department  = new InputTextPrimeReact(element[0], driver);
        return department;
	}
	
	
}
