package org.alert;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask3OmrAuthetication {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://omrbranch.com/api/documentation/");
		driver.manage().window().maximize();
		
		driver.get("https://Suthakarjs:1234@5678@omrbranch.com/api/documentation");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}