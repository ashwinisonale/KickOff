package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.KickOff.MainBase.MainBaseClass;

public class MiniStatementPage extends MainBaseClass {
	
	public MiniStatementPage() {
		super();
	}

	By MiniStatementTab=By.xpath("//a[contains(text(),'Mini Statement')]");
	By AccountNo=By.name("accountno");
	By Submit =By.name("AccSubmit");
	
	
	public void MiniStatementTab() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,600)");
		driver.findElement(MiniStatementTab).click();
		driver.findElement(AccountNo).sendKeys("91828");
		driver.findElement(Submit).click();
	}
}
