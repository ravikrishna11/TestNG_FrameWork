package com.SeleniumsSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Links present in page:"+linkList);
		
		for(int i=0;i<linkList.size();i++) {
			String linkText=linkList.get(i).getText();
			System.out.println(linkText);
			
		}
		

	}

}
