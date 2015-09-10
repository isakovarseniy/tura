package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.HRControllerPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.PopUpCpmpanyDetailsPageObject;
import org.tura.platform.selenium.Button;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primefaces.ButtonPrimeFaces;
import org.tura.platform.selenium.primefaces.InputTextPrimeFaces;
import org.tura.platform.selenium.primefaces.TreeRow;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	
	
	@Test
	public void t4_parallelModification() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);
		Table t = hrControllerPage.getCompanies();

		Button button =   new ButtonPrimeFaces( t.getRow(1).getCell(2).findElement(By.cssSelector("button")),driver);
		button.click();

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
		
		popUp.getDesk().setValue("123");
		popUp.getOk().click();
		
		t = hrControllerPage.getCompanies();
		WebElement el =  t.getRow(1).getCell(1);		

		assertEquals("123", el.getText());
		
		t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();
		InputText inputText=   new InputTextPrimeFaces( t.getRow(1).getCell(1).findElement(By.cssSelector("input")),driver);
		inputText.setValue("567");
		
		t = hrControllerPage.getCompanies();
		button =   new ButtonPrimeFaces( t.getRow(1).getCell(2).findElement(By.cssSelector("button")),driver);
		button.click();
		
		assertEquals( "567", popUp.getDesk().getValue());
		
		popUp.getDesk().setValue("891");
		popUp.getOk().click();
		
		t = hrControllerPage.getCompanies();
		el =  t.getRow(1).getCell(1);		

		assertEquals("567891", el.getText());
		
	
		t = hrControllerPage.getCompanies();
		el =  t.getRow(1).getCell(0);		
		assertEquals("Company B", el.getText());

		
		t = hrControllerPage.getCompanies();
		el =  t.getRow(0).getCell(0);		
		assertEquals("Company A", el.getText());
		
		t = hrControllerPage.getCompanies();
		el =  t.getRow(0).getCell(1);		
		assertEquals("", el.getText());
		
	}	
	
}
