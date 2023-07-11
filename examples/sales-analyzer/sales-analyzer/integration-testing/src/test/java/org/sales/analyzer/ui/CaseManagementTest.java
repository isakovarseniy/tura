/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sales.analyzer.process.PostDeployer;
import org.tura.platform.selenium.DropDownSelection;
import org.tura.platform.selenium.Messages;
import org.tura.platform.selenium.OutputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primereact.ButtonPrimeReact;
import org.tura.platform.selenium.primereact.Repeater;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.AdminWindowPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.MainHolderPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupAssignPermissionsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.RoleManagementPageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.CaseDescriptionPageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.WorkItemCanvasePageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.WriteOutcomePageObject;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CaseManagementTest extends AbstractTest{

	static WebDriver driver;
	static ChromeDriverService service;
	static private String admin_url = "/admin/administration/adminWindow";
	static private String casemgm_url = "/analysis/casemanager/workItemWindow";

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
	public void a000_enablePermission() {
		driver.get( getAdminUrl(admin_url));
		login();

		new Repeater() {
			public void action() {
				MainHolderPageObject mainHolderPageObject = new MainHolderPageObject(driver);
				mainHolderPageObject.getRoleManagement().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
				roleManagementPageObject.getAddPermissions().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				permitionsTable.getHeader().getCell(0).click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				assertTrue(permitionsTable.getRow(3).isSelected());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				permitionsTable.nextPage();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				assertFalse(permitionsTable.getRow(1).isSelected());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				permitionsTable.getHeader().getCell(0).click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
						driver);
				Table permitionsTable = popupAssignPermissionsPageObject.getPermitionsTable();
				assertTrue(permitionsTable.getRow(1).isSelected());
			}
		}.repeat(10);

		PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
				driver);
		popupAssignPermissionsPageObject.getPermPopOk().click();

		new Repeater() {
			public void action() {
				RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
				roleManagementPageObject.getRoleCommit().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				AdminWindowPageObject adminWindowPageObject = new AdminWindowPageObject(driver);
				Messages msg = adminWindowPageObject.getMessage();
				assertEquals("Information persisted", msg.getValue());
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
				roleManagementPageObject.getRoleClearCache().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				AdminWindowPageObject adminWindowPageObject = new AdminWindowPageObject(driver);
				Messages msg = adminWindowPageObject.getMessage();
				assertEquals("Cache has been updated", msg.getValue(1));
			}
		}.repeat(10);
		
		
	}

	@Test
	public void t001_assignCase() {
		driver.get(getCaseMgmUrl(casemgm_url));
		login();

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table workItemTable = workItemCanvase.getWorkItemTable();
				workItemTable.getRow(0).getCell(0).click();
				;
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				workItemCanvase.getAssignToMe().click();
			}
		}.repeat(10);

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table workItemTable = workItemCanvase.getWorkItemTable();

		new Repeater() {
			public void action() {
				WebElement el = workItemTable.getRow(0).getCell(6);
				assertEquals(PostDeployer.USERNAME, el.getText());
			}
		}.repeat(10);

		
	}

	@Test
	public void t001_closeCase() {
		driver.get(getCaseMgmUrl(casemgm_url));
		login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table workItemTable = workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(0).getCell(4);
		String closeCaseId = el.getText();

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table workItemTable = workItemCanvase.getWorkItemTable();
				workItemTable.getRow(0).getCell(0).click();
				;
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				workItemCanvase.getClose().click();
			}
		}.repeat(10);


		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);

				Table workItemTable = workItemCanvase.getWorkItemTable();
				WebElement el = workItemTable.getRow(0).getCell(4);
				String nextCaseId = el.getText();

				assertNotEquals(closeCaseId, nextCaseId);
			}
		}.repeat(10);

		
	}

	@Test
	public void t001_fullCycle() {
		driver.get(getCaseMgmUrl(casemgm_url));
		login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table workItemTable = workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(5).getCell(4);
		String closeCaseId = el.getText();

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table workItemTable = workItemCanvase.getWorkItemTable();
				WebElement el = workItemTable.getRow(5).getCell(4);
				ButtonPrimeReact link = new ButtonPrimeReact(el.findElement(By.cssSelector("button")), driver);
				link.click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
				String value = caseDescription.getCaseId().getValue();
				assertEquals(closeCaseId, value);
				value = caseDescription.getCaseStatus().getValue();
				assertEquals("Case analysis", value);
			}
		}.repeat(10);

		WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
		writeOutcome.getAssignAnalystToMe().click();

		new Repeater() {
			public void action() {
				WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
				OutputText analyst = writeOutcome.getAnalyst();
				assertEquals(PostDeployer.USERNAME, analyst.getValue());
			}
		}.repeat(10);

		writeOutcome.getAssignReviewerToMy().click();

		new Repeater() {
			public void action() {
				WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
				OutputText reviewer = writeOutcome.getReviewer();
				assertEquals(PostDeployer.USERNAME, reviewer.getValue());
			}
		}.repeat(10);


		new Repeater() {
			public void action() {
				WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
				writeOutcome.getSaveCase().click();
			}
		}.repeat(10);

		writeOutcome = new WriteOutcomePageObject(driver);

		writeOutcome.getResolution().setValue("market deviation");
		DropDownSelection resolution = writeOutcome.getResolution();
		assertEquals("market deviation", resolution.getValue());

		writeOutcome.getApproveStatus().setValue("approved");
		DropDownSelection approveStatus = writeOutcome.getApproveStatus();
		assertEquals("approved", approveStatus.getValue());

		new Repeater() {
			public void action() {
				WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
				writeOutcome.getSubmitCase().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
				writeOutcome.getSubmitCase().click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table workItemTable = workItemCanvase.getWorkItemTable();
				WebElement el = workItemTable.getRow(5).getCell(4);
				String nextCaseId = el.getText();

				assertNotEquals(closeCaseId, nextCaseId);
			}
		}.repeat(10);

		

	}

	@Test
	public void t001_viewCase() {
		driver.get(getCaseMgmUrl(casemgm_url));
		driver.manage().window().setSize(new Dimension(1600, 800));
		login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table workItemTable = workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(5).getCell(4);
		String closeCaseId = el.getText();

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table workItemTable = workItemCanvase.getWorkItemTable();
				WebElement el = workItemTable.getRow(5).getCell(4);
				ButtonPrimeReact link = new ButtonPrimeReact(el.findElement(By.cssSelector("button")), driver);
				link.click();
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
				String value = caseDescription.getCaseId().getValue();
				assertEquals(closeCaseId, value);
				value = caseDescription.getCaseStatus().getValue();
				assertEquals("Case analysis", value);
			}
		}.repeat(10);

		new Repeater() {
			public void action() {
				CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
				caseDescription.getCloseDetailWindow().click();
				;
			}
		}.repeat(10);

		workItemCanvase = new WorkItemCanvasePageObject(driver);
		workItemTable = workItemCanvase.getWorkItemTable();
		el = workItemTable.getRow(5).getCell(4);
		String nextCaseId = el.getText();

		assertEquals(closeCaseId, nextCaseId);

	}

}
