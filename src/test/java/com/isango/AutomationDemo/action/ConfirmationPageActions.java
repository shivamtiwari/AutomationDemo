package com.isango.AutomationDemo.action;

import org.testng.Reporter;

public class ConfirmationPageActions extends LoginAndPaymentPageActions{
	
	public void verifyConfirmationPageDisplay(){
		confirmationPage.txt_OrderComplete().isDisplayed();
	}
	
	public void verifyBookingInformation(){
		Reporter.log(" ########## Order Number ###########");

		Reporter.log(confirmationPage.txt_OrderNumber().getText());
		System.out.println(confirmationPage.txt_OrderNumber().getText());
		System.out.println(confirmationPage.txt_CompleteOrderNumber().getText());
		Reporter.log(" ########## Detail Booking Information ###########");

		Reporter.log(confirmationPage.txt_CompleteOrderNumber().getText());

	}

}
