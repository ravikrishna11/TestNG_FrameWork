package com.SeleniumsSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		
		Thread.sleep(3000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		 String ParentWindowID = it.next();
		 System.out.println("parent window ID:"+ParentWindowID);
		 
		 String ChildWindowID = it.next();
		 System.out.println("child window ID:"+ChildWindowID);
		 
		 driver.switchTo().window(ChildWindowID);
		 Thread.sleep(3000);
		 System.out.println("child window popup Title:"+driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(ParentWindowID);
		 Thread.sleep(3000);
		 System.out.println("parent window popup Title:"+driver.getTitle());
		 driver.close();

	}

	
}
