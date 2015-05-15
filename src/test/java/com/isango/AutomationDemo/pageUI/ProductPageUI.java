package com.isango.AutomationDemo.pageUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageUI extends BaseUI {

	public ProductPageUI(WebDriver driver) {
		super(driver);
	}

	public WebElement heading_ProductIntro() {
		return expWait.getWhenVisible(By.xpath("//*[@class='headOuter']//h1"),
				80);
	}

	public WebElement txt_spAdultPrice() {
		return expWait.getWhenVisible(By.id("spAdultPrice"));
	}

	public WebElement txt_spChildPrice() {
		return expWait.getWhenVisible(By.id("spChildPrice"));
	}
	
	public List<WebElement> list_DropDown(){
		return expWait.getWhenVisibleList(By.xpath("//*[@class='bestInner']//span[contains(@id,'arrow')]"), 60);
	}
	
	public WebElement select_Adults() {
		return expWait.getWhenVisible(By.xpath("//*[@class='bestInner']//a[contains(.,'2 Adults')]"), 60);
	}
	
	public WebElement select_Childs() {
		return expWait.getWhenVisible(By.xpath("//*[@class='bestInner']//a[contains(.,'2 Children')]"), 60);
	}
	
	public WebElement btn_BookNow() {
		return expWait.getWhenVisible(By.xpath("//a[text()='Book Now']"));
	}

}
