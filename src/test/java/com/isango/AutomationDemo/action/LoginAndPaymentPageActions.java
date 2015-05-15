package com.isango.AutomationDemo.action;

public class LoginAndPaymentPageActions extends ProductPageActions{
	
	public void enterInformationOnPaymentPage(){
		String localData = "AutomationTest";
		paymentPage.div_Calander().isDisplayed();
		String id = paymentPage.div_Calander().getAttribute("id");
		executeJs("document.getElementById(\""+id+"\").removeAttribute(\"readonly\")");
		paymentPage.div_Calander().sendKeys("20 May 2015");
		
		//   Your details:
		
		paymentPage.txtBox_FirstName().sendKeys(localData);
		paymentPage.txtBox_LastName().sendKeys(localData);
		paymentPage.txtBox_Phone().sendKeys("0123456789");
		paymentPage.txtBox_RegisterEmail().sendKeys(localData+"@test.com");
		paymentPage.txtBox_ConfirmEmail().sendKeys(localData+"@test.com");
		paymentPage.btn_FindUSArrow().click();
		paymentPage.btn_FindUSOption().click();
		
		

//	    Billing address:

		paymentPage.txtBox_Address().sendKeys(localData);
		paymentPage.txtBox_City().sendKeys(localData);
		paymentPage.txtBox_PastCode().sendKeys("201301");
		

//	    Payment details:

		paymentPage.btn_CardTypesArrow().click();
		paymentPage.btn_CardTypesOption().click();
		paymentPage.txtBox_CardNo().sendKeys("4200000000000000");
		paymentPage.txtBox_NameofCardHolder().sendKeys(localData);
		
		paymentPage.btn_ExpiryDateArrow().click();
		paymentPage.btn_ExpiryDateOption().click();
		
		paymentPage.btn_ExpiryYearArrow().click();
		paymentPage.btn_ExpiryYearOption().click();
		paymentPage.txtBox_txtSecurityCode().sendKeys("123");

		paymentPage.checkbox_ChkTerms().click();
		

		
		paymentPage.btn_ConfirmAndpay().click();
		

		
	}

}
