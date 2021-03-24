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

package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import org.tura.example.ui.hrmanager.testform1.pageobject.TestForm1PageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.FalseRepeater;
import org.tura.platform.selenium.primereact.Repeater;

public class TestForm1Test extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/testform1/testForm1";
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
	public void t000_TestForm1() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(0).getCell(0);
			assertEquals("Department 1", el.getText());

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 1", el.getText());

			t = testForm1Page.getDeptTable();
			t.getRow(1).click();

			Table t1 = testForm1Page.getEmpTable();

			new Repeater() {
				@Override
				public void action() {
					WebElement el = t1.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
					assertTrue(t1.getRow(0).isSelected());
				}
			}.repeat(5);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm2() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			testForm1Page = new TestForm1PageObject(driver);
			t = testForm1Page.getDeptTable();
			t.getRow(1).getCell(0).click();

			new Repeater() {

				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(3);

			testForm1Page.getAddDep().click();

			new Repeater() {

				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("", el.getText());
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(3);

			new FalseRepeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getEmpTable();
					t.getRow(0);
				}
			}.repeat(3);

			testForm1Page.getRallback().click();

			new Repeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(3);

			new Repeater() {

				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(3);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm3() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			t = testForm1Page.getDeptTable();
			t.getRow(1).getCell(0).click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
				}
			}.repeat(3);

			testForm1Page.getRmDep().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 3", el.getText());
				}
			}.repeat(3);

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 5", el.getText());

			testForm1Page.getRallback().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
				}
			}.repeat(3);

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm4() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			t = testForm1Page.getDeptTable();
			t.getRow(1).getCell(0).click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
				}
			}.repeat(3);

			testForm1Page.getAddDep().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("", el.getText());
				}
			}.repeat(3);

			new FalseRepeater() {
				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					t.getRow(0);
				}
			}.repeat(3);

			testForm1Page.getRmDep().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(3);

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue(t.getRow(0).isSelected());

			testForm1Page.getRallback().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(3);

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue(t.getRow(0).isSelected());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm5() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			t = testForm1Page.getDeptTable();
			t.getRow(1).getCell(0).click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
				}
			}.repeat(3);

			testForm1Page.getAddEmp().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
				}
			}.repeat(3);

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("", el.getText());
				}
			}.repeat(3);

			testForm1Page.getRallback().click();

			new Repeater() {
				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 2", el.getText());
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(3);

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 3", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(3);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm6() {
		try {
			driver.get(getUrl(app_url));
			driver.manage().window().maximize();

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			t.getRow(1).enableEditMode();
			t.getRow(1).acceptRowChange();

			assertTrue(t.getRow(0).isSelected());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm7() {
		try {
			driver.get(getUrl(app_url));
			driver.manage().window().maximize();

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getEmpTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("First Name 2", el.getText());
			t.getRow(1).enableEditMode();
			t.getRow(1).acceptRowChange();

			new Repeater() {

				@Override
				public void action() {
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(3);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm8() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);

			Table t = testForm1Page.getDeptTable();
			t.nextPage();

			
			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(6).getCell(0);
					assertEquals("Department 17", el.getText());
				}
			}.repeat(10);

			t = testForm1Page.getDeptTable();
			t.nextPage();
			
			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(6).getCell(0);
					assertEquals("Department 27", el.getText());
					
				}
			}.repeat(10);

			t = testForm1Page.getDeptTable();
			t.nextPage();

			
			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.nextPage();
				}
			}.repeat(10);

			
			new Repeater() {
				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(6).getCell(0);
					assertEquals("Department 2-10", el.getText());
				}
			}.repeat(5);;

			new FalseRepeater() {
				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.getRow(7).getCell(0);
				}
			}.repeat(3);

			 t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(6).getCell(0);
			el.click();

			for (int i = 0; i < 6; i++) {

				testForm1Page.getRmDep().click();
				int[] array = new int[] { i };

				new Repeater() {
					@Override
					public void action() {
						Table t = testForm1Page.getDeptTable();
						assertTrue(t.getRow(5 - array[0]).isSelected());
						Table et = testForm1Page.getEmpTable();
						assertTrue(et.isEmpty());
					}
				}.repeat(3);
			}

			testForm1Page.getRmDep().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					assertTrue(t.getRow(9).isSelected());
					Table et = testForm1Page.getEmpTable();
					assertTrue(et.isEmpty());

				}
			}.repeat(3);

			testForm1Page.getRallback().click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					assertTrue(t.getRow(9).isSelected());
					Table et = testForm1Page.getEmpTable();
					assertTrue(et.isEmpty());
				}

			}.repeat(3);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm9() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();

			t.getRow(1).click();

			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.nextPage();
				}
			}.repeat(10);

			t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			el.click();

			new Repeater() {

				@Override
				public void action() {
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(1).getCell(0);
					assertEquals("Department 12", el.getText());
				}
			}.repeat(3);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm10() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			t.nextPage();

			new Repeater() {
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					assertFalse(t.getRow(0).isSelected());
				}
			}.repeat(10);
			
			
			testForm1Page = new TestForm1PageObject(driver);
			t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			el.click();

			new Repeater() {
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(10);

			t = testForm1Page.getDeptTable();
			t.prevPage();

			new Repeater() {
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					assertFalse(t.getRow(1).isSelected());
				}
			}.repeat(10);

			t = testForm1Page.getDeptTable();
			t.nextPage();

			new Repeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					assertTrue(t.getRow(1).isSelected());
				}
			}.repeat(10);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm11() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			assertTrue(t.getRow(0).isSelected());

			t = testForm1Page.getEmpTable();
			assertTrue(t.getRow(0).isSelected());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm12() {
		try {
			driver.get(getUrl(app_url));

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
//			t.getHeader().getCell(0).click();


			new Repeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
				    Table t = testForm1Page.getDeptTable();
					t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("Department 1", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(5);

			new Repeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getEmpTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("First Name 1", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(5);
			
			testForm1Page = new TestForm1PageObject(driver);
			t = testForm1Page.getDeptTable();
			t.getHeader().getCell(0).click();

			new Repeater() {
				@Override
				public void action() {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					WebElement el = t.getRow(0).getCell(0);
					assertEquals("Department 9", el.getText());
					assertTrue(t.getRow(0).isSelected());
				}
			}.repeat(3);

			t = testForm1Page.getEmpTable();
			assertTrue(t.isEmpty());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
