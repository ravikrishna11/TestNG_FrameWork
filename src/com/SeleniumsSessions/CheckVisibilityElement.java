package com.SeleniumsSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityElement {
//	Learn difference between:
//		isDisplayed()  v/s  isEnabled()  v/s   isSelected() 
//		Notes:
//		•	isDisplayed() is the method used to verify presence of a web element within the webpage.
//		 The method returns a “true” value if the specified web element is present on the web page and a “false” value if the web element is not present on the web page.
//		•	isDisplayed() is capable to check for the presence of all kinds of web elements available.
//		•	isEnabled() is the method used to verify if the web element is enabled or disabled within the webpage.
//		•	isEnabled() is primarily used with buttons.
//		•	isSelected() is the method used to verify if the web element is selected or not. isSelected() 
//		method is pre-dominantly used with radio buttons, dropdowns and checkboxes.


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/register/");
		
		//isDisplayed() method
		boolean b = driver.findElement(By.name("submitButton")).isDisplayed();
		System.out.println(b);//true
		
		//isEnabled() method
		boolean b1 = driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println(b1);//false
		
		//lets make submit button enabled:
	    driver.findElement(By.name("agreeTerms")).click();
	    
	  //isEnabled() method
	  		boolean b2 = driver.findElement(By.name("submitButton")).isEnabled();
	  		System.out.println(b2);//true

	   //isSelected() method: only applicable for checkbox, dropdown, radiobutton
	   boolean flag1 = driver.findElement(By.name("agreeTerms")).isSelected();
	   System.out.println(flag1); //true
	   
	 //de-select the checkbox-- I Agree
	 		driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox

	 		boolean flag2 = driver.findElement(By.name("agreeTerms")).isSelected();
	 		System.out.println(flag2); //false
		

	}

}
