package com.SeleniumsSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalanderSelectTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("ravi11");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String date="11-April-2019";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1=new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		

		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]	
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String beforeXpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath="]/td[1]";
		
		final int totalWeekDays=7;
		boolean flag = false;
		String dayVal=null;
		
		for(int rowNum=2;rowNum<=7;rowNum++) {
			for(int colNum=1;colNum<=totalWeekDays;colNum++) {
				try {
					dayVal=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Plz enter a correct date value");
					flag=false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag=true;
					break;
				}
				if(flag) {
					break;
				}
			}
		}
		

	}

}
