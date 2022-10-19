package org.tura.example.ui.hrmanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
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
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.HrControllerPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.MainHolderPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.PopUpCpmpanyDetailsPageObject;
import org.tura.example.ui.hrmanager.hrcontroller.pageobject.StateDetailsPageObject;
import org.tura.platform.selenium.Button;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.Menu;
import org.tura.platform.selenium.Messages;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.Tree;
import org.tura.platform.selenium.primereact.ButtonPrimeReact;
import org.tura.platform.selenium.primereact.FalseRepeater;
import org.tura.platform.selenium.primereact.InputTextPrimeReact;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.platform.selenium.primereact.TableRow;
import org.tura.platform.selenium.primereact.TreeRow;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HrControllerTest extends AbstractTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/hrmanager/hrcontroller/hrController?param1=qwerty2";
	static private String driver_location = System.getProperty("user.home") + "/.tura/resources/"
			+ getChromeDriverName();

	@BeforeClass
	public static void beforeClass() {
		try {

			service = new ChromeDriverService.Builder().usingDriverExecutable(new File(driver_location))
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
		driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	private void login() {
//		LoginPagePageObject loginPage = new LoginPagePageObject(driver);
//		loginPage.getUser().setValue(USERNAME);
//		loginPage.getPassword().setValue(PASSWORD);
//		loginPage.getSignin().click();
	}

	@Test
	public void t000_init() {
		driver.get(getUrl(app_url));

		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(0).enableEditMode();
		t.getRow(0).getCell(1).click();
		InputText inputText = new InputTextPrimeReact(t.getRow(0).getCell(1).findElement(By.cssSelector("input")),
				driver);

		inputText.setValue("111");
		t.getRow(0).acceptRowChange();

		new Repeater() {
			public void action() {
				hrControllerPage.getSaveButton().click();
			}
		}.repeat(10);

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Messages msg = hrControllerPage.getMessages();
				assertEquals("Data persisted", msg.getValue());
			}
		}.repeat(5);
		;

		t.getRow(0).enableEditMode();
		t.getRow(0).rejecttRowChange();

		t = hrControllerPage.getCompanies();
		t.getRow(0).enableEditMode();
		t.getRow(0).getCell(1).click();
		inputText = new InputTextPrimeReact(t.getRow(0).getCell(1).findElement(By.cssSelector("input")), driver);
		inputText.setValue(Keys.HOME);
		for (int i = 0; i < 100; i++) {
			inputText.setValue(Keys.DELETE);
		}

		t.getRow(0).acceptRowChange();

		t.getRow(1).enableEditMode();
		t.getRow(1).getCell(1).click();
		inputText = new InputTextPrimeReact(t.getRow(1).getCell(1).findElement(By.cssSelector("input")), driver);
		inputText.setValue(Keys.HOME);
		for (int i = 0; i < 100; i++) {
			inputText.setValue(Keys.DELETE);
		}

		t.getRow(1).acceptRowChange();

		hrControllerPage.getSaveButton().click();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Messages msg = hrControllerPage.getMessages();
				assertEquals("Data persisted", msg.getValue());
			}
		}.repeat(5);

		checkifFatalErrorPage(driver);

	}

	@Test
	public void t001_validateSwitchingSelectionCurrentRow() {
		try {
			driver.get(getUrl(app_url));
			login();

			HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

			Table t = hrControllerPage.getCompanies();
			t.getRow(0).getCell(1);

			Tree tree = hrControllerPage.getLocationTree();
			TreeRow tr = (TreeRow) tree.getRow("1");
			tr.open();

			new Repeater() {

				@Override
				public void action() {
					Tree tree = hrControllerPage.getLocationTree();
					TreeRow tr = (TreeRow) tree.getRow("1");
					WebElement el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
					assertEquals("Country 1", el.getText());
				}
			}.repeat(10);

			t.getRow(1).getCell(1).click();

			new Repeater() {
				public void action() {
					Tree tree = hrControllerPage.getLocationTree();
					tree = hrControllerPage.getLocationTree();
					TreeRow tr = (TreeRow) tree.getRow("1");
					tr.open();
				}
			}.repeat(10);

			new Repeater() {

				@Override
				public void action() {
					Tree tree = hrControllerPage.getLocationTree();
					tree = hrControllerPage.getLocationTree();
					TreeRow tr = (TreeRow) tree.getRow("1");
					WebElement el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
					assertEquals("Country 2", el.getText());
				}
			}.repeat(5);

			checkifFatalErrorPage(driver);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t002_gridTwoClickBehavor() {
		try {
			driver.get(getUrl(app_url));
			login();

			HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

			Table t = hrControllerPage.getCompanies();
			Tree tree = hrControllerPage.getLocationTree();
			TreeRow tr = (TreeRow) tree.getRow("1");
			tr.open();

			new Repeater() {

				@Override
				public void action() {
					Tree tree = hrControllerPage.getLocationTree();
					TreeRow tr = (TreeRow) tree.getRow("1_2");
					tr.open();
				}

			}.repeat(10);

			t.getRow(0).click();

			tree = hrControllerPage.getLocationTree();
			tr = (TreeRow) tree.getRow("1_2");

			checkifFatalErrorPage(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t002_removeTreeNode() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getDeleteLocation().click();

		try {
			Tree tree = hrControllerPage.getLocationTree();
			tree.getRow("0");
			fail("Tree should not to exists");
		} catch (Exception e) {
		}

		checkifFatalErrorPage(driver);

	}



	@Test
	public void t003_langSwitch() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		new Repeater() {
			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getHeader().getCell(0);
				assertEquals("Company name", el.getText());
			}
		}.repeat(10);

		hrControllerPage.getRusLang().click();

		new Repeater() {
			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getHeader().getCell(0);
				assertEquals("Имя компании", el.getText());
			}
		}.repeat(10);

		hrControllerPage.getEngLang().click();

		new Repeater() {
			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getHeader().getCell(0);

				assertEquals("Company name", el.getText());
			}
		}.repeat(10);

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t004_parallelModification() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
		Table t = hrControllerPage.getCompanies();

		Button button = new ButtonPrimeReact(t.getRow(1).getCell(2).findElement(By.cssSelector("button")), driver);
		button.click();

		new Repeater() {
			@Override
			public void action() {
				PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
				popUp.getDesk().setValue("123");
				popUp.getOk().click();
			}

		}.repeat(10);

		Table t1 = hrControllerPage.getCompanies();
		new Repeater() {
			@Override
			public void action() {
				WebElement el = t1.getRow(1).getCell(1);
				assertEquals("123", el.getText());
			}
		}.repeat(10);

		t = hrControllerPage.getCompanies();
		t.getRow(1).enableEditMode();
		t.getRow(1).getCell(1).click();
		InputText inputText = new InputTextPrimeReact(t.getRow(1).getCell(1).findElement(By.cssSelector("input")),
				driver);
		inputText.clear();
		inputText.setValue("567");
		t.getRow(1).acceptRowChange();

		t = hrControllerPage.getCompanies();
		button = new ButtonPrimeReact(t.getRow(1).getCell(2).findElement(By.cssSelector("button")), driver);
		button.click();

		new Repeater() {
			@Override
			public void action() {
				PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
				assertEquals("567", popUp.getDesk().getValue());
			}
		}.repeat(10);

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
		popUp.getDesk().clear();
		popUp.getDesk().setValue("891");
		popUp.getOk().click();

		Table t2 = hrControllerPage.getCompanies();

		new Repeater() {
			@Override
			public void action() {
				WebElement el = t2.getRow(1).getCell(1);
				assertEquals("891", el.getText());
			}
		}.repeat(10);

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(1).getCell(0);
		assertEquals("Company B", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(0);
		assertEquals("Company A", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(1);
		assertEquals("", el.getText());

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t005_parallelModification() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).enableEditMode();
		t.getRow(1).getCell(1).click();
		InputText inputText = new InputTextPrimeReact(t.getRow(1).getCell(1).findElement(By.cssSelector("input")),
				driver);
		inputText.setValue("123");
		t.getRow(1).acceptRowChange();

		t = hrControllerPage.getCompanies();
		Button button = new ButtonPrimeReact(t.getRow(1).getCell(2).findElement(By.cssSelector("button")), driver);
		button.click();

		new Repeater() {
			@Override
			public void action() {
				assertEquals("123", popUp.getDesk().getValue());
			}
		}.repeat(10);
		;

		new Repeater() {
			@Override
			public void action() {
				popUp.getDesk().setValue("891");
			}
		}.repeat(10);
		;

		popUp.getOk().click();

		t = hrControllerPage.getCompanies();

		new Repeater() {

			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getRow(1).getCell(1);
				assertEquals("123891", el.getText());
			}
		}.repeat(10);
		;

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(1).getCell(0);
		assertEquals("Company B", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(0);
		assertEquals("Company A", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(0).getCell(1);
		assertEquals("", el.getText());

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t006_commitUpdate() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		Table t = hrControllerPage.getCompanies();
		t.getRow(0).enableEditMode();
		t.getRow(0).getCell(1).click();
		InputText inputText = new InputTextPrimeReact(t.getRow(0).getCell(1).findElement(By.cssSelector("input")),
				driver);
		inputText.clear();
		inputText.setValue("t6_123");
		t.getRow(0).acceptRowChange();

		t.getRow(1).enableEditMode();
		t.getRow(1).getCell(1).click();
		inputText = new InputTextPrimeReact(t.getRow(1).getCell(1).findElement(By.cssSelector("input")), driver);
		inputText.setValue("t6_456");
		t.getRow(1).acceptRowChange();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				hrControllerPage.getSaveButton().click();
			}
		}.repeat(5);
		;

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Messages msg = hrControllerPage.getMessages();
				assertEquals("Data persisted", msg.getValue());
			}
		}.repeat(5);
		;

		quitDriver();
		createDriver();

		driver.get(getUrl(app_url));
		login();

		hrControllerPage = new HrControllerPageObject(driver);

		t = hrControllerPage.getCompanies();
		WebElement el = t.getRow(0).getCell(1);
		assertEquals("t6_123", el.getText());

		t = hrControllerPage.getCompanies();
		el = t.getRow(1).getCell(1);
		assertEquals("t6_456", el.getText());

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t007_checkSelectionWithRallback() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getAddCompany().click();

		new FalseRepeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1");
			}
		}.repeat(10);

		hrControllerPage.getRollbackButton().click();

		new Repeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1");
			}
		}.repeat(10);

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("1");

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		new Repeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1");

				WebElement el = tr.getCell(1);
				assertEquals("Country 2", el.getText());
			}
		}.repeat(10);

		hrControllerPage.getAddCompany().click();
		new FalseRepeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1");

				WebElement el = tr.getCell(1);
				assertEquals("Country 2", el.getText());
			}
		}.repeat(10);

		hrControllerPage.getRollbackButton().click();

		new Repeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1");

				WebElement el = tr.getCell(1);
				assertEquals("Country 2", el.getText());
			}
		}.repeat(10);

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(1).isSelected());
		
		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t008_checkSelectionWithRemove() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getAddCompany().click();

		new FalseRepeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1");
			}
		}.repeat(5);

		hrControllerPage.getDelCompany().click();

		new Repeater() {

			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1");
			}
		}.repeat(10);

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("1");

		WebElement el = tr.getCell(1);
		assertEquals("Country 1", el.getText());

		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		hrControllerPage.getAddCompany().click();
		hrControllerPage.getDelCompany().click();

		new Repeater() {
			@Override
			public void action() {
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1");

				WebElement el = tr.getCell(1);
				assertEquals("Country 2", el.getText());
			}
		}.repeat(10);

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("1");

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(1).isSelected());
		
		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t009_removeRow() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
		Table t = hrControllerPage.getCompanies();
		t.getRow(1).getCell(1).click();

		hrControllerPage.getDelCompany().click();

		new Repeater() {

			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				assertEquals(true, t.getRow(1).isSelected());
			}
		}.repeat(10);

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("1");

		new Repeater() {

			@Override
			public void action() {
				WebElement el = tr.getCell(1);
				assertEquals("Country 1", el.getText());
			}
		};
		
		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t010_genericTest() {

		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr1 = (TreeRow) tree.getRow("1");
		assertTrue(tr1.isSelected());

		tr1.open();

		new Repeater() {
			@Override
			public void action() {
				WebElement el = tr1.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
				assertEquals("Country 1", el.getText());
			}
		}.repeat(10);

		CountryDetailsPageObject countryDetails = new CountryDetailsPageObject(driver);
		String value = countryDetails.getCompanyDetails().getValue();
		assertEquals("Country 1", value);

		hrControllerPage = new HrControllerPageObject(driver);
		tree = hrControllerPage.getLocationTree();
		TreeRow tr2 = (TreeRow) tree.getRow("1_1");
		tr2.open();
		tr2.click();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1_1");
			}
		}.repeat(10);

		new Repeater() {
			@Override
			public void action() {
				WebElement el = tr2.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
				assertEquals("State 1", el.getText());
			}
		}.repeat(10);

		StateDetailsPageObject stateDetails = new StateDetailsPageObject(driver);
		assertEquals("State 1", stateDetails.getStateDeteails().getValue());

		TreeRow tr = (TreeRow) tree.getRow("1_1_1");
		tr.open();
		tr.click();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1_1_1");

			}
		}.repeat(10);

		WebElement el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("City 1", el.getText());
		CityDetailsPageObject cityDetails = new CityDetailsPageObject(driver);
		assertEquals("City 1", cityDetails.getCityDetails().getValue());

		TreeRow tr3 = (TreeRow) tree.getRow("1_1_1_1");
		tr3.open();
		tr3.click();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				tree.getRow("1_1_1_1");
			}
		}.repeat(10);

		el = tr3.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertEquals("Street 1", el.getText());

		DepartmentsDetailsPageObject departmentsDetails = new DepartmentsDetailsPageObject(driver);
		TableRow row = (TableRow) departmentsDetails.getDepartmentTable().getRow(0);
		assertEquals("Department 1", row.getCell(0).getText());

		EmployeesPageObject employees = new EmployeesPageObject(driver);
		row = (TableRow) employees.getEmployeeTable().getRow(0);
		assertEquals("First Name 1", row.getCell(0).getText());

		row = (TableRow) employees.getVehicleTable().getRow(0);
		assertEquals("Honda", row.getCell(0).getText());

		MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);
		mainHolderPageObject.getFiles().click();

		FilesPageObject filesPageObject = new FilesPageObject(driver);

		tree = filesPageObject.getContentTable();
		tr = (TreeRow) tree.getRow("1");

		assertEquals("Dir1", tr.getCell(0).getText());

		new Repeater() {
			public void action() {
				Tree tree = filesPageObject.getContentTable();
				TreeRow tr = (TreeRow) tree.getRow("1");
				tr.open();
			}
		}.repeat(10);

		new Repeater() {

			@Override
			public void action() {
				Tree tree = filesPageObject.getContentTable();
				TreeRow tr = (TreeRow) tree.getRow("1_1");
				assertEquals("file1", tr.getCell(0).getText());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);
				mainHolderPageObject.getEmployees().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				EmployeesPageObject employeesPageObject = new EmployeesPageObject(driver);
				TableRow row = (TableRow) employeesPageObject.getEmployeeTable().getRow(1);
				row.click();
			}
		}.repeat(10);

		mainHolderPageObject.getFiles().click();

		new Repeater() {

			@Override
			public void action() {
				Tree tree = filesPageObject.getContentTable();
				tree = filesPageObject.getContentTable();
				tree.getRow("1");
			}

		}.repeat(10);

		new Repeater() {

			@Override
			public void action() {
				Tree tree = filesPageObject.getContentTable();
				TreeRow tr = (TreeRow) tree.getRow("1");
				assertEquals("Dir2", tr.getCell(0).getText());
			}
		}.repeat(5);

		tree = filesPageObject.getContentTable();
		tr = (TreeRow) tree.getRow("1");
		tr.open();

		new Repeater() {

			@Override
			public void action() {
				Tree tree = filesPageObject.getContentTable();
				TreeRow tr = (TreeRow) tree.getRow("1_1");
				assertEquals("file4", tr.getCell(0).getText());
			}

		}.repeat(10);

		mainHolderPageObject.getEmployees().click();

		new Repeater() {
			public void action() {
				DepartmentsDetailsPageObject departmentsDetails = new DepartmentsDetailsPageObject(driver);
				TableRow row = (TableRow) departmentsDetails.getDepartmentTable().getRow(1);
				row.click();
			}
		}.repeat(10);

		new Repeater() {

			@Override
			public void action() {
				TableRow row = (TableRow) employees.getEmployeeTable().getRow(0);
				assertEquals("First Name 3", row.getCell(0).getText());
			}

		}.repeat(10);

		row = (TableRow) employees.getVehicleTable().getRow(0);
		assertEquals("Ford", row.getCell(0).getText());

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t011_addCompany() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getAddCompany().click();

		new Repeater() {
			@Override
			public void action() {
				CountryDetailsPageObject countryDetails = new CountryDetailsPageObject(driver);
				InputText inputText1 = countryDetails.getCompanyDetails();
				assertEquals("", inputText1.getValue());
			}
		}.repeat(10);

		Table t = hrControllerPage.getCompanies();

		t.getRow(0).enableEditMode();
		t.getRow(0).getCell(0).click();
		InputText inputText = new InputTextPrimeReact(t.getRow(0).getCell(0).findElement(By.cssSelector("input")),
				driver);
		inputText.clear();
		inputText.setValue("Company_3");
		assertEquals("Company_3", inputText.getValue());

		t.getRow(0).getCell(1).click();
		inputText = new InputTextPrimeReact(t.getRow(0).getCell(1).findElement(By.cssSelector("input")), driver);
		inputText.clear();
		inputText.setValue("Company_3 description");

		t.getRow(0).acceptRowChange();

		hrControllerPage = new HrControllerPageObject(driver);
		hrControllerPage.getAddToTree().click();

		new Repeater() {
			@Override
			public void action() {
				CountryDetailsPageObject countryDetails = new CountryDetailsPageObject(driver);
				InputText inputText1 = countryDetails.getCompanyDetails();
				inputText1.clear();
				assertEquals("", inputText1.getValue());
			}
		}.repeat(10);

		Tree tree = (Tree) hrControllerPage.getLocationTree();
		final TreeRow tr1 = (TreeRow) tree.getRow("1");
		tr1.rightClick();

		final Menu m = hrControllerPage.getLocationTreeContextMenu();
		new Repeater() {
			public void action() {
				m.clickOnItem("Update");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				new ButtonPrimeReact(tr1.getCell(1).findElement(By.cssSelector("button")), driver);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr1.getCell(1).findElement(By.cssSelector("input")),
						driver);
				inputText.setValue("Country_3");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr1.getCell(1).findElement(By.cssSelector("input")),
						driver);
				assertNotEquals(-1, inputText.getValue().indexOf("Country_3"));
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				ButtonPrimeReact button = new ButtonPrimeReact(
						tr1.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
				button.click();
			}
		}.repeat(10);

		new FalseRepeater() {
			public void action() {
				new ButtonPrimeReact(
						tr1.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		hrControllerPage.getAddChildToTree().click();

		tree = (Tree) hrControllerPage.getLocationTree();
		final TreeRow tr2 = (TreeRow) tree.getRow("1_1");
		tr2.rightClick();

		final Menu m1 = hrControllerPage.getLocationTreeContextMenu();
		new Repeater() {
			public void action() {
				m1.clickOnItem("Update");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				new ButtonPrimeReact(
						tr2.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr2.getCell(1).findElement(By.cssSelector("input")),
						driver);
				inputText.setValue("State_3");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr2.getCell(1).findElement(By.cssSelector("input")),
						driver);
				assertNotEquals(-1, inputText.getValue().indexOf("State_3"));
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				ButtonPrimeReact button = new ButtonPrimeReact(
						tr2.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
				button.click();
			}
		}.repeat(10);

		new FalseRepeater() {
			public void action() {
				new ButtonPrimeReact(
						tr2.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		hrControllerPage.getAddChildToTree().click();

		tree = (Tree) hrControllerPage.getLocationTree();
		final TreeRow tr3 = (TreeRow) tree.getRow("1_1_1");
		tr3.rightClick();

		Menu m4 = hrControllerPage.getLocationTreeContextMenu();
		new Repeater() {
			public void action() {
				m4.clickOnItem("Update");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				new ButtonPrimeReact(
						tr3.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr3.getCell(1).findElement(By.cssSelector("input")),
						driver);
				inputText.setValue("City_3");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr3.getCell(1).findElement(By.cssSelector("input")),
						driver);
				assertNotEquals(-1, inputText.getValue().indexOf("City_3"));
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				ButtonPrimeReact button = new ButtonPrimeReact(
						tr3.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
				button.click();
			}
		}.repeat(10);

		new FalseRepeater() {
			public void action() {
				new ButtonPrimeReact(
						tr3.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		hrControllerPage.getAddChildToTree().click();

		tree = (Tree) hrControllerPage.getLocationTree();
		final TreeRow tr4 = (TreeRow) tree.getRow("1_1_1_1");
		tr4.rightClick();

		final Menu m3 = hrControllerPage.getLocationTreeContextMenu();
		new Repeater() {
			public void action() {
				m3.clickOnItem("Update");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				new ButtonPrimeReact(
						tr4.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr4.getCell(1).findElement(By.cssSelector("input")),
						driver);
				inputText.setValue("Street_3");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr4.getCell(1).findElement(By.cssSelector("input")),
						driver);
				assertNotEquals(-1, inputText.getValue().indexOf("Street_3"));
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				ButtonPrimeReact button = new ButtonPrimeReact(
						tr4.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
				button.click();
			}
		}.repeat(10);

		new FalseRepeater() {
			public void action() {
				new ButtonPrimeReact(
						tr4.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		DepartmentsDetailsPageObject departmentsDetailsPage = new DepartmentsDetailsPageObject(driver);
		Table deptTable = (Table) departmentsDetailsPage.getDepartmentTable();

		new Repeater() {

			@Override
			public void action() {
				departmentsDetailsPage.getAddDepartment().click();
			}
		}.repeat(10);

		new Repeater() {

			@Override
			public void action() {
				deptTable.getRow(0).enableEditMode();
			}
		}.repeat(10);

		deptTable.getRow(0).getCell(0).click();
		inputText = new InputTextPrimeReact(deptTable.getRow(0).getCell(0).findElement(By.cssSelector("input")),
				driver);
		inputText.setValue("Dept_1");

		deptTable.getRow(0).getCell(1).click();
		inputText = new InputTextPrimeReact(deptTable.getRow(0).getCell(1).findElement(By.cssSelector("input")),
				driver);
		inputText.setValue("Dept_1 desk");
		deptTable.getRow(0).acceptRowChange();

		new Repeater() {
			@Override
			public void action() {
				EmployeesPageObject employeesPage = new EmployeesPageObject(driver);
				employeesPage.getAddEmployee().click();
			}
		}.repeat(10);

		EmployeesPageObject employeesPage = new EmployeesPageObject(driver);

		Table empTable = (Table) employeesPage.getEmployeeTable();

		new Repeater() {
			@Override
			public void action() {
				empTable.getRow(0).enableEditMode();
			}
		}.repeat(10);
		empTable.getRow(0).getCell(0).click();

		inputText = new InputTextPrimeReact(empTable.getRow(0).getCell(0).findElement(By.cssSelector("input")), driver);
		inputText.setValue("FName_1");

		empTable.getRow(0).getCell(1).click();

		inputText = new InputTextPrimeReact(empTable.getRow(0).getCell(1).findElement(By.cssSelector("input")), driver);
		inputText.setValue("LName_1");
		empTable.getRow(0).acceptRowChange();

		new Repeater() {
			@Override
			public void action() {
				EmployeesPageObject employeesPage = new EmployeesPageObject(driver);
				employeesPage.getAddVehicle().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				Table vehicleTable = (Table) employeesPage.getVehicleTable();
				vehicleTable.getRow(0).enableEditMode();
				vehicleTable.getRow(0).getCell(0).click();
			}
		}.repeat(10);

		Table vehicleTable = (Table) employeesPage.getVehicleTable();
		inputText = new InputTextPrimeReact(vehicleTable.getRow(0).getCell(0).findElement(By.cssSelector("input")),
				driver);
		inputText.setValue("Honda");

		new Repeater() {
			public void action() {
				Table vehicleTable = (Table) employeesPage.getVehicleTable();
				vehicleTable.getRow(0).getCell(1).click();
			}
		}.repeat(10);

		vehicleTable = (Table) employeesPage.getVehicleTable();
		inputText = new InputTextPrimeReact(vehicleTable.getRow(0).getCell(1).findElement(By.cssSelector("input")),
				driver);
		inputText.setValue("1234-567");

		vehicleTable.getRow(0).acceptRowChange();

		MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);

		mainHolderPageObject.getFiles().click();
		FilesPageObject filesPageObject = new FilesPageObject(driver);
		filesPageObject.getAddContent().click();

		tree = (Tree) filesPageObject.getContentTable();
		TreeRow tr5 = (TreeRow) tree.getRow("1");
		tr5.rightClick();

		final Menu m2 = filesPageObject.getContentTableContextMenu();
		new Repeater() {
			public void action() {
				m2.clickOnItem("Update");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				new ButtonPrimeReact(
						tr5.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr5.getCell(1).findElement(By.cssSelector("input")),
						driver);
				inputText.setValue("Dir5");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				InputText inputText = new InputTextPrimeReact(tr5.getCell(1).findElement(By.cssSelector("input")),
						driver);
				assertNotEquals(-1, inputText.getValue().indexOf("Dir5"));
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				ButtonPrimeReact button = new ButtonPrimeReact(
						tr5.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
				button.click();
			}
		}.repeat(10);

		new FalseRepeater() {
			public void action() {
				new ButtonPrimeReact(
						tr5.getCell(1).findElement(By.cssSelector("span[class='p-button-icon p-c pi pi-check']")),
						driver);
			}
		}.repeat(10);

		new Repeater() {

			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				hrControllerPage.getSaveButton().click();
			}
		}.repeat(10);

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Messages msg = hrControllerPage.getMessages();
				assertEquals("Data persisted", msg.getValue());
			}
		}.repeat(5);
		;

		quitDriver();
		createDriver();

		// Check insert
		driver.get(getUrl(app_url));
		login();

		hrControllerPage = new HrControllerPageObject(driver);

		t = hrControllerPage.getCompanies();
		t.getRow(0).click();
		WebElement el = t.getRow(0).getCell(0);
		assertEquals("Company_3", el.getText());

		tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("1");
		tr.open();

		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertNotEquals(-1, el.getText().contains("Country_3"));

		CountryDetailsPageObject countryDetails = new CountryDetailsPageObject(driver);
		String value = countryDetails.getCompanyDetails().getValue();
		assertNotEquals(-1, value.contains("Country_3"));

		new Repeater() {
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1_1");
				tr.open();
				tr.click();
			}
		}.repeat(10);

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("1_1");

		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertNotEquals(-1, el.getText().indexOf("State_3"));
		StateDetailsPageObject stateDetails = new StateDetailsPageObject(driver);
		value = stateDetails.getStateDeteails().getValue();
		assertNotEquals(-1, value.indexOf("NAState_3"));

		new Repeater() {
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1_1_1");
				tr.open();
				tr.click();
			}
		}.repeat(10);

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("1_1_1");

		el = tr.getCell(1).findElement(By.cssSelector("div[class*='p-treenode-content']"));
		assertNotEquals(-1, el.getText().indexOf("City_3"));
		CityDetailsPageObject cityDetails = new CityDetailsPageObject(driver);
		value = cityDetails.getCityDetails().getValue();
		assertNotEquals(-1, value.indexOf("City_3"));

		new Repeater() {
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Tree tree = hrControllerPage.getLocationTree();
				TreeRow tr = (TreeRow) tree.getRow("1_1_1_1");
				tr.open();
				tr.click();
			}
		}.repeat(10);

		tree = hrControllerPage.getLocationTree();
		tr = (TreeRow) tree.getRow("1_1_1_1");

		el = tr.getCell(1);
		assertNotEquals(-1, el.getText().indexOf("Street_3"));

		DepartmentsDetailsPageObject departmentsDetails = new DepartmentsDetailsPageObject(driver);
		TableRow row = (TableRow) departmentsDetails.getDepartmentTable().getRow(0);
		assertEquals("Dept_1", row.getCell(0).getText());

		EmployeesPageObject employees = new EmployeesPageObject(driver);
		row = (TableRow) employees.getEmployeeTable().getRow(0);
		assertEquals("FName_1", row.getCell(0).getText());

		row = (TableRow) employees.getVehicleTable().getRow(0);
		assertEquals("Honda", row.getCell(0).getText());

		mainHolderPageObject = new MainHolderPageObject(driver);
		mainHolderPageObject.getFiles().click();

		filesPageObject = new FilesPageObject(driver);

		tree = filesPageObject.getContentTable();
		tr = (TreeRow) tree.getRow("1");

		assertNotEquals(-1, tr.getCell(0).getText().contains("Dir5"));

		hrControllerPage.getDelCompany().click();
		new Repeater() {

			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getRow(0).getCell(0);
				assertEquals("Company A", el.getText());
			}
		}.repeat(5);

		hrControllerPage.getSaveButton().click();

		new Repeater() {
			@Override
			public void action() {
				HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);
				Messages msg = hrControllerPage.getMessages();
				assertEquals("Data persisted", msg.getValue());
			}
		}.repeat(5);
		;

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t012_Validations() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getCreatCompany().click();

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
		popUp.getOk().click();

		new Repeater() {

			@Override
			public void action() {
				String value = popUp.getMsg1().getValue();
				assertEquals(0, value.indexOf("Field cannot be emplty"));
			}
		}.repeat(10);

		Table t = hrControllerPage.getCompanies();

		WebElement el = t.getRow(0).getCell(0);
		assertEquals("Company A", el.getText());

		popUp.getDesk().setValue("891");
		popUp.getCmpName().setValue("12345");

		popUp.getOk().click();

		new Repeater() {

			@Override
			public void action() {
				Table t = hrControllerPage.getCompanies();
				WebElement el = t.getRow(0).getCell(0);
				assertEquals("12345", el.getText());
			}

		}.repeat(10);

		Tree tree = hrControllerPage.getLocationTree();
		try {
			tree.getRow("1");
			fail();
		} catch (RuntimeException e) {

		}

		t = hrControllerPage.getCompanies();
		assertEquals(true, t.getRow(0).isSelected());
		
		
		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t013_Validations() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getCreatCompany().click();

		PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
		popUp.getOk().click();

		String msg = popUp.getMsg1().getValue();
		assertEquals(msg.contains("Field cannot be emplty"), true);
		assertEquals(popUp.getMsg1().isError(), true);

		popUp.getCancel().click();
		Table t = hrControllerPage.getCompanies();
		t.getRow(1).click();

		Tree tree = hrControllerPage.getLocationTree();
		TreeRow tr = (TreeRow) tree.getRow("1");

		new Repeater() {
			@Override
			public void action() {
				WebElement el = tr.getCell(1);
				assertEquals("Country 2", el.getText());
			}
		}.repeat(10);

		hrControllerPage.getCreatCompany().click();

		popUp = new PopUpCpmpanyDetailsPageObject(driver);
//Check if window is open
		popUp.getCmpName().getValue();

		try {
			popUp.getMsg1();
			fail();
		} catch (Throwable th) {

		}

		checkifFatalErrorPage(driver);
		
	}

	@Test
	public void t014_Popup() {
		driver.get(getUrl(app_url));
		login();

		HrControllerPageObject hrControllerPage = new HrControllerPageObject(driver);

		hrControllerPage.getAddCompany().click();

		hrControllerPage.getRollbackButton().click();

		Table t = hrControllerPage.getCompanies();

		Button button = new ButtonPrimeReact(t.getRow(1).getCell(2).findElement(By.cssSelector("button")), driver);
		button.click();

		new Repeater() {
			@Override
			public void action() {
				PopUpCpmpanyDetailsPageObject popUp = new PopUpCpmpanyDetailsPageObject(driver);
				popUp.getCancel().click();
			}

		}.repeat(10);
		
		checkifFatalErrorPage(driver);

	}

	
}
