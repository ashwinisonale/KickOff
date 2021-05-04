package com.KickOff.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.EditAccountPage;
import com.KickOff.Pages.loginPage;

public class EditAccountTest extends MainBaseClass {
	loginPage login;
	EditAccountPage page1;
	
	 EditAccountTest(){
		page1=new EditAccountPage();
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
	 public void EditAccountTab() {
		 page1.EditAccountPage();
		
	 }
	 }

