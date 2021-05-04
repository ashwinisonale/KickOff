package com.KickOff.MainBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;

public class Constant extends MainBaseClass{
	
	public static AShot ashot =new AShot();
	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	//public static Alert alert;
}
