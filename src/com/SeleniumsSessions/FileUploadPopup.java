package com.SeleniumsSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://html.com/input-type-file/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Ravi\\Downloads\\ntr\\Goibibo.txt");
        driver.close();
	}

}
