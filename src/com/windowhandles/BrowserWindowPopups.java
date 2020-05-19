package com.windowhandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindowPopups {
WebDriver driver;
	
	
	
	
	@Test
	public void windowPopupTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id:"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id:"+childWindowId);
		
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window popuu title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window popup title:"+driver.getTitle());
		driver.close();


}
}