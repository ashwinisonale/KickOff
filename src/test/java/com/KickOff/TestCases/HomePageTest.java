package com.KickOff.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.KickOff.MainBase.MainBaseClass;
import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.loginPage;

public class HomePageTest extends MainBaseClass {
	HomePage page;
	loginPage login;

	public HomePageTest() {
		page = new HomePage();

	}

	@BeforeClass
	public void SetUp() {
		openBrowser("chrome");
		openUrl();
		login = new loginPage();
		login.EnterPassword();
		login.EnterUserId();
		login.ClickOnLoginButton();
	}

	@Test(dataProvider = "MailData", dataProviderClass = HomePageTest.class)
	public void NewCustomerDetailPage(String name,String state,String mail) {
		page.NewCustomerButton();
		page.NewCustomerDetailsPage(name,state,mail);
		// Assert.assertEquals(true, "successfully customer creation");
	}

	@DataProvider(name = "MailData")
	public Object[][] dataBase() {
		Object[][] temp = { {"Ashwini","madhypradesh","soni1001@gmail.com"}, 
							{"swati","goa","swati11@gmail.com"},
							{"sayli","aandrapradesh","sayli1011@gmail.com"},
							{"Nisha","karnataka","nisha9919@gmail.com"},
							{"sucheta","rajasthan","sucheta6456773@gmail.com"},
							{"priya","kerala","priya122234@gmail.com"}	
		
		};
		return temp;
	}
}
