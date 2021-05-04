package com.KickOff.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.KickOff.MainBase.MainBaseClass;

public class loginPage extends MainBaseClass{

public loginPage() {
	
	PageFactory.initElements(driver, this);
}

	
@FindBy(xpath="//input[@name='uid']")
WebElement UserId;
	
@FindBy(xpath="//input[@name='password']")
WebElement Password;

@FindBy(xpath="//input[@name='btnLogin']")
WebElement loginButton;


public void EnterUserId() {
	UserId.sendKeys("mngr320402");	
}
public void EnterPassword() {
	Password.sendKeys("tYnEhej");
	
}
public void ClickOnLoginButton() {
	loginButton.click();
}	
	
	
}


		


