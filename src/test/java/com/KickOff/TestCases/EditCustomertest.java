package com.KickOff.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.EditCustomerPage;
import com.KickOff.Pages.loginPage;

public class EditCustomertest extends MainBaseClass{
	
	loginPage login;
	EditCustomerPage page1;
	
	EditCustomertest(){
		page1=new EditCustomerPage();
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
   public void EditCustomerPage() {
		page1.EditCustomerTab();
	}	
	
	
	
	
}
