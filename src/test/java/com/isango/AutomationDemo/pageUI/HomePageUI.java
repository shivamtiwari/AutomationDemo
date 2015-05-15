package com.isango.AutomationDemo.pageUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI extends BaseUI{

	public HomePageUI(WebDriver driver) {
		super(driver);
	}

	public WebElement lnk_LowPriceGuarantee(){
		return expWait.getWhenVisible(By.xpath("//*[@id='dnn_TopBanner']//a[text()='Low Price Guarantee']"),80);
	}
	
	public WebElement lnk_FREEGifts(){
		return expWait.getWhenVisible(By.xpath("//*[@id='dnn_TopBanner']//a[text()='FREE Gifts']"));
	}
	
	public WebElement lnk_NoExtraTaxesorCharges(){
		return expWait.getWhenVisible(By.xpath("//*[@id='dnn_TopBanner']//a[text()='No Extra Taxes or Charges']"));
	}
	
	public WebElement lnk_ReadCustomerReviews(){
		return expWait.getWhenVisible(By.xpath("//*[@id='dnn_TopBanner']//a[text()='Read Customer Reviews']"));
	}
	
	public WebElement lnk_ExploreOrlandoTickets(){
		return expWait.getWhenVisible(By.xpath("//*[@id='dnn_accordian']//h2[contains(text(),'Explore Orlando Tickets')]"));
	}
	
	public WebElement lnk_Compareallcombotickets(){
		return expWait.getWhenVisible(By.xpath("//span[contains(text(),'Compare all combo tickets')]"));
	}
	
	public WebElement lnk_Bestsellers(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//h4//*[text()='Bestsellers']"));
	}
	
	public WebElement img_ProductImage(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//img"));
	}
	
	public WebElement lnk_FreeGiftProduct(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//*[contains(text(),'FREE GIFT')]"));
	}
	
	public WebElement lnk_BestProdIntro(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//*[@class='bestProdIntro']//a"));
	}
	
	public WebElement lnk_priceAdult(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//*[@class='priceAdult']"));
	}
	
	public WebElement lnk_priceChild(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//*[@class='priceChild']"));
	}
	
	public WebElement lnk_bookNow(){
		return expWait.getWhenVisible(By.xpath("//div[@id='dnn_Merchandising']//*[@class='bestOuter'][2]//*[@class='bookNow']//a"));
	}
	
}
