package com.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExample {

	public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://www.myntra.com/");
	        
	        //Mouse over on Men link
	        Actions act=new Actions(driver);
	        WebElement testLink = driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
	        act.moveToElement(testLink).build().perform();
	        
	        //click on bags and packs
	        driver.findElement(By.xpath("//a[contains(text(),'Bags & Backpacks')]")).click();
	        
	        //click on backpacks
	        driver.findElement(By.xpath("//div[@='common-checkboxIndicator']")).click();
	        
	        //Mouse over on the 1st bag
	        Actions sel=new Actions(driver);
	        WebElement FirstbagLink = driver.findElement(By.xpath("//img[@title='F Gear Unisex Brown Luxur Laptop Backpack']"));
            sel.moveToElement(FirstbagLink).build().perform();
	}

}
