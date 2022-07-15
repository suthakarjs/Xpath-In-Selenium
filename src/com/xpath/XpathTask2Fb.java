package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask2Fb {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver fb = new ChromeDriver();
		
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();
		WebElement txtUserName = fb.findElement(By.xpath("//input[@type='text']"));
		txtUserName.sendKeys("Suthakar JS");
		WebElement txtPassword = fb.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("abcd123456");
		WebElement btnLogin = fb.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		String title = fb.getTitle();
		String currentUrl = fb.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentUrl);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
