package com.KickOff.Pages;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.KickOff.MainBase.Constant;
import com.KickOff.MainBase.MainBaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class NewAccountpage extends MainBaseClass{

	
	public NewAccountpage() {
		super();
	}
	
	By NewAccount=By.xpath("//a[contains(text(),'New Account')]");
	By CustomerId=By.name("cusid");
	By AccountType=By.name("selaccount");
	By AccountTypeSaving=By.xpath("//option[@value='Savings']");
	By Initialdeposite=By.name("inideposit");
	By submit=By.xpath("//input [@type='submit']");
	
	
	public void NewAccountTab(){
		driver.findElement(NewAccount).click();
	
		driver.findElement(CustomerId).sendKeys("20650");
		driver.findElement(AccountType).click();
        Select select =new Select(driver.findElement(AccountType));
        select.selectByVisibleText("Savings");
        
        
        /*
         * initial deposite amount should be more than 500 
         * less than 500 it gives alart
         */
        driver.findElement(Initialdeposite).sendKeys("1000");
        driver.findElement(submit).click();
      
        Screenshot screenshot= Constant.ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
         try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\Lenovo\\eclipse-workspace\\com.KickOff\\src\\main\\resources\\screenshots"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    
        
        
         
		}
	
	
	
	
	
}
