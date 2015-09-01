package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
import org.tura.example.ui.hrmanager.miscelements.pageobject.MiscElementsWindowPageObject;
import org.tura.platform.selenium.CheckBox;
import org.tura.platform.selenium.DropDownSelection;
import org.tura.platform.selenium.primefaces.Helper;

public class MiscTest {

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
	public void t1_validateDropDown() {
		try {
			driver.get("http://localhost:8080/hrform-1.0/hrmanager/miscelements/MiscElementsWindow.xhtml");

			MiscElementsWindowPageObject miscPage = new MiscElementsWindowPageObject(
					driver);
			Helper helper = new Helper(driver);

			DropDownSelection el = miscPage.getDepartmentDropDown();
			assertEquals("Select one", el.getValue());
			el.setValue("Department 1");
			helper.waitForJQueryAndPrimeFaces();

			el = miscPage.getEmployeesDropDown();
			el.setValue("First Name 1");
			helper.waitForJQueryAndPrimeFaces();
			assertEquals("First Name 1", el.getValue());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	
	
	@Test
	public void t2_validateCheckBox() {
		try {
			driver.get("http://localhost:8080/hrform-1.0/hrmanager/miscelements/MiscElementsWindow.xhtml");

			MiscElementsWindowPageObject miscPage = new MiscElementsWindowPageObject(
					driver);
			Helper helper = new Helper(driver);

			CheckBox el = miscPage.getChkBox();
			assertEquals(false, el.getValue());
			el.setValue(true);
			helper.waitForJQueryAndPrimeFaces();
			assertEquals(true, el.getValue());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
