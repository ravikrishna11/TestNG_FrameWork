package com.goibibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.goibibo.com");
		
		driver.findElement(By.xpath("(//span[contains(text(),'Bus')])[1]")).click();		
		driver.findElement(By.xpath("//input[@id='gi_roundtrip_label']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='gi_source']")).sendKeys("Rajamundry,Andhra Pradesh");
		driver.findElement(By.xpath("//li//div//div//span[contains(text(),'Rajamundry Ii, Andhra Pradesh')]")).click();
		driver.findElement(By.xpath("//input[@id='gi_destination']")).sendKeys("Bangalore,Karnataka");
		driver.findElement(By.xpath("//li//div//div//span[contains(text(),'Bangalore, Karnataka')]")).click();
		driver.findElement(By.xpath("//div[@id='gi_onward_text_wrap']")).click();
		driver.findElement(By.xpath("//td[@id='jrdp_start-calen_2_17_2019']//div//span[contains(text(), '17')]")).click();
		driver.findElement(By.xpath("//input[@id='gi_return_text']")).click();
		//ch.findElement(By.xpath("////td[@id='jrdp_end-calen_2_17_2019']")).click();
		driver.findElement(By.xpath("//td[@id='jrdp_end-calen_2_20_2019']//div//span[contains(text(), '20')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Time')]")).click();
		driver.findElement(By.xpath("//span[@id='time_18_22']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Boarding Point')]")).click();
		driver.findElement(By.xpath("(//label[@title='Morampudi Jn, Nr. Simhadri Steels Ph 8886866443'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dropping Point')]")).click();
		driver.findElement(By.xpath("(//label[@title='Indiranagar'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Bus Operators')]")).click();
		driver.findElement(By.xpath("//label[@title='VRL Travels']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Bus Type')])[2]")).click();
		driver.findElement(By.xpath("(//li//label[contains(text(),'AC')])[3]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Select Seats')])[1]")).click();
		driver.findElement(By.xpath("//a[@title1='46']")).click();
		driver.findElement(By.xpath("(//select[@class='dropPt'])[2]")).click();
		driver.findElement(By.xpath("//select[@class='dropPt']//option[contains(text(),'TIN FACTORY (VAN DROPPING )')]")).click();
		driver.findElement(By.xpath("//a[@id='confirm']")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("(//button[contains(text(),'Select Seats')])[2]")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("(//div[@class='innerSeatLyt']//div[@class='lower-seats-area']//a[@title1='44'])[3]")).click();
		//ch.findElement(By.xpath("(//select[@class='dropPt'])[3]")).click();
		driver.findElement(By.xpath("//select[@class='dropPt']//option[contains(text(),'Select your boarding point')]")).click();
		driver.findElement(By.xpath("(//select[@class='dropPt'])[3]//option[contains(text(),'MARATHALL(PICK UP VEHICLE) OPP KALAMANDIR NEAR AIRTEL 4G SHOP TOWARDS TIN FACTORY PH- 7483070725')]")).click();
		driver.findElement(By.xpath("(//div[@class='fr bsConfirm']//a[contains(text(), 'Confirm Booking')])[2]")).click();
		
		
		

	}

}
