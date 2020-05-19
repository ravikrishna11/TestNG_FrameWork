package com.SeleniumsSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle1 {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://twitter.com/login?lang=en");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert Message:"+alert.getText());
        String text=alert.getText();
        if(text.equals("The username and password you entered did not match our records. Please double-check and try again.")) {
        	System.out.println("Correct message");
        }
        else {
        	System.out.println("Incorrect message ");
        }
        alert.dismiss();
	}

}
