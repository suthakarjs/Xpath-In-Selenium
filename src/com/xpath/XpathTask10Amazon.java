package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask10Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		
		amazon.manage().window().maximize();
		amazon.get("https://www.amazon.in/");
		
		WebElement btnMobiles = amazon.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		btnMobiles.click();
		
		WebElement btnIphone = amazon.findElement(By.xpath("//img[@alt='8Pro']"));
		btnIphone.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
