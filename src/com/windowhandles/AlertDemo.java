package com.windowhandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("40002");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		//switching to alert
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(2000);
		//capturing alert message
		String msg=driver.switchTo().alert().getText();
		
		System.out.println("Alert message:"+msg);
		
		Thread.sleep(2000);
		alert.accept();
		
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
