package com.KickOff.Pages;

import org.openqa.selenium.By;

import com.KickOff.MainBase.MainBaseClass;

public class EditAccountPage extends MainBaseClass {
	public EditAccountPage(){
		super();
	}

	
	By EditAccountTab=By.xpath("//a[contains(text(),'Edit Account')]");
	By AccountNo=By.xpath("//input[@name='accountno']");
	By submit=By.name("AccSubmit");
	
	
	public void EditAccountPage() {
		driver.findElement(EditAccountTab).click();
		driver.findElement(AccountNo).sendKeys("91828");
		driver.findElement(submit).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
