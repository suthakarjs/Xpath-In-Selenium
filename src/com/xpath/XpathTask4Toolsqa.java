package com.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask4Toolsqa {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();
		
		amazon.manage().window().maximize();
		amazon.get("http://toolsqa.com/automation-practice-form/");
	
		
		
}
	
	
	
}
