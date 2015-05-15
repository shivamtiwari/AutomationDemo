package com.isango.AutomationDemo.action;

public class ConfirmationPageActions extends LoginAndPaymentPageActions{
	
	public void verifyConfirmationPageDisplay(){
		confirmationPage.txt_OrderComplete().isDisplayed();
	}
	
	public void verifyBookingInformation(){
		System.out.println(confirmationPage.txt_OrderNumber().getText());
		System.out.println(confirmationPage.txt_CompleteOrderNumber().getText());
	}

}
