package Listner_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner_Demo.ListenerTest.class)

public class Testcases {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com/");
	}
	@Test
	public void googleTitleTest() {
		String aTile=driver.getTitle();
		System.out.println("Title is:"+aTile);
		Assert.assertEquals(aTile, "Google");
	}
	@Test
	public void failedTest() {
		System.out.println("This is failed testcase");
		Assert.assertEquals(true, false);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
