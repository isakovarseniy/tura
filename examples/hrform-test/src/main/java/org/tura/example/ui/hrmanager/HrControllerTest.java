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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.HRControllerPageObject;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primefaces.TreeRow;

public class HrControllerTest {

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
	public void t1_validateSwitchingSelectionCurrentRow() {
		try {
			// Go to the Google Suggest home page
			driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

			HRControllerPageObject hrControllerPage = new HRControllerPageObject(
					driver);

			Table t = hrControllerPage.getCompanies();
			t.getRow(0).getCell(1);

			Tree tree = hrControllerPage.getLocationTree();
			TreeRow tr = (TreeRow) tree.getRow("0");
			tr.open();

			WebElement el = tr.getCell(1);
			assertEquals("Country 1", el.getText());

			t.getRow(1).getCell(1).click();

			tree = hrControllerPage.getLocationTree();
			tr = (TreeRow) tree.getRow("0");
			tr.open();

			tree = hrControllerPage.getLocationTree();
			tr = (TreeRow) tree.getRow("0");
			el = tr.getCell(0);
			assertEquals("Country 2", el.getText());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t2_gridTwoClickBehavor() {
		try {
			// Go to the Google Suggest home page
			driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

			HRControllerPageObject hrControllerPage = new HRControllerPageObject(
					driver);

			Table t = hrControllerPage.getCompanies();
			Tree tree = hrControllerPage.getLocationTree();
			TreeRow tr = (TreeRow) tree.getRow("0");
			tr.open();

			tr = (TreeRow) tree.getRow("0_1");
			tr.open();

			t.getRow(0).click();

			tree = hrControllerPage.getLocationTree();
			tr = (TreeRow) tree.getRow("0_1");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void t3_langSwitch() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);
		Table t = hrControllerPage.getCompanies();
		WebElement el = t.getHeader().getCell(0);

		assertEquals("Company name", el.getText());
		
		hrControllerPage.getRusLang().click();
		
		t = hrControllerPage.getCompanies();
		el = t.getHeader().getCell(0);

		assertEquals("Имя компании", el.getText());

		hrControllerPage.getEngLang().click();

		t = hrControllerPage.getCompanies();
		 el = t.getHeader().getCell(0);

		assertEquals("Company name", el.getText());
		
		
	}
	
}
