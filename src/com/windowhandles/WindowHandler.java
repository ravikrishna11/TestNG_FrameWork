package com.windowhandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandler {
	WebDriver driver;
	
	
	
	
	@Test
	public void windowHandlesTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
		String ParentWindow = driver.getWindowHandle();
		for(String SubWindow:driver.getWindowHandles()) {
			driver.switchTo().window(SubWindow);
		}
		 System.out.println(driver.findElement(By.cssSelector(".bold")).getText());
		 driver.close();
		 
		 driver.switchTo().window(ParentWindow);
		 driver.close();
	}

}
