package org.sales.analyzer.ui;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sales.analyzer.process.TestCommons;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primefaces.Repeater;
import org.tura.platform.selenium.primefaces.SeleniumActionExecutor;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.MainHolderPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupAssignPermissionsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupUsersWindowsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.RoleManagementPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.UserManagementPageObject;


@RunWith(Arquillian.class)
public class AdminTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "http://localhost:8080/sa-admin/admin/administration/AdminWindow.xhtml";
	static private String driver_location = "${user.home}/chromedriver";
	
	
	
	@BeforeClass
	public static void beforeClass() {
		try {
			
			String home = System.getProperty("user.home");
			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(
							new File(driver_location.replace("${user.home}", home) ))
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
		driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
	
	private void login() {
		WebElement el = driver.findElement(By.id("username"));
		el.sendKeys(TestCommons.USERNAME);

		el = driver.findElement(By.id("password"));
		el.sendKeys(TestCommons.PASSWORD);
		
		el = driver.findElement(By.id("kc-login"));
		el.click();
		

	}

	@Test
	@RunAsClient
	public void t000_error1() {
		driver.get(app_url);

		login();
		
		UserManagementPageObject  userManagementPage = new UserManagementPageObject(driver);
		userManagementPage.getCreateUser().click();
		
		PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
		InputText usrName= popupUsersWindowsPage.getUserName();
		usrName.setValue("User Name");
		popupUsersWindowsPage.getUskPopOk().click();
		
		Table t = userManagementPage.getUsersTable();
		t.getRow(1).getCell(0).click();
		t.getRow(1).getCell(3).click();
		
		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				popupUsersWindowsPage.getUskPopCancel().click();
			}
		}.repeat(10);
		

		t = userManagementPage.getUsersTable();
		boolean isSelected = t.getRow(1).isSelected();
		assertTrue(isSelected);
		
		
	}

	@Test
	@RunAsClient
	public void t000_error2() {
		driver.get(app_url);
		login();
		
		MainHolderPageObject main = new MainHolderPageObject(driver);
		main.getRoleManagement().click();

		new Repeater() {
			public void action() {
				RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
				roleManagementPageObject.getRolesTable();
			}
		}.repeat(10);
		
		RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
		Table t = roleManagementPageObject.getRolesTable();
		t.getRow(3).click();
		
		roleManagementPageObject.getAddPermissions().click();
		
		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(driver);
				popupAssignPermissionsPageObject.getPermitionsTable();
			}
		}.repeat(10);

		PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(driver);
		Table t1 =  popupAssignPermissionsPageObject.getPermitionsTable();
		t1.getRow(0).getCell(0).click();
		t1.getRow(0).getCell(0).click();
		
		popupAssignPermissionsPageObject.getPermPopOk().click();
		
		new SeleniumActionExecutor(driver,
				RoleManagementPageObject.getPermissionsSearchCriteria(), RoleManagementPageObject.getRolesTableSearchCriteria()) {
			public void action(WebDriver driver) {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.run();
		
		
		new SeleniumActionExecutor(driver,
				RoleManagementPageObject.getPermissionsSearchCriteria(), RoleManagementPageObject.getRolesTableSearchCriteria()) {
			public void action(WebDriver driver) {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.run();

		
		new SeleniumActionExecutor(driver,
				RoleManagementPageObject.getPermissionsSearchCriteria(), RoleManagementPageObject.getRolesTableSearchCriteria()) {
			public void action(WebDriver driver) {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.run();
		
	try {	
		new Repeater() {
			public void action() {
				  Table t2 = roleManagementPageObject.getPermissions();
				  t2.getRow(0).getCell(0).getText();
				  fail();
			}
		}.repeat(10);
		
	}catch(Throwable  tx) {
		if ( !(tx instanceof AssertionError)) {
			new Repeater() {
				public void action() {
					  Table t2 = roleManagementPageObject.getPermissions();
					  assertTrue(t2.isEmpty());
				}
			}.repeat(10);
		}else {
			  fail();
		}

	}

	}	
	
}