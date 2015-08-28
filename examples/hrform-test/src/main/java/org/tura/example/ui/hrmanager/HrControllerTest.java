package org.tura.example.ui.hrmanager;

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
	public void t1_selectTable() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");
		
		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);
		Table t = hrControllerPage.getCompanies();
		 t.getRow(1).getCell(0);
		
		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr=  (TreeRow) tree.getRow("0");
		tr.open();
		
		WebElement el = tr.getCell(0);
		
		
		System.out.println(el.getText());

	}

}
