package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.KickOff.MainBase.MainBaseClass;

public class BalanceEnquiryPage extends MainBaseClass{
	
	public BalanceEnquiryPage(){
		super();
	}
	
	By BalanceEnquiry=By.xpath("//a[contains(text(),'Balance Enquiry')]");
	By Accountno=By.xpath("//input[@name='accountno']");
	By submit=By.name("AccSubmit");
	
	
	public void BalanceEnquiryPage() {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,600)");
		
		driver.findElement(BalanceEnquiry).click();
		driver.findElement(Accountno).sendKeys("91828");
		driver.findElement(submit).click();
	}
}
