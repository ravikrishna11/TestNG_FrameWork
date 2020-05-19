package com.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("file:///C:/Users/Ravi/Desktop/html/DragAndDrop.html%20(0).htm");
		   
		   WebElement sourse = driver.findElement(By.id("draggable"));
		   WebElement target = driver.findElement(By.id("droppable"));
		   
		   Actions act=new Actions(driver);
		   act.dragAndDrop(sourse, target).build().perform();
		   driver.close();

	}

}
