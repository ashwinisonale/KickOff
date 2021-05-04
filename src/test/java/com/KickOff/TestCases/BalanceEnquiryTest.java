package com.KickOff.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.BalanceEnquiryPage;
import com.KickOff.Pages.loginPage;

public class BalanceEnquiryTest extends MainBaseClass {
	loginPage login;
	BalanceEnquiryPage page1;
	
	BalanceEnquiryTest(){
		page1=new BalanceEnquiryPage();
	}
	
	@BeforeClass
	public void SetUp() {
	     openBrowser("chrome");
	     openUrl();
	     login=new loginPage();
	     login.EnterPassword();
	     login.EnterUserId();
	     login.ClickOnLoginButton();
	}
	@Test(priority=1)
	public void BalanceEnquiryDetailPage() {
		page1.BalanceEnquiryPage();
	}
}
