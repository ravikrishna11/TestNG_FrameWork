package com.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextOrRightClick {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("file:///C:/Users/Ravi/Desktop/html/ContextClick.html%20(0).htm");
	   WebElement element = driver.findElement(By.id("div-context"));
	   Actions act=new Actions(driver);
	   act.contextClick(element).build().perform();
	   WebElement item = driver.findElement(By.name("Item 1"));
	   item.click();
	   Alert alert=driver.switchTo().alert();
	   String msg = alert.getText();
	   System.out.println("Alert Message:"+msg);
	   alert.accept();
	   driver.close();

	}

}
