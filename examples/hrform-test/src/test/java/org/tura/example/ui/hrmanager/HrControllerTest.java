/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.CityDetailsPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.CountryDetailsPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.DepartmentsDetailsPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.EmployeesPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.FilesPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.HRControllerPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.MainHolderPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.PopUpCpmpanyDetailsPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.StateDetailsPageObject;
import org.tura.platform.selenium.Button;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primefaces.ButtonPrimeFaces;
import org.tura.platform.selenium.primefaces.InputTextPrimeFaces;
import org.tura.platform.selenium.primefaces.SeleniumActionExecutor;
import org.tura.platform.selenium.primefaces.TableRow;
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
	public void t000_init() {
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(0).getCell(1).click();
		InputText inputText = new InputTextPrimeFaces(t.getRow(0).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue(Keys.DELETE);

		t.getRow(1).getCell(1).click();
		inputText = new InputTextPrimeFaces(t.getRow(1).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue(Keys.DELETE);
		inputText.setValue(Keys.RETURN);

		hrControllerPage.getSaveButton().click();

	}

	@Test
	public void t001_validateSwitchingSelectionCurrentRow() {
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
	public void t002_gridTwoClickBehavor() {
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
	public void t003_langSwitch() {
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
	public void t004_parallelModification() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);
		Table t = hrControllerPage.getCompanies();

		Button button = new ButtonPrimeFaces(t.getRow(1).getCell(2)
				.findElement(By.cssSelector("button")), driver);
		button.click();

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(
				driver);

		popUp.getDesk().setValue("123");
		popUp.getOk().click();

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(1).getCell(1);

		assertEquals("123", el.getText());

		t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();
		InputText inputText = new InputTextPrimeFaces(t.getRow(1).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("567");

		t = hrControllerPage.getCompanies();
		button = new ButtonPrimeFaces(t.getRow(1).getCell(2)
				.findElement(By.cssSelector("button")), driver);
		button.click();

		assertEquals("567", popUp.getDesk().getValue());

		popUp.getDesk().setValue("891");
		popUp.getOk().click();

		t = hrControllerPage.getCompanies();
		el = t.getRow(1).getCell(1);

		assertEquals("567891", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(1).getCell(0);
		assertEquals("Company B", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(0);
		assertEquals("Company A", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(1);
		assertEquals("", el.getText());

	}

	@Test
	public void t005_parallelModification() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(
				driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();
		InputText inputText = new InputTextPrimeFaces(t.getRow(1).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("123");

		t = hrControllerPage.getCompanies();
		Button button = new ButtonPrimeFaces(t.getRow(1).getCell(2)
				.findElement(By.cssSelector("button")), driver);
		button.click();

		assertEquals("123", popUp.getDesk().getValue());

		popUp.getDesk().setValue("891");
		popUp.getOk().click();

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(1).getCell(1);

		assertEquals("123891", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(1).getCell(0);
		assertEquals("Company B", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(0);
		assertEquals("Company A", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(1);
		assertEquals("", el.getText());

	}

	@Test
	public void t006_commitUpdate() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(0).getCell(1).click();
		InputText inputText = new InputTextPrimeFaces(t.getRow(0).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("t6_123");

		t.getRow(1).getCell(1).click();
		inputText = new InputTextPrimeFaces(t.getRow(1).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("t6_456");
		inputText.setValue(Keys.RETURN);

		hrControllerPage.getSaveButton().click();

		quitDriver();
		createDriver();

		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");
		hrControllerPage = new HRControllerPageObject(driver);

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(0).getCell(1);
		assertEquals("t6_123", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(1).getCell(1);
		assertEquals("t6_456", el.getText());

	}

	@Test
	public void t007_checkSelectionWithRallback() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		hrControllerPage.getAddCompany().click();
		hrControllerPage.getRollbackButton().click();

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("0");

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		hrControllerPage.getAddCompany().click();
		hrControllerPage.getRollbackButton().click();

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("0");

		el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(0).isSelected());
	}

	@Test
	public void t008_checkSelectionWithRemove() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		hrControllerPage.getAddCompany().click();
		hrControllerPage.getDelCompany().click();

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("0");

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		hrControllerPage.getAddCompany().click();
		hrControllerPage.getDelCompany().click();

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("0");

		el = tr.getCell(1);
		assertEquals("Country 2", el.getText());

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(1).isSelected());
	}

	@Test
	public void t009_removeRow() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);
		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		hrControllerPage.getDelCompany().click();

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(0).isSelected());

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("0");

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

	}

	@Test
	public void t010_genericTest() {
		
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("0");
		tr.open();

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());
		
		CountryDetailsPageObject  countryDetails = new CountryDetailsPageObject(driver);
		String value = countryDetails.getCompanyDetails().getValue();
		assertEquals("Country 1", value);

		new SeleniumActionExecutor(driver,MainHolderPageObject.getDetailsSearchCriteria()){
			public void action(WebDriver driver){
				HRControllerPageObject hrControllerPage = new HRControllerPageObject(
						driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("0_0");
				tr.open();
				tr.click();
			}
		}.run();		
		
		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("0_0");

		 el = tr.getCell(1);
		assertEquals("State 1", el.getText());
		StateDetailsPageObject  stateDetails = new StateDetailsPageObject(driver);
		assertEquals("State 1", stateDetails.getStateDeteails().getValue());
		
		
		new SeleniumActionExecutor(driver,MainHolderPageObject.getDetailsSearchCriteria()){
			public void action(WebDriver driver){
				HRControllerPageObject hrControllerPage = new HRControllerPageObject(
						driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("0_0_0");
				tr.open();
				tr.click();
			}
		}.run();			
		
		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("0_0_0");

		 el = tr.getCell(1);
		assertEquals("City 1", el.getText());
		CityDetailsPageObject  cityDetails = new CityDetailsPageObject(driver);
		assertEquals("City 1", cityDetails.getCityDetails().getValue());
		
		
		new SeleniumActionExecutor(driver,MainHolderPageObject.getDetailsSearchCriteria()){
			public void action(WebDriver driver){
				HRControllerPageObject hrControllerPage = new HRControllerPageObject(
						driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("0_0_0_0");
				tr.open();
				tr.click();
			}
		}.run();		
		
		
		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("0_0_0_0");

		 el = tr.getCell(1);
		assertEquals("Street 1", el.getText());
		
		DepartmentsDetailsPageObject departmentsDetails = new DepartmentsDetailsPageObject(driver);
		TableRow row =  (TableRow) departmentsDetails.getDepartmentTable().getRow(0);
		assertEquals("Department 1", row.getCell(0).getText());
		
	
		EmployeesPageObject employees = new EmployeesPageObject(driver);
		row =  (TableRow) employees.getEmployeeTable().getRow(0);
		assertEquals("First Name 1", row.getCell(0).getText());
		
		
		row =  (TableRow) employees.getVehicleTable().getRow(0);
		assertEquals("Honda", row.getCell(0).getText());
		
		MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);
		mainHolderPageObject.getFiles().click();
		
		FilesPageObject filesPageObject = new FilesPageObject(driver);

		tree = filesPageObject.getContentTable();
		tr = (TreeRow) tree.getRow("0");
		
		assertEquals("Dir1", tr.getCell(0).getText());
		
		tr.open();
		tr = (TreeRow) tree.getRow("0_0");
		assertEquals("file1", tr.getCell(0).getText());
		

		new SeleniumActionExecutor(driver,FilesPageObject.getEmplFilesSearchCriteria()){
			public void action(WebDriver driver){
				MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);
		        mainHolderPageObject.getEmployees().click();
		        EmployeesPageObject employeesPageObject = new EmployeesPageObject(driver);
		        TableRow row = (TableRow) employeesPageObject.getEmployeeTable().getRow(1);
		        row.click();
			}
		}.run();

		mainHolderPageObject.getFiles().click();

		tree = filesPageObject.getContentTable();
		tr = (TreeRow) tree.getRow("0");
		
		assertEquals("Dir2", tr.getCell(0).getText());
		
		tr.open();
		tr = (TreeRow) tree.getRow("0_0");
		assertEquals("file4", tr.getCell(0).getText());
		
		
		mainHolderPageObject.getEmployees().click();
		new SeleniumActionExecutor(driver,FilesPageObject.getEmplFilesSearchCriteria(),EmployeesPageObject.getEmplInfoSearchCriteria()){
			public void action(WebDriver driver){
				DepartmentsDetailsPageObject departmentsDetails = new DepartmentsDetailsPageObject(driver);
				TableRow row =  (TableRow) departmentsDetails.getDepartmentTable().getRow(1);
				row.click();
			}
		}.run();
		
		row =  (TableRow) employees.getEmployeeTable().getRow(0);
		assertEquals("First Name 3", row.getCell(0).getText());
		
		
		row =  (TableRow) employees.getVehicleTable().getRow(0);
		assertEquals("Ford", row.getCell(0).getText());
		
	}

	@Test
	public void t011_addCompany() {
		// Go to the Google Suggest home page
		driver.get("http://localhost:8080/hrform-1.0/hrmanager/hrcontroller/HRController.xhtml?param1=qwerty2");

		HRControllerPageObject hrControllerPage = new HRControllerPageObject(
				driver);

		hrControllerPage.getAddCompany().click();
		Table t = hrControllerPage.getCompanies();
		t.getRow(0).getCell(0).click();

		InputText inputText = new InputTextPrimeFaces(t.getRow(0).getCell(0)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("Company 3");
		inputText.setValue(Keys.RETURN);

		t.getRow(0).getCell(1).click();
		inputText = new InputTextPrimeFaces(t.getRow(0).getCell(1)
				.findElement(By.cssSelector("input")), driver);
		inputText.setValue("Company 3 description");
		inputText.setValue(Keys.RETURN);

	}
}
