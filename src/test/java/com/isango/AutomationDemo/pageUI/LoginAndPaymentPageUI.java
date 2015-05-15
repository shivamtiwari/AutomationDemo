package com.isango.AutomationDemo.pageUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndPaymentPageUI extends BaseUI {

	public LoginAndPaymentPageUI(WebDriver driver) {
		super(driver);
	}

	public WebElement div_Calander() {
		return expWait.getWhenVisible(By.xpath("//*[@class='Calander']/input"),
				80);
	}

	public WebElement txtBox_FirstName() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtFirstName')]"));
	}

	public WebElement txtBox_LastName() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtLastName')]"));
	}
	
	public WebElement txtBox_RegisterEmail() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtRegisterEmail')]"));
	}
	
	public WebElement txtBox_ConfirmEmail() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtRegisterConfirmEmail')]"));
	}

	public WebElement txtBox_Phone() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtRegisterPhone')]"));
	}

	public WebElement txtBox_Address() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtAddress')]"));
	}

	public WebElement txtBox_City() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtCity')]"));
	}

	public WebElement txtBox_PastCode() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtPostCode')]"));
	}

	public WebElement txtBox_CardNo() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtCardNo')]"));
	}

	public WebElement txtBox_NameofCardHolder() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtNameofCardHolder')]"));
	}

	public WebElement txtBox_txtSecurityCode() {
		return expWait.getWhenVisible(By
				.xpath("//*[contains(@id,'MainContent_txtSecurityCode')]"));
	}

	public WebElement checkbox_ChkTerms() {
		return expWait.getWhenVisible(By.xpath("//*[@id='ChkTerms']"));
	}

	public WebElement btn_ConfirmAndpay() {
		return expWait
				.getWhenVisible(By.xpath("//*[text()='Confirm and pay']"));
	}

	public WebElement btn_FindUSArrow() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_FindUs_msdd')]//*[@class='arrow']"));
	}

	public WebElement btn_FindUSOption() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_FindUs_msdd')]//a[.='Referred by friends or family']"));
	}

	public WebElement btn_CardTypesArrow() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbCardTypes_msdd')]//*[@class='arrow']"));
	}

	public WebElement btn_CardTypesOption() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbCardTypes_msdd')]//a[.='Visa']"));
	}

	public WebElement btn_ExpiryDateArrow() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbExpiryDateMM_msdd')]//*[@class='arrow']"));
	}

	public WebElement btn_ExpiryDateOption() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbExpiryDateMM_msdd')]//a[.='1']"));
	}

	public WebElement btn_ExpiryYearArrow() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbExpiryDateYYYY_msdd')]//*[@class='arrow']"));
	}

	public WebElement btn_ExpiryYearOption() {
		return expWait
				.getWhenVisible(By
						.xpath("//*[contains(@id,'MainContent_cmbExpiryDateYYYY_msdd')]//a[.='2016']"));
	}

}
