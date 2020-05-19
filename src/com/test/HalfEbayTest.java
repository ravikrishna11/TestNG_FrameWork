package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HalfEbayTest {
    WebDriver driver;
	@BeforeMethod
	  public void setup() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://reg.ebay.in/reg/PartialReg");

	}
	@Test
	public void HalfEbayTest() {
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys();
		
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys();
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys();
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).clear();
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys();
		
		driver.findElement(By.xpath("//input[@id='ppaFormSbtBtn']")).clear();
		driver.findElement(By.xpath("//input[@id='ppaFormSbtBtn']")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}	
