package com.JavaScriptEcecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEcecutorSession {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ravi11");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@1234");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		
		flash(loginBtn,driver);
		//drawBorder(loginBtn, driver);
		//generateAlert(driver, "There is an issue with loginbutton");
		//clickElementByJS(loginBtn, driver);
		//refreshBrowserByJS(driver);
		
		
		System.out.println(getTitleByJS(driver));
		//System.out.println(getInnerText(driver));
		//scrollPageDown(driver);
		WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		scrollIntoView(forgotPassword, driver);
		//driver.quit();
		
	}
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0;i<3;i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);
		}
		
	}
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
    public static String getInnerText(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	String PageText=js.executeScript("return document.documentElement.innerText;").toString();
    	return PageText;
    }
    public static void scrollPageDown(WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public static void scrollIntoView(WebElement element,WebDriver driver) {
    	JavascriptExecutor js=((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
