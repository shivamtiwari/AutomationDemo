package com.isango.AutomationDemo.action;

import org.testng.Assert;

public class HomePageActions extends BaseFixture {

	public void verifyTopBannerLinksDisplay() {
		homePage.lnk_LowPriceGuarantee().isDisplayed();
		homePage.lnk_FREEGifts().isDisplayed();
		homePage.lnk_NoExtraTaxesorCharges().isDisplayed();
		homePage.lnk_ReadCustomerReviews().isDisplayed();
		homePage.lnk_ExploreOrlandoTickets().isDisplayed();
		homePage.lnk_Compareallcombotickets().isDisplayed();
	}

	public void verifyBestProductAssociatedInformation() {
		homePage.lnk_Bestsellers().isDisplayed();
		homePage.img_ProductImage().isDisplayed();
		homePage.lnk_FreeGiftProduct().isDisplayed();
		homePage.lnk_BestProdIntro().isDisplayed();
		homePage.lnk_priceAdult().isDisplayed();
		homePage.lnk_priceChild().isDisplayed();
		homePage.lnk_bookNow().isDisplayed();

	}

	public void selectProduct() {
		String productIntro = homePage.lnk_BestProdIntro().getText();
		String adultPrice = homePage.lnk_priceAdult().getText();
		adultPrice = adultPrice.replaceAll("Adult", "");
		String childPrice = homePage.lnk_priceChild().getText();
		childPrice = childPrice.replaceAll("Child", "");
		homePage.lnk_bookNow().click();
		productPage.heading_ProductIntro().isDisplayed();
		Assert.assertTrue(productPage.heading_ProductIntro().getText()
				.equals(productIntro));
		Assert.assertTrue(productPage.txt_spAdultPrice().getText()
				.equals(adultPrice));
		Assert.assertTrue(productPage.txt_spChildPrice().getText()
				.equals(childPrice));

	}

}
