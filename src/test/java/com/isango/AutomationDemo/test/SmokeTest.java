package com.isango.AutomationDemo.test;

import org.testng.Reporter;
import org.testng.annotations.*;

import com.isango.AutomationDemo.Utilities.Utilities;
import com.isango.AutomationDemo.action.HomePageActions;

public class SmokeTest {

	HomePageActions test = new HomePageActions();
	@BeforeClass
	public void initialsettings() {
		Utilities.setYamlFilePath("integration_testData.yml");
	}
	
	@Test
	public void setup() {
		Reporter.log(" ########## Start browser session STARTS ###########");
		test.startBrowserSession(test.getYamlVal("browser"));
		Reporter.log(" ########## Start browser session ENDS ###########");
	}
	
	@Test(dependsOnMethods = "setup")
	public void launchDashboardPage() {
		Reporter.log(" ########## Launch Home page STARTS ###########");
		test.launchUrl(test.getYamlVal("appurl"));
		Reporter.log(" ########## Launch Home page ENDS ###########");
	}
	
	@AfterClass
	public void tearDown() {
		Reporter.log(" ########## Stop Browser Session ###########");
		test.stopBrowserSession();
	}
}
