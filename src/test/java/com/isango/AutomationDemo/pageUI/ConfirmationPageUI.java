package com.isango.AutomationDemo.pageUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPageUI extends BaseUI{

	public ConfirmationPageUI(WebDriver driver) {
		super(driver);
	}
	
	public WebElement txt_OrderComplete(){
		return expWait.getWhenVisible(By.xpath("//*[contains(text(),'Your order is complete')]"),80);
	}
	
	public WebElement txt_OrderNumber(){
		return expWait.getWhenVisible(By.xpath("//*[contains(text(),' Order number:')]"),80);
	}
	
	public WebElement txt_CompleteOrderNumber(){
		return expWait.getWhenVisible(By.xpath("//*[contains(text(),' Order number:')]/parent::tr/parent::tbody"),80);
	}
	
	

}
