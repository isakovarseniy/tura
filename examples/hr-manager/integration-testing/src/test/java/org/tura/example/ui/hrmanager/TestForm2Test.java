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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.example.ui.hrmanager.testform1.pageobject.TestForm2PageObject;
import org.tura.platform.selenium.Table;

public class TestForm2Test extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "http://localhost:8080/hrform/hrmanager/testform1/testForm2.xhtml";
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

			TestForm2PageObject testForm2Page = new TestForm2PageObject(driver);
			Table t = testForm2Page.getDepartmentTable();

			t.getRow(0).getCell(0).click();
			t.getRow(1).getCell(0).click();
			t.getRow(2).getCell(0).click();

			assertTrue(t.getRow(0).isSelected());
			assertTrue(t.getRow(1).isSelected());
			assertTrue(t.getRow(2).isSelected());
			
		
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

}
