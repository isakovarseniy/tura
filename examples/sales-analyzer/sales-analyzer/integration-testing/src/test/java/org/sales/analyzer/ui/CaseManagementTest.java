package org.sales.analyzer.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sales.analyzer.process.PostDeployer;
import org.tura.configuration.dsl.commons.ConfigConstants;
import org.tura.platform.selenium.DropDownSelection;
import org.tura.platform.selenium.Link;
import org.tura.platform.selenium.OutputText;
import org.tura.platform.selenium.Table;
import org.tura.platform.selenium.primefaces.LinkPrimeFaces;
import org.tura.platform.selenium.primefaces.Repeater;
import org.tura.platform.selenium.primefaces.SeleniumActionExecutor;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.AdminWindowPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.MainHolderPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.PopupAssignPermissionsPageObject;
import org.tura.salesanalyzer.admin.admin.administration.pageobject.RoleManagementPageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.CaseDescriptionPageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.WorkItemCanvasePageObject;
import org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.WriteOutcomePageObject;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CaseManagementTest {

	static WebDriver driver;
	static ChromeDriverService service;
	static private String admin_url = "http://wf:8081/sa-admin/admin/administration/adminWindow.xhtml";
	static private String casemgm_url = "http://wf:8081/sa-case-manager/analysis/casemanager/workItemWindow.xhtml";

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
		driver.get(admin_url);
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
				permitionsTable.nextPage();
				permitionsTable.getHeader().getCell(0).click();
			}
		}.repeat(10);

		PopupAssignPermissionsPageObject popupAssignPermissionsPageObject = new PopupAssignPermissionsPageObject(
				driver);
		popupAssignPermissionsPageObject.getPermPopOk().click();

		new SeleniumActionExecutor(driver, AdminWindowPageObject.getMessageSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
						roleManagementPageObject.getRoleCommit().click();
					}
				}.repeat(10);
			}
		}.run();

		new Repeater() {
			public void action() {
				RoleManagementPageObject roleManagementPageObject = new RoleManagementPageObject(driver);
				roleManagementPageObject.getRoleClearCache().click();
			}
		}.repeat(10);

	}

	@Test
	public void t001_assignCase() {
		driver.get(casemgm_url);
		login();

		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table  workItemTable =  workItemCanvase.getWorkItemTable();
				workItemTable.getRow(0).getCell(0).click();;
			}
		}.repeat(10);

		new SeleniumActionExecutor(driver, WorkItemCanvasePageObject.getWorkItemTableSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
						workItemCanvase.getAssignToMe().click();
					}
				}.repeat(10);
			}
		}.run();
		
		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table  workItemTable =  workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(0).getCell(6);
		assertEquals(PostDeployer.USERNAME, el.getText());

	}

	@Test
	public void t001_closeCase() {
		driver.get(casemgm_url);
		login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table  workItemTable =  workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(0).getCell(4);
		String closeCaseId = el.getText();

		
		new Repeater() {
			public void action() {
				WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
				Table  workItemTable =  workItemCanvase.getWorkItemTable();
				workItemTable.getRow(0).getCell(0).click();;
			}
		}.repeat(10);

		new SeleniumActionExecutor(driver, WorkItemCanvasePageObject.getWorkItemTableSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
						workItemCanvase.getClose().click();
					}
				}.repeat(10);
			}
		}.run();
		
		workItemCanvase = new WorkItemCanvasePageObject(driver);
		workItemTable =  workItemCanvase.getWorkItemTable();
		el = workItemTable.getRow(0).getCell(4);
		String nextCaseId = el.getText();

		assertNotEquals(closeCaseId, nextCaseId);

	}
	
	@Test
	public void t001_fullCycle() {
		driver.get(casemgm_url);
		login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table  workItemTable =  workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(5).getCell(4);
		String closeCaseId = el.getText();
		
		new SeleniumActionExecutor(driver, WorkItemCanvasePageObject.getWorkItemTableSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
						Table  workItemTable =  workItemCanvase.getWorkItemTable();
						WebElement el = workItemTable.getRow(5).getCell(4);
						Link link = new LinkPrimeFaces(el.findElement(By.cssSelector("a")), driver);
						link.click();
					}
				}.repeat(10);
			}
		}.run();
		
		
		new Repeater() {
			public void action() {
				CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
				String value  = caseDescription.getCaseId().getValue();
				assertEquals(closeCaseId, value);
				 value  = caseDescription.getCaseStatus().getValue();
				assertEquals("Case analysis", value);
			}
		}.repeat(10);

		
		new SeleniumActionExecutor(driver, WriteOutcomePageObject.getAnalystSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
						writeOutcome.getAssignAnalystToMe().click();
					}
				}.repeat(10);
			}
		}.run();
		
		WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
		OutputText analyst = writeOutcome.getAnalyst();
		assertEquals(PostDeployer.USERNAME, analyst.getValue());
		

		new SeleniumActionExecutor(driver, WriteOutcomePageObject.getReviewerSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
						writeOutcome.getAssignReviewerToMy().click();
					}
				}.repeat(10);
			}
		}.run();
		
		writeOutcome = new WriteOutcomePageObject(driver);
		OutputText reviewer = writeOutcome.getReviewer();
		assertEquals(PostDeployer.USERNAME, reviewer.getValue());

		
		new SeleniumActionExecutor(driver, org.tura.salesanalyzer.admin.analysis.casemanager.pageobject.MainHolderPageObject.getWriteOutcomeSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
						writeOutcome.getSaveCase().click();;
					}
				}.repeat(10);
			}
		}.run();


		writeOutcome = new WriteOutcomePageObject(driver);
		
		writeOutcome.getResolution().setValue("market deviation");;
		DropDownSelection resolution = writeOutcome.getResolution();
		assertEquals("market deviation", resolution.getValue());

		writeOutcome.getApproveStatus().setValue("approved");;
		DropDownSelection approveStatus = writeOutcome.getApproveStatus();
		assertEquals("approved", approveStatus.getValue());

		new SeleniumActionExecutor(driver, CaseDescriptionPageObject.getCaseStatusSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
						writeOutcome.getSubmitCase().click();;
					}
				}.repeat(10);
			}
		}.run();

		new SeleniumActionExecutor(driver, CaseDescriptionPageObject.getCaseStatusSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WriteOutcomePageObject writeOutcome = new WriteOutcomePageObject(driver);
						writeOutcome.getSubmitCase().click();;
					}
				}.repeat(10);
			}
		}.run();

		workItemCanvase = new WorkItemCanvasePageObject(driver);
		workItemTable =  workItemCanvase.getWorkItemTable();
		el = workItemTable.getRow(5).getCell(4);
		String nextCaseId = el.getText();

		assertNotEquals(closeCaseId, nextCaseId);
		
	}
	
	@Test
	public void t001_viewCase() {
		driver.get(casemgm_url);
		driver.manage().window().setSize(new Dimension(1600, 800));
		 login();

		WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
		Table  workItemTable =  workItemCanvase.getWorkItemTable();
		WebElement el = workItemTable.getRow(5).getCell(4);
		String closeCaseId = el.getText();
		
		new SeleniumActionExecutor(driver, WorkItemCanvasePageObject.getWorkItemTableSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						WorkItemCanvasePageObject workItemCanvase = new WorkItemCanvasePageObject(driver);
						Table  workItemTable =  workItemCanvase.getWorkItemTable();
						WebElement el = workItemTable.getRow(5).getCell(4);
						Link link = new LinkPrimeFaces(el.findElement(By.cssSelector("a")), driver);
						link.click();
					}
				}.repeat(10);
			}
		}.run();

		new Repeater() {
			public void action() {
				CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
				String value  = caseDescription.getCaseId().getValue();
				assertEquals(closeCaseId, value);
				 value  = caseDescription.getCaseStatus().getValue();
				assertEquals("Case analysis", value);
			}
		}.repeat(10);

		new SeleniumActionExecutor(driver, CaseDescriptionPageObject.getCaseStatusSearchCriteria()) {
			public void action(WebDriver driver) {
				new Repeater() {
					public void action() {
						CaseDescriptionPageObject caseDescription = new CaseDescriptionPageObject(driver);
						caseDescription.getCloseDetailWindow().click();;
					}
				}.repeat(10);
			}
		}.run();

		workItemCanvase = new WorkItemCanvasePageObject(driver);
		workItemTable =  workItemCanvase.getWorkItemTable();
		el = workItemTable.getRow(5).getCell(4);
		String nextCaseId = el.getText();

		assertEquals(closeCaseId, nextCaseId);
		
	}
	
}
