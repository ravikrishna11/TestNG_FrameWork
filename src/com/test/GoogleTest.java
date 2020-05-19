package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test(priority=1, groups="Title")
	public void googleTitleTest() {
		String aTitle=driver.getTitle();
		String eTitle="Google";
		Assert.assertEquals(aTitle, eTitle);
		
	}
	@Test(priority=2, groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
	}
	@Test(priority=3, groups="Gmail")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.xpath("//a[@class='gb_P']")).isDisplayed();
		Assert.assertEquals(b, true);
		
	}
	@Test(priority=4, groups="Tests")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5)
	public void test2() {
		System.out.println("test2");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
