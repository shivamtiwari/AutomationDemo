package com.isango.AutomationDemo.test;

import org.testng.Reporter;
import org.testng.annotations.*;

import com.isango.AutomationDemo.Utilities.Utilities;
import com.isango.AutomationDemo.action.ConfirmationPageActions;

public class SmokeTest {

	ConfirmationPageActions test = new ConfirmationPageActions();
	@BeforeClass
	public void initialsettings() {
		Utilities.setYamlFilePath("integration_testData.yml");
	}
	
	@Test
	public void setup() {
		Reporter.log(" ########## Start browser session STARTS ###########");
		test.startBrowserSession(System.getProperty("browser", test.getYamlVal("browser")));
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
		test.verifyCartPageDisplay();
		test.enterChildAge();
		test.verifyclickonProceedtoPay();
		test.enterInformationOnPaymentPage();
		test.verifyConfirmationPageDisplay();
		test.verifyBookingInformation();
	}
	
	@AfterClass
	public void tearDown() {
		Reporter.log(" ########## Stop Browser Session ###########");
		test.stopBrowserSession();
	}
}
