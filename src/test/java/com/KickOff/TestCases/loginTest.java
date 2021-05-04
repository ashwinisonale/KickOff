package com.KickOff.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.loginPage;

public class loginTest extends MainBaseClass {
	
	loginPage page;

	public loginTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		page.openBrowser("chrome");
		page.openUrl();
		page=new loginPage();
	}
	@Test(priority=1)
	public void LoginDetails() {
		page.EnterUserId();
		page.EnterPassword();
		page.ClickOnLoginButton();
	}
	@Test(priority=2)
	public void getTitle() {
		driver.getTitle();
	}
	
	
	

}
