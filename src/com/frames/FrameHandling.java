package com.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.crmpro.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ravi11");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		//WebDriver count=driver.switchTo().frame("mainpanel");
		//System.out.println("Mainpanel frame:"+count);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		WebDriver count2 = driver.switchTo().frame("leftpanel");
		System.out.println("Leftpanel frame:"+count2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Messages']")).click();
				
		
		driver.close();
		
		

	}

}
