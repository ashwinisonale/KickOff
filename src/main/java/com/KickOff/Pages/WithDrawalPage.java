package com.KickOff.Pages;

import org.openqa.selenium.By;

import com.KickOff.MainBase.MainBaseClass;

public class WithDrawalPage extends MainBaseClass{
	public WithDrawalPage() {
		super();
		
	}
	
	
By WithDrawalTab=By.xpath("//a[contains(text(),'Withdrawal')]");
By AccountNo=By.name("accountno");
By Account=By.name("ammount");
By Description=By.name("desc");
By Submit=By.name("AccSubmit");



public void WithDrawalPageDetails() {
	driver.findElement(WithDrawalTab).click();
	driver.findElement(AccountNo).sendKeys("91828");
	driver.findElement(Account).sendKeys("500");
	driver.findElement(Description).sendKeys("dress shoping");
	driver.findElement(Submit).click();
}

}
