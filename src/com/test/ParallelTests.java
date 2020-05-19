package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {
	WebDriver driver;
	
	@Test
	public void getChrome() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.out.println("Running Chrome");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.close();
	}
	@Test
	public void getGecko() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.out.println("Running Firefox");
		driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.close();
		
	}

}
