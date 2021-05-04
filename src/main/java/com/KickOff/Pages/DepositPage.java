package com.KickOff.Pages;

import org.openqa.selenium.By;

import com.KickOff.MainBase.MainBaseClass;

public class DepositPage extends MainBaseClass{
	
	public DepositPage(){
		super();
	}
	
By Deposit=By.xpath("//a[contains(text(),'Deposit')]");
By AccountNo=By.name("accountno");
By account=By.name("ammount");
By Description=By.name("desc");
By submit=By.name("AccSubmit");

public void DepositTab() {
	driver.findElement(Deposit).click();
	driver.findElement(AccountNo).sendKeys("91828");
	driver.findElement(account).sendKeys("10000");
	driver.findElement(Description).sendKeys("For Home");
	driver.findElement(submit).click();
}


	
}








