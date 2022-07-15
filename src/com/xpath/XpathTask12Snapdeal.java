package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask12Snapdeal {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver snap = new ChromeDriver();
		
		snap.get("https://snapdeal.com/");
		snap.manage().window().maximize();
		
		WebElement btnSignIn = snap.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		btnSignIn.click();
		
		WebElement btnRegister = snap.findElement(By.xpath("//span[@class='newUserRegister']"));
		btnRegister.click();
		
		WebElement txtUserName = snap.findElement(By.xpath("//input[@id='userName']"));
		txtUserName.sendKeys("suthakarjs85@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
