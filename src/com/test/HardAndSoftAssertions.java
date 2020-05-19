package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertions {
	
	SoftAssert softAssert=new SoftAssert();
	
	@Test
	public void test1() {
		
		System.out.println("open browser");
		//Assert.assertEquals(false, true);
		softAssert.assertEquals(true, false);
		System.out.println("enter username");
		System.out.println("enter password");
		//softAssert.assertAll();
	}
	@Test
	public void test2() {
		System.out.println("home page");
		System.out.println("contacts page");
		//Assert.assertEquals(false, true);
		softAssert.assertEquals(true, false);
		System.out.println("deals page");
		System.out.println("incometax page");
		
	}

}
