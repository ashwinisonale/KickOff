package com.KickOff.Pages;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.KickOff.MainBase.Constant;
import com.KickOff.MainBase.MainBaseClass;

import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class HomePage extends MainBaseClass{
public HomePage() {
 super();
}

By NewCustome=By.xpath("//li//a[contains(text(),'New Customer')]");
By CustomerName=By.name("name");
By gendar=By.xpath("//input[@value='f']");
By DateOfBirth=By.name("dob");
By Address=By.name("addr");
By City=By.name("city");
By State=By.name("state");
By Pin=By.name("pinno");
By MobileNumber=By.name("telephoneno");
By EmailId=By.name("emailid");
By password=By.name("password");
By Submit=By.name("sub");



public void NewCustomerButton() {
	driver.findElement(NewCustome).click();
	}
public void NewCustomerDetailsPage(String name,String state,String mail) {
	driver.findElement(CustomerName).sendKeys(name);
	driver.findElement(gendar).click();
	driver.findElement(DateOfBirth).sendKeys("02-06-2000");
	driver.findElement(Address).sendKeys("Mukkrawar wajankata udgir");
	driver.findElement(City).sendKeys("Udgir");
	driver.findElement(State).sendKeys(state);
	driver.findElement(Pin).sendKeys("413517");
	driver.findElement(MobileNumber).sendKeys("1234567890");
	driver.findElement(EmailId).sendKeys(mail);
	driver.findElement(password).sendKeys("urbantest123");
	driver.findElement(Submit).click();
	driver.switchTo().alert().accept();
}
}