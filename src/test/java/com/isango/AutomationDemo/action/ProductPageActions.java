package com.isango.AutomationDemo.action;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductPageActions extends HomePageActions {

	public void enterInformationAndClickOnBookNow() {
		productPage.list_DropDown().get(0).click();
		productPage.select_Adults().click();
		productPage.list_DropDown().get(1).click();
		productPage.select_Childs().click();
		productPage.btn_BookNow().click();
	}

	public void verifyCartPageDisplay() {
		Assert.assertTrue(checkoutPage.btn_ProceedtoPay().isDisplayed());
		checkoutPage.txt_GrandTotal().isDisplayed();
	}

	public void enterChildAge() {
		checkoutPage.select_ExpandDropDown(1).click();
		checkoutPage.select_Age(1).click();

		checkoutPage.select_ExpandDropDown(2).click();
		checkoutPage.select_Age(2).click();

	}
	
	public void verifyclickonProceedtoPay() {
		checkoutPage.btn_ProceedtoPay().click();
	}
}