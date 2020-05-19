package com.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingDropDown {
	
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ravi/Desktop/select.html");
	}
	@Test
	public void testSelectFunctionally() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(),'Google')]")).click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//select By value
		Select Value= new Select(driver.findElement(By.id("SelectID_One")));
		Value.selectByValue("greenvalue");
		Thread.sleep(2000);
		
		
		//select By visible Text
		Select VisibleText=new Select(driver.findElement(By.id("SelectID_Two")));
		VisibleText.selectByVisibleText("Mango");
		Thread.sleep(2000);
		
		//select by index
		Select index=new Select(driver.findElement(By.id("SelectID_Three")));
		index.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
