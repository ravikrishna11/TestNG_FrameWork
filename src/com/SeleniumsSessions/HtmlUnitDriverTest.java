package com.SeleniumsSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 WebDriver driver=new HtmlUnitDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://www.crmpro.com/index.html");
		 System.out.println("Before Login Title is::"+driver.getTitle());
		 driver.findElement(By.name("username")).sendKeys("ravi11");
			driver.findElement(By.name("password")).sendKeys("test@123");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			System.out.println("After Login Title is:"+driver.getTitle());
			driver.close();
		 
		 

	}

}
