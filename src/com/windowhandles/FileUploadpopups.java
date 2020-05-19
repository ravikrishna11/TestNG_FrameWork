package com.windowhandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadpopups {
	
WebDriver driver;
	
	
	
	
	@Test
	public void TestFileUploadpopups() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://html.com/input-type-file");
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\Ravi\\Downloads\\ntr\\ravifile.txt");

}
}