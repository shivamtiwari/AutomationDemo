package com.isango.AutomationDemo.test;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.isango.AutomationDemo.Utilities.Utilities;
import com.isango.AutomationDemo.action.ConfirmationPageActions;

public class SmokeTest {
	ConfirmationPageActions test = new ConfirmationPageActions();


	
	@BeforeClass
	public void setUpClass() {
		System.out.println("\n#####################################################################################################");
		System.out.println("################ e2e smoke #############");
		System.out.println("######################################################################################################\n\n");
		Utilities.setYamlFilePath("integration_testData.yml");

	}

	@Test
	public void setup() {
		Reporter.log(" ########## Start browser session STARTS ###########");
		test.startBrowserSession(System.getProperty("browser",
				test.getYamlVal("browser")));
		Reporter.log(" ########## Start browser session ENDS ###########");
	}

	@Test(dependsOnMethods = "setup")
	public void launchHomePage() {
		Reporter.log(" ########## Launch Home page STARTS ###########");
		test.launchUrl(test.getYamlVal("appurl"));
		Reporter.log(" ########## Launch Home page ENDS ###########");
	}

	@Test(dependsOnMethods = "launchHomePage")
	public void verifyTopBannerLinksDisplay() {
		test.verifyTopBannerLinksDisplay();
	}

	@Test(dependsOnMethods = "verifyTopBannerLinksDisplay")
	public void verifyBestProductAssociatedInformation() {
		test.verifyBestProductAssociatedInformation();
	}

	@Test(dependsOnMethods = "verifyBestProductAssociatedInformation")
	public void verifySelectProductAndUserNavigateToProductDecriptionPage() {
		test.selectProduct();
	}

	@Test(dependsOnMethods = "verifySelectProductAndUserNavigateToProductDecriptionPage")
	public void enterInformationAndClickOnBookNow() {
		test.enterInformationAndClickOnBookNow();
	}

	@Test(dependsOnMethods = "enterInformationAndClickOnBookNow")
	public void verifyCartPageDisplay() {
		test.verifyCartPageDisplay();
	}

	@Test(dependsOnMethods = "verifyCartPageDisplay")
	public void enterChildAge() {
		test.enterChildAge();
	}

	@Test(dependsOnMethods = "enterChildAge")
	public void verifyclickonProceedtoPay() {
		test.verifyclickonProceedtoPay();
	}

	@Test(dependsOnMethods = "verifyclickonProceedtoPay")
	public void enterInformationOnPaymentPageYourdetails() {
		test.enterInformationOnPaymentPageYourdetails(
				test.getYamlVal("User.Yourdetails.Date"),
				test.getYamlVal("User.Yourdetails.FirstName"),
				test.getYamlVal("User.Yourdetails.LastName"),
				test.getYamlVal("User.Yourdetails.Phone"),
				test.getYamlVal("User.Yourdetails.email"));
	}

	@Test(dependsOnMethods = "enterInformationOnPaymentPageYourdetails")
	public void enterInformationOnPaymentPageBillingAddress() {
		test.enterInformationOnPaymentPageBillingAddress(
				test.getYamlVal("User.BillingAddress.Address"),
				test.getYamlVal("User.BillingAddress.City"),
				test.getYamlVal("User.BillingAddress.PostCode"));
	}

	@Test(dependsOnMethods = "enterInformationOnPaymentPageBillingAddress")
	public void enterInformationOnPaymentPagePaymentDetails() {
		test.enterInformationOnPaymentPagePaymentDetails(
				test.getYamlVal("User.PaymentDetails.CardNo"),
				test.getYamlVal("User.PaymentDetails.CardHolderName"),
				test.getYamlVal("User.PaymentDetails.SecCode"));
	}

	@Test(dependsOnMethods = "enterInformationOnPaymentPagePaymentDetails")
	public void clickOnConfirmAndPayButton() {
		test.clickOnConfirmAndPayButton();
	}

	@Test(dependsOnMethods = "clickOnConfirmAndPayButton")
	public void verifyConfirmationPageDisplay() {
		test.verifyConfirmationPageDisplay();
	}

	@Test(dependsOnMethods = "verifyConfirmationPageDisplay")
	public void verifyBookingInformation() {
		test.verifyBookingInformation();
	}
	@BeforeMethod
	public void init() {
		System.out.println("\n\n__________________________________________________________________________");
	}

	/**
	 * Capture screen shot on failure.
	 * 
	 * @param result
	 *            the result
	 */
	@AfterMethod
	public void captureScreenShotOnFailure(ITestResult result) {
		System.out.println("******************************************************");
		System.out.println("Test Name: " + result.getName());
		if (!result.isSuccess()) {
			System.out.println("Test Result: FAIL");
			if (test.getYamlVal("ExecutionType").equalsIgnoreCase("remote")) {
				test.takeScreenshotOfFailure(result);
			} else {
				test.takeScreenshotOfFailureFromLocalMachine(result);
			}
		} else {
			System.out.println("Test Result: PASS");
		}
		System.out.println("******************************************************");
		System.out.println("__________________________________________________________________________");
	}

	/**
	 * Tear down class.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	@AfterClass
	public void tearDownClass() throws Exception {
		test.stopBrowserSession();
		System.out.println("###########################################################################################");
		System.out.println("########################################################################################### \n\n");
	}
}


