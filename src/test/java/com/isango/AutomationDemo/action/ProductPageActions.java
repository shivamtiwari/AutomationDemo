package com.isango.AutomationDemo.action;

import org.testng.Assert;

public class ProductPageActions extends HomePageActions {
	public void enterInformationAndClickOnBookNow() {
		productPage.list_DropDown().get(0).isDisplayed();
		productPage.list_DropDown().get(0).click();
		productPage.select_Adults().click();
		productPage.waitForSyncPage();
		productPage.checkWeekSliderSpinnerToAppear();
		productPage.list_DropDown().get(1).isDisplayed();
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
		checkoutPage.select_ExpandDropDown(2).isDisplayed();
		checkoutPage.select_ExpandDropDown(2).click();
		checkoutPage.select_Age(2).click();
		checkoutPage.checkWeekSliderSpinnerToAppear();
	}

	public void verifyclickonProceedtoPay() {
		checkoutPage.btn_ProceedtoPay().isDisplayed();
		checkoutPage.btn_ProceedtoPay().click();
	}
}
