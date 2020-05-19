package com.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("file:///C:/Users/Ravi/Desktop/html/Selectable.html%20(0).htm");
		   
		   WebElement Four = driver.findElement(By.name("four"));
		   WebElement Five = driver.findElement(By.name("five"));
		   WebElement Eleven = driver.findElement(By.name("eleven"));
		   
		   Actions act=new Actions(driver);
		   act.keyDown(Keys.CONTROL).click(Four).click(Five).click(Eleven).keyUp(Keys.CONTROL).build().perform();
		   driver.close();

	}

}
