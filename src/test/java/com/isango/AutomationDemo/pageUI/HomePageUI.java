package com.isango.AutomationDemo.pageUI;

import org.openqa.selenium.WebDriver;

public class HomePageUI extends BaseUI{

	WebDriver driver;
	public HomePageUI(WebDriver driver) {
		super(driver);
		driver = this.driver;
	}

}
