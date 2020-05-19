package testng_groups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase2 {

	
WebDriver driver;
	
	
	
	@Test(priority=2,groups="functionalTest")
	public void composeMail() {
		System.out.println("Mail sent");
	}
}
