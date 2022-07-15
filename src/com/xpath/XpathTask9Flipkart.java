package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask9Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver flip = new ChromeDriver();
		
		flip.get("https://www.flipkart.com/");
		flip.manage().window().maximize();
		
		WebElement btnLogin = flip.findElement(By.xpath("//a[@class='_1_3w1N']"));
		btnLogin.click();
		
		WebElement txtEmail = flip.findElement(By.xpath(""));
		txtEmail.sendKeys("suthakarjs85@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
