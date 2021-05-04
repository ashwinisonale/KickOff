package com.KickOff.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.MiniStatementPage;
import com.KickOff.Pages.loginPage;

public class MiniStatementTest extends MainBaseClass{
	loginPage login;
	MiniStatementPage page1;
	
	public MiniStatementTest() {
		page1=new MiniStatementPage();
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
	public void MiniStatementDetailPage() {
	page1.MiniStatementTab();	
	}
}
