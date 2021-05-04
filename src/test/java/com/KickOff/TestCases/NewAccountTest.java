package com.KickOff.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.NewAccountpage;
import com.KickOff.Pages.loginPage;

public class NewAccountTest extends MainBaseClass{
	loginPage login;
	NewAccountpage page1;
	
	public NewAccountTest() {
		page1=new NewAccountpage();
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
@Test
public void NewAccountDetails() {
	page1.NewAccountTab();
	//Assert.assertEquals("", driver.getTitle());
}
}
