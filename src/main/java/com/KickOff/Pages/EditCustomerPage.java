package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.KickOff.MainBase.MainBaseClass;

public class EditCustomerPage extends MainBaseClass{
	
	public EditCustomerPage() {
		super();
	}
	
By EditCustomer=By.xpath("//a[contains(text(),'Edit Customer')]");
By CustomerId=By.name("cusid");
//@FindBy(xpath="//input[@type='submit']")
//WebElement Submit;
By Submit=By.xpath("//input[@type='submit']");

By submit1=By.name("sub");

public void EditCustomerTab() {
	driver.findElement(EditCustomer).click();
	driver.findElement(CustomerId).sendKeys("20650");
	//Submit.click();
	driver.findElement(Submit).click();
	driver.findElement(submit1).click();
}

}
