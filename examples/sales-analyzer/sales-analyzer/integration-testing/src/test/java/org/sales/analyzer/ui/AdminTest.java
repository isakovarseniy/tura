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

package org.sales.analyzer.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sales.analyzer.process.PostDeployer;
import org.tura.platform.selenium.InputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.MainHolderPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupAssignPermissionsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupUsersWindowsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.RoleManagementPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.UserManagementPageObject;

public class AdminTest extends AbstractTest{

	static WebDriver driver;
	static ChromeDriverService service;
	static private String app_url = "/admin/administration/adminWindow";
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

	private void login() {
		WebElement el = driver.findElement(By.id("username"));
		el.sendKeys(PostDeployer.USERNAME);

		el = driver.findElement(By.id("password"));
		el.sendKeys(PostDeployer.PASSWORD);

		el = driver.findElement(By.id("kc-login"));
		el.click();

	}

	@Test
	public void t000_error1() {
		driver.get(getAdminUrl(app_url));

		login();

		UserManagementPageObject userManagementPage = new UserManagementPageObject(driver);

		new Repeater() {
			public void action() {
				UserManagementPageObject userManagementPage = new UserManagementPageObject(driver);
				userManagementPage.getCreateUser().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText usrName = popupUsersWindowsPage.getUserName();
				usrName.setValue("User Name");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText usrName = popupUsersWindowsPage.getUserName();
				assertEquals("User Name", usrName.getValue());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText firstName = popupUsersWindowsPage.getFirstName();
				firstName.setValue("First Name");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText firstName = popupUsersWindowsPage.getFirstName();
				assertEquals("First Name", firstName.getValue());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText lastName = popupUsersWindowsPage.getLastName();
				lastName.setValue("Last Name");
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				InputText lastName = popupUsersWindowsPage.getLastName();
				assertEquals("Last Name", lastName.getValue());
			}
		}.repeat(10);

		PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
		popupUsersWindowsPage.getUskPopOk().click();

		new Repeater() {
			public void action() {
				Table t = userManagementPage.getUsersTable();
				t.getRow(1).getCell(0).click();
				t.getRow(1).getCell(3).click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupUsersWindowsPageObject popupUsersWindowsPage = new PopupUsersWindowsPageObject(driver);
				popupUsersWindowsPage.getUskPopCancel().click();
			}
		}.repeat(10);

		Table t = userManagementPage.getUsersTable();
		boolean isSelected = t.getRow(1).isSelected();
		assertTrue(isSelected);

	}

	@Test
	public void t000_error2() {
		driver.get(getAdminUrl(app_url));
		login();

		MainHolderPageObject mainHolderPageObject = new 		MainHolderPageObject(driver);
		mainHolderPageObject.getRoleManagement().click();
		
		RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
		roleManagementPageObject.getRolesTable();

		Table t = roleManagementPageObject.getRolesTable();
		t.getRow(3).click();

		roleManagementPageObject.getAddPermissions().click();

		PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
				driver);
		Table t1 = popupAssignPermissionsPageObject.getPermitionsTable();

        new Repeater() {
			@Override
			public void action() {
				t1.getRow(0).getCell(0).click();
			}
		}.repeat(10);;
		
		
        new Repeater() {
			@Override
			public void action() {
				t1.getRow(0).getCell(0).click();
			}
		}.repeat(10);

		popupAssignPermissionsPageObject.getPermPopOk().click();

        new Repeater() {
			@Override
			public void action() {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.repeat(10);
		

        new Repeater() {
			@Override
			public void action() {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.repeat(10);


        new Repeater() {
			@Override
			public void action() {
				Table t = roleManagementPageObject.getRolesTable();
				t.getRow(0).getCell(2).click();
			}
		}.repeat(10);
		
		
		try {
			new Repeater() {
				public void action() {
					Table t2 = roleManagementPageObject.getPermissions();
					t2.getRow(0).getCell(0).getText();
					fail();
				}
			}.repeat(10);

		} catch (Throwable tx) {
			if (!(tx instanceof AssertionError)) {
				new Repeater() {
					public void action() {
						Table t2 = roleManagementPageObject.getPermissions();
						assertTrue(t2.isEmpty());
					}
				}.repeat(10);
			} else {
				fail();
			}

		}

	}

}
