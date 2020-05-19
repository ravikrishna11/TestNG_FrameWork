package com.Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("file:///C:/Users/Ravi/Desktop/html/DoubleClick.html%20(0).htm");
		   WebElement ele = driver.findElement(By.name("dblClick"));
		   
		   Actions act=new Actions(driver);
		   Thread.sleep(2000);
		   act.doubleClick(ele).build().perform();
		   Alert alert=driver.switchTo().alert();
		   Thread.sleep(2000);
		   String msg=alert.getText();
		   System.out.println("Meaage here:"+msg);
		   Thread.sleep(2000);
		   alert.accept();
		   driver.close();
		   
		   

	}

}
