package com.isango.AutomationDemo.pageUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPageUI extends BaseUI {

	public CheckOutPageUI(WebDriver driver) {
		super(driver);
	}

	public WebElement btn_ProceedtoPay() {
		return expWait.getWhenVisible(By.xpath("//a[text()='Proceed to pay']"),
				60);
	}

	public WebElement txt_GrandTotal() {
		return expWait.getWhenVisible(By.xpath(".//*[@id='GrandTotal']/span"));
	}
	
	public WebElement select_Age(int index) {
		return expWait.getWhenVisible(By.xpath("(//*[contains(@class,'crossSellContent')]//*[contains(@id,'Child_')]//*[contains(@class,'cardOption') and @style=\"\"])["+index+"]//a/span[text()='5 yrs']"));
	}
	
	public WebElement select_ExpandDropDown(int index) {
		return expWait.getWhenVisible(By.xpath("(//*[contains(@class,'crossSellContent')]//*[contains(@id,'Child_')]//*[contains(@class,'cardOption') and @style=\"\"])["+index+"]//*[@class='ddTitle']"));
	}


}
