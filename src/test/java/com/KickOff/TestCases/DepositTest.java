package com.KickOff.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.DepositPage;
import com.KickOff.Pages.loginPage;

public class DepositTest extends MainBaseClass{
	loginPage login;
    DepositPage page1;
    
    DepositTest(){
    	page1=new DepositPage();
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
    public void DepositPage() {
    	page1.DepositTab();
    }
    
    
    
}
