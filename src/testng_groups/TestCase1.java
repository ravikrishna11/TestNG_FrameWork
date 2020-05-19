package testng_groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase1 {
WebDriver driver;
	
	
	
	@Test(priority=1,groups= {"smokeTest","functionalTest"})
	public void loginTest() {
		System.out.println("Login successfully");
	}

}
