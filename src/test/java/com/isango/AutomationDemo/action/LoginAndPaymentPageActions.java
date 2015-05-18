package com.isango.AutomationDemo.action;

public class LoginAndPaymentPageActions extends ProductPageActions {
	public void enterInformationOnPaymentPageYourdetails(String Date, String FirstName, String LastName, String Phone, String email) {
		paymentPage.div_Calander().isDisplayed();
		String id = paymentPage.div_Calander().getAttribute("id");
		executeJs("document.getElementById(\"" + id
				+ "\").removeAttribute(\"readonly\")");
		paymentPage.div_Calander().sendKeys(Date);
		paymentPage.txtBox_FirstName().sendKeys(FirstName);
		paymentPage.txtBox_LastName().sendKeys(LastName);
		paymentPage.txtBox_Phone().sendKeys(Phone);
		paymentPage.txtBox_RegisterEmail().sendKeys(email);
		paymentPage.txtBox_ConfirmEmail().sendKeys(email);
		paymentPage.btn_FindUSArrow().click();
		paymentPage.btn_FindUSOption().click();
	}

	public void enterInformationOnPaymentPageBillingAddress(String Address, String City, String PostCode) {
		

		paymentPage.txtBox_Address().sendKeys(Address);
		paymentPage.txtBox_City().sendKeys(City);
		paymentPage.txtBox_PastCode().sendKeys(PostCode);
	}

	public void enterInformationOnPaymentPagePaymentDetails(String CardNo, String HolderName, String SecCode) {
		

		paymentPage.btn_CardTypesArrow().click();
		paymentPage.btn_CardTypesOption().click();
		paymentPage.txtBox_CardNo().sendKeys(CardNo);
		paymentPage.txtBox_NameofCardHolder().sendKeys(HolderName);
		paymentPage.btn_ExpiryDateArrow().click();
		paymentPage.btn_ExpiryDateOption().click();
		paymentPage.btn_ExpiryYearArrow().click();
		paymentPage.btn_ExpiryYearOption().click();
		paymentPage.txtBox_txtSecurityCode().sendKeys(SecCode);
		paymentPage.checkbox_ChkTerms().click();
		paymentPage.checkWeekSliderSpinnerToAppear();
	}

	public void clickOnConfirmAndPayButton() {
		paymentPage.btn_ConfirmAndpay().click();
	}
}
