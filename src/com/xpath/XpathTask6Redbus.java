package com.xpath;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class XpathTask6Redbus {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver redbus = new ChromeDriver();
		
		redbus.get("https://www.redbus.in/");
		redbus.manage().window().maximize();
		WebElement btnDownArrow = redbus.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btnDownArrow.click();
		WebElement btnSignIn = redbus.findElement(By.xpath("//*[@id=\"signInLink\"]"));
		btnSignIn.click();
		
		redbus.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> frame = redbus.findElements(By.tagName("iframe"));
		int count = frame.size();
		System.out.println(count);
		
		redbus.switchTo().frame(1);
		
		WebElement txtName = redbus.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtName.sendKeys("0123456789");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(redbus).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//		
//		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//			
//			@Override
//			public WebElement apply(WebDriver t) {
//				return redbus.findElement(By.xpath("//input[@id='mobileNoInp']")); 
//			}
//		});
//		
//		element.sendKeys("0123456789");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
