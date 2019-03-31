package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.example.ui.hrmanager.testform1.pageobject.TestForm1PageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primefaces.Repeater;
import org.tura.platform.selenium.primefaces.SeleniumActionExecutor;

public class TestForm1Test extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "http://localhost:8080/hrform/hrmanager/testform1/TestForm1.xhtml";
	static private String driver_location = ConfigConstants.RESOURCE_HOME + "/chromedriver";

	@BeforeClass
	public static void beforeClass() {
		try {

			String home = System.getProperty("user.home");
			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File(driver_location.replace("${user.home}", home))).usingAnyFreePort()
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
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(0).getCell(0);
			assertEquals("Department 1", el.getText());

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 1", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					t.getRow(1).click();
				}
			}.run();

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	@Test
	public void t000_TestForm2() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					t.getRow(1).getCell(0).click();
					;
				}
			}.run();

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());

			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getAddDep().click();
				}
			}.run();

			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("", el.getText());
			assertTrue (t.getRow(1).isSelected());
			

			try {
				t = testForm1Page.getEmpTable();
				t.getRow(0);
				fail();
			} catch (NoSuchElementException e1) {

			}
			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRallback().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			assertTrue (t.getRow(1).isSelected());
			
			
			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());
			


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	
	@Test
	public void t000_TestForm3() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					t.getRow(1).getCell(0).click();
					;
				}
			}.run();

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRmDep().click();
				}
			}.run();

			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 3", el.getText());

				t = testForm1Page.getEmpTable();
				el = t.getRow(0).getCell(0);
				assertEquals("First Name 5", el.getText());
			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRallback().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			
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
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					t.getRow(1).getCell(0).click();
					;
				}
			}.run();

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getAddDep().click();
				}
			}.run();

			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("", el.getText());

			try {
				t = testForm1Page.getEmpTable();
				t.getRow(0);
				fail();
			} catch (NoSuchElementException e1) {

			}
			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRmDep().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			assertTrue (t.getRow(1).isSelected());
			
			
			
			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());

			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getAllSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRallback().click();
				}
			}.run();

			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			assertTrue (t.getRow(1).isSelected());
			
			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void t000_TestForm5() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					Table t = testForm1Page.getDeptTable();
					t.getRow(1).getCell(0).click();
					;
				}
			}.run();

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());

			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getAddEmp().click();
				}
			}.run();

			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());

			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("", el.getText());

			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRallback().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			assertTrue (t.getRow(1).isSelected());
			
			
			t = testForm1Page.getEmpTable();
			el = t.getRow(0).getCell(0);
			assertEquals("First Name 3", el.getText());
			assertTrue (t.getRow(0).isSelected());


		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void t000_TestForm6() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("Department 2", el.getText());
			t.getRow(1).enableEditMode();
			t.getRow(1).acceptRowChange();
			
			assertTrue(t.getRow(1).isSelected());
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
	@Test
	public void t000_TestForm7() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			Table t = testForm1Page.getEmpTable();
			WebElement el = t.getRow(1).getCell(0);
			assertEquals("First Name 2", el.getText());
			t.getRow(1).enableEditMode();
			t.getRow(1).acceptRowChange();
			
			assertTrue(t.getRow(1).isSelected());
			

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	

	@Test
	public void t000_TestForm8() {
		try {
			driver.get(app_url);

			TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
			
			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.nextPage(); 
				}
			}.repeat(10);
			

			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.nextPage(); 
				}
			}.repeat(10);
			

			new Repeater() {
				public void action() {
					Table t = testForm1Page.getDeptTable();
					t.nextPage(); 
				}
			}.repeat(10);
			
			
			Table t = testForm1Page.getDeptTable();
			WebElement el = t.getRow(36).getCell(0);
			assertEquals("Department 2-10", el.getText());
			
			try {
				 t = testForm1Page.getDeptTable();
				t.getRow(37).getCell(0);
				fail();
			} catch (NoSuchElementException e1) {

			}
			
			el.click();
			
			
			for ( int i = 0; i < 6; i++) {
			
				new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria(), TestForm1PageObject.getDeptTableSearchCriteria()) {
					public void action(WebDriver driver) {
						TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
						testForm1Page.getRmDep().click();
					}
				}.run();
				
				t = testForm1Page.getDeptTable();
				assertTrue( t.getRow(35-i).isSelected());
				Table et = testForm1Page.getEmpTable();
				assertTrue( et.isEmpty());
			}
			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getEmplTableSearchCriteria(), TestForm1PageObject.getDeptTableSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRmDep().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			assertTrue( t.getRow(29).isSelected());
			Table et = testForm1Page.getEmpTable();
			assertTrue( et.isEmpty());
			
			new SeleniumActionExecutor(driver, TestForm1PageObject.getAllSearchCriteria()) {
				public void action(WebDriver driver) {
					TestForm1PageObject testForm1Page = new TestForm1PageObject(driver);
					testForm1Page.getRallback().click();
				}
			}.run();
			
			t = testForm1Page.getDeptTable();
			assertTrue( t.getRow(29).isSelected());
			et = testForm1Page.getEmpTable();
			assertTrue( et.isEmpty());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}
	
}
