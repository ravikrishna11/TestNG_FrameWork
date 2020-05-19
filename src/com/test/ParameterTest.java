package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  WebDriver driver;
  @BeforeMethod
  public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/?stype=lo&jlou=AffBkzQf_obYM7JyITYCVEUPLGGbvXc7oyuXkrAEz96WjTTW_DybbH3MbDffyT9j3XUR9lYvSA6YHVX9uJ74lsg4C-w7Atp81x2j-CUT0bUu-Q&smuh=29523&lh=Ac-8TAlODqfoEBSD");
	}
  @Test
  @Parameters({"phone","password"})
  public void FbLogin(String phone,String password) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@type='email']")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys(phone);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).clear();
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
