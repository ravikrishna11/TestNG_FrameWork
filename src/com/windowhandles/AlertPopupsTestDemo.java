package com.windowhandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopupsTestDemo {
	
	WebDriver driver;
	
	
	
	
	@Test
	public void TestAlertpopups() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		}
		else {
			System.out.println("Incorrect message");
		}
		alert.accept();
		Thread.sleep(2000);
		//alert.sendKeys("worng");
		//alert.dismiss();
		Thread.sleep(2000);
		driver.close();
		
	}
		

}
