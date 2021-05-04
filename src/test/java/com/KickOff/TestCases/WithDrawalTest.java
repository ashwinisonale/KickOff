package com.KickOff.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.WithDrawalPage;
import com.KickOff.Pages.loginPage;

public class WithDrawalTest extends MainBaseClass {
	loginPage login;
	WithDrawalPage page1;
	
WithDrawalTest(){
	page1=new WithDrawalPage();
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
public void WithDrawalDetails(){
    page1.WithDrawalPageDetails();
}
}
